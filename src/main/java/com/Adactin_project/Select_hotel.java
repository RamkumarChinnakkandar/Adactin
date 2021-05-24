package com.Adactin_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_hotel {
	
	public WebDriver driver;

	@FindBy(id = "radiobutton_0")
	private WebElement radio_button;

	public Select_hotel(WebDriver driver2) {
		this.driver=driver2;
	    PageFactory.initElements(driver, this);
	}

	public WebElement getRadio_button() {
		return radio_button;
	}
	
	@FindBy(id = "continue")
	private WebElement continue_button;

	public WebElement getContinue_button() {
		return continue_button;
	}
	
	@FindBy(id = "cancel")
	private WebElement cancel_button;

	public WebElement getCancei_button() {
		return cancel_button;
	}
}
