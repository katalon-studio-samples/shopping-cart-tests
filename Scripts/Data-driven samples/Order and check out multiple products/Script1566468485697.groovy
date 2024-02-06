import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.util.stream.Collectors

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

CustomKeywords.'sample.Login.loginIntoApplicationWithGlobalVariable'()

WebUI.waitForElementPresent(findTestObject('Pages/Shop page/lnkShop'), GlobalVariable.waitPresentTimeout)

WebUI.click(findTestObject('Pages/Shop page/lnkShop'))

TestData product = findTestData(GlobalVariable.dataFile)
List<String> productList = product.getAllData().stream()
							.map{data -> data[0]}/*get first column of each row in data file */
							.collect(Collectors.toList())/*add collect and parse to list*/

for(def productName : productList){
	CustomKeywords.'sample.Shop.addToCart'(productName.toString(), GlobalVariable.urlProduct)
}
CustomKeywords.'sample.Checkout.CheckoutShopWithGlobalVariable'()

//close browser
WebUI.closeBrowser()