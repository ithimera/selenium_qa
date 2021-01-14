package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserHelper {
    static WebDriver driver;

    public static WebDriver open_chrome_and_launch_app(){
        if(driver==null){
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://demo.guru99.com/");
        }
        return driver;
    }

    public static void close_browser(){
        driver.quit();
    }
}
