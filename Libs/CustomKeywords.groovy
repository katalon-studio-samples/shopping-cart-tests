
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject

import java.lang.String

import org.openqa.selenium.WebElement


def static "simple.component.JSelect.selectByText"(
    	TestObject container	
     , 	TestObject o	
     , 	String optionText	) {
    (new simple.component.JSelect()).selectByText(
        	container
         , 	o
         , 	optionText)
}

def static "simple.component.JSelect.selectByText"(
    	TestObject container	
     , 	String labelSelect	
     , 	String optionText	) {
    (new simple.component.JSelect()).selectByText(
        	container
         , 	labelSelect
         , 	optionText)
}

def static "simple.component.JSelect.selectByText"(
    	TestObject container	
     , 	WebElement el	
     , 	String optionText	) {
    (new simple.component.JSelect()).selectByText(
        	container
         , 	el
         , 	optionText)
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
