package com.tng.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceboolLoginTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void initializeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void launchFbApp() {
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
		System.out.println(driver.getTitle());
		Thread.sleep(500);
		
	}
	
	@Test
	public void warningPopUp() {
		boolean isDisplayed = driver.findElement(By.className("_9ay7")).isDisplayed();
		System.out.println(isDisplayed == true ? "Login Successfull " : "Login Failed");
	}
	
	@AfterTest
	public void tesrDown(){
		driver.close();
	}
	
	
}
