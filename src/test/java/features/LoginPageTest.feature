Feature: Login Action

  Scenario: Sucessfull login with valid credentials
    Given User is on Home Page
    And User opens Bank Login Page
    Then User enters his username "1303"
    And User enters his password "Guru99"
    Then User clicks on login button