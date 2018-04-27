package com.automation.myaccount;

import static org.junit.Assert.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.AutomationPractice.Pages.HomePage;
import com.AutomationPractice.Pages.LoginPage;
import com.AutomationPractice.Pages.MyAccount;
import com.AutomationPractice.Pages.OrderHistory;
import com.AutomationPractice.Pages.Search;
import com.AutomationPractice.Pages.WishList;
import com.AutomationPractice.Pages.Women;
import com.AutomationPractice.Pages.ContactUs;
import com.AutomationPractice.Pages.CreditSlip;
import com.automation.login.VerifyLogin;
import com.automation.myaccount.pages.MyAddresses;

import junit.framework.Assert;

public class MyAccountTest {
	static WebDriver driver;
	String myAccountTitle = "My account - My Store";
	static MyAccount myAccount;
	
	
	

	
	 @BeforeClass
     public static void BeforeTest() {
    	    System.setProperty("webdriver.chrome.driver","/Users/harmeetkaur/Downloads/chromedriver_5");
 		driver=new ChromeDriver();
 		
 		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		driver.get("http://automationpractice.com");
 		System.out.println(driver.getTitle());
 		LoginPage login = new LoginPage(driver);
		login.gotoLoginPage();
		System.out.println(driver.getTitle());
		 myAccount = login.login("wow@aoi.com", "wow123");
 		
	 }
		
		
		
	
	@Test
	public void verifyMyAccountTitle() {
		System.out.println(driver.getTitle());
		Assert.assertEquals(myAccountTitle, driver.getTitle());
	}

	@Test
	public void verifyMyCreditSlipsExists() {
		WebElement element=myAccount.getCreditSlipsElement();
		assertNotNull(element);
		assertEquals(element.getText(), "MY CREDIT SLIPS");

}	
	@Test
	public void verifyOrderHistoryexists() {
		
		WebElement element=myAccount.getOrderHistoryElement();
		assertNotNull(element);
		assertEquals(element.getText(), "ORDER HISTORY AND DETAILS");
	}
	@Test
	public void verifyAddressesExists() {
		WebElement element= myAccount.getAddresses();
		assertNotNull(element);
		assertEquals(element.getText(), "MY ADDRESSES");
		
	}
	@Test
	public void verifyHomeButton() throws InterruptedException {
		HomePage homepage=myAccount.clickHomeButton();
        String title=homepage.getTitle();
        Assert.assertEquals("My Store", title);
        driver.navigate().back();
        Thread.sleep(2000);
	}
	@Test
	public void verifyOrderHistory() throws InterruptedException {
		OrderHistory orderhistory=myAccount.clickOrderHistory();
		String title=orderhistory.getTitle();
		System.out.println(title);
		Assert.assertEquals("Order history - My Store", title);
		driver.navigate().back();
        Thread.sleep(2000);
	}
	@Test
	public void verifyCreditSlip() {
		CreditSlip orderslip=myAccount.clickCreditSlips();
		String title=orderslip.getTitle();
		Assert.assertEquals("Order slip - My Store" , title);
		driver.navigate().back();
		
	}
	@Test
	public void verifyAddresses() {
		MyAddresses myaddresses=myAccount.clickMyAddresses();
		String title=myaddresses.getTitle();
		Assert.assertEquals("Addresses - My Store", title);
		driver.navigate().back();
	}
	
	@Test
	public void verifyWishlistExits() {
		WebElement element=myAccount.getWishlist();
		assertNotNull(element);
		System.out.println(element.getText());
		Assert.assertEquals("MY WISHLISTS", element.getText());
	}
	@Test
	public void verifyWishlist() {
		WishList wishlist=myAccount.clickWishlist();
		String title=wishlist.getTitle();
		System.out.println(title);
		Assert.assertEquals("My Store", title);
		driver.navigate().back();
	}
	@Test
	public void verifyWomenLabelExists() {
		WebElement element=myAccount.getWomenElement();
		assertNotNull(element);
		assertEquals("Women", element.getText());
	}
	@Test
	public void verifyWomen() {
		Women women=myAccount.clickOnWomen();
		String title=women.getTitle();
		assertEquals("Women - My Store", title);
		driver.navigate().back();
		
		
	}
	@Test
	public void verifyCartExists() {
		WebElement element=myAccount.getCart();
		assertNotNull(element);
		System.out.println(element.getText());
		assertEquals("Cart", element.getText());
	}
	@Test
	public void VerifySearchExists() {
		WebElement element=myAccount.getSearch();
		assertNotNull(element);
		System.out.println(element.getText());
	}
	
	@Test
	public void verifySearch() {
		Search search=myAccount.clickOnSearch();
		String title=search.getTitle();
		assertEquals("Search - My Store", title);
		driver.navigate().back();
		
	}
	@Test
	public void verifyContactUsExists() {
		WebElement element=myAccount.getContactUs();
		assertNotNull(element);
		System.out.println(element.getText());
		assertEquals("Contact us",element.getText());
	}
	@Test
	public void verifyContactUs() {
		ContactUs contactus=myAccount.clickonContactUs();
		String title=contactus.getTitle();
		System.out.println(title);
		assertEquals("Contact us - My Store", title);
		driver.navigate().back();
	}
	
		
		
	}
	

