package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetup {
    public static WebDriver driver;


    public  void LaunchBrowser(String browserName, String baseURL) throws InterruptedException {
        if(browserName.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        Thread.sleep(1000);
        driver.manage().deleteAllCookies();
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.get(baseURL);

        //return driver;
    }
}
