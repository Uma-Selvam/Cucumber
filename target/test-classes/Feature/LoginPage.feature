Feature: To verify the letcode webpage

Scenario Outline:  To verify the letcode webpage login with valid credentials
Given User should be in Login page
When User should enter the "<Username>" and "<Password>"
Then User should to Click the buttons

Examples: 
|Username|Password|
|umasit|uma123|
|umasit77|uma@1|
|um1234|pwssat|
|uma1234|9876M|