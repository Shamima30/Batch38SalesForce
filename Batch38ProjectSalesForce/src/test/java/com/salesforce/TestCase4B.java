package com.salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase4B {
	
	
	
	WebDriver driver;

	@Test
	public void tc_4A() {
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// validating the homepage of salesforce that salesforce word id there or not
		WebElement salesForceLogo = driver.findElement(By.id("logo"));

		if (salesForceLogo.isDisplayed()) {
			System.out.println("Logo is Displayed");

		} else {
			System.out.println("Logo is not Displayed");

		}
		// sending wrong user name

		driver.findElement(By.id("username")).sendKeys("nasrin.shamima30gmail.com");

		// sending wrong  password to the password field
				WebElement passWordField = driver.findElement(By.id("password"));
				passWordField.sendKeys("Bangla17");
				//clicking on the Login Btn
				driver.findElement(By.id("Login")).click();
		
	//validating the error message
				String errorMsgWithRwongPass  = driver.findElement(By.id("error")).getText();
				String errorText = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
				if (errorMsgWithRwongPass.equals(errorText)) {
					System.out.println(  "Text Displayed : test passed ");}
					else {
						System.out.println("Text is not  Displayed : test failed " );
						
					}
				
						 driver.quit();
	
}}


