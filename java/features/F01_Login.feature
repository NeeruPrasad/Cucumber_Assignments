Feature: Login functionality for leaftaps application

#Background:
#Given Open the Chrome Browser#
#And Load the application url

@functional @smoke
Scenario Outline: TC001_ Login with positive credentials

And Enter username as <username>
And Enter password as <password>
When Click on login button
Then HomePage should be displayed

Examples:
|username|password|
|'DemoSalesManager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|


@functional
Scenario: TC002_Login with invalid credentials

And Enter username as 'Demo'
And Enter password as 'crmsfa'
When Click on login button
But Error Message should be displayed


