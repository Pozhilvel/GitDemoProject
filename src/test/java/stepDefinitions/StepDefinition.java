package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	
	@Given("^User is on Netbanking landing page$")
	public void user_is_on_Netbanking_Landing_Page()	
	{
		System.out.println("Landing page is Validated");
	}
	@When("^User login to application with username and password$")
	public void user_login_to_application_with_username_password()
	{
		System.out.println("Login success");
		System.out.println("Login success1");
		System.out.println("Login success2");
	}
	@Then("^Home page is displayed$")
	public void home_page_is_displayed()
	{
		System.out.println("Validated Home Page");
	}
	
	@And("^Creditcards are displayed$")
	public void creditcards_are_displayed()
	{
		System.out.println("Validated Creditcard page");
	}
	
	
	
	
}
