package com.harmeet.automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestHomePage {
	
	public void testHomePage(WebDriver driver) throws InterruptedException {
		//clicking on Search with Sendkeys 
		driver.findElement(By.xpath("//input[contains(@id,'search_query_top')]")).sendKeys("Women clothing");
		driver.findElement(By.xpath("//button[contains(@name,'submit_search')]")).click();
		driver.navigate().back();
		
		boolean element = driver.findElement(By.xpath("//img[@class='logo img-responsive' and @alt='My Store']")).isDisplayed();
		
		System.out.println(element);
		
		String element2=driver.getTitle();
		System.out.println(element2);
		
		//clicking on tab women
		driver.findElement(By.xpath("//a[contains(@title, 'Women')]")).click();
		driver.navigate().back();
		
		//Clicking on Dresses
		//absolute xpath...need to change in customised xpath
		driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[2]/a")).click();
		driver.navigate().back();
		
		//clicking on sign in
		driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
		driver.navigate().back();
		
		
		
//		driver.findElement(By.xpath("//a[contains(@title,'View my shopping cart')]")).click();
//		driver.navigate().back();
		//scrolling down to image
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy(0,700)", "");
		
		//clicking on image and selecting
		driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']")).click();
//		driver.findElement(By.xpath("//*[@id='add_to_cart']/button/span")).click();
//		driver.findElement(By.xpath("//span[contains(text(),'	Add to cart')]")).click();
		
		
		
		
		
		
		
	}

}
