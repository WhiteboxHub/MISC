package com.wbqa.wd.test;

import java.util.Arrays;
import java.util.List;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.wbqa.wd.HomePage;
import com.wbqa.wd.utilities.MyAssertion;


public class TestHomePage {
	
	static WebDriver driver;

	@BeforeClass
	@Parameters("browser")
	public  static void launchBrowser(String browser){
		
		if (browser.equalsIgnoreCase("Firefox"))
	    	driver = new FirefoxDriver();
		else if (browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("IE"))	{
		
			System.setProperty("webdriver.ie.driver", "lib/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else
		    driver = new HtmlUnitDriver(); // used to make tests run faster
	}
	
	
	@Test
	public void testSRurl(){
		
		Reporter.log("Entering testSRURL.. ");
		
		HomePage hp = new HomePage(driver);
		String actualTitle = hp.visitSRHomePage();
		String expectedTitle = "Reader Store - eBooks from Sony";
		
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	@Test
	public void testSRLogo(){
		
		Reporter.log("Entering testSRLogo");
		MyAssertion myAssertion = new MyAssertion();
		
		HomePage hp = new HomePage(driver);
		List<Boolean> images = hp.findLogoImages();
	//	Assert.assertTrue(images.get(0),"Sony Image not found" );
		Reporter.log("Sony Image Assertion ----");
		myAssertion.verifyTrue(images.get(0), "Sony Image not found");
		
	//	Assert.assertTrue(images.get(1),"Reader Store Image not found");
		Reporter.log("Reader Store Image Assertion --- ");
		myAssertion.verifyTrue(images.get(1), "Reader Store Image not found");
	}
	
	@Test
	public void testSearch(){
		
		HomePage hp = new HomePage(driver);
		String keyword = "Oliver";
		String actualTitle = hp.searchFlow(keyword);
		
		Assert.assertTrue(actualTitle.contains(keyword),"Keyword not found in Search Results Title");
	}
	
	@Test
	public void testBrowseLinks(){
		
		HomePage hp = new HomePage(driver);
		List<String> actualList = hp.findBrowseList();
		String[] l =  new String []{"Authors","Awards","Bargain-Priced","Bundles","Kids Corner","Magazines","New Arrivals" };
		List<String> expectedList = Arrays.asList(l);
		
		Assert.assertTrue(expectedList.containsAll(actualList));
		
		
		
	}
	
	@AfterClass
	public static void closeBrowser(){
		driver.close();
	}
}
