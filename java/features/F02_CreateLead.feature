Feature: Create Lead functionality for leaftaps application

@Regression @smoke
Scenario Outline: TC003_Create Lead

Given Enter username as 'DemoSalesManager'
And Enter password as 'crmsfa'
When Click on login button
Then HomePage should be displayed
When Click on 'CRM/SFA' link
Then 'My Home' page should be displayed
When Click on 'Leads' link
Then 'My Leads' page should be displayed
When Click on 'Create Lead' link
Then 'Create Lead' page should be displayed
Given Enter 'companyName' text as <companyname>
And Enter 'firstName' text as <firstname>
And Enter 'lastName' text as <lastname>
And Enter 'primaryPhoneNumber' text as <phonenumber>
Then Click on 'Create Lead' button

Examples:
|companyname|firstname|lastname|phonenumber|
|'Accenture'|'Sanjana'|'N'|'7760'|

