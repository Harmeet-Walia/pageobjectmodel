package com.AutomationPractice.Pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class MyAccount {
	WebDriver driver;
	
	By orderHistory=By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a/span");
	By MyCreditSlips=By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[2]/a/span");
	By addresses=By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a");
	By home=By.xpath("//*[@id=\"center_column\"]/ul/li/a");
	By wishlist=By.xpath("//*[@id=\"center_column\"]/div/div[2]/ul/li/a/span");
	By women=By.linkText("Women");
	By cart=By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/b");
	By search=By.id("search_query_top");
	By submitSearch=By.name("submit_search");
	By contactUs=By.linkText("Contact us");
	
	public MyAccount(WebDriver driver) {
		this.driver = driver;
	}

	public String getTitle() {
		return driver.getTitle();
	
	}
	
	

	public WebElement getOrderHistoryElement() {
		WebElement element = driver.findElement(orderHistory);
		return element;
	}
	
	public WebElement getCreditSlipsElement() {
		WebElement element=driver.findElement(MyCreditSlips);
		return element;
		
	}
	public CreditSlip clickCreditSlips() {
		getCreditSlipsElement().click();
		return new CreditSlip(driver);
	}
	
	public OrderHistory clickOrderHistory() {
		getOrderHistoryElement().click();
		return new OrderHistory(driver);
	}
	
	public MyAddressesPage clickMyAddresses() {
		getAddresses().click();
		return new MyAddressesPage(driver);
	}
	
	public WebElement getAddresses() {
		WebElement element = driver.findElement(addresses);
		return element;
		
	}
	
	public HomePage clickHomeButton() {
		WebElement element=driver.findElement(home);
		element.click();
		return new HomePage(driver);
	}
	
	public WebElement getWishlist() {
		WebElement element=driver.findElement(wishlist);
		return element;
	}
	public WishList clickWishlist() {
		WebElement element=driver.findElement(wishlist);
		element.click();
		return new WishList(driver);
		
	}
	
	public WebElement getWomenElement() {
		WebElement element=driver.findElement(women);
		return element;
	}
	
	public WomenPages clickOnWomen() {
		WebElement element=driver.findElement(women);
		element.click();
		return new WomenPages(driver);
	}
	public WebElement getCart() {
		WebElement element=driver.findElement(cart);
		return element;
	}
	
	public WebElement getSearch() {
		WebElement element=driver.findElement(search);
		return element;
	}
	
	public Search clickOnSearch() {
		WebElement element=driver.findElement(submitSearch);
		element.click();
		return new Search(driver);
		
	}
	
	public WebElement getContactUs() {
		WebElement element=driver.findElement(contactUs);
		return element;
	}
	
	public ContactUs clickonContactUs() {
		WebElement element=driver.findElement(contactUs);
		element.click();
		return new ContactUs(driver);
	}
	
		
	
}


