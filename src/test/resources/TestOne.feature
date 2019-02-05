Feature: Login Functionality Feature

Scenario: Verify Valid Login
Given User is in homepage
Then  Enter username and password
When  Clicks on the submit button
Then  login should be successful

Scenario: Verify Invalid Login
Given User is in homepage
Then  Enter username and password
When  Clicks on the submit button
Then  login should be successful

