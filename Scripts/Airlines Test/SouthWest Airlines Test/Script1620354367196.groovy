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

WebUI.navigateToUrl('https://www.southwest.com/air/booking/')

WebUI.setText(findTestObject('Object Repository/Page_Southwest Airlines - Book a Flight/input_Depart_originationAirportCode'), 
    'SAN')

WebUI.setText(findTestObject('Object Repository/Page_Southwest Airlines - Book a Flight/input_Arrive_destinationAirportCode'), 
    'LAS')

WebUI.click(findTestObject('Object Repository/Page_Southwest Airlines - Book a Flight/input_(Optional)_promoCode'))

WebUI.click(findTestObject('Object Repository/Page_Southwest Airlines - Book a Flight/button_Search'))


WebUI.setText(findTestObject('Object Repository/Page_Southwest Airlines - Book a Flight/input_Depart_originationAirportCode'), 
    'SAN')

WebUI.setText(findTestObject('Object Repository/Page_Southwest Airlines - Book a Flight/input_Arrive_destinationAirportCode'), 
    'LAS')

WebUI.click(findTestObject('Object Repository/Page_Southwest Airlines - Book a Flight/input_(Optional)_promoCode'))

WebUI.click(findTestObject('Object Repository/Page_Southwest Airlines - Book a Flight/button_Search'))



WebUI.click(findTestObject('Object Repository/Page_Southwest Airlines - Book a Flight/a_Low Fare Calendar'))

WebUI.setText(findTestObject('Object Repository/Page_Southwest Low Fare Calendar  Southwest_5e7418/input_Arrive_destinationAirportCode'), 
    'las')

WebUI.click(findTestObject('Object Repository/Page_Southwest Low Fare Calendar  Southwest_5e7418/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Southwest Low Fare Calendar  Southwest_5e7418/button_Where we flyOpens Modal'))

WebUI.click(findTestObject('Object Repository/Page_Southwest Low Fare Calendar  Southwest_5e7418/button_List view'))

WebUI.click(findTestObject('Object Repository/Page_Southwest Low Fare Calendar  Southwest_5e7418/a_Visit route mapOpens new window'))

