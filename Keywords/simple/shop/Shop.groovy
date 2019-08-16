package simple.shop

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import simple.login.Login

public class Shop {
	@Keyword
	def static void addToCart(){
		Login.loginIntoApplicationWith()

		WebUI.waitForElementPresent(findTestObject('Object Repository/Simple Object/HomePage/Shop/lnkShop'),GlobalVariable.waitPresentTimeout)
		WebUI.click(findTestObject('Object Repository/Simple Object/HomePage/Shop/lnkShop'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Simple Object/HomePage/Shop/lblProduct'), GlobalVariable.waitPresentTimeout)
		WebUI.click(findTestObject('Object Repository/Simple Object/HomePage/Shop/lblProduct'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Simple Object/HomePage/Shop/btnAddToCart'), GlobalVariable.waitPresentTimeout)
		WebUI.click(findTestObject('Object Repository/Simple Object/HomePage/Shop/btnAddToCart'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Simple Object/HomePage/Shop/lnkViewCart'), GlobalVariable.waitPresentTimeout)
		WebUI.click(findTestObject('Object Repository/Simple Object/HomePage/Shop/lnkViewCart'))
	}
}
