Feature: Navigation menu options

  @regression
  Scenario: Verify menu options
    Given User navigates to login page
    When User enters "Admin" and "admin123" as credentials
    And User clicks on "login"
    Then Menu options should be displayed
      | Admin       |
      | PIM         |
      | Leave       |
      | Time        |
      | Recruitment |
      | My Info     |
      | Performance |
      | Dashboard   |
      | Directory   |
      | Maintenance |
      | Buzz        |
    And User closes the browser