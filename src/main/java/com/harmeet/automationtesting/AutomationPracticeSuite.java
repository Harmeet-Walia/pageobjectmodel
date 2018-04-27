package com.harmeet.automationtesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPracticeSuite {

	public static void main(String[] args) throws InterruptedException {
		AutomationPracticeSuite automationPractice=new AutomationPracticeSuite();
		automationPractice.runTests();
		// TODO Auto-generated method stub

	}

	public void runTests() throws InterruptedException {
		WebDriver chromeDriver = getChromeDriver();

		runAllTests(chromeDriver);

	}

	private void runAllTests(WebDriver driver) throws InterruptedException {
//		TestHomePage testHomepage=new TestHomePage();
//		testHomepage.testHomePage(driver);
		SignInPage signin=new SignInPage();
		signin.signinpage(driver);
		
	}

	public WebDriver getChromeDriver() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "//Users/harmeetkaur/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.automationpractice.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		return driver;
}
}