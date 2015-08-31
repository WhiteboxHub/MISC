package com.wbqa.samples.WD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wbqa.samples.WD.page.*;
import com.wbqa.samples.WD.utility.*;

public class TestMCRates {

	WebDriver driver;
	
	@BeforeMethod
	public void open(){
		driver = new FirefoxDriver();
	}
	
	@Test(dataProviderClass=MyDataProvider.class , dataProvider ="testData")
	public void test1(String state, String loanType, String amount){
		MCRatesPage rp = new MCRatesPage(driver);
		int actualSize = rp.getRates(state, loanType, amount);
		Assert.assertTrue(actualSize>0, "Size is less than 0");
		
	}
	
	@Test(dataProviderClass=MyDataProvider.class , dataProvider ="testDataFromCSV", enabled=false)
	public void testusingCSV(String state, String loanType, String amount){
		MCRatesPage rp = new MCRatesPage(driver);
		int actualSize = rp.getRates(state, loanType, amount);
		Assert.assertTrue(actualSize>0, "Size is less than 0");
		
	}
}

