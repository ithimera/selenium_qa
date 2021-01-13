package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserHelper {
    static WebDriver driver;

    public static WebDriver open_firefox_and_launch_app(){
        if(driver==null){
            System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("http://demo.guru99.com/v4");

        }
        return driver;
    }

    public static WebDriver open_chrome_and_launch_app(){
        if(driver==null){
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://demo.guru99.com/v4");

        }
        return driver;
    }

    public static void close_browser(){
        driver.quit();
    }
}
