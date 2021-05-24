package com.Adactin_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Conformation {
	
	public WebDriver driver;

	@FindBy(id="my_itinerary")
	private WebElement myitinerary;
	public Booking_Conformation(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}


	public WebElement getMyitinerary() {
		return myitinerary;
	}
	
	
	
}
