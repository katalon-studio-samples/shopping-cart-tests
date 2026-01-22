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

// KIỂM TRA POPUP (LẦN ĐẦU)
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
}

// --- LOGIN LẦN 1 ---
WebUI.click(findTestObject('Object Repository/Thien/CartSync/a_Account'))
WebUI.setText(findTestObject('Object Repository/Thien/CartSync/input_Email_login-email'), userEmail)
WebUI.setEncryptedText(findTestObject('Object Repository/Thien/CartSync/input_Mt Khu_password'), userPass)
WebUI.click(findTestObject('Object Repository/Thien/CartSync/button_ng nhp'))

// --- THÊM SẢN PHẨM VÀO GIỎ ---
WebUI.click(findTestObject('Object Repository/Thien/CartSync/a_TRANG PHC'))
WebUI.mouseOverOffset(findTestObject('Object Repository/Thien/CartSync/a_TRANG PHC'), -50, 0)
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Thien/CartSync/a_chooseProduct', [('index') : 1]))

// Lấy tên sản phẩm để verify sau này
WebUI.waitForElementVisible(findTestObject('Object Repository/Thien/CartSync/product_Detail'), 10)
String expectedProductName = WebUI.getText(findTestObject('Object Repository/Thien/CartSync/product_Detail')).trim()
WebUI.comment('Tên sản phẩm đã thêm: ' + expectedProductName)

// Add to Cart
WebUI.click(findTestObject('Object Repository/Thien/CartSync/button_addToCart'))
WebUI.waitForElementVisible(findTestObject('Object Repository/Thien/CartSync/product_DetailonCart'), 10)

// Verify sơ bộ lần 1
WebUI.verifyElementText(findTestObject('Object Repository/Thien/CartSync/product_DetailonCart'), expectedProductName)

// ===================================================================
// 🔴 BẮT ĐẦU LOGIC TC_S_08: PERSISTENCE CHECK
// ===================================================================

// --- BƯỚC 2: LOGOUT ---
WebUI.comment("--- Thực hiện Logout ---")
WebUI.click(findTestObject('Object Repository/Thien/CartSync/button_closeCart')) // Đóng giỏ hàng trước
WebUI.click(findTestObject('Object Repository/Thien/CartSync/a_Account'))
WebUI.click(findTestObject('Object Repository/Thien/CartSync/span_Logout'))
WebUI.waitForPageLoad(10)

// --- QUAN TRỌNG: XÓA LOCAL STORAGE ---
WebUI.comment("🧹 Xóa sạch Local Storage & Cookies")
WebUI.executeJavaScript("window.localStorage.clear();", null)
WebUI.executeJavaScript("window.sessionStorage.clear();", null)
WebUI.deleteAllCookies()
WebUI.refresh() 
WebUI.waitForPageLoad(10)


// --- XỬ LÝ POPUP SAU KHI REFRESH (LẦN 2) ---
// Do xóa cookie, web coi như User mới -> Popup lại hiện
TestObject popupRecheck = new TestObject('popup_recheck')
popupRecheck.addProperty('xpath', ConditionType.EQUALS, '//div[@id=\'antsomi-slidedown-dialog\']')

if (WebUI.waitForElementVisible(popupRecheck, 5, FailureHandling.OPTIONAL)) {
    WebUI.comment("⚠️ Popup xuất hiện lại -> Thực hiện đóng")
    WebUI.click(findTestObject('Object Repository/Thien/CartSync/button_cancel_slidedown'))
    WebUI.delay(1) // Chờ 1 chút cho popup biến mất hẳn để không che nút Login
}


// --- BƯỚC 3: LOGIN LẠI (LẦN 2) ---
WebUI.comment("--- Login lại lần 2 ---")
WebUI.click(findTestObject('Object Repository/Thien/CartSync/a_Account'))
WebUI.setText(findTestObject('Object Repository/Thien/CartSync/input_Email_login-email'), userEmail)
WebUI.setEncryptedText(findTestObject('Object Repository/Thien/CartSync/input_Mt Khu_password'), userPass)
WebUI.click(findTestObject('Object Repository/Thien/CartSync/button_ng nhp'))


// --- BƯỚC 4: KIỂM TRA GIỎ HÀNG (SERVER SYNC) ---
WebUI.comment("--- Kiểm tra giỏ hàng sau khi Login lại ---")

// Mở lại giỏ hàng (vì sau login thường về trang chủ)
WebUI.click(findTestObject('Object Repository/Thien/CartSync/open_miniCart')) 
WebUI.waitForElementVisible(findTestObject('Object Repository/Thien/CartSync/product_DetailonCart'), 10)

// Verify
String actualProductName = WebUI.getText(findTestObject('Object Repository/Thien/CartSync/product_DetailonCart')).trim()

if (actualProductName.equals(expectedProductName)) {
    WebUI.comment("✅ PASSED: Sản phẩm được đồng bộ từ Server thành công!")
} else {
    WebUI.takeScreenshot()
    WebUI.keywordMain.stepFailed("❌ FAILED: Giỏ hàng bị mất sản phẩm sau khi login lại!")
}


// ============================
// CLEAN UP
WebUI.click(findTestObject('Object Repository/Thien/CartSync/a_deleteItem'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Thien/CartSync/button_closeCart'))
WebUI.click(findTestObject('Object Repository/Thien/CartSync/a_Account'))
WebUI.click(findTestObject('Object Repository/Thien/CartSync/span_Logout'))
WebUI.delay(2)
WebUI.closeBrowser()