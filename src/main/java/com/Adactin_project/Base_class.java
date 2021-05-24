package com.Adactin_project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_class {
	  public static WebDriver driver;
	  
	  public static WebDriver getBrowser(String type) {
		  if(type.equalsIgnoreCase("chrome")) {
			  System.setProperty("webdriver.chrome.driver","C:\\Users\\elcot\\eclipse-workspace\\Adactin_project\\driver\\chromedriver.exe");
				driver=new ChromeDriver();	
		  }
		  else if(type.equalsIgnoreCase("firefox")) {
			  System.setProperty("webdriver.gecko.driver","C:\\Users\\elcot\\eclipse-workspace\\Selenium_project name\\Driver89\\geckodriver.exe");
				driver=new FirefoxDriver();	
		  }
		  else if(type.equalsIgnoreCase("ie")) {
			  System.setProperty("webdriver.chrome.ie.driver","C:\\Users\\elcot\\eclipse-workspace\\Selenium_project name\\Driver89\\IEDriverServer.exe");
				driver=new InternetExplorerDriver();		
		  }
		  driver.manage().window().maximize();
		  return driver;  
	}
	 
	  
	  public static void geturl(String url) {
		  driver.get(url);
		
	}
	  
	public static void navigate(String nurl) {
		driver.navigate().to("nurl");
		
	}  
	  
	 public static void back() {
	
		 driver.navigate().back();
	} 
	  
	 public static void forword() {
			
		 driver.navigate().back();
	} 
	  
	 public static void refresh() {
			
		 driver.navigate().back();
	} 
	  
	  public static void send(WebElement email,String value) {
		 
		  email.sendKeys(value);
	}
	 
	 
	  public static void click(WebElement login) {
			 
		  try {
			login.click();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	 
	  public static void url() {
			 
		  String title= driver.getTitle();
		  System.out.println(title);
	}
	  
	  public static void currenturl() {
			 
		  String title= driver.getCurrentUrl();
		  System.out.println(title);
	}
	  
	  public static void action(WebElement acc) throws AWTException {
		
		  Actions ac=new Actions(driver);
		  ac.contextClick(acc).build().perform();
		  
		  Robot r=new Robot();
		  r.keyPress(KeyEvent.VK_DOWN);
		  r.keyRelease(KeyEvent.VK_DOWN);
		  
		  r.keyPress(KeyEvent.VK_ENTER);
		  r.keyRelease(KeyEvent.VK_ENTER);
	}
	  
	 public static void singledropdown(WebElement e,String ty,int se,String v) {
		if(ty.equalsIgnoreCase("index")) {
			Select sc= new Select(e);
			sc.selectByIndex(se);
		}
		else if (ty.equalsIgnoreCase("value")) {
			Select sc= new Select(e);
			sc.selectByValue(v);
		}
		else if(ty.equalsIgnoreCase("text")) {
			Select sc= new Select(e);
			sc.selectByVisibleText(v);
		}
	} 
	  
	 public static void takescreenshot(String path) throws IOException {
		 TakesScreenshot ts =(TakesScreenshot) driver;
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 File destination=new File(path);
		 FileUtils.copyFile(source, destination);
		
	}
	  
	  public static void alert(WebElement e,String s,String value) {
		if(s.equalsIgnoreCase("simplealert")) {
			Alert salert = driver.switchTo().alert();
			salert.accept();
		}
		if(s.equalsIgnoreCase("calert")) {
			Alert calert = driver.switchTo().alert();
			calert.accept();
		}
		if(s.equalsIgnoreCase("textalert")) {
			Alert texalert = driver.switchTo().alert();
			String text = e.getText();
			System.out.println(text);
			e.sendKeys(value);
			texalert.accept();
		}

	}
	  
	 /*public static void ismultiple(WebElement e,String ty) {
		Select s=new Select(e);
		boolean multiple = s.isMultiple();
		System.out.println(multiple); 
		String st=String.valueOf(multiple);
		
		if(st.equalsIgnoreCase("true")) {
					List<WebElement> options = s.getOptions();
					System.out.println("***alloption***");
					for (WebElement alloptions : options) {
						String value = alloptions.getText();
						System.out.println(value);
			}
					int size = options.size();
					System.out.println(size);
					for (int i = 0; i < size; i++) {
						if(i==3 || i==5 || i==7) {
							s.selectByIndex(i);
						}
					}
					}
		System.out.println("***allselectedoptions");
		if(ty.equalsIgnoreCase("getallselected")) {
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			for (WebElement allselect: allSelectedOptions) {
				
				System.out.println(allselect.getText());
			}
			
			if(ty.equalsIgnoreCase("getfirstselected")) {
				WebElement firstSelectedOption = s.getFirstSelectedOption();
				System.out.println("***firstselected***");
				System.out.println(firstSelectedOption.getText());
			}
			
		}
		
	 }*/
	 
	 
	 public static List<WebElement> getAllOptions(WebElement element,String size) {
			Select s=new Select(element);
			List<WebElement> options = s.getOptions();
		for (WebElement geto : options) {
			String text = geto.getText();
			System.out.println( text);
		}
		int size1 = options.size();
		System.out.println(size1);
		return options;
		}
		public static void getAllSelected(WebElement element,String options,String value) {
			Select s=new Select(element);
			if (options.equalsIgnoreCase("index")) {
				int parseInt = Integer.parseInt(value);
				s.selectByIndex(parseInt);
			}
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			for (WebElement selected : allSelectedOptions) {
				String text1 = selected.getText();
				System.out.println(text1);
			}
		}
		//getfirstselected
		public static void getFirstSelected(WebElement element) {
			Select s=new Select(element);
			WebElement firstSelectedOption = s.getFirstSelectedOption();
			System.out.println(firstSelectedOption.getText());


		}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 }
	  
	  
	  
	  
	  
	 
	 
	 
	 
	 
	 
	 
	  
	  



