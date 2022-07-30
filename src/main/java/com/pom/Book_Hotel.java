package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	public static WebDriver driver;
	@FindBy(xpath="(//input[@type='text'])[11]")
	private WebElement fname;
	@FindBy(xpath="(//input[@type='text'])[12]")
	private WebElement lname;
	@FindBy(xpath="//textarea[@id='address']")
	private WebElement address;
	@FindBy(xpath="(//input[@type='text'])[13]")
	private WebElement credit;
	@FindBy(xpath="//select[@id='cc_type']")
	private WebElement cardtype;
	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement month;
	@FindBy(xpath="//select[@id='cc_exp_year']")
	private WebElement year;
	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement cvv;
	@FindBy(xpath="//input[@type='button']")
	private WebElement submit;
	
	public Book_Hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCredit() {
		return credit;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getSubmit() {
		return submit;
	}
	
	
}
