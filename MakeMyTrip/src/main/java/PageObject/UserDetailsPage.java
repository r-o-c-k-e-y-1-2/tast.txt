package PageObject;

import Base.Baseclass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UserDetailsPage extends Baseclass {

    JavascriptExecutor js;
  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    public UserDetailsPage(WebDriver dr) {
        this.driver = dr;
        this.js = (JavascriptExecutor) dr;

        PageFactory.initElements(dr, this);
    }

    @FindBy(xpath = "//span[text()='Traveller Details']")
    WebElement traveller;
    @FindBy(xpath = "//input[@id='fname']")
    WebElement name;
    @FindBy(xpath = "//input[@id='age']")
    WebElement age;
    @FindBy(xpath = "//div[text()='Male']")
    WebElement gender;
    @FindBy(xpath = "//input[@name='email id']")
    WebElement mailid;
    @FindBy(xpath = "//input[@id='mobileNumber']")
    WebElement mobile;
    @FindBy(xpath = "//p[text()='Confirm and save billing details to your profile']")
    WebElement box;
    @FindBy(id = "dt_state_gst_info")
    WebElement statebox;
    @FindBy(xpath = "//li[text()='Tamil Nadu']")
    WebElement state;
    @FindBy(xpath = "//span[text()='Continue']")
    WebElement countinu;


    public void userdetails(String name1, String age2, String mail, String phone) {
        js.executeScript("arguments[0].scrollIntoView(true);", traveller);
        name.sendKeys(name1);
        age.sendKeys(age2);
        gender.click();
        mailid.sendKeys(mail);
        mobile.sendKeys(phone);
    }

    public void checkbox() throws InterruptedException {
       Thread.sleep(3000);
        statebox.click();
        wait.until(ExpectedConditions.elementToBeClickable(state));
        js.executeScript("arguments[0].scrollIntoView(true);",state);
        state.click();
        box.click();

    }

    public void countinuebox(){
        countinu.click();
    }
}