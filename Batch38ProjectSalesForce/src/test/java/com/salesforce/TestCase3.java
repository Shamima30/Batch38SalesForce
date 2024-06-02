package com.salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase3 {

	WebDriver driver;

	@Test
	public void tc_3() {
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
		// sending password to the password field
		WebElement passWordField = driver.findElement(By.id("password"));
		passWordField.sendKeys("Bangladesh@3017");
		// clicking on the remember Btn
		driver.findElement(By.id("rememberUn")).click();
		// clicking on the Login Btn
		driver.findElement(By.id("Login")).click();
		// validating the user name is there
		String usrName = driver.findElement(By.id("userNavLabel")).getText();
		System.out.println(usrName);
		if (usrName.equals("Shamima Nasrin")) {
			System.out.println("user name is displayed ");
		} else {
			System.out.println("user name is not displayed ");
		}
		// click on the username dropdown
		driver.findElement(By.id("userNav-arrow")).click();
//clicking on theLogout btn
		driver.findElement(By.linkText("Logout")).click();
//validating username is displayed in the username field
		String validateusr = driver.findElement(By.id("idcard-identity")).getText();
		
		if (validateusr.equals("nasrin.shamima30@gmail.com")) {
			System.out.println("user email id is displayed then test case passed ");
		} else {
			System.out.println("user email id  is  not displayed then test case failed ");
		}
		
		 driver.quit();	

	}
}










