package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM4 {
	public WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"first_name\"]")
	private WebElement firstname;
	@FindBy(xpath = "//*[@id=\"last_name\"]")
	private WebElement lastname;
	@FindBy(xpath = "//*[@id=\"address\"]")
	private WebElement address;
	@FindBy(xpath = "//*[@id=\"cc_num\"]")
	private WebElement ccnum;
	@FindBy(xpath = "//*[@id=\"cc_type\"]")
	private WebElement cctype;
	@FindBy(xpath = "//*[@id=\"cc_exp_month\"]")
	private WebElement ccexpmonth;
	@FindBy(xpath = "//*[@id=\"cc_exp_year\"]")
	private WebElement ccexpyear;
	@FindBy(xpath = "//*[@id=\"cc_cvv\"]")
	private WebElement cccvv;
	@FindBy(xpath = "//*[@id=\"book_now\"]")
	private WebElement booknow;
	
	public POM4(WebDriver driver4) {
     this.driver = driver4;
     PageFactory.initElements(driver, this);
	}
	
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCcnum() {
		return ccnum;
	}
	public WebElement getCctype() {
		return cctype;
	}
	public WebElement getCcexpmonth() {
		return ccexpmonth;
	}
	public WebElement getCcexpyear() {
		return ccexpyear;
	}
	public WebElement getCccvv() {
		return cccvv;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	
	
}
