package PageObject;

import Base.Baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PaymentPage extends Baseclass {

    public PaymentPage(WebDriver dr){
        this.driver=dr;

        PageFactory.initElements(dr,this);

    }

    public void Payment() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        Boolean payment = wait.until(ExpectedConditions.urlContains("payment"));// gateway redirects back

        String url = driver.getCurrentUrl();
        System.out.println("Final URL: " + url+payment);
    }
}
