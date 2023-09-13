Feature: DashBoard OrangeHRM

  Background:User searching for Alice employee
    Given I am in orange web page

  @FindAnEmployee
  Scenario Outline: Looking for employees
    Given I set the user name field with "Admin"
    And I set the password field with "admin123"
    When I click on the login button
    Then The DashBoard should be displayed
    Given I click on PIM
    And I set the employee text with "<name>"
    Then I click on the search button
    And The name of "<name>" should be displayed
    And I click on drop down
    Then I click on logout button
    Examples:
      | name        |
      | Ferrufino J |
      | Antonio V   |
      | Alexander V |

    @DeleteAnEmployee
    Scenario: Delete an employee
      Given I set the user name field with "Admin"
      And I set the password field with "admin123"
      When I click on the login button
      Then The DashBoard should be displayed
      Given I click on PIM
      And I set the employee text with "Antonio V"
      Then I click on the search button
      And I click on trash button
      Then I click in Yes, Delete
      Then The name of "Antonio V" should not be displayed
      And I click on drop down
      Then I click on logout button

