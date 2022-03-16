 package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features="features/Verify_Pending_Time_Sheet.feature", 
glue= {"stepDefinitions"},
dryRun=false,
monochrome=true,
//publish=true,
//Types of Reporting: pretty, usage, html:target/cucumber-reports/report.html/json/xml
plugin = {"rerun:failed_scenarios/failed_scenarios.txt","html:target/cucumber-reports/report.html","pretty"}
)

public class Runner {

}
