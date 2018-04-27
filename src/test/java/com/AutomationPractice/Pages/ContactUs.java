package com.AutomationPractice.Pages;

import org.openqa.selenium.WebDriver;

public class ContactUs {
	WebDriver driver;

	public ContactUs(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	
	public String getTitle() {
		return driver.getTitle();
	}

}
