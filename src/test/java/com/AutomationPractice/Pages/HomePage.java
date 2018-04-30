package com.AutomationPractice.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;
	By womenElement= By.linkText("Women");

	public HomePage(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public String getTitle() {
		return driver.getTitle();
	}
	
	public WebElement getWomenElement() {
		return driver.findElement(womenElement);
	}
	
	public WomenPages clickOnWomen() {
		getWomenElement().click();
		return new WomenPages(driver);
	}
	
	

}
