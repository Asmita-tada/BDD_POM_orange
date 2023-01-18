Feature: Login Test Automation for OrangeHRM Website Final

Scenario: Login to OrangeHRM Website Final

Given User is already on OrnageHRM login page
When title of loginpage is OrangeHRM
Then user enters "Admin" and "admin123" final
Then user clicks on login butoon
Then user is on Homepage
When user click on PIM on Homepage
Then user click on add employee on Orangepage
Then user enters firstname and lastname and midname and save
|fname|lname|midname|
 |John|smith|tda|
 |Adm|dom|rec|
Then user exit