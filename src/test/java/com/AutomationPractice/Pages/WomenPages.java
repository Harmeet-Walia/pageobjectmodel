package com.AutomationPractice.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WomenPages {
	WebDriver driver;
	
	
	By colourBlueButton= By.id("layered_id_attribute_group_14");
	By colourOrangeButton=By.id("layered_id_attribute_group_13");
	By fadedShortSleeveTshirts= By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img");
	By colourPinkButton=By.id("layered_id_attribute_group_24");
	By categoriesCheckBoxTops=By.id("layered_category_4");
	By blackBlouse=By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img");
	
	public WomenPages(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}	
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public WebElement getblackBlouseElement() {
		return driver.findElement(blackBlouse);
	}
	
	public WebElement getCheckBoxTops() {
		return driver.findElement(categoriesCheckBoxTops);
		
	}
	
	public void clickCheckBoxTops() {
		getCheckBoxTops().click();
	}
	
	public WebElement getPinkColourElement() {
		return driver.findElement(colourPinkButton);
	}
	
	public void clickPinkColour() {
		getPinkColourElement().click();
	}
	
	public boolean IsfadedShortSleeveTshirtsVisible() {
		WebElement element=driver.findElement(fadedShortSleeveTshirts);
		if (element.isDisplayed()==true) {
		return true;
	} else {
		return false;
		
	}
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

	public boolean IsPinkColourClicked() {
		WebElement element=driver.findElement(colourPinkButton);
		String attribute=element.getAttribute("class");
		if (attribute.contains("on")) {
			return true;
		} else {
		return false;
		}
	}

	public boolean isCheckBoxTopsSelected() {
		WebElement element=driver.findElement(categoriesCheckBoxTops);
		String attribute=element.getAttribute("checked");
		if (attribute.equals("true")){
			return true;
		} else {
			return false;
			
		}
		
		
	}

	public boolean IsBlackBlouseImageAvailable() {
		WebElement element = driver.findElement(blackBlouse);

		if (element.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}

}
	
	


