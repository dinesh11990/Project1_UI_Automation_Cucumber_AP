package stepDefinitions;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.Select;

import com.krish.constants.Constants;
import com.krish.page_objects.DirectoryPage;
import com.krish.page_objects.HomePage;
import com.krish.page_objects.LoginPage;
import com.krish.utilities.CommonUtils;
import com.krish.webdriver_manager.DriverManager;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Verify_CEOName_Step_Def {


	private static final Logger LOGGER = LogManager.getLogger(Verify_CEOName_Step_Def.class);

	@Given("the user is logged in successfully and is on Home Pages")
	public void the_user_is_logged_in_successfully_and_is_on_home_pages() {

		try {
			//login
			DriverManager.getDriver().get(Constants.APP_URL);


			//You should not again initilise the object (that why there is null point exception, in this case we re going to implement singleton design pattern) 
			//because you have already initiated the object in CommonUtils ie in page factory.
			//LoginPage loginPage = new LoginPage(); ------------> You need to avoid writing this, 1. Here we are initialising the page factory and 2. Again you are using the loginPage object to call some other methods from different class

			//Created the object for LoginPage
			//LoginPage.getInstance();


			//It will retrieve the same object from the page factory, it will not retrieve any new object
			LoginPage.getInstance().enterUserName(Constants.USERNAME);
			LoginPage.getInstance().enterPassword(Constants.PASSWORD);
			LoginPage.getInstance().clickLoginButton();

			String url=DriverManager.getDriver().getCurrentUrl();

			if(url.contains("dashboard")) {

				LOGGER.info("the user is logged in successfully and is on Home Pages");
			}}
		catch (Exception e) {

			LOGGER.error(e);
			//CommonUtils.getInstance().takeScreenshot();
		}

	}

	@When("the user clicks on the directory option from the Menu bars")
	public void the_user_clicks_on_the_directory_option_from_the_menu_bars() {
		//HomePage homePage = new HomePage();

		//HomePage.getInstance().getDIRECTORY().click();

		try {

			HomePage.getInstance().clickDirectory();
			LOGGER.info("the user clicks on the directory option from the Menu bars");
		}catch(Exception e) {

			LOGGER.error(e);
			//CommonUtils.getInstance().takeScreenshot();
		}

	}
	
	@When("^the user selects the job title as \"([^\"]*)\" from the drop down \"([^\"]*)\"$")
	public void the_user_selects_the_job_title_as_from_the_drop_down(String jobTitle,String howTo) throws Throwable {
		//DirectoryPage directoryPage = new DirectoryPage();

		
		/*Select selectJob = new Select(DirectoryPage.getInstance().getJOB_TITLE());
		selectJob.selectByVisibleText("Chief Executive Officer");*/
		
		try {
			
			//DirectoryPage.getInstance().selectJobTitle(jobTitle);
			
			CommonUtils.getInstance().selectFromDropDown(DirectoryPage.getInstance().getJOB_TITLE(), howTo, jobTitle);
			LOGGER.info("the user selects the job title as {string} from the drop downs");

		}catch(Exception e) {

			LOGGER.error(e);
			CommonUtils.getInstance().takeScreenshot();
		}}

	
	/*@When("^the user selects the job title as \"(.*?)\" from the drop downs \"(.*?)\"$")
	public void the_user_selects_the_job_title_as_from_the_drop_downs(String jobTitle,String howTo) {

		//DirectoryPage directoryPage = new DirectoryPage();

		
		Select selectJob = new Select(DirectoryPage.getInstance().getJOB_TITLE());
		selectJob.selectByVisibleText("Chief Executive Officer");
		
		try {
			//DirectoryPage.getInstance().selectJobTitle(jobTitle);
			
			CommonUtils.getInstance().selectFromDropDown(DirectoryPage.getInstance().getJOB_TITLE(), howTo, jobTitle);
			LOGGER.info("the user selects the job title as {string} from the drop downs");

		}catch(Exception e) {

			LOGGER.error(e);
			CommonUtils.getInstance().takeScreenshot();
		}}*/
	
	
	
	
		/*@When("^the user selects the job title as \"(.*?)\" from the drop down")
		public void the_user_selects_the_job_title_as_from_the_drop_downs(String jobTitle) {
			
		try {
				DirectoryPage.getInstance().selectJobTitle(jobTitle);
				LOGGER.info("the user selects the job title as {string} from the drop down");

			}catch(Exception e) {

				LOGGER.error(e);
				//CommonUtils.getInstance().takeScreenshot();
			}}*/
	
	
	

	@When("clicks the search button")
	public void clicks_the_search_button() {

		//DirectoryPage directoryPage = new DirectoryPage();

		//DirectoryPage.getInstance().getSEARCH().click();
		try {

			DirectoryPage.getInstance().clickSearch();
			LOGGER.info("clicks the search button");
		}catch(Exception e) {

			LOGGER.error(e);
			//CommonUtils.getInstance().takeScreenshot();
		}}


	@Then("^the user should see the CEO name as \"(.*?)\"$")
	public void the_user_should_see_the_ceo_name_as(String expectedName) {


		//DirectoryPage directoryPage = new DirectoryPage();

		//String actualName=DirectoryPage.getInstance().getNAME().getText();

		try {

			String actualName=DirectoryPage.getInstance().getPersonName();

			if(actualName.equalsIgnoreCase(expectedName)) {

				LOGGER.info("the user should see the CEO name as John Smith");
			}}catch (Exception e) {

				LOGGER.error(e);
				//CommonUtils.getInstance().takeScreenshot();
			}





	}

}
