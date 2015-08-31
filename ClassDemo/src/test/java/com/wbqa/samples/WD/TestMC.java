package com.wbqa.samples.WD;



import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.wbqa.samples.WD.page.MCHomePage;
import com.wbqa.samples.WD.utility.MyAssertion;


public class TestMC {
	
	WebDriver driver;

	
	@BeforeMethod
	public void openBrowser(String browser){
		if (browser.equalsIgnoreCase("FF")){
			driver = new FirefoxDriver();
		}
		else
			if  (browser.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		driver = new ChromeDriver();
		}
			else
				driver = new HtmlUnitDriver();
	}
	
    @Test
    public void testAppURL(){
    	driver.get("http://www.mortgagecalculator.com/");
    	String actualTitle = driver.getTitle();
    	String expectedTitle = "Mortgage Calculator - Buying or Refinancing a Home";
    	
    	Assert.assertTrue(expectedTitle.contains(actualTitle));
    }
	
	@Test(dependsOnMethods ="testAppURL")
	public void testAllImages(){
		// create the page object
		MCHomePage hp = new MCHomePage(driver);
		// call the method from page class to find all images
		List<WebElement> allImages = hp.findAllImages();
		
		// create a file which would store all the src attributes for all the images
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			  fw = new FileWriter("C:\\Users\\Shilpi\\SkyDrive\\training\\allImages.txt");
			  pw = new PrintWriter(fw);
			// Iterate through all the list elements  , and get the image src attribute  
			for (WebElement img : allImages){
				// store it in a string
				String src = img.getAttribute("src");
				// write the string on the file
				pw.println(src);
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  finally{
			  try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  pw.close();
		  }
		
		
		int expectedCount = 14;
		int actualCount = allImages.size();
		// asserting the size of the image
		//Assert.assertEquals(actualCount, expectedCount);
		Assert.assertTrue(actualCount > 10);
	}
	
	@Test
	public void testTC1(){
		Reporter.log("I am in testTC1 : Authored By Shilpi");
		MCHomePage test = new MCHomePage(driver);
		Map<String,List<WebElement>> allLinks = test.searchForKeyword();
		
		List<WebElement> link1 = allLinks.get("link1");
		Assert.assertTrue(link1.size()>0);
		
		List<WebElement> link2 = allLinks.get("link2");
		Assert.assertTrue(link2.size()>0);

		
	}
	
	@Test
	public void testwithVerifyTC1(Method method){
		MyAssertion myAssert = new MyAssertion();
		Reporter.log("I am in testTC1 : Authored By Shilpi");
		MCHomePage test = new MCHomePage(driver);
		Map<String,List<WebElement>> allLinks = test.searchForKeyword();
		
		List<WebElement> link1 = allLinks.get("link1");
		myAssert.verifyTrue(link1.size() > 0, "link1 not found in " +method.getName()  );
		
		List<WebElement> link2 = allLinks.get("link2");
		myAssert.verifyTrue(link2.size()>0, "link2 not found in" + method.getName());

		
	}
	@Test(groups="fastTests")
	public void testTC2(){
		MCHomePage test = new MCHomePage(driver);
		WebElement link = test.searchForKeyword1();
		Assert.assertNotNull(link);
	}
	
	
	
	@AfterMethod(groups="fastTests")
	public void closeFFBrowser(){
		driver.close();
		driver.quit();
	}
}
