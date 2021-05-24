package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_reader {

	public static Properties p;
	
	public Configuration_reader() throws Throwable {
	File f=new File("C:\\Users\\elcot\\eclipse-workspace\\Adactin_project\\src\\test\\java\\com\\adactin\\propertyfile\\configuration.properties");
	
	FileInputStream fis=new FileInputStream(f);
	
	p=new Properties();
	
	p.load(fis);
	
	}
	
	public String getBrowser() {
		
		String browser = p.getProperty("browser");
		return browser;
	}
	
	public String geturl() {
		
		String url = p.getProperty("url");
		return url;
	}
	
	public String getcardnumber() {
		String cardnumber = p.getProperty("card_no");
		return cardnumber;
	}

	
	public String getCvv() {
		String cvv= p.getProperty("cvv");
		return cvv;
		
	}
	
}
