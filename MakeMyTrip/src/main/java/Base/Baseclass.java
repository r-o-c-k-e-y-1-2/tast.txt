package Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Baseclass {
    public static WebDriver driver;

    public static  void web(){
        driver = new ChromeDriver();
    }

    public static void launchbrowser(String url){
     driver.get(url);
    }

  public static void impwait(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  }
  public static void maximize(){
        driver.manage().window().maximize();
  }



  public static  void navigateback(){
        driver.navigate().back();
  }



}
