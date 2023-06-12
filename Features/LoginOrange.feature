Feature: Login to HRM  
 
@ValidCredentials
Scenario: Login with valid credentials
Given User is on Home page
When User enters username as "Admin"
And User enters password as "admin123"
     
@InValidCredentials   
Scenario Outline: Login with invalid credentials
Given User is on Home page
When User enters username as '<username>'
And User enters password as '<password>'
Then User should be able to see error message '<errorMessage>'
       
Examples:
|username  |password  |errorMessage                    |
|admin     |admin     |Invalid credentials             |
|          |admin123  |Username cannot be empty        | 
