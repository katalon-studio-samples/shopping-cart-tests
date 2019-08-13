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

'open Browser'
WebUI.callTestCase(findTestCase("home/my account/login/component/openBrowser"), null)

'lauch shop page'
WebUI.navigateToUrl(GlobalVariable.baseURL)

'get product by name'
String productName = WebUI.callTestCase(findTestCase("data/general/getObjectText"),['elemLabel' : productName])
TestObject lnkProductName = findTestObject("shop/lnkDynProduct",['productName' : productName])

'click product by name'
WebUI.click(lnkProductName)

'get add to cart'
String textOfAddToCart = WebUI.callTestCase(findTestCase("data/general/getObjectText"), ['elemLabel' : addCart])
TestObject btnAddToCart = findTestObject("shop/btnAddCart",['btnAddCart' : textOfAddToCart])

'click add to cart'
WebUI.click(btnAddToCart)

'verify Element on Cart'
String textOfViewCart = WebUI.callTestCase(findTestCase("data/general/getObjectText"), ['elemLabel' : viewCart])
TestObject lnkViewCart = findTestObject("shop/lnkViewCart",[btnViewCart : textOfViewCart])
WebUI.verifyElementPresent(lnkViewCart, GlobalVariable.waitPresentTimeout)

