package com.sdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.Book_Hotel;
import com.pom.Hotel_Signin;
import com.pom.Logout_Hotel;
import com.pom.Search_Hotel;
import com.pom.Select_Hotel;

public class Page_Object_Manager {
	public static WebDriver driver;
	
	private Hotel_Signin a;
	private Search_Hotel b;
	private Select_Hotel c;
	private Book_Hotel d;
	private Logout_Hotel e;
	public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public Hotel_Signin getA() {
		a = new Hotel_Signin(driver);
		return a;
	}
	public Search_Hotel getB() {
		b = new Search_Hotel(driver);
		return b;
	}
	public Select_Hotel getC() {
		c = new Select_Hotel(driver);
		return c;
	}
	public Book_Hotel getD() {
		d = new Book_Hotel(driver);
		return d;
	}
	public Logout_Hotel getE() {
		e = new Logout_Hotel(driver);
		return e;
	}
}
