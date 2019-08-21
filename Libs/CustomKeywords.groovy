
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject

import java.lang.String

import java.util.List


def static "simple.Utils.clickOnSelect2"(
    	TestObject to	) {
    (new simple.Utils()).clickOnSelect2(
        	to)
}

def static "simple.Utils.findContainer"(
    	TestObject to	) {
    (new simple.Utils()).findContainer(
        	to)
}

def static "simple.Utils.selectResult"(
    	String option	
     , 	String subContainerOpenClass	) {
    (new simple.Utils()).selectResult(
        	option
         , 	subContainerOpenClass)
}

def static "simple.Utils.enterText"(
    	String option	) {
    (new simple.Utils()).enterText(
        	option)
}

def static "simple.Checkout.CheckoutShop"(
    	String companyName	
     , 	String optionText	
     , 	String address	
     , 	String city	
     , 	String postCode	
     , 	String Phone	) {
    (new simple.Checkout()).CheckoutShop(
        	companyName
         , 	optionText
         , 	address
         , 	city
         , 	postCode
         , 	Phone)
}

def static "simple.Checkout.CheckoutShopWith"() {
    (new simple.Checkout()).CheckoutShopWith()
}

def static "simple.Select2.selectOptionByLabel"(
    	TestObject to	
     , 	String option	) {
    (new simple.Select2()).selectOptionByLabel(
        	to
         , 	option)
}

def static "simple.Select2.selectManyOptionsByLabel"(
    	TestObject to	
     , 	java.util.List<String> options	) {
    (new simple.Select2()).selectManyOptionsByLabel(
        	to
         , 	options)
}

def static "simple.Select2.getSelectedOptionsLabel"(
    	TestObject to	) {
    (new simple.Select2()).getSelectedOptionsLabel(
        	to)
}

def static "simple.Select2.getSelectedOptionsList"(
    	TestObject to	) {
    (new simple.Select2()).getSelectedOptionsList(
        	to)
}

def static "simple.Select2.getAllOptionsLabel"(
    	TestObject to	) {
    (new simple.Select2()).getAllOptionsLabel(
        	to)
}

def static "simple.Select2.removeOptions"(
    	TestObject to	
     , 	java.util.List<String> options	) {
    (new simple.Select2()).removeOptions(
        	to
         , 	options)
}

def static "simple.Login.loginIntoApplication"(
    	String applicationURL	
     , 	String username	
     , 	String password	) {
    (new simple.Login()).loginIntoApplication(
        	applicationURL
         , 	username
         , 	password)
}

def static "simple.Login.loginIntoApplicationWith"() {
    (new simple.Login()).loginIntoApplicationWith()
}

def static "simple.Login.logoutFromApplication"() {
    (new simple.Login()).logoutFromApplication()
}

def static "simple.Shop.addToCart"(
    	String productName	
     , 	String urlProduct	) {
    (new simple.Shop()).addToCart(
        	productName
         , 	urlProduct)
}

def static "simple.Shop.addToCartWith"() {
    (new simple.Shop()).addToCartWith()
}
