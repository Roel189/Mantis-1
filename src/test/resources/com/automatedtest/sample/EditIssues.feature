Feature: SearchIssues
  @functionals


Scenario Outline: Add Note
  Given The user wants to search any issue    
  When The user fills the search bar with "<issue_id>"
  And clicks on Jump button
  And clicks on to add notes "<notes>"
  Then The system shows the created notes "<notes>"
    
  Examples: 
  | issue_id| notes        |
  | 0006165 |Note 001 Test | 
  | 0006166 |Note 002 Test |


    
    
    
