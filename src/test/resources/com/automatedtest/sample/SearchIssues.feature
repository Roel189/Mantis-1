Feature: SearchIssues

Background:
Given The user wants to search any issue
  @functionals
  Scenario Outline: Search issues by id    
   When The user fills the search bar with "<issue_id>"
   And clicks on Jump button
   Then The system shows the searched "<issue_id>"
    
    Examples: 
    | issue_id|
    | 0006165 | 
    | 0006166 |
    
    Scenario Outline: Try to search issue using letters and special characters
    When The user fills the search bar with "<wrong_issue_id>"
    And clicks on Jump button
    Then The system return the message "<message>" 
     
    Examples: 
    | wrong_issue_id | message |
    |  %$@%%%%       |A number was expected for bug_id.| 
    |  test_         |A number was expected for bug_id.| 
    
    
    