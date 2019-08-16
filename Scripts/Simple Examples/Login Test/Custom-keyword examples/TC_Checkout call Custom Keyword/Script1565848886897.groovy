import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable


CustomKeywords.'simple.login.Login.loginIntoApplicationWith'()

WebUI.click(findTestObject('Object Repository/Simple Object/HomePage/Checkout/lnkCheckout'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Simple Object/HomePage/Checkout/inputCompanyName'), GlobalVariable.waitPresentTimeout)

WebUI.setText(findTestObject('Object Repository/Simple Object/HomePage/Checkout/inputCompanyName'), GlobalVariable.companyName)

CustomKeywords.'simple.select2.Select2.selectOptionByLabel'(findTestObject('Object Repository/Simple Object/Select2/select_single'), GlobalVariable.optionText)

CustomKeywords.'simple.select2.Select2.getAllOptionsLabel'(findTestObject('Object Repository/Simple Object/Select2/select_single'))

CustomKeywords.'simple.select2.Select2.getSelectedOptionsLabel'(findTestObject('Object Repository/Simple Object/Select2/select_single'))

WebUI.setText(findTestObject('Object Repository/Simple Object/HomePage/Checkout/inputAddress'), GlobalVariable.address)

WebUI.setText(findTestObject('Object Repository/Simple Object/HomePage/Checkout/inputCity'), GlobalVariable.city)

WebUI.setText(findTestObject('Object Repository/Simple Object/HomePage/Checkout/inputCountry'), GlobalVariable.country)

WebUI.setText(findTestObject('Object Repository/Simple Object/HomePage/Checkout/inputPostcode'), GlobalVariable.postCode)

WebUI.setText(findTestObject('Object Repository/Simple Object/HomePage/Checkout/inputPhone'), GlobalVariable.Phone)

WebUI.callTestCase(findTestCase('Test Cases/Simple Examples/Utils/waitBlockUIDismissed'), null)

WebUI.click(findTestObject('Object Repository/Simple Object/HomePage/Checkout/btnPlaceOrder'))

//WebUI.closeBrowser()