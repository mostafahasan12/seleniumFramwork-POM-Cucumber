package steps;


import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage1;
import pages.UserRegistrationPage1;
import tests.TestBase1;

public class UserRegisterationForCucumber extends TestBase1 {
	HomePage1 homeobject;
	UserRegistrationPage1 registerobject;
	
	
	@Given("the user in the home page")
	public void the_user_in_the_home_page() {
	  homeobject = new HomePage1(driver);
	  homeobject.openRegistrationPage();
	}
	@When("I click on the register link")
	public void i_click_on_the_register_link() {
	 Assert.assertTrue( driver.getCurrentUrl().contains("register"));  
	}
//	@When("I entered the user data")
//	public void i_entered_the_user_data() {
//	    registerobject = new UserRegistrationPage1(driver);
//	    registerobject.userRegistration( "mostafa", "hasan", "msahdyy@test.com", "1234567");
//	    
//	}
	@When("I entered {string} , {string} , {string} , {string}")
	public void i_entered(String firstname , String lastname , String email , String password) {
		registerobject = new UserRegistrationPage1(driver);
	    registerobject.userRegistration( firstname ,lastname , email , password );
	}
	
	@Then("The registeration page displayed successfully")
	public void the_registeration_page_displayed_successfully() {
//	   registerobject.userlogout(); 
	}

}
