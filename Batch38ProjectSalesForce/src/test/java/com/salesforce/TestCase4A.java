package com.salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase4A {
	
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
		// sending user name

		driver.findElement(By.id("username")).sendKeys("nasrin.shamima30@gmail.com");
	// clicking on the forgot password link 
		driver.findElement(By.linkText("Forgot Your Password?")).click();
			
		
		//validating the forgot password message 
		WebElement forgotMsg = driver.findElement(By.id("header"));
		if (forgotMsg.isDisplayed()) {
			System.out.println("Forgot message  is Displayed");

		} else {
			System.out.println("Forgot message is not Displayed");

		}
		// checking the username field in the forgot link 
		
		driver.findElement(By.id("un")).sendKeys("nasrin.shamima30@gmail.com");
		// clicking on the continue Btn
		driver.findElement(By.id("continue")).click();
		// validating sent emial message
		WebElement checkemail = driver.findElement(By.xpath("//*[@class='mb12']"));
		if (checkemail.isDisplayed()) {
			System.out.println("Check your email message   is Displayed then test passed ");

		} else {
			System.out.println("Check your email message is not Displayed then test failed");

		}
		
	
	
	
		 driver.quit();
	
	
	
	

}
	
}
