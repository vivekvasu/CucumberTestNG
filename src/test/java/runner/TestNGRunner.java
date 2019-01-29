package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="src/test/resources",
		glue={"stepDefinition"},
		plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:ExtentReports/report.html"}
		)
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
