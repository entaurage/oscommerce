@Signin
Feature: osCommerce sign in

Scenario: osCommerce user sign in

Given I am on the webpage
When click on my account button
And enter user name and password
And click on sign in button
Then sign in should be successfull