package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.DashboardPage;
import pages.LoginPage;
import pages.PimPage;
import pages.PimPageAdd;
import utilities.DriverManager;


public class PimSteps {
    PimPage pimPage = new PimPage(DriverManager.getDriver().driver);
    PimPageAdd pimPageAdd = new PimPageAdd(DriverManager.getDriver().driver);
    @And("I set the employee text with {string}")
    public void putSomethingOnEmployee(String something)throws InterruptedException{
        pimPage.putSomethingOnEmployee(something);
        Thread.sleep(2000);
    }
    @Then("I click on the search button")
    public void clickOnSearch()throws  InterruptedException{
        pimPage.setButtonSearch();
    }
    @And("The name of {string} should be displayed")
    public void findName(String name)throws  InterruptedException{
        Thread.sleep(2000);
        Assertions.assertTrue(pimPage.findName(name));
        Thread.sleep(2000);
    }
    @And("The name of {string} should not be displayed")
    public void dontFindName(String name)throws  InterruptedException{
        Thread.sleep(2000);
        Assertions.assertFalse(pimPage.findName(name));
        Thread.sleep(2000);
    }
    @And("I click on AddButton")
    public void AddButtonClick()throws InterruptedException{
        Thread.sleep(2000);
        pimPage.clickAddButton();
    }
    @Then("I set the first name field with {string}")
    public void setFirstName(String firstName) throws InterruptedException {
        Thread.sleep(2000);
        pimPageAdd.setFirstNameTextBox(firstName);
    }

    @And("I set the last name field with {string}")
    public void setLastName(String lastName){
        pimPageAdd.setLastNameTextBox(lastName);
    }
    @And("I set the middle name field with {string}")
    public void setMiddleName(String middleName){
        pimPageAdd.setMiddleNameTextBox(middleName);
    }
    @And("I set the employee id with {string}")
    public void setEmployeeId(String employeeId){
        pimPageAdd.setEmployeeIdTextBox(employeeId);
    }
    @Then("I click on the save button")
    public void clickOnSaveButton()throws InterruptedException{
        Thread.sleep(2000);
        pimPageAdd.clickSaveButton();
        Thread.sleep(2000);

    }
    @Then("Personal details should be displayed")
    public void titleDisplayed() throws InterruptedException {
        Assertions.assertTrue(pimPageAdd.isPersonalDetailsDisplayed());
    }
    @And("I click on trash button")
    public void deleteAnEmployee(){
       pimPage.deleteAnEmployee();
    }
    @Then("I click in Yes, Delete")
    public void yesDelete(){
        pimPage.yesDelete();
    }
}
