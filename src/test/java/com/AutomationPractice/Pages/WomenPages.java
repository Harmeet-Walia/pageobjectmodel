package com.AutomationPractice.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WomenPages {
	WebDriver driver;
	
	
	By colourBlueButton= By.id("layered_id_attribute_group_14");
	By colourOrangeButton=By.id("layered_id_attribute_group_13");

	public WomenPages(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public WebElement getBlueColourElement() {
		WebElement element=driver.findElement(colourBlueButton);
		return element;
		
	}
	
	public WebElement getOrangeColourElement() {
		WebElement element=driver.findElement(colourOrangeButton);
		
		return element;
	}
	public void clickOrangeColourElement() {
		getOrangeColourElement().click();
		
	}
	
	public boolean isOrangeButtonClicked() {
		WebElement element=driver.findElement(colourOrangeButton);
		String classAttribute=element.getAttribute("class");
		if (classAttribute.contains("on")) {
			return true;
		}
			else {
				return false;
			}
		}
		
	
	
	public void clickBlueColour() {
		getBlueColourElement().click();
		//Assert.assertEquals
		
	}





	public boolean isBlueButtonClicked() {
		WebElement element = driver.findElement(colourBlueButton);
		String attribute = element.getAttribute("class");
		if (attribute.contains("on")) {
			return true;
		} else {
			return false;
		}
	}
	
	
}

	
	


