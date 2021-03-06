package com.foodapp;

import junit.framework.TestCase;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class foodappSteps extends TestCase {
	String user, location, foodType;
	Resturants obj = new Resturants();
	
	@Given("^\"([^\"]*)\" entered location as \"([^\"]*)\"$")
	public void entered_location_as(String arg1, String arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		user=arg1;
		location=arg2;
	}

	@Given("^select food type \"([^\"]*)\"$")
	public void select_food_type(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		foodType=arg1;
	}

	@When("^click on \"([^\"]*)\"$")
	public void click_on(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
	}

	@Then("^system display all available resturant serving same food$")
	public void system_display_all_available_resturant_serving_same_food() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		ResturantBLL obj = new ResturantBLL();
		assertTrue(obj.find(location, foodType));
	}
	@Given("^\"([^\"]*)\" entered pincode as \"([^\"]*)\"$")
	public void entered_pincode_as(String arg1, String arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Given("^select food time \"([^\"]*)\"$")
	public void select_food_time(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^system display \"([^\"]*)\"$")
	public void system_display(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}


}
