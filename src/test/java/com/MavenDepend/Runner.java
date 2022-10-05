package com.MavenDepend;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Runner {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("venkatesh92");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("senthil");
        driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
        WebElement loc = driver.findElement(By.xpath("//*[@id=\"location\"]"));
        Select loca = new Select(loc);
        loca.selectByIndex(1);
        WebElement hotels = driver.findElement(By.xpath("//*[@id=\"hotels\"]"));
        Select hotel = new Select(hotels);
        hotel.selectByValue("Hotel Sunshine");
        WebElement room = driver.findElement(By.xpath("//*[@id=\"room_type\"]"));
       Select roomtype = new Select(room);
       roomtype.selectByIndex(2);
       driver.findElement(By.xpath("//*[@id=\"datepick_in\"]")).sendKeys("09/06/2022");
       driver.findElement(By.xpath("//*[@id=\"datepick_out\"]")).sendKeys("10/06/2022");
       WebElement adults = driver.findElement(By.xpath("//*[@id=\"adult_room\"]"));
       Select adult = new Select(adults);
       adult.selectByIndex(3);
       WebElement child = driver.findElement(By.xpath("//*[@id=\"child_room\"]"));
       Select childs = new Select(child);
       childs.selectByVisibleText("2 - Two");
       driver.findElement(By.xpath("//*[@id=\"Submit\"]")).click();
       driver.findElement(By.xpath("//*[@id=\"radiobutton_0\"]")).click();
       driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
       driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("venki");
       driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("V");
       driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("NO:6, Vivekanandar Theru, Dubai");
       driver.findElement(By.xpath("//*[@id=\"cc_num\"]")).sendKeys("1234567890789654");
       WebElement card = driver.findElement(By.xpath("//*[@id=\"cc_type\"]"));
       Select ctype = new Select(card);
       ctype.selectByIndex(3);
       WebElement months = driver.findElement(By.xpath("//*[@id=\"cc_exp_month\"]"));
	   Select month = new Select(months);
	   month.selectByIndex(6);
	   WebElement years = driver.findElement(By.xpath("//*[@id=\"cc_exp_year\"]"));
	   Select year = new Select(years);
	   year.selectByIndex(5);
	   driver.findElement(By.xpath("//*[@id=\"cc_cvv\"]")).sendKeys("549821475364");
	   driver.findElement(By.xpath("//*[@id=\"book_now\"]")).click();
	   Thread.sleep(5000);
	   TakesScreenshot scr = (TakesScreenshot) driver;
		File source = scr.getScreenshotAs(OutputType.FILE);
		File destination = new File("F:\\seleniumworkspace7am\\MavenDepend\\screen1\\adacit.png");
        FileUtils.copyFile(source, destination);
	}	
}