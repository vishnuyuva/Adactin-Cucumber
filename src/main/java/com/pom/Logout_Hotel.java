package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Hotel {
	public static WebDriver driver;
	@FindBy(linkText="Logout")
	private WebElement logout;
	
	public Logout_Hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogout() {
		return logout;
	}

}
