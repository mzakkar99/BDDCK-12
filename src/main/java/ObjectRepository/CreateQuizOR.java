package ObjectRepository;

import baseclass.BrowserSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CreateQuizOR extends BrowserSetup {
    //WebDriver driver;
    By libraryLnk=By.xpath("(//ul//li//a[@title='Library'])[1]");
    By createDropdown=By.xpath("//a[@id='dropdown-create']");
    By quizOption=By.xpath("(//a[@title='New Quiz'])[1]");
   // By iFrame=By.xpath("//iframe[@id='assessmentFrame']");
    String iFrame="//iframe[@id='assessmentFrame']";
    By quizTitle=By.xpath("//input[@id='testTitle']");
    By quizDescription=By.xpath("//textarea[@id='testDescription']");
    By noAttemptDropdown=By.xpath("//select[@id='noAttempts' and //div//a[@class='current']]");
    By timeLimitDropdown=By.xpath("//select[@id='timeLimitUnit' and //div//a[@class='current']]");
    By showHints=By.xpath("//label[contains(text(), 'Show Hints')]");
    By addQuestionSetbtn=By.xpath("//*[@id='addExercise']//div[2]//span//i");
    By mathmeticsLnk=By.xpath("//*[@id='MAT']//span");
    By elementaryMathGrade1=By.xpath("//*[@id='Elementary-Math-Grade-1']//span[contains(text(), 'Elementary Math Grade 1')]");
    By addAndSubTo20=By.xpath("//span[@data-handle='elementary-math-grade-1-::-addition-and-subtraction-to-20']");
    By addAndSubTo20Facts=By.xpath("//span[@data-handle='elementary-math-grade-1-::-addition-and-subtraction-facts-to-20']");
    By addToTenWithImagesChk=By.xpath("//input[@id='MAT_ARI_103_0101']");

    public void CreateQuizOR() throws InterruptedException {
        Thread.sleep(1000);
    }
    public void library()
    {
        driver.findElement(libraryLnk).click();
    }

    public void createDropdown() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(createDropdown).click();
    }

    public void selectQuizOption() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(quizOption).click();}

    public void switchToFrame(By element) throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> iFrameList=driver.findElements(By.tagName("iframe"));
        for(int i=0;i<iFrameList.size();i++) {
            driver.switchTo().frame(i);
            Thread.sleep(2000);
            if (driver.findElement(element).isDisplayed())
            break;
        }
    }
    public void enterQuizTitle(String title) throws InterruptedException {
        switchToFrame(quizTitle);
        driver.findElement(quizTitle).sendKeys(title);
        driver.switchTo().defaultContent();
    }

}
