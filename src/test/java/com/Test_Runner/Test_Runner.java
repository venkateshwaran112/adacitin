package com.Test_Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.MavenDepend.Baseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature\\Hotelapp.feature", glue = "com.stepdefinition", monochrome = true,
plugin = {"html:Report", "json:Report/cucumber.json", "pretty", "com.cucumber.listener.ExtentCucumberFormatter:Report/Adactin.html"})
public class Test_Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void browserlaunch() throws InterruptedException {
		driver = Baseclass.browserlaunch("chrome");
		Thread.sleep(5000);
		
	}
	
   @AfterClass
   public static void exibrowser() {
	   driver.close();
   } 
}
