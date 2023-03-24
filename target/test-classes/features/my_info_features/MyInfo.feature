Feature: My Info Page Validation

  @wip
  Scenario: Verify User update Contact Details
    Given User navigates to login page
    When User enters "Admin" and "admin123" as credentials
    And User clicks on "login"
    Then User clicks on "My Info"
    Then User clicks on "Contact Details"
    And User enters Contact Detail values to corresponding fields
      | Street 1 | Street 2    | City   | State/Province | Zip/Postal Code | Country       | Home       | Mobile     | Work       | Work Email       | Other Email      |
      | 22 Elm   | 100 Academy | Queens | ELM            | 77777           | United States | 9494494949 | 8484848484 | 7747777474 | info@elm.academy | other@elm.school |