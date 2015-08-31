package com.wbqa.wd.test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wbqa.wd.MCHomePage;
import com.wbqa.wd.pagedata.MCHomePageData;
import com.wbqa.wd.utilities.MCDataProvider;

public class TestMCHomePage {

	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser(){
		
		driver = new FirefoxDriver();
	}
	
	@Test(dataProviderClass = MCDataProvider.class , dataProvider="hpdata" , enabled=false)
	public void testCalculateMortgage(MCHomePageData data){
		
		
		MCHomePage hp = new MCHomePage(driver);
	//	WebElement loanAmt = hp.calculateMortgage("New Home Purchase", "300,000", "94568");
		WebElement loanAmt = hp.calculateMortgage(data.getLoanType(),data.getLoanAmount(),data.getZipCode());
		String actualAmount = loanAmt.getText();
		Assert.assertTrue(actualAmount.contains(data.getLoanAmount()));
				
	}
	
	@Test(enabled=false)
	public void testLoan() throws InterruptedException{
		
		MCHomePage hp = new MCHomePage(driver);
		boolean actualResult = hp.getRatesforLoanTerms();
		Assert.assertTrue(actualResult);
		
	}
	
	@Test
	public void testLike(){
		
		MCHomePage hp = new MCHomePage(driver);
		String actualTitle = hp.clickFBLike();
		
		Assert.assertEquals(actualTitle, "Facebook");
		
	}
	@AfterMethod
	public void closeBrowser(){
		
//		driver.quit();
	}
}
