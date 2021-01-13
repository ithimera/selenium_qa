package desktop;

import helpers.BrowserHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    public LoginPage() {
        this.driver = BrowserHelper.open_chrome_and_launch_app();
        PageFactory.initElements(driver,this);
    }
    @FindBy(name="uid")
    WebElement username;
    @FindBy(name = "password")
    WebElement password;
    @FindBy(name = "btnLogin")
    WebElement loginButton;
    public void enterUsername(String text){
        username.sendKeys(text);
    }
    public void enterPassword(String text){
        password.sendKeys(text);
    }
    public void clickOnLogin(){
        loginButton.click();
    }
}
