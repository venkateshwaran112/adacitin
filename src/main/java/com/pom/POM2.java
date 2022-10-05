package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM2 {
	public WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"location\"]")
	private WebElement location;
	@FindBy(xpath = "//*[@id=\"hotels\"]")
	private WebElement hotels;
	@FindBy(xpath = "//*[@id=\"room_type\"]")
	private WebElement roomtype;
	@FindBy(xpath = "//*[@id=\"adult_room\"]")
    private WebElement adultroom;
    @FindBy(xpath = "//*[@id=\"child_room\"]")
    private WebElement childroom;
    @FindBy(xpath = "//*[@id=\"Submit\"]")
    private WebElement submit;
	
	
	public POM2(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getAdultroom() {
		return adultroom;
	}
	public WebElement getChildroom() {
		return childroom;
	}
	public WebElement getSubmit() {
		return submit;
	}
	
    
}
