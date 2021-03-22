Feature: ReportIssue

Background:
Given The user wants to report any issue
When The user clicks on Report Issue button
  @functionals
  Scenario: Report issues filling all mandatory fields    
    And fills the Report Issue
    |     Project             | Category                        |     Reproducibility   | Severity    |Priority |      Profile       | Summary   | Description |Step To Reproduce |Additional Info | Status |
    | Desafio jMeter Project 1| [All Projects] 7EI2PODHPN       | have not tried        | minor       | normal  |Desktop Windows 10  | Test Roel |  Test       |  Phase 1         |    Adictional  | Public |   
    And clicks to submit report
    Then The system saves the report
    
 Scenario: Report issues filling without summary field
    And fills the Report Issue without mandatory fields 
    |     Project             | Category                        |     Reproducibility   | Severity    |Priority |      Profile       | Description |Step To Reproduce |Additional Info | Status |
    | Desafio jMeter Project 1| [All Projects] 7EI2PODHPN       | have not tried    | minor       | normal  |Desktop Windows 10      |  Test       |  Phase 1         |    Adictional  | Public | 
    And clicks to submit report
    Then The system notifies that the message
    |A necessary field "Summary" was empty. Please recheck your inputs.|

 Scenario: Report issues filling without description field
    And fills the Report Issue without mandatory fields 
    |     Project             | Category                        |     Reproducibility   | Severity    |Priority |      Profile       |Summary       |   Description |Step To Reproduce |Additional Info | Status |
    | Desafio jMeter Project 2| [All Projects] 7EI2PODHPN       | have not tried        | minor       | normal  |Desktop Windows 10  |     M        |               |  Phase 1         |    Adictional  | Public | 
    And clicks to submit report
    Then The system notifies that the message
    |A necessary field "Description" was empty. Please recheck your inputs.|
    
  Scenario: Report issues filling without category field
    And fills the Report Issue without mandatory fields 
    |     Project             | Category                        |     Reproducibility   | Severity    |Priority |      Profile       |Summary       |   Description  | Step To Reproduce |Additional Info | Status |
    | Desafio jMeter Project 2|                                 | have not tried        | minor       | normal  |Desktop Windows 10  |     M        |   Descpriction |  Phase 1         |    Adictional  | Public | 
    And clicks to submit report
    Then The system notifies that the message
    |A necessary field "Category" was empty. Please recheck your inputs.|
    