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
	
	//nếu đang đăng nhập thì logout
		
	WebUI.click(findTestObject('Object Repository/Thien/CartSync/a_TRANG PHC'))
	
	//  Bấm vào trang trang phục và di chuột về trái 50 để tránh hover
	WebUI.mouseOverOffset(findTestObject('Object Repository/Thien/CartSync/a_TRANG PHC'), -50, 0)
	WebUI.delay(1)
	
	WebUI.click(findTestObject('Object Repository/Thien/CartSync/a_chooseProduct', [('index') : 1]))
	
	// --- [SỬA ĐỔI] LẤY TÊN SẢN PHẨM TRƯỚC KHI ADD ---
	// Lý do: Lấy tên mong muốn (Expected) ở trang chi tiết trước để đảm bảo chính xác
	WebUI.waitForElementVisible(findTestObject('Object Repository/Thien/CartSync/product_Detail'), 10)
	
	String expectedProductName = WebUI.getText(findTestObject('Object Repository/Thien/CartSync/product_Detail')).trim()
	
	WebUI.comment('Tên sản phẩm mong đợi là: ' + expectedProductName)
	
	// Thêm vào giỏ hàng
	WebUI.click(findTestObject('Object Repository/Thien/CartSync/button_addToCart'))
	
	// Chờ giỏ hàng mini hiện ra (Thay vì delay cứng, dùng waitForElementVisible sẽ nhanh hơn)
	WebUI.waitForElementVisible(findTestObject('Object Repository/Thien/CartSync/product_DetailonCart'), 10)
	
	// verifyElementText(Object cần check, Chuỗi mong muốn)
	// Hàm này sẽ tự động so sánh text trong 'product_DetailonCart' với biến 'expectedProductName'
	WebUI.verifyElementText(findTestObject('Object Repository/Thien/CartSync/product_DetailonCart'), expectedProductName)
	
	// 1. Tìm đối tượng ô nhập số lượng
	TestObject qtyInput = findTestObject('Object Repository/Thien/CartSync/product_quantityonCart')
	
	// 2. Lấy giá trị thực tế đang hiển thị trong ô đó (Lấy attribute 'value')
	String actualQuantity = WebUI.getAttribute(qtyInput, 'value')
	
	// 3. In ra console để kiểm tra (cho chắc)
	WebUI.comment('Số lượng sản phẩm hiện tại trong giỏ hàng là: ' + actualQuantity)
	
	// 4. So sánh: Kiểm tra xem nó có bằng "1" hay không
	// Dùng verifyMatch (Giá trị thực tế, Giá trị mong muốn, Có dùng Regex ko?)
	WebUI.verifyMatch(actualQuantity, '1', false)
	
	// -----------------------------------------------------------
	// BƯỚC 5: KIỂM TRA LOGIC CHẶN GIẢM DƯỚI 1 (MIN LIMIT)
	// -----------------------------------------------------------
	
	TestObject btnMinus = findTestObject('Object Repository/Thien/CartSync/button_QuaMinus')
	TestObject btnPlus = findTestObject('Object Repository/Thien/CartSync/button_QuaPlus')

	// --- 1. KIỂM TRA NÚT TRỪ KHI SL = 1 (Phải bị Disable/Mờ) ---
	// Lấy class hiện tại của nút Trừ
	String classMinusStep1 = WebUI.getAttribute(btnMinus, 'class')
	WebUI.comment("Class của nút Trừ lúc SL=1 là: " + classMinusStep1)

	// Verify: Class này phải chứa từ khóa "disabled"
	// Dùng Regex '.*disabled.*' để tìm kiếm (tức là có chữ disabled nằm ở đâu đó trong chuỗi class)
	WebUI.verifyMatch(classMinusStep1, '.*disabled.*', true, FailureHandling.OPTIONAL)
	// Lưu ý: Nếu web Aristino KHÔNG làm mờ nút (vẫn cho bấm nhưng ko giảm), bạn có thể bỏ dòng verifyMatch trên.
	
	
	// --- 2. BẤM NÚT CỘNG ĐỂ LÊN 2 ---
	WebUI.comment("Thực hiện bấm nút Cộng (+)")
	WebUI.click(btnPlus)
	WebUI.delay(2) // Chờ web xử lý ajax
	
	// Verify chắc chắn đã lên 2
	String qtyAfterPlus = WebUI.getAttribute(qtyInput, 'value')
	WebUI.verifyMatch(qtyAfterPlus, '2', false)
	
	
	// --- 3. KIỂM TRA LẠI NÚT TRỪ KHI SL = 2 (Phải Enable/Sáng lên) ---
	String classMinusStep2 = WebUI.getAttribute(btnMinus, 'class')
	WebUI.comment("Class của nút Trừ lúc SL=2 là: " + classMinusStep2)
	
	// Verify: Class này KHÔNG ĐƯỢC chứa chữ "disabled" nữa (Dùng verifyNotMatch)
	WebUI.verifyNotMatch(classMinusStep2, '.*disabled.*', true)
	
	
	// --- 4. BẤM NÚT TRỪ ĐỂ VỀ 1 ---
	WebUI.comment("Thực hiện bấm nút Trừ (-)")
	WebUI.click(btnMinus)
	WebUI.delay(2) // Chờ web xử lý ajax
	
	
	// --- 5. KIỂM TRA ACTUAL QUANTITY CÓ PHẢI 1 KHÔNG ---
	String finalQuantity = WebUI.getAttribute(qtyInput, 'value')
	WebUI.comment("Số lượng sau khi bấm trừ là: " + finalQuantity)
	
	// So sánh
	WebUI.verifyMatch(finalQuantity, '1', false)
	
	if (finalQuantity == '1') {
		WebUI.comment("✅ PASSED: Hệ thống đã giảm về 1 thành công.")
	} else {
		WebUI.comment("❌ FAILED: Số lượng không về 1.")
	}

	// -----------------------------------------------------------
	
	WebUI.delay(3)
	WebUI.takeScreenshot()
	WebUI.click(findTestObject('Object Repository/Thien/CartSync/a_deleteItem'))
	
	WebUI.delay(5)
	
	WebUI.takeScreenshot()
	
	WebUI.click(findTestObject('Object Repository/Thien/CartSync/button_closeCart'))
	
	// ============================
	// chờ thêm 7 giây để quan sát
	WebUI.delay(7)
	
	// Chụp màn hình trước khi đóng browser
	WebUI.takeScreenshot()
	
	WebUI.closeBrowser()

