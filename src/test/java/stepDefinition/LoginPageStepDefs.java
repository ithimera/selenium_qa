package stepDefinition;

import desktop.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginPageStepDefs extends LoginPage {
    @Then("User enters his username {string}")
    public void user_enters_his_username(String text){
        enterUsername(text);
    }

    @And("User enters his password {}")
    public void user_enters_his_password(String text){
        enterPassword(text);
    }

    @Then("User clicks on login button")
    public void user_clicks_on_login_button(){
        clickOnLogin();
    }
}
