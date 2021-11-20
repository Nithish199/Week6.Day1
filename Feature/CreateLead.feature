Feature: CreateLead

Scenario: CreateLead with mandatory info

#Given open the chrome browser
#And load the application
#And enter the username as Demosalesmanager
#And enter the password as crmsfa
#When click on login button
#Then hompage should be displayed

When click on CRMSFA link button
Then home page should be displayed
When click on Leads button
Then leads page is opened
When click on create lead button
Then create lead page is opened
Given enter company name
And enter First name
And enter Last name
And enter Phone number
When click on create lead button
Then view leads page is displayed
