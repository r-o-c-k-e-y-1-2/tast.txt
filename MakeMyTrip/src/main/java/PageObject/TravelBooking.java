package PageObject;

import Base.Baseclass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

;import java.time.Duration;
import java.util.List;

public class TravelBooking extends Baseclass {

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    JavascriptExecutor js;
    public TravelBooking(WebDriver dr){
        this.driver=dr;
        this.js=(JavascriptExecutor)dr;

        PageFactory.initElements(dr,this);

    }

    @FindBy(xpath = "(//p[text()='AC'])[2]")
    WebElement Ac;
    @FindBy(xpath = "//p[text()='Sleeper']")
    WebElement sleeper;
    @FindBy(xpath = "//p[text()='Price']")
    WebElement price;
    @FindBy(xpath = "(//button[text()='Select Seats'])[1]")
    WebElement seatselect;
    @FindBy(xpath = "//span[text()='Pick up time - Chennai, Tamil Nadu']")
    WebElement scroll;
    @FindBy(xpath = "//img[@alt='HORIZONTAL_SLEEPER' and contains(@src,'Available')]")
    WebElement seat;
    @FindBy(xpath = "//div[@class='PickUpDropSelection_pickDropContainer__VSr2j']/child::div/div")
    List<WebElement> pickupoff ;
    @FindBy(xpath = "(//div[@class='PickUpDropSelection_pickDropContainer__VSr2j'])[2]/child::div/div")
    List<WebElement> dropoff;
    @FindBy(xpath = "//button[text()='Continue']")
    WebElement continuebtn;


public void filter() throws InterruptedException {
    Thread.sleep(3000);
    Ac.click();
    sleeper.click();
    Thread.sleep(2000);
    price.click();
    Thread.sleep(3000);
    js.executeScript("arguments[0].scrollIntoView(true);",scroll);
    wait.until(ExpectedConditions.elementToBeClickable(seatselect));
    seatselect.click();
}


    public void pickupdrop() throws InterruptedException {
        js.executeScript("window.scrollBy(0,1500)"); // fixed: added )
        Thread.sleep(2000);
        pickupoff.get(0).click();
        dropoff.get(0).click();
    }

    public void booking() throws InterruptedException {

        Thread.sleep(3000);
        seat.click();
        continuebtn.click();
    }


}
