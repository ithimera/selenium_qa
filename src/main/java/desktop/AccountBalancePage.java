package desktop;

import helpers.BrowserHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountBalancePage {
    WebDriver driver;
    public AccountBalancePage() {
        this.driver = BrowserHelper.open_chrome_and_launch_app();
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "accountno")
    public Select accountNr;

    @FindBy(name = "AccSubmit")
    public WebElement submitButton;

    @FindBy(xpath = "//p[contains(text(),'Transaction Details for Account')]")
    WebElement balanceDetailsTitle;

    public void pickAccount(String accNr){
        accountNr.selectByValue(accNr);
    }

    public void clickOnSubmit(){
        submitButton.click();
    }

    public String getAccountDetailsTitle(){
        return balanceDetailsTitle.getText();
    }
}
