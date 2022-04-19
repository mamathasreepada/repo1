Feature: Login
Background:
Given user goes into bookstoreapplication page
When user clicking  login tab  
Then user should go in to login page


Scenario: Verification of Login Function  

When user enters UserName with "mamatha123s"
And user enters password with "Mammu123@"  
And user click login button
Then user should see Profile
 
Scenario: Unsuccessful login

When user enters invalidUserName with "mamata123s"
And user enters invalidpassword with "hdjdshd"  
And user wil click login button
Then Error message displayed with invalid username or password

