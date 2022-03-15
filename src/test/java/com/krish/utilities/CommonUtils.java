package com.krish.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.krish.constants.Constants;
import com.krish.page_objects.DirectoryPage;
import com.krish.page_objects.HomePage;
import com.krish.page_objects.LoginPage;
import com.krish.webdriver_manager.DriverManager;

import stepDefinitions.Common_Step_Definition;

public class CommonUtils {
	
	private static final Logger LOGGER=LogManager.getLogger(CommonUtils.getInstance());

	//Singleton

	private static CommonUtils commonUtilsInstance = null;

	private CommonUtils() {


	}

	public static CommonUtils getInstance() {

		if(commonUtilsInstance==null) {
			commonUtilsInstance = new CommonUtils();
		}

		return commonUtilsInstance;


	}
	
//-------------------------------------------------------------------------------------------------------


	//Config file loader
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

	
	public void takeScreenshot() {

		File screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.FILE);

		//Copy the file to a location and use try catch block to handle exception

		try {

			//FileUtils.copyFile(screenshot, new File(Common_Step_Definition.getScenarioName()+".png"));
			FileUtils.copyFile(screenshot, new File("screenshot.png"));
		}catch (IOException e) {

			System.out.println(e.getMessage());
		}}

	//Highlighting the elements
	//Not requried
	public void highlightElement(WebElement element) {

		JavascriptExecutor executor = (JavascriptExecutor) DriverManager.getDriver();
		executor.executeScript("arguments[0].setAttribute('style','border: 3px solid blue')", element);
	}

	public void selectFromDropDown(WebElement dropDown, String howTo, String value ) {

		Select select = new Select(dropDown);

		switch (howTo) {
		
		case "index":

			select.selectByIndex(Integer.parseInt(value));

			break;

		case "value":

			select.selectByValue(value);

			break;

		case "text":

		select.selectByVisibleText(value);

		break;

		default:
			LOGGER.info("Please provide a valid selection in the feature file. Valid selection are: text, value, index");
			break;
		}


	}


}


