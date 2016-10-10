package exercise4;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/",
		glue = { "exercise4.steps", "exercise7.steps" },
		plugin = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber-json-report.json" }		)
public class RunCukesTest {
}
