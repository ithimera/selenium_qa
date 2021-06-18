package stepDefinition;

import desktop.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginPageSteps extends LoginPage {
    @Then("User enters his username {string}")
    public void userEntersHisUsername(String userId) {
        enterUsername(userId);
    }

    @And("User enter his password {string}")
    public void userEnterHisPassword(String passWord) {
        enterPassword(passWord);
    }

    @Then("User clicks on login button")
    public void userClicksOnLoginButton() {
        clickOnLogin();
    }

    @And("User is on login page")
    public void userIsOnLoginPage() {
        Assert.assertTrue("Banner is not displayed",isBannerPresent());
    }

}
