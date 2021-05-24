package com.Adactin_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_hotel {
	
	public WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement location;
	
	public Search_hotel(WebDriver driver2) {
		this .driver= driver2;
		
		PageFactory.initElements(driver, this);
	}


	public WebElement getLocation() {
		return location;
	}
	
	@FindBy(id = "hotels")
	private WebElement hotel;

	public WebElement getHotel() {
		return hotel;
	}
	
	@FindBy(id="room_type")
	private WebElement roomtype;

	public WebElement getRoomtype() {
		return roomtype;
	}
	
	@FindBy(id = "room_nos")
	private WebElement room_nos;

	public WebElement getRoom_nos() {
		return room_nos;
	}
	
	@FindBy(id = "datepick_in")
	private WebElement checkindate;

	public WebElement getCheckindate() {
		return checkindate;
	}
	
	@FindBy(id = "datepick_out")
	private WebElement checkoutdate;

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}
	
	@FindBy(id = "adult_room")
	private WebElement adultperroom;

	public WebElement getAdultperroom() {
		return adultperroom;
	}
	
	@FindBy(id = "child_room")
	private WebElement childrenperroom;

	public WebElement getChildrenperroom() {
		return childrenperroom;
	}
	
	@FindBy(id = "Submit")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}
	
	@FindBy(id = "Reset")
	private WebElement reset;

	public WebElement getReset() {
		return reset;
	}
	

}
