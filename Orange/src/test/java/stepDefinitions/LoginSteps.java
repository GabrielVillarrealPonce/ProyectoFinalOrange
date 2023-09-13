package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.junit.jupiter.api.Assertions;
import pages.DashboardPage;
import pages.LoginPage;
import utilities.DriverManager;


public class LoginSteps {
    LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);
    DashboardPage dashboardPage = new DashboardPage(DriverManager.getDriver().driver);

    @Given("I set the user name field with {string}")
    public void setUserName(String userName) throws InterruptedException {
        Thread.sleep(2000);
        loginPage.setUserNameTextBox(userName);
    }

    @And("I set the password field with {string}")
    public void setPassword(String password){
        loginPage.setPasswordTextBox(password);
    }

    @When("I click on the login button")
    public void clickOnLoginButton() throws InterruptedException {
        Thread.sleep(2000);
        loginPage.clickOnLoginButton();
    }
    @Then("The DashBoard should be displayed")
    public void dashBoardIsDisplayed() throws InterruptedException{
        Thread.sleep(2000);
        dashboardPage.dashboardTitleIsDisplayed();
    }

}
