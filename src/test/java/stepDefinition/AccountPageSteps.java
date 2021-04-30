package pageSteps;

import desktop.pages.AccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AccountPageSteps extends AccountPage {

    @Then("User picks account with nr {string}")
    public void userPicksAccountWithNr(String brojRacuna) {
        enterAccountNumber(brojRacuna);
    }

    @When("User clicks on mini statement")
    public void userClicksOnMiniStatement() {
        clickOnMiniStatement();
    }

    @And("User transactions for account nr {string} are displayed")
    public void userTransactionsForAccountNrAreDisplayed(String brojRacuna) {
        Assert.assertTrue("Broj racuna se ne uklapa",getTransactionTextForUser().contains(brojRacuna));
    }

    @When("User clicks on submit button")
    public void userClicksOnSubmitButton() {
        clickOnSubmit();
    }
}
