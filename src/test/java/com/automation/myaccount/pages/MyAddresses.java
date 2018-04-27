package com.automation.myaccount.pages;

import org.openqa.selenium.WebDriver;

public class MyAddresses {
	WebDriver driver;

	public MyAddresses(WebDriver driver) {
		this.driver=driver;
		
		// TODO Auto-generated constructor stub
	}
	public String getTitle() {
		return driver.getTitle();
		
	}

}
