package stepdefinition;

import baseclass.BrowserSetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Hooks extends BrowserSetup {
   @Before("@LoginTest")
    public void beforeTest() throws IOException, InterruptedException {
        BrowserSetup BSetUp=new BrowserSetup();
        File file=new File(".\\config\\Properties.properties");
        FileInputStream fis=new FileInputStream(file);
        Properties prop=new Properties();
        prop.load(fis);
        BSetUp.LaunchBrowser(prop.getProperty("browsername"),prop.getProperty("baseURL"));
    }
@After("@LoginTest")
    public void tearDown(){
        driver.close();
}
}
