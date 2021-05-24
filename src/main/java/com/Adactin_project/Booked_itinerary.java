package com.Adactin_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_itinerary {
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@name='ids[]']")
	private WebElement tick;

	public Booked_itinerary(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getTick() {
		return tick;
	}
	
	
	@FindBy(name = "cancelall")
	private WebElement cancel;

	public WebElement getCancel() {
		return cancel;
	}
	
	@FindBy(id = "search_hotel")
	private WebElement search_hotel;

	public WebElement getSearch_hotel() {
		return search_hotel;
	}
	
	@FindBy(id="logout")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}

}
