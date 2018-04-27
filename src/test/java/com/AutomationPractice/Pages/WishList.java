package com.AutomationPractice.Pages;

import org.openqa.selenium.WebDriver;

public class WishList {
	WebDriver driver;

	public WishList(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	
	public String getTitle() {
		return driver.getTitle();
		
	}

}
