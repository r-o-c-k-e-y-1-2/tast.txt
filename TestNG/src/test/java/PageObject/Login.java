package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

        @FindBy(xpath = ".//img[@alt='company-branding']")
        private WebElement logo;

        @FindBy(xpath = ".//h5[text()='Login']")
        private WebElement logintext;

        @FindBy(xpath = ".//input[@name='username']")
        private WebElement username;

        @FindBy(name = "password")
        private WebElement password;

        @FindBy(xpath = " .//button[text()=' Login ']")
        private WebElement loginButton;

        @FindBy(xpath = ".//p[text()='Forgot your password? ']")
        private WebElement Forgetpassword;


        private WebDriver driver;

        public Login(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);

        }

        public boolean checklogo() {
            if (logo.getAttribute("alt") == "company-branding")
                return true;
            else
                return false;
        }

        public boolean checklogintext() {
            if (logintext.getText() == "Login")
                return true;
            else
                return false;
        }

        public void entreusername(String user) {
            username.sendKeys(user);

        }

        public void enterpass(String pass) {
            password.sendKeys(pass);

        }

        public void clickloginbtn() {
            loginButton.click();

        }

        public void clickforgetpass() {
            Forgetpassword.click();
        }


    }

