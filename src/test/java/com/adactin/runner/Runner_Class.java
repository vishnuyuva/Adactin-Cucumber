package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.propertyfile.Property_Object;
import com.baseclass.Base_Class;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src\\test\\java\\com\\adactin\\feature", 
glue = "com\\adactin\\stepdefinition",
monochrome=true,
strict=true,
plugin= {"html:Report/html_report",
		"pretty",
		"json:Report/json_report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Report/extent_report.html"
		
}
)
public class Runner_Class {
	public static WebDriver driver;
	@BeforeClass
	public static void setUp() throws Throwable {
		String browser = Property_Object.InstancePO().InstancePC().getBrowser();
		driver=Base_Class.browserLaunch(browser);
	}
	@AfterClass
	public static void tearDown() {
		driver=Base_Class.close();
	}
}
