package com.adactin.propertyfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Property_Class {
	public static Properties p;
	public Property_Class() throws Throwable {
	File f=new File("C:\\Users\\Vishnu Priya\\eclipse-workspace\\Adactin_Cucumber\\src\\test\\java\\com\\adactin\\propertyfile\\cucumber.properties");
	FileInputStream fis=new FileInputStream(f);
	p=new Properties();
	p.load(fis);
	}
	public String getBrowser() {
		String browser=p.getProperty("browser");
		return browser;
	}
	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}

}
