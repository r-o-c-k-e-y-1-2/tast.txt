package OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class Hooks {

        public WebDriver driver ;

        @BeforeClass
        public void openbrower() {
            driver= new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofNanos(30));
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


        }

        @AfterClass
        public void closebrowser() {
           // driver.close();

        }
    }

