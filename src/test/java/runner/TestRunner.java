package runner;

import io.cucumber.testng.CucumberOptions;
import tests.TestBase1;

@CucumberOptions(features = "src/test/java/features"
, glue = "steps"
, plugin = {"pretty" , "html:target/Cucumber-report-10-v1.html"})


public class TestRunner extends TestBase1 {

}
