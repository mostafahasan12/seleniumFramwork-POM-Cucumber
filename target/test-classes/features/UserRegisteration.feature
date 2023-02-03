Feature: User Registeration 
  I want to check that the user can register in our e-commerce website.
  
Scenario Outline: : UserRegistration
Given the user in the home page 
When I click on the register link 
And I entered "firstname" , "lastname" , "email" , "password"
Then The registeration page displayed successfully 

Examples:
      | firstname | lastname | email          | password|
      | ahmed     | hasan    | ahmed@test.com | 1234567 | 
      |eslam      | osama    | aiuy@user.com  | 7654321 |

