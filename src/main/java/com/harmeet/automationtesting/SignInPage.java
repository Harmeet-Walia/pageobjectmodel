package com.harmeet.automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignInPage {
	
	public void signinpage(WebDriver driver) {
		boolean imageStore=driver.findElement(By.xpath("//img[@alt='My Store']")).isDisplayed();
		System.out.println(imageStore);
		
		driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
		driver.findElement(By.id("email_create")).sendKeys("abc@sip.com");
		driver.findElement(By.id("SubmitCreate")).click();
		driver.findElement(By.id("uniform-id_gender1")).click();
		driver.findElement(By.id("uniform-id_gender2")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("sandy");
		driver.findElement(By.id("customer_lastname")).sendKeys("shaun");
		//Not required to enter email-its comes autoatically
		//driver.findElement(By.id("email")).sendKeys("abc@sip.com");
		
		driver.findElement(By.id("passwd")).sendKeys("testing123");
		
		//selecting day for DOB
		
		
		WebElement days=driver.findElement(By.id("days"));
		Select daysDOB=new Select(days);
		daysDOB.selectByIndex(5);
		
		//selecting month for DOB
		
		WebElement month=driver.findElement(By.id("months"));
		Select monthDOB=new Select(month);
		monthDOB.selectByIndex(7);
		
		//selecting year for DOB
		
		WebElement year=driver.findElement(By.id("years"));
		Select yearDOB=new Select(year);
		yearDOB.selectByIndex(12);
		
		//Sign up for newsletter
		driver.findElement(By.id("newsletter")).click();
		
		//Special offers
		driver.findElement(By.id("uniform-optin")).click();
		
		//company
		driver.findElement(By.id("company")).sendKeys("Logic corp");
		//Address
	
		driver.findElement(By.id("address1")).sendKeys("3456,sally Dr");
		driver.findElement(By.id("address2")).sendKeys("289");
		driver.findElement(By.id("city")).sendKeys("Dublin");
		
		//State
		WebElement state=driver.findElement(By.id("id_state"));
		Select stateforIndex=new Select(state);
		stateforIndex.selectByIndex(5);
		
		//Postcode
		driver.findElement(By.id("postcode")).sendKeys("3456");
		//country
//		WebElement country=driver.findElement(By.id("id_country"));
//		Select selectCountry=new Select(country);
//		selectCountry.selectByIndex(21);
//		
		//mobilephone
		driver.findElement(By.id("phone_mobile")).sendKeys("367458987");
		
		//Alias address
		driver.findElement(By.id("alias")).sendKeys("sol@sip.com");
		
		
//		//Register
//		driver.findElement(By.xpath("//span[text(),'Register']")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
