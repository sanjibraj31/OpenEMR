Feature: Log in to OpenEMR

  Scenario Outline: Log in to OpenEMR with valid input
    Given I am on OpenEMR log in page
    When I enter "<username>" "<password>"
    And I click Log in button
    Then I land on the OpenEMR Home page

    Examples: 
      | username | password |
      | admin    | pass     |
      | Raj13    | admin    |