Feature: EditLead

Scenario: EditLead Mandatory info
#Given open the chrome browser
#And load the application
#And enter the username as Demosalesmanager
#And enter the password as crmsfa
#When click on login button
#Then hompage should be displayed


When click on CRMSFA link button
Then home page should be displayed
When click on Leads button
Then My leads page is opened
When click on find leads button
Then find leads page is opened
When click on Phone
Given Phone number
When click on find leads search button
Then leads list is displayed
When click on first lead Id
Then view lead page is opened
When click on edit button
Then edit lead has been displayed
Given company Name
When click on update button
Then view lead page is displayed
