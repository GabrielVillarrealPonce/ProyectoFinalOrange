Feature: PIM OrangeHRM

  Background: User adding, editing and finding employees
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

  @EditAnEmployee
  Scenario: Editing an employee
    Given I set the user name field with "Admin"
    And I set the password field with "admin123"
    When I click on the login button
    Then The DashBoard should be displayed
    Given I click on PIM
    And I set the employee text with "Alexander V"
    Then I click on the search button
    Then I click on edit button
    Then I change the first name to "Julian"
    And I change the middle name to "A"
    And I change the last name to "M"
    And I set the nickname to "Juliansito"
    Then I click on the save button to save the changes
    And The message success should be displayed
    And I click on drop down
    Then I click on logout button


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
      | Julian A    |

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
