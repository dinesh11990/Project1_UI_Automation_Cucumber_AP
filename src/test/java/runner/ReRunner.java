package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features="@failed_scenarios/failed_scenarios.txt", 
glue= {"stepDefinitions"},
dryRun=false,
monochrome=true
)


public class ReRunner {

}
