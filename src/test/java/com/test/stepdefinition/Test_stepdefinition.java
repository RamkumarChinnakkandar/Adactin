package com.test.stepdefinition;



import org.openqa.selenium.WebDriver;

import com.Adactin_project.Base_class;
import com.Adactin_project.Book_hotel;
import com.Adactin_project.Booked_itinerary;
import com.Adactin_project.Booking_Conformation;
import com.Adactin_project.Login_page;
import com.Adactin_project.Search_hotel;
import com.Adactin_project.Select_hotel;
import com.adactin.helper.Filemanager;
import com.adactin.helper.Page_manager;
import com.test.runner.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_stepdefinition extends Base_class {
	public static WebDriver Driver=Test_Runner.driver;
	public static Page_manager pom= new Page_manager(driver);
	
	@Given("^User launch the application$")
	public void user_launch_the_application() throws Throwable {
	    
	  String geturl = Filemanager.getinstance().getInstanceCR().geturl();
	  geturl(geturl);
	  
	}
	
	@When("^User enter  the \"([^\"]*)\"$")
	public void user_enter_the1(String username) throws Throwable {
		send(pom.getInstanceLogin().getUsername(), username);
	   
	}

	@When("^User enter the \"([^\"]*)\"$")
	public void user_enter_the(String password) throws Throwable {
		send(pom.getInstanceLogin().getPassword(), password);
	    
	}

	

	@Then("^User click on login and it navigate to the select hotel page$")
	public void user_click_on_login_and_it_navigate_to_the_select_hotel_page() throws Throwable {
	 
		click(pom.getInstanceLogin().getLogin());
	}

	
	
	@When("^User enter location$")
	public void user_enter_location() throws Throwable {
		
		singledropdown(pom.getInstanceSearch().getLocation(), "value", 0, "Sydney");
	    
	}

	@When("^User enter hotel$")
	public void user_enter_hotel() throws Throwable {
		
		singledropdown(pom.getInstanceSearch().getHotel(), "value", 0, "Hotel Sunshine");
	}


	@When("^User enter room type$")
	public void user_enter_room_type() throws Throwable {
	    
		singledropdown(pom.getInstanceSearch().getRoomtype(), "Value", 0, "Double");
		
	}

	@When("^User enter no of rooms$")
	public void user_enter_no_of_rooms() throws Throwable {
	   
		singledropdown(pom.getInstanceSearch().getRoom_nos(), "value", 0, "2");
		
	}

	@When("^User enter check in date$")
	public void user_enter_check_in_date() throws Throwable {
	    
		send(pom.getInstanceSearch().getCheckindate(), "13/04/2021");
		
	}

	@When("^User enter check out date$")
	public void user_enter_check_out_date() throws Throwable {
	   
		send(pom.getInstanceSearch().getCheckoutdate(), "14/04/2021");
		
	}

	@When("^User enter adult per room$")
	public void user_enter_adult_per_room() throws Throwable {
	    
		singledropdown(pom.getInstanceSearch().getAdultperroom(), "value", 0, "2");
		
	}

	@When("^User enter children per room$")
	public void user_enter_children_per_room() throws Throwable {
	    
		
		singledropdown(pom.getInstanceSearch().getChildrenperroom(), "value", 0, "2");
	}

	@Then("^User click the search and it navigate to select hotel page$")
	public void user_click_the_search_and_it_navigate_to_select_hotel_page() throws Throwable {
	    
		click(pom.getInstanceSearch().getSubmit());
		
	}

	@When("^User tick the check box$")
	public void user_tick_the_check_box() throws Throwable {
		
		click(pom.getInstanceSelect().getRadio_button());
	    
	}

	@Then("^user click contiue and it navigate to book hotel page$")
	public void user_click_contiue_and_it_navigate_to_book_hotel_page() throws Throwable {
	    
		click(pom.getInstanceSelect().getContinue_button());
	}

	@When("^User enter the first name$")
	public void user_enter_the_first_name() throws Throwable {
	 
		send(pom.getInstanceBook().getFirstname(), "Ramkumar");
		
	}

	@When("^User enter the last name$")
	public void user_enter_the_last_name() throws Throwable {
	    
	    send(pom.getInstanceBook().getLastname(), "C");
	}

	@When("^User enter the billing address$")
	public void user_enter_the_billing_address() throws Throwable {
	   
		send(pom.getInstanceBook().getAddress(), "karur");
	}

	@When("^User enter credit card number$")
	public void user_enter_credit_card_number() throws Throwable {
		String getcardnumber = Filemanager.getinstance().getInstanceCR().getcardnumber();
	   send(pom.getInstanceBook().getCardnumber(), getcardnumber);
	}

	@When("^User enter credit card type$")
	public void user_enter_credit_card_type() throws Throwable {
	   singledropdown(pom.getInstanceBook().getCardtype(), "value", 0, "VISA");
	}

	@When("^User enter ex month$")
	public void user_enter_ex_month() throws Throwable {
	    singledropdown(pom.getInstanceBook().getExmonth(), "value", 0, "2");
	}

	@When("^User enter ex year$")
	public void user_enter_ex_year() throws Throwable {
		
	   singledropdown(pom.getInstanceBook().getExyear(), "value", 0, "2022");
	   
	}
	@When("^User enter ex cvv number$")
	public void user_enter_ex_cvv_number() throws Throwable {
		String cvv = Filemanager.getinstance().getInstanceCR().getCvv();
	    send(pom.getInstanceBook().getCvno(), cvv);
	}

	@Then("^User click book now and it navigate to booking conformation page$")
	public void user_click_book_now_and_it_navigate_to_booking_conformation_page() throws Throwable {
    click(pom.getInstanceBook().getBooknow());
    Thread.sleep(7000);

	}

	@Then("^User click the my itinerary and it navigate to Booked itinerary$")
	public void user_click_the_my_itinerary_and_it_navigate_to_Booked_itinerary() throws Throwable {
	click(pom.getInstanceConform().getMyitinerary());
	Thread.sleep(7000);
	    
	}

	@Then("^User click logout the application$")
	public void user_click_logout_the_application() throws Throwable {
	    click(pom.getInstanceitinerary().getLogout());
		Thread.sleep(7000);
	}




}
