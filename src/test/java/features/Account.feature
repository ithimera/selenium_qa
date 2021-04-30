Feature: Account check

  Scenario: Transaction check
    Given User is on Home Page
    And User opens Bank Login Page
    Then User enters his username "1303"
    And User enter his password "Guru99"
    Then User clicks on login button
    And User is on login page
    When User clicks on mini statement
    Then User picks account with nr "3308"
    When User clicks on submit button
    And User transactions for account nr "3308" are displayed
