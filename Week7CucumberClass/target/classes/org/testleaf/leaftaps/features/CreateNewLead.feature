Feature: Leaftaps - Create New Lead
Scenario: Verify user is able to create new lead
Given Open the browser 
And Load leaftaps application URL
And Enter username
And Enter password
When Click Login
Then Verify welcome page is displayed or not
When Click on CRMS hyperlink
Then Verify Home page is displayed
And Click Create New Lead
And Enter Company Name
And Enter First name
And Enter Last name
When Click Create Lead
Then Verify Lead name in View Lead page