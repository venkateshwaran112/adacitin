package com.MavenDepend;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	public static WebDriver driver;
		// browser launch 
		public static  WebDriver browserlaunch (String name) {
		
		if (name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
//			driver.get(url);
//			driver.manage().window().maximize();
		}
		else if ( name.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "\\Drivers\\geckodriver.exe");
	         driver = new FirefoxDriver();
//	         driver.get(url);
//	         driver.manage().window().maximize();
		}
		else if (name.equalsIgnoreCase("edge")) {
			 System.setProperty("webdriver.msedge.driver", System.getProperty("user.dir")+ "\\Drivers\\msedgedriver.exe");
	         driver = new EdgeDriver();
//	         driver.get(url);
//	         driver.manage().window().maximize();
		}
		return driver;
	}
		
	public static void url (String url)
	{
		driver.get(url);
        driver.manage().window().maximize();
        
	}
	
	public static void usrinput (WebElement element, String name) {
		element.sendKeys(name);		
	}
	
//	public static void pwd (WebElement element, String name) {
//		element.sendKeys(name);
//	}
	
	public static void usrclick(WebElement element) {
		element.click();
	}
	
	public static void usrselect(WebElement element, int value) {
        Select lo = new Select(element);
        lo.selectByIndex(value);
	}
	
	public static void usrselects(WebElement element, String va) {
		 Select lo = new Select(element);
	        lo.selectByValue(va);
			}
	
//	public static void hotels1 ( WebElement element, int value) {
//    Select hotel = new Select(element);
//    hotel.selectByIndex(value);
//	}
//	
//	public static void room1 (WebElement element, int value)
//	{
//    Select roomtype = new Select(element);
//    roomtype.selectByIndex(value);
//	}
//	
//	public static void adult1 (WebElement element, int value) {
//    Select adult = new Select(element);
//    adult.selectByIndex(value);
//}
//	public static void child1 (WebElement element, int value) {
//		Select childs = new Select(element);
//	    childs.selectByIndex(value);
//	}
	
//	public static void click1 ( WebElement element) {
//		element.click();
//	}
//	public static void radio1 ( WebElement element) {
//		element.click();
//	}
//	public static void continue1(WebElement element) {
//		element.click();
//	}
	
	public static void usrscreen(String lo) throws IOException, InterruptedException {
		Thread.sleep(3000);
		    TakesScreenshot scr = (TakesScreenshot) driver;
			File source = scr.getScreenshotAs(OutputType.FILE);
			File destination = new File(lo);
	        FileUtils.copyFile(source, destination);
	}
}


