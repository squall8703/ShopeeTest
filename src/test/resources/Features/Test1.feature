Feature: Login Action

Scenario: User can log in successfully
	Given User on Home Page
	When User Enters "shopeetest" and "Shopee@2020" to username and password fields
	Then User Verifies the header is "Find a Flight: Mercury Tours: 1"