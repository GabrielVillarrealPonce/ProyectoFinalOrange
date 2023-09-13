package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LogOutPage;
import utilities.DriverManager;

public class    CommonSteps {

    LogOutPage logOutPage = new LogOutPage(DriverManager.getDriver().driver);
    @Given("I am in orange web page")
    public void goToSauceDemoPage(){
        DriverManager.getDriver().driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        DriverManager.getDriver().driver.manage().window().maximize();
    }
    @And("I click on drop down")
    public void clickOnDropDown() throws InterruptedException {
        Thread.sleep(2000);
        logOutPage.clickOnDropDownButton();
    }
    @Then("I click on logout button")
    public void clickOnLogOut() throws InterruptedException {
        Thread.sleep(1000);
        logOutPage.clickOnLogOut();
        Thread.sleep(1000);
    }
}
