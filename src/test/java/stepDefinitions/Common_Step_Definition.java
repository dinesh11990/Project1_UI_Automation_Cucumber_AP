package stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.krish.constants.Constants;
import com.krish.utilities.CommonUtils;
import com.krish.webdriver_manager.DriverManager;

import cucumber.api.java.Before;



public class Common_Step_Definition {
	
	//launchBrowser()
	
	
	private static final Logger LOGGER= LogManager.getLogger(Common_Step_Definition.class);
	
	
	@Before
	public void beforeScenario() {
		
		LOGGER.info("Execution Started");
		
		try {
			
			LOGGER.info("Instantiation the CommonUtils");
			CommonUtils commonUtils = new CommonUtils();
			LOGGER.info("Loading the properties file");
			commonUtils.loadProperties();
			
			
			LOGGER.info("Checking the Driver is NULL or NOT ?");
			if(DriverManager.getDriver()==null) {
				
				LOGGER.info("DRIVER is NULL. Instantiating it!");
			    DriverManager.launchBrowser();
			}
			
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
	}


	

}
