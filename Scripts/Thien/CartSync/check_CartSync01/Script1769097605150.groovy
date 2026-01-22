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
WebUI.click(findTestObject('Object Repository/Thien/CartSync/a_Account'))

WebUI.setText(findTestObject('Object Repository/Thien/CartSync/input_Email_login-email'), userEmail)

WebUI.setEncryptedText(findTestObject('Object Repository/Thien/CartSync/input_Mt Khu_password'), userPass)

WebUI.click(findTestObject('Object Repository/Thien/CartSync/button_ng nhp'))

WebUI.click(findTestObject('Object Repository/Thien/CartSync/a_TRANG PHC'))
//  Bấm vào trang trang phục và di chuột về trái 50 để tránh hover
WebUI.mouseOverOffset(findTestObject('Object Repository/Thien/CartSync/a_TRANG PHC'), -50, 0)
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Thien/CartSync/a_chooseProduct', [('index') : 2]))

// --- [SỬA ĐỔI] LẤY TÊN SẢN PHẨM TRƯỚC KHI ADD ---
// Lý do: Lấy tên mong muốn (Expected) ở trang chi tiết trước để đảm bảo chính xác
WebUI.waitForElementVisible(findTestObject('Object Repository/Thien/CartSync/product_Detail'), 10)
String expectedProductName = WebUI.getText(findTestObject('Object Repository/Thien/CartSync/product_Detail')).trim()
WebUI.comment("Tên sản phẩm mong đợi là: " + expectedProductName)

// Thêm vào giỏ hàng
WebUI.click(findTestObject('Object Repository/Thien/CartSync/button_addToCart'))

// Chờ giỏ hàng mini hiện ra (Thay vì delay cứng, dùng waitForElementVisible sẽ nhanh hơn)
WebUI.waitForElementVisible(findTestObject('Object Repository/Thien/CartSync/product_DetailonCart'), 10)

// --- [SỬA ĐỔI] CHECK PRODUCT NAME ---
// verifyElementText(Object cần check, Chuỗi mong muốn)
// Hàm này sẽ tự động so sánh text trong 'product_DetailonCart' với biến 'expectedProductName'
WebUI.verifyElementText(findTestObject('Object Repository/Thien/CartSync/product_DetailonCart'), expectedProductName)

WebUI.delay(3)

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



