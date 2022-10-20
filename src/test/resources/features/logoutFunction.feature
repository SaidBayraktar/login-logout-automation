@wip
Feature: Logout functionality
  Agile story: As a user, I should be able to log out.


  Scenario: User can log out and ends up in login page.
    Given User able to go to the homepage
    When User as a SalesManager able to write valid credentials in the username and password box.
    Then User able to click on the log in button
    When User able to login to the main page
    When User able to click on the SalesManager16 user name button
    Then User able to click the Log Out button on on the dropdown
    And User able to land on the Login page