package com.sh.tests;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sh.pages.SHFacilities;
import com.sh.pages.SHHomePage;

public class SHHomePageTest {
	
	WebDriver driver;
	
	@Parameters("browsername")
	@BeforeMethod(groups={"Sanity","Functional"}) 
	public void openBrowser(String browser){
		
		//String browser = "ie";
		
		if (browser.equals("ff")) {
			driver = new FirefoxDriver();
		}
		else if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","lib/chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if (browser.equals("ie")){
			System.setProperty("webdriver.ie.driver","lib/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else
			driver = new HtmlUnitDriver();
		
		driver.get("http://www.sutterhealth.org/");
		driver.manage().window().maximize();
	}
	
	@Test(groups="Sanity")
	public void testHomePage(){
		
		String actualTitle =driver.getTitle();
		Assert.assertTrue(actualTitle.equals("Sutter Health | Doctors and Hospitals | Northern California"));
	}
	
	@Test(groups={"Slider","Broken"})
	public void testSliderImages(){
		
		SHHomePage fp = new SHHomePage(driver);
		Set<WebElement> images = fp.getSliderImages();
		Assert.assertTrue(images.size() == 6);
	}

	@Test
	public void testSideBarHeaders(){
		
		
		SHHomePage hp = new SHHomePage(driver); // dependency Injection
		List<WebElement> headers = hp.getSideBarHeaders();
		String[] expected = new String[] {
				  "HEALTH NOTICES",
				  "LOCATIONS",
				  "QUICK LINKS"
				};
		String [] actual = new String[3];
		Iterator<WebElement> it = headers.iterator();
		int i = 0;
		while (it.hasNext()){
			WebElement header = it.next();
			actual[i++] = header.getText();
		}
		
		Assert.assertEquals(actual, expected);
		
		driver.close();
	}
	
	@Test(groups={"Sanity","Functional"})
	public void testSideBarBrokenLinks(){
		
		SHHomePage hp = new SHHomePage(driver); // dependency Injection
		List<String> actual = hp.getLinksByHeader("HEALTH NOTICES");
		System.out.println(actual);
		Assert.assertFalse(actual.contains("404 - Page not found..."));
		Reporter.log("SideBarBrokenLinks Passed .. ");
	}
	
	@Test
	public void testLikeUS(){
		
		SHHomePage hp = new SHHomePage(driver); 
		
		WebElement actualText = hp.showLikeUs();
		Assert.assertNotNull(actualText);
		
	}
	
	@AfterMethod(groups={"Sanity","Functional"}) 
	public void closeBrowser(){
		
		if (driver != null)
			driver.close();
	}

}
