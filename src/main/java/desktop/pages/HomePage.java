package desktop.pages;

import helpers.BrowserHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage  {
    public HomePage() {
        this.driver = BrowserHelper.open_the_chrome_and_launch_the_application();
        PageFactory.initElements(driver, this);
    }

    WebDriver driver;
    @FindBy (xpath = "//a[contains(text(),'Bank Project')]")
    WebElement bankLoginLink;

    public void clickOnBankLoginLink(){
        bankLoginLink.click();
    }
}
