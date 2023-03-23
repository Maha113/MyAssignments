Feature: Leaftaps - Create New Lead

Background:
Given Open browser and load leaftaps application using 'http://leaftaps.com/opentaps/control/login'
And Enter username as 'Demosalesmanager'
And Enter password as 'crmsfa'
When Click Login button
Then Verify welcome page is displayed 
When Click on CRMS hyperlink
Then Verify Home page is displayed
And Click Create New Lead


Scenario Outline: Verify the new lead is created
And Enter Company Name as <companyname>
And Enter First Name as <firstname>
And Enter Last Name as <lastname>
When Click Create Lead
Then Verify Lead is created

Examples:
|companyname|firstname|lastname|
|'TestLeaf'|'Ram'|'R'|
|'TestLeaf'|'Ragav'|'R'|


