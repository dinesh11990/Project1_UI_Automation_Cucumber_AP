package stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.krish.constants.Constants;
import com.krish.utilities.CommonUtils;
import com.krish.webdriver_manager.DriverManager;

import cucumber.api.java.Before;
import gherkin.formatter.model.Scenario;



public class Common_Step_Definition {
	
	//launchBrowser()
	
	//Not Working
	/*
	private static String scenarioName=null;
	
	public static String getScenarioName() {
		return scenarioName;
	}*/

	
	private static final Logger LOGGER= LogManager.getLogger(Common_Step_Definition.class);
	
	//Cucumber annotation
	@Before
	//public void beforeScenario(Scenario scenario) {
	public void beforeScenario() {
		LOGGER.info("Execution Started");
		
		try {
			
			//scenarioName=scenario.getName();
			LOGGER.info("Instantiation the CommonUtils");
			
			//Since we have used singleton in "Common_Step_Definitions" we don't need
			//CommonUtils commonUtils = new CommonUtils();
			
			LOGGER.info("Loading the properties file");
			CommonUtils.getInstance().loadProperties();
			
			
			LOGGER.info("Checking the Driver is NULL or NOT ?");
			if(DriverManager.getDriver()==null) {
				
				LOGGER.info("DRIVER is NULL. Instantiating it!");
			    DriverManager.launchBrowser();
			    CommonUtils.getInstance().initWebElements();
			}
			
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
	}


	

}
