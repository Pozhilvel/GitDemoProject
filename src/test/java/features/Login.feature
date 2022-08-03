Feature: Application Login

Scenario: Home Page default Login

Given User is on Netbanking landing page
When User login to application with username and password
Then Home page is displayed
And Creditcards are displayed

