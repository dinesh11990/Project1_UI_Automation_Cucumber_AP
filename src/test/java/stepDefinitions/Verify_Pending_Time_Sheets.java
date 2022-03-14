package stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.krish.page_objects.HomePage;
import com.krish.page_objects.TimesheetPage;
import com.krish.utilities.CommonUtils;
import com.krish.webdriver_manager.DriverManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Verify_Pending_Time_Sheets {

	private static Logger LOGGER = LogManager.getLogger();
	
	@Given("the user is on the homepages")
	public void the_user_is_on_the_homepages() {
		
		String url = DriverManager.getDriver().getCurrentUrl();
		
		if(url.contains("dashboard")) {
			
			LOGGER.info("the user is on homepage");
	}
	}

	@Given("the user clicks on the time option from the menus")
	public void the_user_clicks_on_the_time_option_from_the_menus() {
		
		HomePage.getInstance().clickTime();
	}

	@Given("the user enters the name as \"(.*?)\"")
	public void the_user_enters_the_name_as(String name) {
		TimesheetPage.getInstance().getCEONAME().sendKeys("John Smith");
		
	}

	@Given("clicks on the view buttons")
	public void clicks_on_the_view_buttons() {
		TimesheetPage.getInstance().clickView();

	}

	//Since you have given try catch, it will show pass in green, here we see - How to fail a scenario
	@Then("the user should see the message as \"(.*?)\"")
	public void the_user_should_see_the_message_as(String expectedMessage) {
		
		try {
			String actualMessage = TimesheetPage.getInstance().getMessage();
			if(expectedMessage.equals(actualMessage)) {
				LOGGER.info("expected message is seen");
			}
			
		}catch(Exception e) {

			LOGGER.error(e);
			CommonUtils.getInstance().takeScreenshot();
			Assert.fail(e.getMessage());
		}}
		
		
		

	}


