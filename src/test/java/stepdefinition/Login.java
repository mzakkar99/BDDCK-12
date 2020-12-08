package stepdefinition;

import ObjectRepository.LoginOR;
import baseclass.BrowserSetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Login extends BrowserSetup {
    public LoginOR lo=new LoginOR();
    BrowserSetup BSetUp=new BrowserSetup();


    @Given("^CtoK app is luanched$")
    public void ctok_app_is_luanched() throws Throwable {
        System.out.println("Application launched....");
    }

    @When("^user Clicks on SignIn button$")
    public void user_Clicks_on_SignIn_button() throws Throwable {
        lo.SignInLnk();
    }

    @When("^User Enters username \"([^\"]*)\"$")
    public void user_Enters_username(String arg1) throws Throwable {
        Thread.sleep(1000);
            lo.username(arg1);
    }

    @When("^User Enters password \"([^\"]*)\"$")
    public void user_Enters_password(String arg1) throws Throwable {
        Thread.sleep(1000);
            lo.password(arg1);
    }

    @When("^User Clicks on login button$")
    public void user_Clicks_on_login_button() throws Throwable {
            lo.LoginInBtn();
    }

    @Then("^SignIn should be \"([^\"]*)\"$")
    public void signin_should_be(String arg1) throws Throwable {

    }

}
