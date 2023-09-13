Feature: PIM OrangeHRM

  Background: User adding a new employee
    Given I am in orange web page

    @AddANewEmployee
    Scenario Outline: Adding a new employee
      Given I set the user name field with "Admin"
      And I set the password field with "admin123"
      When I click on the login button
      Then The DashBoard should be displayed
      Given I click on PIM
      And I click on AddButton
      Then I set the first name field with "<FirstName>"
      And I set the last name field with "<LastName>"
      And I set the middle name field with "<MiddleName>"
      And I set the employee id with "<ID>"
      Then I click on the save button
      And Personal details should be displayed
      And I click on drop down
      Then I click on logout button
      Examples:
        | FirstName | MiddleName | LastName | ID    |
        | Alexander | V          | A        | 32154 |
        | Antonio   | V          | A        | 56487 |
        | Ferrufino | J          | K        | 45678 |
