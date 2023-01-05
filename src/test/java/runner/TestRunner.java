package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "Features",
		glue = "stepdef"
		
		
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
