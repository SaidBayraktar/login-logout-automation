
Feature: Login Functionality
  Agile story: As a user, I should be able to log in so that I can land on homepage.


  Background: User already logged in
    Given User able to go to the homepage

  #Scenario: Login Functionality
    #When user is on the login page
    #Then user should be able to type valid credentials
    #Then user should be able to login


  Scenario: Users can log in with valid credentials.

    When User as a SalesManager able to write valid credentials in the username and password box.
    Then User able to click on the log in button
    And User able to login to the main page


  Scenario: Users can log in with valid credentials.

    When User as a PosManager able to write valid credentials in the username and password box.
    Then User able to click on the log in button
    And User able to login to the main page

  Scenario: Verify that user can not log in with invalid credentials and "Wrong login/password" is displayed
    When User able to type invalid credentials
    Then User able to click on the log in button
    And "Wrong login/password" should be *displayed*


  Scenario: Verify "Please fill out this field" message is displayed when user leaves userName and password empty
    When User leaves the userName and password empty
    Then User able to click on the log in button
    And "Please fill out this field" should be displayed.


  Scenario: Verify user see the password in bullet signs
    When User able to type any password on the password input


  Scenario: Verify if the Enter key of the keyboard is working successfully
    When User as a PosManager able to write valid credentials in the username and password box.
    Then User should enter the ENTER button on the keyword.
    And User able to login to the main page




  #Scenario: Verify user able to click on the "Reset password" link to go to ‘reset password’ page
    #When User able to locate/see the Reset password link
    #Then User able to click on the "Reset password" link
    #And User able to land on the ‘reset password’ page














