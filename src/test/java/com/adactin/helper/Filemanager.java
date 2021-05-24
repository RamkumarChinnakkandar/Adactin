package com.adactin.helper;

public class Filemanager {

	
public static Filemanager getinstance() {
	Filemanager helper=new Filemanager();
    return helper;
	
}	
	
	
	
public Configuration_reader getInstanceCR() throws Throwable {
	
	Configuration_reader reader = new Configuration_reader();
	return reader;
	
}
	
}
