/**
 * 
 */
package com.AutomationPractice.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/**
 * @author harmeetkaur
 *
This class stores all the locators for login page
*/

public class LoginPage {
	WebDriver driver;
	 private By Signin=By.linkText("Sign in");
	 By username=By.id("email");
	 By password=By.name("passwd");
	 By SigninandLogin= By.name("SubmitLogin");
	 
	 By SearchButton=By.id("search_query_top");
	 By SubmitSearch=By.name("submit_search");
	 
	 public LoginPage(WebDriver driver) {
		 this.driver=driver;
	 }
	 
	 public void gotoLoginPage() {
		 driver.findElement(Signin).click();
		 
	 }
	 public MyAccount login(String email1,String pass)  {
		 driver.findElement(username).sendKeys(email1);
		 driver.findElement(password).sendKeys(pass);
		 driver.findElement(SigninandLogin).click();
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return new MyAccount(driver);
	 }	 

	 public void search(String value) {
		 driver.findElement(SearchButton).sendKeys(value);
	 }
	 public void submitSearch() {
		 driver.findElement(SubmitSearch).click();
	 }
	 
	 
	 //http://newtours.demoaut.com/

}
