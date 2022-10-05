package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM3 {
	public WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"radiobutton_0\"]")
	private WebElement radiobutton;
	@FindBy(xpath = "//*[@id=\"continue\"]")
    private WebElement conti;
	
	public POM3(WebDriver driver3) {
		this.driver = driver3;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getRadiobutton() {
		return radiobutton;
	}
	public WebElement getConti() {
		return conti;
	}
	
}
