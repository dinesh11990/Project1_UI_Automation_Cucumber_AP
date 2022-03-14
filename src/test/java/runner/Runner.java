package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/Verify_CEO_Name.feature", 
glue= {"stepDefinitions"},
monochrome=true
)

public class Runner {

}
