# shopping-cart-tests
1. Profiles
    - In here, we will save all global variables, you can call them for everywhere(Test Case, Test Suites...)
2. Test Cases
    - We using Custom keyword or Data-driven for definition a Test Case
      + Custom keyword
        - We definition these function re-use many times. Example: Login,Shop,Checkout...
        - Syntax of Custom keyword :
           @Keyword
           def static {return type} {functinname}(parameters,parameters...){
              ...
           }
      + Data-driven
        - We using function getAllData() for get all row of data file and get first column of each row in data file after add to collect and parse to list
    - We have three test case:
      + TC 1 : we will add single product to cart after check out 
      + TC 2 : we will add single product to cart with coupon 50% and check out
      + TC 3 : we will add multiple product to cart and check out
    - How to run : 
      + You double-click on TC you want to run -> Click on run button or Press the key combination Ctrl + Shift + A and observe result.
3. Test Suites
    - Using Data driven
      + Using Data Binding in Test Suites or data in Test Case
         + Using Data Binding in Test Suites : On TS Click Show Data Binding -> Test Data table -> click on Add button -> tick Test Data checkbox you want used and on Variable Binding -> Click Set Type chocie Data Column -> Click on Set Test Data choice Test Data above,after mapping Variable on TC with column of data.
         + Data in Test Case : find Test Data and Stream List of product and get first column of each row in data file after add collect and parse to list.
    - Using Global Variable
      + In here,we call Custom Keyword in Test Case and parameters is Global Variable
    - How to run:
      + You double-click on TS you want to run -> Click on run button or Press the key combination Ctrl + Shift + A and observe result.
4. Data Files
    - List Product: list of product you want to add to cart.
    - Multiple Checkout : list information shipping of user on Checkout page.
