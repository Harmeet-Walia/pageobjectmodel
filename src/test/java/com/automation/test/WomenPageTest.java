package com.automation.test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.AutomationPractice.Pages.HomePage;


import com.AutomationPractice.Pages.WomenPages;

import junit.framework.Assert;

public class WomenPageTest {
	static WebDriver driver;
	
	static WomenPages womenpage;
	
	@BeforeClass
	public static void BeforeTest() {
		System.setProperty("webdriver.chrome.driver","/Users/harmeetkaur/Downloads/chromedriver_5");
 		driver=new ChromeDriver();
 		
 		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		driver.get("http://automationpractice.com");
		HomePage homepage=new HomePage(driver);
		
		womenpage =homepage.clickOnWomen();
 		
		
		
		
	}
	
	@Test
	public void verifyResultsofBlue() {
		womenpage.clickBlueColour();
		Assert.assertTrue(womenpage.isBlueButtonClicked());
		
		
	}
	
	@Test
	public void verifyResultsofOrange() {
		womenpage.clickOrangeColourElement();
		Assert.assertTrue(womenpage.isOrangeButtonClicked());
	}

}
