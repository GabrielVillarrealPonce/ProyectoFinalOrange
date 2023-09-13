package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
    WebDriver driver;
    @FindBy(className = "oxd-userdropdown-tab")
    WebElement dropDownButton;
    @FindBy(xpath = "//a[text()='Logout']")
    WebElement logOutButton;
    public LogOutPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickOnDropDownButton(){dropDownButton.click();}
    public void clickOnLogOut(){logOutButton.click();}
}
