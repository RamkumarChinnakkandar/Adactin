package com.Adactin_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Book_hotel {
	
	public WebDriver driver;

	@FindBy(id = "first_name")
	private WebElement firstname;

	public Book_hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	}

	public WebElement getFirstname() {
		return firstname;
	}
	
	@FindBy(id = "last_name")
	private WebElement lastname;

	public WebElement getLastname() {
		return lastname;
	}
	
	@FindBy(id = "address")
	private WebElement address;

	public WebElement getAddress() {
		return address;
	}
	
	@FindBy(id = "cc_num")
	private WebElement cardnumber;

	public WebElement getCardnumber() {
		return cardnumber;
	}
	
	@FindBy(id = "cc_type")
	private WebElement cardtype;

	public WebElement getCardtype() {
		return cardtype;
	}
	
	@FindBy(id = "cc_exp_month")
	private WebElement exmonth;

	public WebElement getExmonth() {
		return exmonth;
	}
	
	
	@FindBy(id = "cc_exp_year")
	private WebElement exyear;

	public WebElement getExyear() {
		return exyear;
	}
	
	
	@FindBy(id = "cc_cvv")
	private WebElement cvno;

	public WebElement getCvno() {
		return cvno;
	}
	
	@FindBy(id = "book_now")
	private WebElement booknow;

	public WebElement getBooknow() {
		return booknow;
	}
	
	@FindBy(id = "cancel")
	private WebElement cancel;

	public WebElement getCancel() {
		return cancel;
	}
	
	
	
	
	
	
	
}
