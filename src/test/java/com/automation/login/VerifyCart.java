/**
 * 
 */
package com.automation.login;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author harmeetkaur
 *
 */
public class VerifyCart {
	
	@BeforeClass
	public void invokeBrowser() {
		WebDriver driver;
	    System.setProperty("webdriver.chrome.driver","/Users/harmeetkaur/Downloads/chromedriver_5");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	@Test
	public void testCart() {
//		
//		AfterLoginLocators  afterlogin=new AfterLogin();
//		fail("Not yet implemented");
	}

}
