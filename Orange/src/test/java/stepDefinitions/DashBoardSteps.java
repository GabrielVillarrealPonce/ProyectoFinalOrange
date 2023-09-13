package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.DashboardPage;
import pages.LoginPage;
import utilities.DriverManager;

public class DashBoardSteps {
    DashboardPage darshBoard = new DashboardPage(DriverManager.getDriver().driver);

    @Given("I click on PIM")
    public void clickOnPIM() throws InterruptedException{
        Thread.sleep(2000);
        darshBoard.clickonPIMButton();
    }

}
