package com.automation.login;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.AutomationPractice.Pages.LoginPage;
import com.AutomationPractice.Pages.MyAccount;
import junit.framework.Assert;



public class VerifyLogin {
	
    static WebDriver driver;
    String myAccountTitle = "My account - My Store";

     
     @BeforeClass
     public static void BeforeTest() {
    	    System.setProperty("webdriver.chrome.driver","/Users/harmeetkaur/Downloads/chromedriver_5");
 		driver=new ChromeDriver();
 		
 		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 		driver.get("http://automationpractice.com");
 		
     }
     
     @Test
	public void testLogin() throws Exception {
    	 
    	 	LoginPage loginpage=new LoginPage(driver);
		loginpage.gotoLoginPage();
		MyAccount myAccounttest = loginpage.login("wow@aoi.com","wow123") ;
		String title=myAccounttest.getTitle();
		Assert.assertEquals(myAccountTitle, title);
		
		
	}
     @Test
     public void testSearch() {
    	 
 		LoginPage loginpage=new LoginPage(driver);
 		loginpage.search("women summer dresses");
 		loginpage.submitSearch();
 		String title=driver.getTitle();
 		System.out.println(title);
 		Assert.assertEquals("Search - My Store", title);

 		
     }

}
