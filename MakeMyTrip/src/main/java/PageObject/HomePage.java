package PageObject;

import Base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class HomePage  extends Baseclass {

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    public HomePage(WebDriver dr) {
        this.driver = dr;

        PageFactory.initElements(dr, this);
    }


    @FindBy(xpath = "//span[text()='Buses'][1]")
    WebElement bus;
    @FindBy(xpath = "//input[@id='fromCity']")
    WebElement from;
    @FindBy(xpath = "//input[@placeholder='From']")
    WebElement frombox;
    @FindBy(id = "toCity")
    WebElement to;
    @FindBy(xpath = "//input[@placeholder='To']")
    WebElement Destination;
    @FindBy(id = "travelDate")
    WebElement date;
    @FindBy(xpath = "( //div[@class='DayPicker-Day'])[2]")
    WebElement Tripdate;
    @FindBy(xpath = "//button[text()='Search']")
    WebElement searchbutton;

    public By pop = (By.xpath("//span[@data-cy='closeModal']"));

    public void popup() {
        System.out.println("............Entering home page search Bus........");
        try {
            WebElement alert = driver.findElement(pop);
            alert.click();
        } catch (Exception e) {

        }
    }

    public void busicon() {
        bus.click();
    }

    public void fromcity(String arg1) throws InterruptedException {
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(from));
         from.click();
         Thread.sleep(2000);
        frombox.sendKeys(arg1);
        Thread.sleep(1000);
        frombox.sendKeys(Keys.ARROW_DOWN);
        frombox.sendKeys(Keys.ENTER);
   System.out.println("........... From Entering Travel Location........");
    }

    public void tocity(String arg0) throws InterruptedException {
       Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(to));
        to.click();
        Thread.sleep(2000);
        Destination.click();
        Destination.sendKeys(arg0);
        Thread.sleep(2000);
        Destination.sendKeys(Keys.ARROW_DOWN);
        Destination.sendKeys(Keys.ENTER);

        System.out.println("..Entering the Travel Destination...");
    }

    public void dateselect() throws InterruptedException {
        date.click();
        Thread.sleep(2000);
        Tripdate.click();
        searchbutton.click();
     System.out.println("...Selecting the the TravelDate...");
    }

}
