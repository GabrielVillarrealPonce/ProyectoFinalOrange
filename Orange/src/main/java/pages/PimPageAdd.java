package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PimPageAdd {
    WebDriver driver;
    //@FindBy(name = "firstName")
    //WebElement firstNameTextBox;
    @FindBy(name = "lastName")
    WebElement lastNameTextBox;
    @FindBy(name = "middleName")
    WebElement middleNameTextBox;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")
    WebElement employeeIdTextBox;
    @FindBy(className = "orangehrm-left-space")
    WebElement saveButton;
    @FindBy(xpath = "//h6[text()='Personal Details']")
    WebElement personalDetailsDisplayed;
    public PimPageAdd(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void setFirstNameTextBox(String userName){
        WebElement firstNameTextBox = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.name("firstName")));
        firstNameTextBox.sendKeys(userName);
    }
    public void setLastNameTextBox(String userName){
        lastNameTextBox.sendKeys(userName);
    }
    public void setMiddleNameTextBox(String userName){
        middleNameTextBox.sendKeys(userName);
    }
    public void setEmployeeIdTextBox(String userName){
        employeeIdTextBox.sendKeys(userName);
    }
    public void clickSaveButton(){saveButton.click();}
    public boolean isPersonalDetailsDisplayed(){
         WebElement personalDetailsTittle = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h6[text()='Personal Details']")));
         return personalDetailsTittle.isDisplayed();
    }
}
