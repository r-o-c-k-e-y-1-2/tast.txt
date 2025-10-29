package OrangeHRM;

import PageObject.Login;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners({CustomListners.TestNGListners.class})
public class LoginpageTest extends Hooks {

        @Test(description = "verify login with valid credential",  dataProviderClass = Testdata.class,   dataProvider ="validData")

        public void validcredintials(String data[]) throws InterruptedException {

            System.out.println("username : " +data[0]);
            System.out.println("password : " +data[1]);

            Login lg = new Login(driver);
            Thread.sleep(3000);
            lg.entreusername(data[0]);
            lg.enterpass(data[1]);
            lg.clickloginbtn();


        }
    }

