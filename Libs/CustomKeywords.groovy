
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject

import java.lang.String

import java.util.List


def static "simple.select2.Select2.selectOptionByLabel"(
    	TestObject to	
     , 	String option	) {
    (new simple.select2.Select2()).selectOptionByLabel(
        	to
         , 	option)
}

def static "simple.select2.Select2.selectManyOptionsByLabel"(
    	TestObject to	
     , 	java.util.List<String> options	) {
    (new simple.select2.Select2()).selectManyOptionsByLabel(
        	to
         , 	options)
}

def static "simple.select2.Select2.getSelectedOptionsLabel"(
    	TestObject to	) {
    (new simple.select2.Select2()).getSelectedOptionsLabel(
        	to)
}

def static "simple.select2.Select2.getSelectedOptionsList"(
    	TestObject to	) {
    (new simple.select2.Select2()).getSelectedOptionsList(
        	to)
}

def static "simple.select2.Select2.getAllOptionsLabel"(
    	TestObject to	) {
    (new simple.select2.Select2()).getAllOptionsLabel(
        	to)
}

def static "simple.select2.Select2.removeOptions"(
    	TestObject to	
     , 	java.util.List<String> options	) {
    (new simple.select2.Select2()).removeOptions(
        	to
         , 	options)
}

def static "simple.select2.Utils.clickOnSelect2"(
    	TestObject to	) {
    (new simple.select2.Utils()).clickOnSelect2(
        	to)
}

def static "simple.select2.Utils.findContainer"(
    	TestObject to	) {
    (new simple.select2.Utils()).findContainer(
        	to)
}

def static "simple.select2.Utils.selectResult"(
    	String option	
     , 	String subContainerOpenClass	) {
    (new simple.select2.Utils()).selectResult(
        	option
         , 	subContainerOpenClass)
}

def static "simple.select2.Utils.enterText"(
    	String option	) {
    (new simple.select2.Utils()).enterText(
        	option)
}

def static "simple.login.Login.loginIntoApplication"(
    	String applicationURL	
     , 	String username	
     , 	String password	) {
    (new simple.login.Login()).loginIntoApplication(
        	applicationURL
         , 	username
         , 	password)
}

def static "simple.login.Login.loginIntoApplicationWith"() {
    (new simple.login.Login()).loginIntoApplicationWith()
}

def static "simple.login.Login.logoutFromApllication"() {
    (new simple.login.Login()).logoutFromApllication()
}

def static "simple.shop.Shop.addToCart"() {
    (new simple.shop.Shop()).addToCart()
}
