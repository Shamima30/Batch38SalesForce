package com.salesforce;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase5 {
	
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
		// printing all the dropdown elements
		List<WebElement> option = driver.findElements(By.id("userNavMenu"));
		for (WebElement ele:option) {
			System.out.println( ele.getText() );
		}
		
		
		
//		//option = all webelements , now ele = is actual web elements data ; 
//		//expected 
//		ArrayList<String > exp = new ArrayList<>();
//		exp.add( "My profile");
//		exp.add("My Settings");
//		exp.add("Developer Console");
//		exp.add("Logout");
//		exp.add("Switching to lightning Experience");
//		//System.out.println(exp);
//		
//		
//		// validate the drop down 
//		
//	SoftAssert sa = new SoftAssert();
//	sa.assertEquals(ele.getText(), exp);
//	sa.assertAll();
//		
		
		 driver.quit();	

	}}