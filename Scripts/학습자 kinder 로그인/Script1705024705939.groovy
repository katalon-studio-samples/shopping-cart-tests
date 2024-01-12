import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://stg.quebon.tv/')

WebUI.click(findTestObject('Object Repository/학습자 로그인 kinder/Page_/a_'))

WebUI.click(findTestObject('Object Repository/학습자 로그인 kinder/Page_/button_KINDER'))

WebUI.switchToWindowTitle('깨봉수학')

WebUI.setText(findTestObject('Object Repository/학습자 로그인 kinder/Page_/input_email'), 'kinder8515')

WebUI.setEncryptedText(findTestObject('Object Repository/학습자 로그인 kinder/Page_/input_password'), '5Ed5CIkj9UQfaMZXAkDVaQ==')

WebUI.click(findTestObject('Object Repository/학습자 로그인 kinder/Page_/button_'))

WebUI.click(findTestObject('Object Repository/학습자 로그인 kinder/Page_/a__1'))

WebUI.click(findTestObject('Object Repository/학습자 로그인 kinder/Page_/div_20.542'))

WebUI.click(findTestObject('Object Repository/학습자 로그인 kinder/Page_/li_12039'))

WebUI.click(findTestObject('Object Repository/학습자 로그인 kinder/Page_/li_20.542'))

WebUI.click(findTestObject('Object Repository/학습자 로그인 kinder/Page_/img'))

WebUI.click(findTestObject('Object Repository/학습자 로그인 kinder/Page_/img_1'))

WebUI.click(findTestObject('Object Repository/학습자 로그인 kinder/Page_/img_1_2'))

WebUI.click(findTestObject('Object Repository/학습자 로그인 kinder/Page_/button_flex items-center justify-center fle_a97ba1'))

WebUI.click(findTestObject('Object Repository/학습자 로그인 kinder/Page_/img_1_2_3'))

WebUI.click(findTestObject('Object Repository/학습자 로그인 kinder/Page_/button__1'))

WebUI.click(findTestObject('Object Repository/학습자 로그인 kinder/Page_/button_flex items-center justify-center fle_a97ba1'))