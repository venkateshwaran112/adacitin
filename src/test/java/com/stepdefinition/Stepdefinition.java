package com.stepdefinition;


import com.MavenDepend.Baseclass;
import com.Page_Obj_Manager.Pg_obj_Mgr;

import Properties.File_Reader_Manager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends Baseclass {
	public static Pg_obj_Mgr pom = new Pg_obj_Mgr(driver);
	
	@Given("^url has to launch$")
	public void url_has_to_launch() throws Throwable {

        String u = File_Reader_Manager.getfrm().getcr().geturl();
        url(u);
	}

	@When("^enter username as \"([^\"]*)\"$")
	public void enter_username_as(String arg1) throws Throwable {
		usrinput(pom.getWp1().getUsrname(), arg1);
	}

	@When("^enter password as \"([^\"]*)\"$")
	public void enter_password_as(String arg1) throws Throwable {
        usrinput(pom.getWp1().getPwd(), arg1);
	}

	@Then("^click the login button$")
	public void click_the_login_button() throws Throwable {
		 usrclick(pom.getWp1().getLogin());
		 Thread.sleep(3000);	
	}
	
	
    
	@When("^enter the \"([^\"]*)\" as hotel location$")
	public void enter_the_as_hotel_location(String arg1) throws Throwable {
		 usrselects(pom.getWp2().getLocation(), arg1);
	}

	@When("^enter the \"([^\"]*)\" as hotel type$")
	public void enter_the_as_hotel_type(String arg1) throws Throwable {
		usrselects(pom.getWp2().getHotels(),arg1);
	}

	@When("^enter the room type as \"([^\"]*)\"$")
	public void enter_the_room_type_as(String arg1) throws Throwable {
		 usrselects(pom.getWp2().getRoomtype(), arg1);
	}

	@When("^enter the adult per room as \"([^\"]*)\"$")
	public void enter_the_adult_per_room_as(String arg1) throws Throwable {
		usrselects(pom.getWp2().getAdultroom(), arg1);
	}

	@When("^enter the children per room as \"([^\"]*)\"$")
	public void enter_the_children_per_room_as(String arg1) throws Throwable {
		 usrselects(pom.getWp2().getChildroom(),arg1);
	}

	@Then("^click the submit button$")
	public void click_the_submit_button() throws Throwable {
		usrclick(pom.getWp2().getSubmit());
		Thread.sleep(3000);
	}
	@When("^select the radio button$")
	public void select_the_radio_button() throws Throwable {
		usrclick(pom.getWp3().getRadiobutton());
	}

	@Then("^click the continue button$")
	public void click_the_continue_button() throws Throwable {
		usrclick(pom.getWp3().getConti());
		Thread.sleep(3000);
	}

	@When("^enter your first name as \"([^\"]*)\"$")
	public void enter_your_first_name_as(String arg1) throws Throwable {
		usrinput(pom.getWp4().getFirstname(), arg1);
		
	}

	@When("^enter your last name as \"([^\"]*)\"$")
	public void enter_your_last_name_as(String arg1) throws Throwable {
		usrinput(pom.getWp4().getLastname(), arg1);
	}
	

	@When("^enter your billing address as \"([^\"]*)\"$")
	public void enter_your_billing_address_as(String arg1) throws Throwable {
		usrinput(pom.getWp4().getAddress(), arg1);
	}

	@When("^enter your credit card no as \"([^\"]*)\"$")
	public void enter_your_credit_card_no_as(String arg1) throws Throwable {
		usrinput(pom.getWp4().getCcnum(), arg1);
	}

	@When("^enter your credit card type as \"([^\"]*)\"$")
	public void enter_your_credit_card_type_as(String arg1) throws Throwable {
		 usrselects(pom.getWp4().getCctype(), arg1);
	}

	@When("^enter your expiry date as \"([^\"]*)\"$")
	public void enter_your_expiry_date_as(String arg1) throws Throwable {
		usrselects(pom.getWp4().getCcexpmonth(),arg1);
	}

	@When("^enter your expiry year as \"([^\"]*)\"$")
	public void enter_your_expiry_year_as(String arg1) throws Throwable {
		  usrselects(pom.getWp4().getCcexpyear(), arg1);
	}

	@When("^enter your cvv number as \"([^\"]*)\"$")
	public void enter_your_cvv_number_as(String arg1) throws Throwable {
		  usrinput(pom.getWp4().getCccvv(), arg1);
	}

	@Then("^click the book now button$")
	public void click_the_book_now_button() throws Throwable {
		usrclick(pom.getWp4().getBooknow());
	}

	@Then("^logout$")
	public void logout() throws Throwable {
		usrclick(pom.getWp5().getLogout());
	}





}
