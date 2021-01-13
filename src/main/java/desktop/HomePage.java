package desktop;

import helpers.BrowserHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    public HomePage() {
        this.driver = BrowserHelper.open_chrome_and_launch_app();
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[contains(text(),'Bank Project')]")
    WebElement bankLoginLink;

    public void clickOnBankLoginLink(){
        bankLoginLink.click();
    }
}
