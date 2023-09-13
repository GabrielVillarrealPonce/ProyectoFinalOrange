package pages;

import org.apache.commons.math3.analysis.function.Add;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class PimPage {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")
    WebElement employeeNameTextBox;
    @FindBy(className = "orangehrm-left-space")
    WebElement buttonSearch;
   // @FindBy(className = "data")
    //List<WebElement> dataNames;
   //@FindBy(xpath = "//div[@class='data']")
    //List<WebElement> dataElement;
    //@FindBy(className = "bi-trash")
    //WebElement deleteButton;
   @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
   WebElement AddButton;
    public PimPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickAddButton(){
        AddButton.click();
    }
    public void putSomethingOnEmployee(String something) throws InterruptedException {
        Thread.sleep(2000);
        employeeNameTextBox.sendKeys(something);
    }
    public void setButtonSearch(){buttonSearch.click();}
    public boolean findName(String name) throws InterruptedException {
        Thread.sleep(2000);
        List <WebElement> dataElements = driver.findElements(By.className("oxd-table-cell"));

        for(WebElement names: dataElements){
            if(names.getText().equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }
    public void deleteAnEmployee(){
        WebElement deleteButton = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.className("bi-trash")));
        deleteButton.click();
    }
    public void yesDelete(){
        WebElement deleteButton = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.className("oxd-button--label-danger")));
        deleteButton.click();
    }

}
