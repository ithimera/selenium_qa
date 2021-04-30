Feature: Login Action

  Scenario: Successful Login with Valid Credentials
    Given User is on Home Page
    And User opens Bank Login Page
    Then User enters his username "1303"
    And User enter his password "Guru99"
    Then User clicks on login button
    And User is on login page
