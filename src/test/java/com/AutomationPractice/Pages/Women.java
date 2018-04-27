package com.AutomationPractice.Pages;

import org.openqa.selenium.WebDriver;

public class Women {
	WebDriver driver;

	public Women(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public String getTitle() {
		return driver.getTitle();
	}

}
