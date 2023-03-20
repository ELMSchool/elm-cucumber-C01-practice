package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		   plugin = {
	                "pretty",
	                "html:target/default-cucumber-reports",
	                "json:target/cucumber.json",
	                "junit:target/cucumber.xml"
	        },
		features = "src/test/resources/features/",
		glue = "step_definitions",
		dryRun = false
		)

public class CukesRunner {





}
