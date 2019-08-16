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

		WebUI.waitForElementPresent(findTestObject('Simple Object/Shop page/lnkShop'),GlobalVariable.waitPresentTimeout)
		WebUI.click(findTestObject('Simple Object/Shop page/lnkShop'))

		WebUI.waitForElementPresent(findTestObject('Simple Object/Shop page/lblProduct'), GlobalVariable.waitPresentTimeout)
		WebUI.click(findTestObject('Simple Object/Shop page/lblProduct'))

		WebUI.waitForElementPresent(findTestObject('Simple Object/Shop page/btnAddToCart'), GlobalVariable.waitPresentTimeout)
		WebUI.click(findTestObject('Simple Object/Shop page/btnAddToCart'))

		WebUI.waitForElementPresent(findTestObject('Simple Object/Shop page/lnkViewCart'), GlobalVariable.waitPresentTimeout)
		WebUI.click(findTestObject('Simple Object/Shop page/lnkViewCart'))

		WebUI.verifyElementPresent(findTestObject('Object Repository/Simple Object/Shop page/btnProceed'), GlobalVariable.waitPresentTimeout)
	}
}
