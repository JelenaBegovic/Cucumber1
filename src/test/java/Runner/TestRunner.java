package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        glue = {"Steps"},
        features = {"src/test/resources/login.feature"}
)

public class TestRunner extends AbstractTestNGCucumberTests {
}