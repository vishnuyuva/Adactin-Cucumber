package com.adactin.stepdefinition;
import org.openqa.selenium.WebDriver;

import com.adactin.propertyfile.Property_Object;
import com.adactin.runner.Runner_Class;
import com.baseclass.Base_Class;
import com.sdp.Page_Object_Manager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class Step_Definition extends Base_Class{
	public static WebDriver driver=Runner_Class.driver;
	public static Page_Object_Manager pom=new Page_Object_Manager(driver); 
@Given("^user Launch The Application$")
public void user_Launch_The_Application() throws Throwable {
	String url = Property_Object.InstancePO().InstancePC().getUrl();
	getUrl(url);
}
@When("^user Enter The \"([^\"]*)\" In Username Field$")
public void user_Enter_The_In_Username_Field(String username) throws Throwable {
	sendkeys(pom.getA().getUsername(), username);
}

@When("^user Enter The \"([^\"]*)\" In Password Field$")
public void user_Enter_The_In_Password_Field(String password) throws Throwable {
	 sendkeys(pom.getA().getPassword(), password);
}
@Then("^click The Login Button And It Navigates To Search Hotel Page$")
public void click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
    click(pom.getA().getLogin());
}
@When("^user Select The Location$")
public void user_Select_The_Location() throws Throwable {
	dropdown(pom.getB().getLocation(), "selectbyvalue", "New York");
}
@When("^user Select The Hotel Name$")
public void user_Select_The_Hotel_Name() throws Throwable {
	dropdown(pom.getB().getHotel(),"selectbyvalue", "Hotel Sunshine");
}
@When("^user Select The Room Type$")
public void user_Select_The_Room_Type() throws Throwable {
	dropdown(pom.getB().getType(), "selectbyvalue", "Super Deluxe");
}
@When("^user Select The Number Of Rooms$")
public void user_Select_The_Number_Of_Rooms() throws Throwable {
	dropdown(pom.getB().getRoom(),"selectbyvalue" , "1");
}
@When("^user Enter The Check In Date$")
public void user_Enter_The_Check_In_Date() throws Throwable {
	sendkeys(pom.getB().getCheckin(), "07/07/2022");
}
@When("^user Enter The Check Out Date$")
public void user_Enter_The_Check_Out_Date() throws Throwable {
	sendkeys(pom.getB().getCheckout(), "08/07/2022");
}
@When("^user Select The Number Of Adults$")
public void user_Select_The_Number_Of_Adults() throws Throwable {
	dropdown(pom.getB().getAdult(), "selectbyvalue", "2");
}
@When("^user Select The Number Of Children$")
public void user_Select_The_Number_Of_Children() throws Throwable {
	dropdown(pom.getB().getChild(), "selectbyvalue", "1");
}
@Then("^click The Submit Button And It Navigates To Select Hotel Page$")
public void click_The_Submit_Button_And_It_Navigates_To_Select_Hotel_Page() throws Throwable {
	click(pom.getB().getSearch());
}
@When("^user Click The Checkbox$")
public void user_Click_The_Checkbox() throws Throwable {
	click(pom.getC().getCheckbox());
}
@Then("^Click Ok And It Navigates To Book Hotel Page$")
public void click_Ok_And_It_Navigates_To_Book_Hotel_Page() throws Throwable {
	click(pom.getC().getOk());
}
@When("^user Enter The Firstname$")
public void user_Enter_The_Firstname() throws Throwable {
	sendkeys(pom.getD().getFname(), "vishnu");
}
@When("^user Enter The Lastname$")
public void user_Enter_The_Lastname() throws Throwable {
	sendkeys(pom.getD().getLname(), "priya");
}
@When("^user Enter The Address$")
public void user_Enter_The_Address() throws Throwable {
	sendkeys(pom.getD().getAddress(), "AnnaNagar, Chennai");
}
@When("^user Enter The Credit Card Number$")
public void user_Enter_The_Credit_Card_Number() throws Throwable {
	sendkeys(pom.getD().getCredit(), "1234567890123456");
}
@When("^user Select The Card Type$")
public void user_Select_The_Card_Type() throws Throwable {
	dropdown(pom.getD().getCardtype(), "selectbyvalue", "VISA");
}
@When("^user Select The Month$")
public void user_Select_The_Month() throws Throwable {
	dropdown(pom.getD().getMonth(), "selectbyvalue", "11");
}
@When("^user Select The year$")
public void user_Select_The_year() throws Throwable {
	dropdown(pom.getD().getYear(), "selectbyvalue", "2022");
}
@When("^user Enter Cvv$")
public void user_Enter_Cvv() throws Throwable {
	sendkeys(pom.getD().getCvv(), "1234");
}
@Then("^click Submit And Hotel successfully Booked$")
public void click_Submit_And_Hotel_successfully_Booked() throws Throwable {
	click(pom.getD().getSubmit());
}
@Then("^Click THe Logout button$")
public void click_THe_Logout_button() throws Throwable {
	click(pom.getE().getLogout());
}
}
















