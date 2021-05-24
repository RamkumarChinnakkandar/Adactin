package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Adactin_project.Book_hotel;
import com.Adactin_project.Booked_itinerary;
import com.Adactin_project.Booking_Conformation;
import com.Adactin_project.Login_page;
import com.Adactin_project.Search_hotel;
import com.Adactin_project.Select_hotel;

public class Page_manager {
	
	public WebDriver driver;
	
	private Login_page login;
	private Search_hotel search;
	private Select_hotel select;
	private Book_hotel book;
	private Booking_Conformation conform;
	private Booked_itinerary itinerary;
	
	public Page_manager(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	}
	public Login_page getInstanceLogin() {
		
		login=new Login_page(driver);
		return login;
		
	}
public Search_hotel  getInstanceSearch() {
	
	search=new Search_hotel(driver);
    return search;
	
}
	
	public Select_hotel getInstanceSelect() {
		
		select = new Select_hotel(driver);
		return select;
		
	}
	public Book_hotel getInstanceBook() {
		book=new Book_hotel(driver);
		return book;
		
	}
	
	public Booking_Conformation getInstanceConform() {
		conform=new Booking_Conformation(driver);
		return conform;
		
	}
	
	public Booked_itinerary getInstanceitinerary() {
		itinerary=new Booked_itinerary(driver);
		return itinerary;
	}
}
