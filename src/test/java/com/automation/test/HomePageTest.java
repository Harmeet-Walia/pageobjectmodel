package com.automation.test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.AutomationPractice.Pages.HomePage;
import com.AutomationPractice.Pages.MyAccount;
import com.AutomationPractice.Pages.WomenPages;

public class HomePageTest {
	
	static WebDriver driver;
	static HomePage homepage;
	
	
	@BeforeClass
	public static void BeforeTest() {
		System.setProperty("webdriver.chrome.driver","/Users/harmeetkaur/Downloads/chromedriver_5");
 		driver=new ChromeDriver();
 		
 		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		driver.get("http://automationpractice.com");
 		homepage = new HomePage(driver);
	}

	@Test
	public void verifyWomenTitle() {
		WomenPages women=homepage.clickOnWomen();
		String title=women.getTitle();
		System.out.println(title);
		//Assert.assertEquals(title, "Women - My Store");
		
	}

}
