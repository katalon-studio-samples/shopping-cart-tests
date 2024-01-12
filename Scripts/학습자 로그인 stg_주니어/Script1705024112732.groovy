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

WebUI.click(findTestObject('Object Repository/stg.quebon.tv 학습자 로그인/Page_/Page_/a_'))

WebUI.click(findTestObject('Object Repository/stg.quebon.tv 학습자 로그인/Page_/Page_/li_'))

WebUI.click(findTestObject('Object Repository/stg.quebon.tv 학습자 로그인/Page_/Page_/input_id'))

WebUI.click(findTestObject('Object Repository/stg.quebon.tv 학습자 로그인/Page_/Page_/div_KINDER'))

WebUI.setText(findTestObject('Object Repository/stg.quebon.tv 학습자 로그인/Page_/Page_/input_id'), 'junior8515')

WebUI.setEncryptedText(findTestObject('Object Repository/stg.quebon.tv 학습자 로그인/Page_/Page_/input_password'), '9NLz+4tGZcQ=')

WebUI.click(findTestObject('Object Repository/stg.quebon.tv 학습자 로그인/Page_/Page_/div_'))

WebUI.setEncryptedText(findTestObject('Object Repository/stg.quebon.tv 학습자 로그인/Page_/Page_/input_password'), '5Ed5CIkj9UQfaMZXAkDVaQ==')

WebUI.click(findTestObject('Object Repository/stg.quebon.tv 학습자 로그인/Page_/Page_/div_KINDER_1'))

WebUI.click(findTestObject('Object Repository/stg.quebon.tv 학습자 로그인/Page_/Page_/button_'))

WebUI.click(findTestObject('Object Repository/stg.quebon.tv 학습자 로그인/Page_/Page_/a__1'))

WebUI.click(findTestObject('Object Repository/stg.quebon.tv 학습자 로그인/Page_/Page_/button__1'))

WebUI.click(findTestObject('Object Repository/stg.quebon.tv 학습자 로그인/Page_/Page_/div_close-btn'))

WebUI.click(findTestObject('Object Repository/stg.quebon.tv 학습자 로그인/Page_/Page_/a_My'))

WebUI.click(findTestObject('Object Repository/stg.quebon.tv 학습자 로그인/Page_/Page_/a__1_2'))

