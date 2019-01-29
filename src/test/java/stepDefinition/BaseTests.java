/**
 * @author Vivek
 *
 */
package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.TestNGRunner;

public class BaseTests extends TestNGRunner
{
	@Given("^User is in homepage$")
	public void navigateToHomepage()
	{
		System.out.println("Inside Given");
	}

	@Then("^Enter username and password$")
	public void enterUserDetails()
	{
		System.out.println("Then");
	}
	
	@When("^Clicks on the submit button$")
	public void clickOnSubmitButton()
	{
		System.out.println("Inside When");
	}

	@Then("^login should be successful$")
	public void verifyLoginIsSuccessfull()
	{
		System.out.println("Then");
	}

}