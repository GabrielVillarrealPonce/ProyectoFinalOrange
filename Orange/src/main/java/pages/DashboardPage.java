package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    WebDriver driver;

    @FindBy(className = "oxd-topbar-header-breadcrumb-module")
    WebElement dashboardText;
    //@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")
    //WebElement PIMButton;
    @FindBy(xpath = "//span[text()='PIM']")
    WebElement pimLink;
    public DashboardPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public boolean dashboardTitleIsDisplayed(){
        boolean dashboardTitleIsDisplayed= dashboardText.isDisplayed();
        return dashboardTitleIsDisplayed;
    }
    public void clickonPIMButton(){
        pimLink.click();
    }

}
