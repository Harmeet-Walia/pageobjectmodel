package com.harmeet.automationtesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestimageTestNG {

	WebDriver driver;

	@Test
	public void testlogo() {

		boolean element1 = driver.findElement(By.xpath("//img[@class='logo img-responsive' and @alt='My Store']")).isDisplayed();
				
		System.out.println(element1);
		Assert.assertEquals(true, element1);

	}
	
	@Test
	public void testTitle() {
		String element=driver.getTitle();
		Assert.assertEquals("My Store", element);
		System.out.println("Test Passed");
		
	}
	
	@Test
	public void topImageChk() {
		boolean topimage=driver.findElement(By.xpath("//img[@src='http://automationpractice.com/modules/blockbanner/img/sale70.png']")).isDisplayed();
		Assert.assertEquals(true, topimage);
	}
	
	@Test
	public void imageCheck() {
		boolean threedaySaleImage=driver.findElement(By.xpath("//img[@src='http://automationpractice.com/modules/themeconfigurator/img/banner-img6.jpg']")).isDisplayed();
		Assert.assertEquals(true, threedaySaleImage);
	}
	
		
	

	@BeforeTest
	public WebDriver getChromeDriver()  {

		System.setProperty("webdriver.chrome.driver", "//Users/harmeetkaur/Downloads/chromedriver");
		 driver = new ChromeDriver();
		driver.navigate().to("http://www.automationpractice.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		return driver;
	}

}
