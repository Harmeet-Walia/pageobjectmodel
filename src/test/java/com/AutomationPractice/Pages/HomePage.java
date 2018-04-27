package com.AutomationPractice.Pages;

import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public String getTitle() {
		return driver.getTitle();
	}

}
