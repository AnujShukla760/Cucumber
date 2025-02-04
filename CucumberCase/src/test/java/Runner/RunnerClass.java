package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Case.feature",
        glue = "Runner",
        plugin = {"pretty","html:target/cucumber-reports.html"},
   tags="@Anuj"
)


public class RunnerClass {
}
