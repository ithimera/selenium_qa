package stepDefinition;

import desktop.pages.HomePage;
import helpers.BrowserHelper;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class HomePageSteps extends HomePage {

    @Given("^User is on Home Page$")
    public void user_is_on_Home_Page() {
    }

    @And("User opens Bank Login Page")
    public void userOpensBankLoginPage() {
        clickOnBankLoginLink();
    }

    @After
    public void closeDriver(){
        BrowserHelper.closeBrowser();
    }
}
