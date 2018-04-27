/**
 * 
 */
package com.AutomationPractice.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author harmeetkaur
 *
 */
public class AfterLoginLocators {
	WebDriver driver;
	By Cart=By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a");
	
	public void AfterLoginLocators(WebDriver driver) {
		this.driver=driver;
	}



   public void checkingCart() {
	   driver.findElement(Cart).click();
   }
}
