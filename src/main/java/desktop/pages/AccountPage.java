package desktop.pages;

import helpers.BrowserHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
    public AccountPage() {
        this.driver = BrowserHelper.open_the_chrome_and_launch_the_application();
        PageFactory.initElements(driver, this);
    }
    WebDriver driver;
    @FindBy(xpath = "//a[contains(text(),'Mini Statement')]")
    WebElement miniStatement;
    @FindBy(name = "accountno")
    WebElement accountNo;
    @FindBy(xpath = "//p[@class='heading3']")
    WebElement header;
    @FindBy(name = "AccSubmit")
    WebElement submitButton;

    public void clickOnSubmit(){
        submitButton.click();
    }

    public void clickOnMiniStatement(){
        miniStatement.click();
    }

    public void enterAccountNumber(String brojRacuna){
        accountNo.sendKeys(brojRacuna);
    }

    public String getTransactionTextForUser(){
        return header.getText();
    }
}
