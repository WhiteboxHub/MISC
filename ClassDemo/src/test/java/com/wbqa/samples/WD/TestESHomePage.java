package com.wbqa.samples.WD;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.wbqa.samples.WD.page.EbookSonyHomePage;
import com.wbqa.samples.WD.utility.MyDataProvider;

public class TestESHomePage {

	WebDriver driver;
	
	
	@BeforeMethod
	public void openBrowser(){
		String browser=System.getProperty("browser");
		String appUrl=System.getProperty("appUrl");
	
		if (browser.equalsIgnoreCase("FF")){
			driver = new FirefoxDriver();
		}
		else
			if  (browser.equalsIgnoreCase("chrome")){
			driver = new ChromeDriver();
		}
			else
				driver = new HtmlUnitDriver();
		driver.get(appUrl);
		
		
	}
	@Test(dataProviderClass=MyDataProvider.class , dataProvider="data")
	public void testValid(String keyword, String result){
		EbookSonyHomePage hp = new EbookSonyHomePage(driver);
		int actual = hp.searchForValidKeyword(keyword);
		if (result.equals("valid"))
	     assert(actual > 0);
		else
		 assert(actual == 0);
		System.out.println("I am in testValid");
	}
	@Test(enabled=false)
	public void testInvalid(){
		EbookSonyHomePage hp = new EbookSonyHomePage(driver);
		int actual = hp.searchForValidKeyword("dgkssdjgss sgsj");
		
	     assert(actual > 0);
		
	}
	
	@AfterMethod
	public void closeBrowser(){
		driver.quit();
	}
	
}
