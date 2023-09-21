package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
features ="D:\\eclipse workspace\\EveningBatch12Bestdotnettraining.pom\\src\\main\\java\\Features\\Homepage.feature"		
	, glue = {"stepDefinitions"}
, monochrome= true,
dryRun = false
		
		)
public class TestRunner {

}
