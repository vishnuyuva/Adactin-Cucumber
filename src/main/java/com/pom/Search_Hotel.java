package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	public static WebDriver driver;
	@FindBy(xpath="//select[@id='location']")
	private WebElement location;
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement hotel;
	@FindBy(xpath="//select[@id='room_type']")
	private WebElement type;
	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement room;
	@FindBy(xpath="(//*[@type='text'])[2]")
	private WebElement checkin;
	@FindBy(xpath="(//*[@type='text'])[3]")
	private WebElement checkout;
	@FindBy(xpath="//select[@id='adult_room']")
	private WebElement adult;
	@FindBy(xpath="//select[@id='child_room']")
	private WebElement child;
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement search;
	public Search_Hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getType() {
		return type;
	}
	public WebElement getRoom() {
		return room;
	}
	public WebElement getCheckin() {
		return checkin;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getChild() {
		return child;
	}
	public WebElement getSearch() {
		return search;
	}
}
