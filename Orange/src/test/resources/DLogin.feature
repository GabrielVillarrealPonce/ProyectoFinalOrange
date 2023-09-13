Feature: Login OrangeHRM

  Background:User Login into the orange DashBoard
    Given I am in orange web page

    @loginWithValidCredentials
    Scenario: Login into Orange Web DashBoard with valid credentials
      Given I set the user name field with "Admin"
      And I set the password field with "admin123"
      When I click on the login button
      Then The DashBoard should be displayed
      And I click on drop down
      Then I click on logout button
