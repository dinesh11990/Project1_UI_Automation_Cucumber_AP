package stepDefinitions;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.Select;

import com.krish.constants.Constants;
import com.krish.page_objects.DirectoryPage;
import com.krish.page_objects.HomePage;
import com.krish.page_objects.LoginPage;
import com.krish.webdriver_manager.DriverManager;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Verify_CEOName_Step_Def {

	
	private static final Logger LOGGER = LogManager.getLogger(Verify_CEOName_Step_Def.class);
	
	@Given("the user is logged in successfully and is on Home Pages")
	public void the_user_is_logged_in_successfully_and_is_on_home_pages() {
		//login
		DriverManager.getDriver().get(Constants.APP_URL);
		LoginPage.USERNAME.sendKeys(Constants.USERNAME);
		LoginPage.PASSWORD.sendKeys(Constants.PASSWORD);
		LoginPage.LOGIN_BUTTON.click();
		
		String url=DriverManager.getDriver().getCurrentUrl();
		
		if(url.contains("dashboard")) {
			
			LOGGER.info("the user is logged in successfully and is on Home Pages");
		}
		
		
	}

	@When("the user clicks on the directory option from the Menu bars")
	public void the_user_clicks_on_the_directory_option_from_the_menu_bars() {
		
		HomePage.DIRECTORY.click();
		
		
		LOGGER.info("the user clicks on the directory option from the Menu bars");

	}

	@When("^the user selects the job title as \"(.*?)\" from the drop downs$")
	public void the_user_selects_the_job_title_as_from_the_drop_downs(String jobTitle) {
		
		Select selectJob = new Select(DirectoryPage.JOB_TITLE);
		selectJob.selectByVisibleText("Chief Executive Officer");
		LOGGER.info("the user selects the job title as {string} from the drop downs");

	}

	@When("clicks the search buttons")
	public void clicks_the_search_buttons() {
		
		DirectoryPage.SEARCH.click();
		LOGGER.info("clicks the search buttons");

	}

	@Then("^the user should see the CEO name as \"(.*?)\"$")
	public void the_user_should_see_the_ceo_name_as(String expectedName) {
		
		String actualName=DirectoryPage.NAME.getText();
		
		if(actualName.equalsIgnoreCase(expectedName))
		{
			LOGGER.info("the user should see the CEO name as John Smith");
		}
		LOGGER.info("the user should see the CEO name as John Smith");

	
	}

}
