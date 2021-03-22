Feature: ViewIssues

Background:
Given The user wants to see any issue
  @functionals
  Scenario Outline: Try to filter some issue registered on another project 
   When The user selects a project "<Project>"
   When clicks on View Issues  
   And fills the filter bar with "<issue_id>"
   And clicks on Filter button
   Then The system does not show the searched "<issue_id>"
    
    Examples: 
    | issue_id| Project |
    | 0006165 | Desafio jMeter Project 2|
    | 0006194 | Desafio jMeter Project 1|
    
   Scenario Outline: Filter some issue registered on the same project 
   When The user selects a project "<Project>"
   When clicks on View Issues  
   And fills the filter bar with "<issue_id>"
   And clicks on Filter button
   Then The system does not show the searched "<issue_id>"
    
    Examples: 
    | issue_id| Project |
    | 0006194 | Desafio jMeter Project 2|
    | 0006227 | Desafio jMeter Project 1|