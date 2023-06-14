package com.stepdefiniton;
import Base.com.Baseclass;
import Base.com.Pojoclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Samplecucumber extends Baseclass{
	@Given("To launch the chromebrowser")
	public void to_launch_the_chromebrowser() {
	    // Write code here that turns the phrase above into concrete actions
		launchBrowser();
	    
	}

	@When("To launch the url of fb")
	public void to_launch_the_url_of_fb() {
	    // Write code here that turns the phrase above into concrete actions
	   launchUrl("https://www.facebook.com/");
	    
	}

	@When("To pass valid username {string} in emnail field")
	public void to_pass_valid_username_in_emnail_field(String string) {
		Pojoclass p=new Pojoclass();
		passText(string, p.getEmail());
	}

	@When("To pass valid password {string} in password field")
	public void to_pass_valid_password_in_password_field(String string) {
		Pojoclass p=new Pojoclass();
		passText(string, p.getPassword());
	}

	   
	
	@When("To pass valid{string} in emnail field")
	public void to_pass_valid_in_emnail_field(String string) {
		Pojoclass p=new Pojoclass();
		passText(string, p.getEmail());
	}

	@When("To pass valid{string} in password field")
	public void to_pass_valid_in_password_field(String string) {
		Pojoclass p=new Pojoclass();
		passText(string, p.getPassword());
	   
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		Pojoclass p=new Pojoclass();
		 p.getLoginbtn().click();
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
	 //  closeEntireBrowser();
	}



}
