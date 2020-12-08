package runners;



import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
                    features ="classpath:feature",
                    glue ="stepdefinition",
                    dryRun = false,
                    monochrome = true
        ,tags="@LoginTest"
      //  , tags="@QuizTest"
)
public class Runner {
    //tags ="@LoginTest"
}
