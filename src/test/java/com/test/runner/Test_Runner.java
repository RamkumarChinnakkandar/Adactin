package com.test.runner;

import org.junit.AfterClass;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Adactin_project.Base_class;
import com.adactin.helper.Filemanager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//test//featurefile",glue = "com.test.stepdefinition",
monochrome = true,dryRun=false,
strict = true,
plugin = {"html:Report/HTML_Report",
		"pretty",
		"json:Reports/jsonReport.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Report/Extentreport.html"
}
		)

	
public class Test_Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_up() throws Throwable {
		
    String browser = Filemanager.getinstance().getInstanceCR().getBrowser();
	driver=Base_class.getBrowser(browser);

	}
	@AfterClass
	public static void tear_down() {
		driver.close();
	}
}
