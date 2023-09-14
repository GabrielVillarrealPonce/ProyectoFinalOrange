package pages;

import org.apache.commons.math3.analysis.function.Add;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.time.Duration;

public class PimPageEdit {
    WebDriver driver;
    @FindBy(name = "firstName")
    WebElement firstNameTextBox;
    @FindBy(name = "middleName")
    WebElement middleNameTextBox;
    @FindBy(name = "lastName")
    WebElement lastNameTextBox;
    @FindBy(xpath = "(//input[@data-v-1f99f73c])[5]")
    WebElement nickNameTextBox;
    @FindBy(xpath = "//button[@data-v-b6d78ace]")
    WebElement saveButton;
    //@FindBy(xpath = "//div[@data-v-35c8fe09]")
    //WebElement messageSucces;
    public PimPageEdit(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void editFirstNameTextBox(String nombre) throws InterruptedException {
        firstNameTextBox.sendKeys(Keys.CONTROL + "a");
        firstNameTextBox.sendKeys(Keys.DELETE);
        firstNameTextBox.sendKeys(nombre);
    }
    public void editMiddleNameTextBox(String middle){
        middleNameTextBox.sendKeys(Keys.CONTROL + "a");
        middleNameTextBox.sendKeys(Keys.DELETE);
        middleNameTextBox.sendKeys(middle);
    }
    public void editLastNameTextBox(String last){
        lastNameTextBox.sendKeys(Keys.CONTROL+"a");
        lastNameTextBox.sendKeys(Keys.DELETE);
        lastNameTextBox.sendKeys(last);
    }
    public void editNickNameTextBox(String nickname){
        nickNameTextBox.sendKeys(Keys.CONTROL+"a");
        nickNameTextBox.sendKeys(Keys.DELETE);
        nickNameTextBox.sendKeys(nickname);
    }
    public void clickOnSaveButton(){
        saveButton.click();
    }
    public boolean messageSuccess(){
        WebElement messageSuccess = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-v-35c8fe09]")));
        return messageSuccess.isDisplayed();
    }
}
