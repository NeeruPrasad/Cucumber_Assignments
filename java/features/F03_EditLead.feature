Feature: Edit Lead functionality for leaftaps application


Scenario Outline: TC004_Edit Lead

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
When Click on first LeadID link
Then 'View Lead' page should be displayed
When Click on 'Edit' link
Then 'Edit Lead' page should be displayed
When Enter company name in the textbox as <companyname>
Then Click on 'Update' button 
Then 'View Lead' page should be displayed

Examples:
|phonenumber|companyname|
|'7760'|'IBM'|