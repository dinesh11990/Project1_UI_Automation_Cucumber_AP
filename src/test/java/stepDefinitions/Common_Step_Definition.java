package stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.krish.constants.Constants;
import com.krish.utilities.CommonUtils;

import cucumber.api.java.Before;



public class Common_Step_Definition {
	
	//launchBrowser()
	
	public static WebDriver driver;
	
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
			if(driver==null) {
				
				LOGGER.info("DRIVER is NULL. Instantiating it!");
			launchBrowser();
			}
			
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
	}


	public void launchBrowser() {
		// TODO Auto-generated method stub
		
		try {
			
			switch (Constants.BROWSER) {
			
			case "chrome":
				System.setProperty(Constants.CHROME_DRIVER, Constants.CHROME_DRIVER_LOCATION);
				LOGGER.info("Launching" + Constants.BROWSER);
				driver=new ChromeDriver();
				break;
			
			case "firefox":
				System.setProperty(Constants.FIREFOX_DRIVER, Constants.FIREFOX_DRIVER_LOCATION);
				LOGGER.info("Launching" + Constants.BROWSER);
				driver=new ChromeDriver();
				break;
			
			case "ie":
				System.setProperty(Constants.EDGE_DRIVER, Constants.EDGE_DRIVER_LOCATION);
				LOGGER.info("Launching" + Constants.BROWSER);
				driver=new ChromeDriver();
				break;
				
			default:
				System.setProperty(Constants.CHROME_DRIVER, Constants.CHROME_DRIVER_LOCATION);
				LOGGER.info("Launching" + Constants.BROWSER);
				driver=new ChromeDriver();
				break;
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
