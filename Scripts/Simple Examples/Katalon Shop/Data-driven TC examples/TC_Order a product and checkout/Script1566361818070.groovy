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

CustomKeywords.'simple.Login.loginIntoApplicationWith'()

WebUI.waitForElementPresent(findTestObject('Simple Object/Shop page/lnkShop'), GlobalVariable.waitPresentTimeout)

WebUI.click(findTestObject('Simple Object/Shop page/lnkShop'))

TestData productList = findTestData(GlobalVariable.dataFile)
List<String> a = productList.getAllData().stream().map{data -> data[0]}.collect(Collectors.toList())

for(def s : a){
	CustomKeywords.'simple.Shop.addToCart'(s.toString(), GlobalVariable.urlProduct)
}
CustomKeywords.'simple.Checkout.CheckoutShopWith'()
WebUI.closeBrowser()