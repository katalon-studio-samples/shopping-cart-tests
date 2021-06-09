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

WebUI.click(findTestObject('Object Repository/Page_Southwest Airlines - Book a Flight/div_Flight type optionsRound tripOne-wayMul_9c2d35'))

WebUI.click(findTestObject('Object Repository/Page_Southwest Airlines - Book a Flight/input_Round trip_tripType'))

WebUI.click(findTestObject('Object Repository/Page_Southwest Airlines - Book a Flight/input_Round trip_tripType'))

WebUI.click(findTestObject('Object Repository/Page_Southwest Airlines - Book a Flight/span_Round trip'))

WebUI.click(findTestObject('Object Repository/Page_Southwest Airlines - Book a Flight/input_Special Accommodations_input--text'))

WebUI.click(findTestObject('Object Repository/Page_Southwest Airlines - Book a Flight/ul_Stop remembering'))

WebUI.click(findTestObject('Object Repository/Page_Southwest Airlines - Book a Flight/button_Flight  Hotel  Car  VacationsOpens flyout'))

WebUI.click(findTestObject('Object Repository/Page_Southwest Airlines - Book a Flight/a_Book a HotelOpens new window. External si_e865fe'))

WebUI.click(findTestObject('Object Repository/Page_Southwest Airlines - Book a Flight/a_Book a Flight'))

