package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Verify_CEOName_Step_Def {

	
	@Given("the user is logged in successfully and is on Home Pages")
	public void the_user_is_logged_in_successfully_and_is_on_home_pages() {
		System.out.println("the user is logged in successfully and is on Home Pages");
	}

	@When("the user clicks on the directory option from the Menu bars")
	public void the_user_clicks_on_the_directory_option_from_the_menu_bars() {
		System.out.println("the user clicks on the directory option from the Menu bars");

	}

	@When("^the user selects the job title as \"(.*?)\" from the drop downs$")
	public void the_user_selects_the_job_title_as_from_the_drop_downs(String string) {
		System.out.println("the user selects the job title as {string} from the drop downs");

	}

	@When("clicks the search buttons")
	public void clicks_the_search_buttons() {
		System.out.println("clicks the search buttons");

	}

	@Then("^the user should see the CEO name as \"(.*?)\"$")
	public void the_user_should_see_the_ceo_name_as(String string) {
		System.out.println("the user should see the CEO name as {string}");

	
	}

}
