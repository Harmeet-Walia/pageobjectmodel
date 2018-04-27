package com.AutomationPractice.Pages;

import org.openqa.selenium.WebDriver;

public class Search {
	WebDriver driver;
	public Search(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	
	public String getTitle() {
		return driver.getTitle();
	}

}
