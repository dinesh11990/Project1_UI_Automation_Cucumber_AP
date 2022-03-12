package com.krish.utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.krish.constants.Constants;

public class CommonUtils {
	
	public void loadProperties() {
		
		
	
		Properties properties = new Properties();
		
		try {
			
			//We wrote this code because we move the config.properties into src/test/resources
			properties.load(getClass().getResourceAsStream("/config.properties"));
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		Constants.APP_URL=properties.getProperty("APP_URL");
		Constants.BROWSER=properties.getProperty("BROWSER");
		Constants.USERNAME=properties.getProperty("UserName");
		Constants.PASSWORD=properties.getProperty("Password");
		Constants.CHROME_DRIVER_LOCATION=properties.getProperty("CHROME_DRIVER_LOCATION");
		Constants.FIREFOX_DRIVER_LOCATION=properties.getProperty("FIREFOX_DRIVER_LOCATION");
		Constants.EDGE_DRIVER_LOCATION=properties.getProperty("EDGE_DRIVER_LOCATION");
		
		
	
		
	}

}
