Feature: LoginPage Test

Scenario Outline: Multiple data set
Given My username is fixed is "Test"
Given I have current <UserNameValue>
Given I have <Password> of the user


Examples:
|UserNameValue|Password|
|AdminUser|Password1|
|SalesUser|Password2|
|CorpUser|Password3|
