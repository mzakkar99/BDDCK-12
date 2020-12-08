package stepdefinition;

import ObjectRepository.CreateQuizOR;
import ObjectRepository.LoginOR;
import baseclass.BrowserSetup;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Before;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class CreateQuiz extends BrowserSetup {
    CreateQuizOR cq=new CreateQuizOR();
    LoginOR lo=new LoginOR();
    @Before
    public void beforeTest() throws IOException, InterruptedException {
        BrowserSetup BSetUp=new BrowserSetup();
        File file=new File(".\\config\\Properties.properties");
        FileInputStream fis=new FileInputStream(file);
        Properties prop=new Properties();
        prop.load(fis);
        BSetUp.LaunchBrowser(prop.getProperty("browsername"),prop.getProperty("baseURL"));
    }

  /*  @When("User Enters Credentials to LogIn")
    public void user_enters_credentials_to_log_in(DataTable dt) throws InterruptedException {


        }*/
    @Then("user verify title of the page")
    public void user_verify_title_of_the_page() {
           }


    @Given("user is Logged in")
    public void user_is_logged_in() {

    }
    @And("User Enters Credentials to LogIn")
    public void userEnterCredentialsToLogIn(DataTable dt) throws InterruptedException {
        List<Map<String,String>> list= dt.asMaps(String.class,String.class);

        lo.SignInLnk();
        Thread.sleep(1000);
        lo.username(list.get(0).get("UserName"));
        lo.password(list.get(0).get("Password"));
        lo.LoginInBtn();
    }

    @When("user Clicks on Library Link")
    public void user_clicks_on_library_link() {
    cq.library();
    }
    @When("User clicks on Create New Dropdown")
    public void user_clicks_on_create_new_dropdown() throws InterruptedException {
    cq.createDropdown();
    }
    @When("User Selects Quiz")
    public void user_selects_quiz() throws InterruptedException {
        cq.selectQuizOption();

    }
    @Then("User Enter Title as {string}")
    public void user_enter_title_as(String title) throws InterruptedException {
        //cq.switchToFrame();
        cq.enterQuizTitle(title);
    }


}
