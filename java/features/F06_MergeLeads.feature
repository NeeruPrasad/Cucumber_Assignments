Feature: Merge Leads functionality for leaftaps application


Scenario: TC006_Merge Leads

Given Enter username as 'DemoSalesManager'
And Enter password as 'crmsfa'
When Click on login button
Then HomePage should be displayed
When Click on 'CRM/SFA' link
Then 'My Home' page should be displayed
When Click on 'Leads' link
Then 'My Leads' page should be displayed
When Click on 'Merge Leads' link
Then 'Merge Leads' page should be displayed
When Click on Image beside From Lead text box
Then Find Leads window should be displayed 
And Click on first LeadID and go back to main window and store in a variable
When Click on Image beside To Lead text box
Then Find Leads window should be displayed 
And Click on second LeadID and go back to main window
Then 'Merge Leads' page should be displayed
When Click on 'Merge' link
Then An alert displays accept it
When Click on 'Find Leads' link
Then 'Find Leads' page should be displayed
When Enter stored LeadId in the LeadID 
And Click on 'Find Leads' button to find Leads
Then 'Lead List' should be displayed
Then Check whether Lead List has rows to display and display a merge message 



