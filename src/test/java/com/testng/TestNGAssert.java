package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGAssert {
WebDriver driver;
	
	@Test (priority = 0)
	public void CloseBrowser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.close();
		Reporter.log("Driver Closed After Testing");
	}
	
	@Test (priority = -1)
	public void OpenBrowser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		Reporter.log("This test verifies the current selenium compatibility with TestNG by launching the chrome driver");
	        Reporter.log("Launching Google Chrome Driver version 81 for this test"); 
	        
	        driver.get("https://www.facebook.com");
	        
	        Reporter.log("The website used was DemoQA for this test", true);
	        String expectedTitle = "Facebook – log in or sign up";
	        String originalTitle = driver.getTitle();
	        Assert.assertEquals(originalTitle, expectedTitle);
  }
}
