package com.tng.AssertionDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceboolLoginTestWithAssertion {
	
	WebDriver driver;
	
	@Test
	public void launchFbApp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void launchGoogleApp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void testFacebookLogin() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys("username1");
		driver.findElement(By.name("pass")).sendKeys("abc", Keys.ENTER);
		String actual = driver.getTitle();
		String expected = "Welcome to Facebook";
		Assert.assertNull(actual);
		Assert.assertNotEquals(expected, actual, "Failed to login with the given credential");
		
		Thread.sleep(500);
		
	}
	
	@Test
	public void warningPopUp() {
		boolean isDisplayed = driver.findElement(By.className("_9ay7")).isDisplayed();
		Assert.assertTrue(isDisplayed, "Login was successful");
	}
	
	@Test
	public void closeApp() {
		driver.close();
	}
	
}
