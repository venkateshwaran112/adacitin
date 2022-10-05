package com.MavenDepend;

//import java.io.File;
import java.io.IOException;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class Runner1 extends Baseclass {

	
  public static void main(String[] args) throws IOException, InterruptedException {
//			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver_1.exe");
//			WebDriver driver = new ChromeDriver();
			browserlaunch("chrome","https://adactinhotelapp.com");
	        WebElement usrname = driver.findElement(By.xpath("//*[@id=\"username\"]"));
	        usrinput(usrname, "venkatesh92");
	        WebElement pwd = driver.findElement(By.xpath("//*[@id=\"password\"]"));
	        usrinput(pwd, "senthil");
	        WebElement login = driver.findElement(By.xpath("//*[@id=\"login\"]"));
	        usrclick(login);
	        WebElement loc = driver.findElement(By.xpath("//*[@id=\"location\"]"));
	        usrselect(loc,3);
	        WebElement hotel = driver.findElement(By.xpath("//*[@id=\"hotels\"]"));
            usrselect(hotel,2);
	        WebElement rooms = driver.findElement(By.xpath("//*[@id=\"room_type\"]"));
            usrselect(rooms, 2);
            
//	       driver.findElement(By.xpath("//*[@id=\"datepick_in\"]")).sendKeys("09/06/2022");
//	       driver.findElement(By.xpath("//*[@id=\"datepick_out\"]")).sendKeys("10/06/2022");
	       WebElement adults = driver.findElement(By.xpath("//*[@id=\"adult_room\"]"));
           usrselect(adults, 3);
	       WebElement children = driver.findElement(By.xpath("//*[@id=\"child_room\"]"));
	       usrselect(children,2);
	       WebElement cli = driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
	       usrclick(cli);
	       WebElement radio = driver.findElement(By.xpath("//*[@id=\"radiobutton_0\"]"));
	       usrclick(radio);
	       WebElement conti = driver.findElement(By.xpath("//*[@id=\"continue\"]"));
	       usrclick(conti);
	       usrscreen("F:\\seleniumworkspace7am\\MavenDepend\\screen1\\adacit1.png");
//	       driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("venki");
//	       driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("V");
//	       driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("NO:6, Vivekanandar Theru, Dubai");
//	       driver.findElement(By.xpath("//*[@id=\"cc_num\"]")).sendKeys("1234567890789654");
//	       WebElement card = driver.findElement(By.xpath("//*[@id=\"cc_type\"]"));
//	       Select ctype = new Select(card);
//	       ctype.selectByIndex(3);
//	       WebElement months = driver.findElement(By.xpath("//*[@id=\"cc_exp_month\"]"));
//		   Select month = new Select(months);
//		   month.selectByIndex(6);
//		   WebElement years = driver.findElement(By.xpath("//*[@id=\"cc_exp_year\"]"));
//		   Select year = new Select(years);
//		   year.selectByIndex(5);
//		   driver.findElement(By.xpath("//*[@id=\"cc_cvv\"]")).sendKeys("549821475364");
//		   driver.findElement(By.xpath("//*[@id=\"book_now\"]")).click();
//		   Thread.sleep(5000);
		   
		}


		
	
	}


