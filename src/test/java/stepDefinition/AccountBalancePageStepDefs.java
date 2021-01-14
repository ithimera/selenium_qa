package stepDefinition;

import desktop.AccountBalancePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AccountBalancePageStepDefs extends AccountBalancePage {

    @Then("User selects account number {string}")
    public void userSelectsAccountNumber(String accNr) {
        userSelectsAccountNumber(accNr);
    }

    @And("User clicks on submit button")
    public void userClicksOnSubmitButton() {
    }

    @Then("User can see balance details for account {string}")
    public void userCanSeeBalanceDetailsForAccount(String accNr) {
        Assert.assertEquals("Account details are not displayed properly for:".concat( accNr),"Balance Details for Account".concat(accNr), getAccountDetailsTitle());
    }
}
