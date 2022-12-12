Feature: Navigate to staff

  Scenario Outline: Verify staff
    Given I login to nextgen<username> and <psw>
    When I click on staffad and save details
    Then I click on edit and search for add
    Examples:
      |username|psw|
      |S0075|Abc!@1|







