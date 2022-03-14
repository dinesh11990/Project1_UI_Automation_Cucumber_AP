package com.krish.utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.krish.constants.Constants;
import com.krish.page_objects.DirectoryPage;
import com.krish.page_objects.HomePage;
import com.krish.page_objects.LoginPage;
import com.krish.webdriver_manager.DriverManager;

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
	
	public void initWebElements() {
		
		//Here we are calling the singleton design patter "getInstance()"
		
		PageFactory.initElements(DriverManager.getDriver(), LoginPage.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), HomePage.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), DirectoryPage.getInstance());
	}

}
