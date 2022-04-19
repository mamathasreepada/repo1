Feature: Verification of Login Feature

Background: 
When I Clear The Cache 
 
Scenario: Test Login with Valid Data
Given Browser is launch
When I enter the xredentials
Then I click on login
And I verifies that i succesfully Loggeg in

@Smoke
Scenario: Test2 
Given Abc
When D
Then E
And F