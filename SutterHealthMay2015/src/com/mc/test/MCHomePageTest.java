package com.mc.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mc.pages.MCHomePage;

public class MCHomePageTest {

WebDriver driver;
	
	@BeforeMethod
	public void openBrowser(){
		
		driver = new FirefoxDriver();
		driver.get("http://www.mortgagecalculator.org/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void testLoanAmount(){
		
		MCHomePage hp = new MCHomePage(driver);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		String actual = hp.getMortgageRates();
		Assert.assertTrue(actual.contains("3.875%"));
	}
	
	
	@AfterMethod
	public void closeBrowser(){
		
		if (driver != null)
			driver.close();
	
	}
}
