Feature: Test leaftaps login functionality

Scenario: Test with Positive Credential

Given open the chrome browser
And load the application
And enter the username as Demosalesmanager
And enter the password as crmsfa
When click on login button
Then hompage should be displayed
