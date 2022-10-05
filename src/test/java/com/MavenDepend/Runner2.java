package com.MavenDepend;
import java.io.IOException;

import com.pom.POM1;
import com.pom.POM2;
import com.pom.POM3;
import com.pom.POM4;
import com.pom.POM5;

public class Runner2 extends Baseclass{

	public static void main(String[] args) throws IOException, InterruptedException   {
		browserlaunch("chrome","https://adactinhotelapp.com");
		POM1 wp1 = new POM1(driver);
        usrinput(wp1.getUsrname(), "venkatesh92");
        usrinput(wp1.getPwd(), "senthil");
        usrclick(wp1.getLogin());
        
        POM2 wp2 = new POM2(driver); 
        usrselect(wp2.getLocation(),3);
        usrselect(wp2.getHotels(),2);
        usrselect(wp2.getRoomtype(), 2);
        usrselect(wp2.getAdultroom(), 3);
        usrselect(wp2.getChildroom(),2);
        usrclick(wp2.getSubmit());
        
        POM3 wp3 = new POM3(driver);
        usrclick(wp3.getRadiobutton());
        usrclick(wp3.getConti());
        
        POM4 wp4 = new POM4(driver);
        usrinput(wp4.getFirstname(), "venkatesh");
        usrinput(wp4.getLastname(), "M");
        usrinput(wp4.getAddress(), "No.6 Vivekanandar Theru, Dubai");
        usrinput(wp4.getCcnum(), "1234569870147258");
        usrselect(wp4.getCctype(),3);
        usrselect(wp4.getCcexpmonth(),6);
        usrselect(wp4.getCcexpyear(), 7);
        usrinput(wp4.getCccvv(),"54761478596");
        usrclick(wp4.getBooknow());
        
        POM5 wp5 = new POM5(driver);
        usrclick(wp5.getLogout());
        usrscreen("F:\\seleniumworkspace7am\\MavenDepend\\screen1\\adacit1.png");
        
        
////       driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("venki");
////       driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("V");
////       driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("NO:6, Vivekanandar Theru, Dubai");
////       driver.findElement(By.xpath("//*[@id=\"cc_num\"]")).sendKeys("1234567890789654");
////       WebElement card = driver.findElement(By.xpath("//*[@id=\"cc_type\"]"));
////       Select ctype = new Select(card);
////       ctype.selectByIndex(3);
////       WebElement months = driver.findElement(By.xpath("//*[@id=\"cc_exp_month\"]"));
////	   Select month = new Select(months);
////	   month.selectByIndex(6);
////	   WebElement years = driver.findElement(By.xpath("//*[@id=\"cc_exp_year\"]"));
////	   Select year = new Select(years);
////	   year.selectByIndex(5);
////	   driver.findElement(By.xpath("//*[@id=\"cc_cvv\"]")).sendKeys("549821475364");
////	   driver.findElement(By.xpath("//*[@id=\"book_now\"]")).click();
	   Thread.sleep(5000);
	   
	}


	

}


