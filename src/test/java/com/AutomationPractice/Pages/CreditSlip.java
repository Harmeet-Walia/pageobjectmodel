package com.AutomationPractice.Pages;

import org.openqa.selenium.WebDriver;

public class CreditSlip {
	WebDriver driver;

	public CreditSlip(WebDriver driver) {
		this.driver=driver;
		
	}
	public String getTitle() {
		return driver.getTitle();
	}

}
