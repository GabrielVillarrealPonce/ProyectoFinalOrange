package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_lol.AN;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import pages.*;
import utilities.DriverManager;

public class PimEditSteps {
    PimPageEdit pimPageEdit = new PimPageEdit(DriverManager.getDriver().driver);
    PimPage pimPage = new PimPage(DriverManager.getDriver().driver);
    @Then("I click on edit button")
    public void clickOnEditButton(){
        pimPage.editAnEmployee();
    }
    @Then("I change the first name to {string}")
    public void changeTheFirstName(String first) throws InterruptedException {
        Thread.sleep(2000);
        pimPageEdit.editFirstNameTextBox(first);
    }
    @And("I change the middle name to {string}")
    public void changeMiddleName(String middle){
        pimPageEdit.editMiddleNameTextBox(middle);
    }
    @And("I change the last name to {string}")
    public void changeLastName(String last){
        pimPageEdit.editLastNameTextBox(last);
    }
    @And("I set the nickname to {string}")
    public void changeNickName(String nickName){
        pimPageEdit.editNickNameTextBox(nickName);
    }
    @Then("I click on the save button to save the changes")
    public void clickOnSaveButton() throws InterruptedException {
        Thread.sleep(4000);
        pimPageEdit.clickOnSaveButton();
    }
   @And("The message success should be displayed")
    public void messageSuccessDisplayed(){
        Assertions.assertTrue(pimPageEdit.messageSuccess());
   }
}
