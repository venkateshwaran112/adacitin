package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1 {
	public WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"username\"]")
	private WebElement usrname;
	
	@FindBy(xpath = "//*[@id=\"password\"]")
	private WebElement pwd;
	
	@FindBy(xpath = "//*[@id=\"login\"]")
	private WebElement login;
	
	public POM1(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getUsrname() {
		return usrname;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLogin() {
		return login;
	}

	
	
	
	
	

}
