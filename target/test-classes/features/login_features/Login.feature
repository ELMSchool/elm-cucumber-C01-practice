Feature: Login

  @positive @smoke @regression
  Scenario: Login with valid credentials
    Given User navigates to login page
    When User enters "Admin" and "admin123" as credentials
    And User clicks on "login"
    Then User should see the dashboard page
    And User closes the browser

  @negative @regression
  Scenario Outline: Login with invalid credentials
    Given User navigates to login page
    When User enters "<username>" and "<password>" as credentials
    And User clicks on "login"
    Then User should see the error message
    And User closes the browser

    Examples:
    |username        |password       |
    |invalidUsername |admin123       |
    |Admin           |invalidPassword|
    |invalidUsername |invalidPassword|