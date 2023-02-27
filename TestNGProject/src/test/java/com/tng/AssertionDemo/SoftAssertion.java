package com.tng.AssertionDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertion {
	
	WebDriver driver;
	
	@Test
	public void testFacebook() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.name("email")).sendKeys("username1");
		driver.findElement(By.name("pass")).sendKeys("abc", Keys.ENTER);
		Thread.sleep(500);
		
		SoftAssert softAssert = new SoftAssert();
		
		// Title assertion 
		String actualTitle = driver.getTitle();
		String expectedTitle = "Log in to Facebook";
		softAssert.assertEquals(expectedTitle, actualTitle, "Title is  mismatched");
		
		// Url assertion 
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.facebook.com/";
		softAssert.assertEquals(expectedUrl, actualUrl, "Url is  mismatched");
		
		// Text assetion                     
		String actualText = driver.findElement(By.name("email")).getAttribute("value");  // getting value of attribute named 'value'
		String expectedText = "";
		softAssert.assertEquals(expectedText, actualText, "username name is not cleared");
		
		// Border Assertion	
		
		String actualBorder = driver.findElement(By.name("email")).getCssValue("border");
		String expectedBorder = "1px solid rgb(240, 40, 73)";
		softAssert.assertEquals(expectedBorder, actualBorder, "border is mismatched");
		
		// Error message assertion
		
//		String actualErrorMessage = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[1]/div[2]")).getText();
//		String expectedErrorMessage = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
//		softAssert.assertEquals(expectedBorder, actualBorder, "error message is mismatched");
		
		driver.close();
		softAssert.assertAll();
		
		
		
		
		
	}
}
