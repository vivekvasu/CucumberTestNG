Feature: Login Functionality Feature

@positiveScenario
Scenario: Verify Valid Login
Given User is in homepage
Then  Enter username and password
When  Clicks on the submit button
Then  login should be successful

@Negative
Scenario: Verify Innvlid Login
Given User is in homepage
Then  Enter username and password
When  Clicks on the submit button
Then  login should be successful

