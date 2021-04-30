package desktop.pages;

import helpers.BrowserHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        this.driver = BrowserHelper.open_the_chrome_and_launch_the_application();
        PageFactory.initElements(driver, this);
    }

    WebDriver driver;
    @FindBy(name = "uid")
    WebElement username;
    @FindBy(name = "password")
    WebElement password;
    @FindBy(name = "btnLogin")
    WebElement loginButton;
    @FindBy(xpath = "//marquee[@class='heading3']")
    WebElement banner;

    public boolean isBannerPresent(){
        return banner.isDisplayed();
    }
    public void enterUsername(String userId){
        username.sendKeys(userId);
    }

    public void enterPassword(String pass){
        password.sendKeys(pass);
    }

    public void clickOnLogin(){
        loginButton.click();
    }
}
