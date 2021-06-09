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

WebUI.click(findTestObject('Object Repository/Page_Southwest Airlines - Book a Flight/button_Special OffersOpens flyout'))

WebUI.click(findTestObject('Object Repository/Page_Southwest Airlines - Book a Flight/a_Flights'))

WebUI.click(findTestObject('Object Repository/Page_Cheap Flights, Air Deals  Travel Offer_04e996/span_Book now'))

WebUI.click(findTestObject('Object Repository/Page_Southwest Low Fare Calendar  Southwest_5e7418/button_Special OffersOpens flyout'))

WebUI.click(findTestObject('Object Repository/Page_Southwest Low Fare Calendar  Southwest_5e7418/span_Opens new window. External site which _33a3c4'))

WebUI.switchToWindowTitle('Southwest Airlines: Deals')

WebUI.setText(findTestObject('Object Repository/Page_Southwest Airlines Deals/input_Type your destination_ss'), 'san diego')

WebUI.click(findTestObject('Object Repository/Page_Southwest Airlines Deals/span_Search'))

WebUI.click(findTestObject('Object Repository/Page_Southwest Airlines  Hotels in San Dieg_3df7c1/a_Price (lowest first)'))

WebUI.click(findTestObject('Object Repository/Page_Southwest Airlines  Hotels in San Dieg_3df7c1/a_Our Top Picks'))

WebUI.click(findTestObject('Object Repository/Page_Southwest Airlines  Hotels in San Dieg_3df7c1/a_San Diego'))

WebUI.click(findTestObject('Object Repository/Page_The 10 Best San Diego Hotels (From 69)/span_Search'))

WebUI.click(findTestObject('Object Repository/Page_Southwest Airlines  Hotels in San Dieg_3df7c1/span_Search'))

