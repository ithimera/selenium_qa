package stepDefinition;

import desktop.HomePage;
import helpers.BrowserHelper;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class HomePageStepDefs extends HomePage {
    @Given("^User is on Home Page$")
    public void user_is_on_home_page(){
    }

    @And("^User opens Bank Login Page$")
    public void user_opens_bank_login_page(){
        clickOnBankLoginLink();
    }

    @After
    public void close_driver(){
        BrowserHelper.close_browser();
    }
}
