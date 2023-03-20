Feature: OrangeHRM Login functionality

Scenario: Login with valid credentials
	Given User navigates to the login page
	When User enters valid credentials and cliks on login button
	Then User should land on dashboard page
 