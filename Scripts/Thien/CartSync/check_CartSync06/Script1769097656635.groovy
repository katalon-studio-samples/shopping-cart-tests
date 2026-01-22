import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.testng.asserts.SoftAssert as SoftAssert
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.testobject.ConditionType as ConditionType

// Khởi tạo SoftAssert
SoftAssert softAssertion = new SoftAssert()

// --- CẤU HÌNH USER ---
String url = 'https://aristino.com/'
String userEmail = 'concocon198thien@gmail.com'
String userPass = 'N4LHEkK0aTbaTUc5DZaF2w=='

// --- BƯỚC 1: KHỞI TẠO ---
WebUI.openBrowser('https://www.google.com/')
WebUI.maximizeWindow()
WebUI.navigateToUrl(url)
WebUI.waitForPageLoad(10)

// KIỂM TRA POPUP
TestObject slideDown = new TestObject('slidedown')
slideDown.addProperty('xpath', ConditionType.EQUALS, '//div[@id=\'antsomi-slidedown-dialog\']')
if (WebUI.waitForElementVisible(slideDown, 3, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Object Repository/Thien/CartSync/button_cancel_slidedown'))
}

// ============================
// KHỐI LỆNH THAO TÁC:

WebUI.comment("--- CHECK LOGIN STATUS ---")
WebUI.click(findTestObject('Object Repository/Thien/CartSync/a_Account'))
WebUI.delay(1)

boolean isLoggedIn = WebUI.waitForElementVisible(findTestObject('Object Repository/Thien/CartSync/span_Logout'), 2, FailureHandling.OPTIONAL)
if (isLoggedIn) {
    WebUI.comment("⚠️ Đang Login -> Logout để về Guest")
    WebUI.click(findTestObject('Object Repository/Thien/CartSync/span_Logout'))
    WebUI.waitForPageLoad(10)
} else {
    WebUI.comment("✅ Đã là Guest")
}

// --- THÊM SẢN PHẨM VÀO GIỎ ---
WebUI.click(findTestObject('Object Repository/Thien/CartSync/a_TRANG PHC'))
WebUI.mouseOverOffset(findTestObject('Object Repository/Thien/CartSync/a_TRANG PHC'), -50, 0)
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Thien/CartSync/a_chooseProduct', [('index') : 1]))

WebUI.waitForElementVisible(findTestObject('Object Repository/Thien/CartSync/product_Detail'), 10)
String expectedProductName = WebUI.getText(findTestObject('Object Repository/Thien/CartSync/product_Detail')).trim()
WebUI.comment('Tên SP mong đợi: ' + expectedProductName)

WebUI.click(findTestObject('Object Repository/Thien/CartSync/button_addToCart'))
WebUI.waitForElementVisible(findTestObject('Object Repository/Thien/CartSync/product_DetailonCart'), 10)
WebUI.verifyElementText(findTestObject('Object Repository/Thien/CartSync/product_DetailonCart'), expectedProductName)

// ===================================================================
// 🔴 BẮT ĐẦU LOGIC TC_I_06: RAPID CLICK (SPAM CHUỘT)
// ===================================================================

TestObject qtyInput = findTestObject('Object Repository/Thien/CartSync/product_quantityonCart')
TestObject btnMinus = findTestObject('Object Repository/Thien/CartSync/button_QuaMinus')
TestObject btnPlus = findTestObject('Object Repository/Thien/CartSync/button_QuaPlus')

// --- BƯỚC 1: TĂNG SỐ LƯỢNG LÊN 5 (Chuẩn bị môi trường test) ---
WebUI.comment("--- Đưa số lượng lên 5 (Có delay để đảm bảo ổn định) ---")

// Hiện tại đang là 1, cần bấm thêm 4 lần
for (int i = 1; i <= 4; i++) {
    WebUI.click(btnPlus)
    WebUI.delay(1) // Delay nhỏ để server kịp xử lý từng request
}

// Verify chắc chắn đã lên 5 trước khi spam
String qtyBeforeSpam = WebUI.getAttribute(qtyInput, 'value')
WebUI.verifyMatch(qtyBeforeSpam, '5', false)
WebUI.comment("Đã đạt mốc số lượng: " + qtyBeforeSpam)


// --- BƯỚC 2: SPAM CLICK NÚT TRỪ 6 LẦN (KHÔNG DELAY) ---
WebUI.comment("⚡ Bắt đầu Spam Click nút Trừ 6 lần liên tục...")

// Đang là 5, bấm 6 lần. Nếu JS tốt thì phải dừng ở 1. Nếu lỗi thì về 0 hoặc -1.
for (int i = 1; i <= 6; i++) {
    WebUI.click(btnMinus)
    // ⚠️ QUAN TRỌNG: Không dùng WebUI.delay() ở đây để giả lập tay người dùng bấm nhanh
}


// --- BƯỚC 3: KIỂM TRA KẾT QUẢ ---
WebUI.comment("--- Chờ 2s để UI ổn định sau cú click cuối cùng ---")
WebUI.delay(2) 

String finalQuantity = WebUI.getAttribute(qtyInput, 'value')
WebUI.comment("Số lượng chốt lại sau khi spam: " + finalQuantity)

// Logic Verify
int finalQtyInt = Integer.parseInt(finalQuantity)

if (finalQtyInt < 1) {
    WebUI.takeScreenshot()
    WebUI.keywordMain.stepFailed("❌ BUG CRITICAL: Số lượng bị tụt xuống " + finalQtyInt + " (Dưới 1)")
} 
else if (finalQtyInt == 1) {
    WebUI.comment("✅ PASSED: Hệ thống chặn tốt, số lượng dừng chuẩn ở 1.")
} 
else {
    WebUI.takeScreenshot()
    WebUI.comment("⚠️ WARNING: Hệ thống xử lý chậm, số lượng chưa về 1 (Đang là " + finalQtyInt + ")")
    // Trường hợp này không hẳn là Bug, có thể do mạng lag nên click 6 cái nhưng server mới nhận 2-3 cái.
    // Tùy vào requirement dự án mà đánh Fail hay Pass. Ở đây mình chỉ Warning.
}

// Kiểm tra UI nút Trừ có bị Disabled không
String classMinus = WebUI.getAttribute(btnMinus, 'class')
WebUI.verifyMatch(classMinus, '.*disabled.*', true, FailureHandling.OPTIONAL)

WebUI.takeScreenshot()
// ============================
// CLEAN UP
WebUI.click(findTestObject('Object Repository/Thien/CartSync/a_deleteItem'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Thien/CartSync/button_closeCart'))
WebUI.delay(2)
WebUI.closeBrowser()