Feature: Balance enquiry

  Scenario: Sucessfull login with valid check of funds
    Given User is on Home Page
    And User opens Bank Login Page
    Then User enters his username "1303"
    And User enters his password "Guru99"
    Then User clicks on login button
    And User clicks on balance enquiry link
    Then User selects account number "3308"
    And User clicks on submit button
    Then User can see balance details for account "3308"