import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.testng.asserts.SoftAssert as SoftAssert
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

// Khởi tạo SoftAssert
SoftAssert softAssertion = new SoftAssert()

// --- CẤU HÌNH USER ---
String url = 'https://aristino.com/'

String userEmail = 'concocon198thien@gmail.com'

String userPass = 'N4LHEkK0aTbaTUc5DZaF2w=='

// --- BƯỚC 1: KHỞI TẠO ---
WebUI.openBrowser('https://www.google.com/')

WebUI.maximizeWindow()

//chuyển driver vào biến (giữ nguyên)
def driver = com.kms.katalon.core.webui.driver.DriverFactory.getWebDriver()

// Điều hướng tới trang Aristino
WebUI.navigateToUrl(url)

// Chờ trang load hoàn toàn
WebUI.waitForPageLoad(10)

// KIỂM TRA SLIDEDOWN TRONG 3s
TestObject slideDown = new TestObject('slidedown')

slideDown.addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, '//div[@id=\'antsomi-slidedown-dialog\']')

boolean isSlideDownVisible = WebUI.waitForElementVisible(slideDown, 3, FailureHandling.OPTIONAL)

// Nếu popup xuất hiện → bấm Cancel
if (isSlideDownVisible) {
	WebUI.click(findTestObject('Object Repository/Thien/CartSync/button_cancel_slidedown'))
}

// ============================
// KHỐI LỆNH THAO TÁC:


WebUI.comment("--- BẮT ĐẦU KIỂM TRA TRẠNG THÁI ĐĂNG NHẬP ---")
WebUI.click(findTestObject('Object Repository/Thien/CartSync/a_Account'))
WebUI.delay(1) // Chờ menu xổ xuống

// Kiểm tra xem nút Logout có xuất hiện không (trong 2 giây)
// FailureHandling.OPTIONAL: Nếu không thấy (tức là chưa login) thì không báo lỗi, cứ chạy tiếp
boolean isLoggedIn = WebUI.waitForElementVisible(findTestObject('Object Repository/Thien/CartSync/span_Logout'), 2, FailureHandling.OPTIONAL)

if (isLoggedIn) {
WebUI.comment("⚠️ Phát hiện đang Login -> Thực hiện Logout để về Guest")
WebUI.click(findTestObject('Object Repository/Thien/CartSync/span_Logout'))
WebUI.waitForPageLoad(10) // Chờ reload sau khi logout
} else {
WebUI.comment("✅ Chưa đăng nhập (Guest) -> Tiếp tục quy trình")
// Nếu menu Account đang mở che màn hình, click lại vào nó để đóng (hoặc click ra ngoài)
// Nhưng vì bước tiếp theo là chuyển trang sang 'TRANG PHỤC' nên không cần đóng cũng được.
}
//Login

WebUI.click(findTestObject('Object Repository/Thien/CartSync/a_Account'))

WebUI.setText(findTestObject('Object Repository/Thien/CartSync/input_Email_login-email'), userEmail)

WebUI.setEncryptedText(findTestObject('Object Repository/Thien/CartSync/input_Mt Khu_password'), userPass)
WebUI.click(findTestObject('Object Repository/Thien/CartSync/button_ng nhp'))

WebUI.click(findTestObject('Object Repository/Thien/CartSync/a_TRANG PHC'))

//  Bấm vào trang trang phục và di chuột về trái 50 để tránh hover
WebUI.mouseOverOffset(findTestObject('Object Repository/Thien/CartSync/a_TRANG PHC'), -50, 0)
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Thien/CartSync/a_chooseProduct', [('index') : 5]))

// --- [SỬA ĐỔI] LẤY TÊN SẢN PHẨM TRƯỚC KHI ADD ---
// Lý do: Lấy tên mong muốn (Expected) ở trang chi tiết trước để đảm bảo chính xác
WebUI.waitForElementVisible(findTestObject('Object Repository/Thien/CartSync/product_Detail'), 10)

String expectedProductName = WebUI.getText(findTestObject('Object Repository/Thien/CartSync/product_Detail')).trim()

WebUI.comment('Tên sản phẩm mong đợi là: ' + expectedProductName)

// Thêm vào giỏ hàng
WebUI.click(findTestObject('Object Repository/Thien/CartSync/button_addToCart'))

// Chờ giỏ hàng mini hiện ra (Thay vì delay cứng, dùng waitForElementVisible sẽ nhanh hơn)
WebUI.waitForElementVisible(findTestObject('Object Repository/Thien/CartSync/product_DetailonCart'), 10)
WebUI.click(findTestObject('Object Repository/Thien/CartSync/button_closeCart'))
WebUI.delay(5)
//lặp lại việc thêm sản phẩm đó vào cart
WebUI.comment("--- THÊM SẢN PHẨM LẦN 2 ---")
WebUI.click(findTestObject('Object Repository/Thien/CartSync/button_addToCart'))
WebUI.waitForElementVisible(findTestObject('Object Repository/Thien/CartSync/product_DetailonCart'), 10)

// verifyElementText(Object cần check, Chuỗi mong muốn)
// Hàm này sẽ tự động so sánh text trong 'product_DetailonCart' với biến 'expectedProductName'
WebUI.verifyElementText(findTestObject('Object Repository/Thien/CartSync/product_DetailonCart'), expectedProductName)

// 1. Lấy giá gốc (Unit Price) - Object này bạn check lại xem dùng CSS cũ hay XPath mới nhé
String unitPriceText = WebUI.getText(findTestObject('Object Repository/Thien/CartSync/product_PriceDefault'))
// Clean text: Xóa hết chữ cái, chỉ giữ số
int unitPrice = Integer.parseInt(unitPriceText.replaceAll("[^0-9]", ""))

WebUI.comment("Giá đơn vị (int): " + unitPrice)

// 2. Verify số lượng = 2
TestObject qtyInput = findTestObject('Object Repository/Thien/CartSync/product_quantityonCart')
String actualQuantity = WebUI.getAttribute(qtyInput, 'value')
WebUI.verifyMatch(actualQuantity, '2', false)

// 3. Lấy TỔNG TIỀN (Subtotal) theo XPath mới của bạn
String totalPriceText = WebUI.getText(findTestObject('Object Repository/Thien/CartSync/product_PriceTotal'))
WebUI.comment("Text lấy được từ XPath priceTotal: " + totalPriceText)

// Xử lý chuỗi tổng tiền (Dùng Regex [^0-9] để xóa mọi thứ không phải là số cho an toàn tuyệt đối)
int actualTotalPrice = Integer.parseInt(totalPriceText.replaceAll("[^0-9]", ""))

// 4. Tính toán mong đợi:
// Công thức: Expected = UnitPrice * Quantity
int expectedTotalPrice = unitPrice * Integer.parseInt(actualQuantity)

WebUI.comment("Phép tính check: " + unitPrice + " * " + actualQuantity + " = " + expectedTotalPrice)

// 5. SO SÁNH
if (actualTotalPrice == expectedTotalPrice) {
	WebUI.comment("✅ PASSED: Tổng tiền chính xác!")
} else {
	WebUI.takeScreenshot()
	WebUI.comment("Fail")
}

WebUI.delay(3)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Object Repository/Thien/CartSync/a_deleteItem'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Thien/CartSync/button_closeCart'))

WebUI.click(findTestObject('Object Repository/Thien/CartSync/a_Account'))

WebUI.click(findTestObject('Object Repository/Thien/CartSync/span_Logout'))

// ============================
// chờ thêm 7 giây để quan sát
WebUI.delay(7)

// Chụp màn hình trước khi đóng browser
WebUI.takeScreenshot()

WebUI.closeBrowser()

