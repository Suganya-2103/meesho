package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/feature/loginpoorvika.feature",
    glue = {"stepdefinition"},
    plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class TestRunner {
}
