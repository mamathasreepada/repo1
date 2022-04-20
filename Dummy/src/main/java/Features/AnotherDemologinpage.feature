Feature: Login Action 
    
//Extra comments 


Scenario Outline: Login with valid and Invalid Credentials 

    Given user goes into login page
	
    
    Then User enters "<username>" and "<password>" 
   
    
    
    Then User enters "<username>" and "<password>" 
    And Keeping case as InValid and click on login button
    Then Error message displayed with invalid username or password
    

Examples: 
        |username|password|
        |mamatha123s|Mammu123@|
        |mama345|dfsd2|


