Feature: Delete Lead functionality for leaftaps application


Scenario Outline: TC004_Delete Lead

Given Enter username as 'DemoSalesManager'
And Enter password as 'crmsfa'
When Click on login button
Then HomePage should be displayed
When Click on 'CRM/SFA' link
Then 'My Home' page should be displayed
When Click on 'Leads' link
Then 'My Leads' page should be displayed
When Click on 'Find Leads' link
Then 'Find Leads' page should be displayed
When Click on 'Phone' button in findby division
And Enter phone number in the textbox as <phonenumber>
And Click on 'Find Leads' button to find Leads
Then 'Lead List' should be displayed
Then Store first LeadID in a variable
When Click on first LeadID link
Then 'View Lead' page should be displayed
When Click on 'Delete' link
Then 'My Leads' page should be displayed
When Click on 'Find Leads' link
Then 'Find Leads' page should be displayed
When Enter stored LeadId in the LeadID textbox
And Click on 'Find Leads' button to find Leads
Then 'Lead List' should be displayed
Then Check whether Lead List has rows to display and display a message 


Examples:
|phonenumber|
|'7760'|
