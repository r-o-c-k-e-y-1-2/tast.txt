package StepDef;

import Base.Baseclass;
import PageObject.HomePage;
import PageObject.PaymentPage;
import PageObject.TravelBooking;
import PageObject.UserDetailsPage;
import io.cucumber.java.en.*;

public class Stepdefinition  extends Baseclass {

    HomePage hm = new HomePage(driver);
    TravelBooking tb = new TravelBooking(driver);
    UserDetailsPage us = new UserDetailsPage(driver);
    PaymentPage pm = new PaymentPage(driver);

    @Given("launch browser and enter url")
    public void launch_browser_and_enter_url() {
        launchbrowser("https://www.makemytrip.com/");
        hm.popup();

    }

    @Then("click buses on  {string} and {string}")
    public void clickBusesOnAnd(String arg0, String arg1) throws InterruptedException {
        hm.busicon();
        hm.tocity(arg0);
        hm.fromcity(arg1);

    }


    @Then("click date search buses")
    public void click_date_search_buses() throws InterruptedException {
        hm.dateselect();
    }


    @When("select  the filter options")
    public void selectTheFilterOptions() throws InterruptedException {
        tb.filter();
    }

    @And("select pickup drop location")
    public void selectPickupDropLocation() throws InterruptedException {
        tb.pickupdrop();
    }

    @Then("select the bus and seat")
    public void selectTheBusAndSeat() throws InterruptedException {
        tb.booking();
    }


    @When("Enter the traveller personal details {string} {string} {string} and {string}")
    public void enterTheTravellerPersonalDetailsAnd(String arg0, String arg1, String arg2, String arg3) {
        us.userdetails(arg0, arg1,arg2,arg3);
    }

    @And("click the state to save the billing details")
    public void clickTheStateToSaveTheBillingDetails() throws InterruptedException {
     us.checkbox();
    }

    @And("click to countinue the payment page")
    public void clickToCountinueThePaymentPage() {
     us.countinuebox();
    }


    @When("Finally the payment page reached")
    public void finallyThePaymentPageReached() {
       pm.Payment();
    }
}