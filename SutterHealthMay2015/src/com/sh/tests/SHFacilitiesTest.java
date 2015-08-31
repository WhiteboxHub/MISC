package com.sh.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.testng.Assert.*;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sh.pages.SHFacilities;

public class SHFacilitiesTest {

WebDriver driver;
	

	@BeforeMethod(groups={"Sanity","Functional"}) 
	public void openBrowser(){
		
		driver = new FirefoxDriver();
		driver.get("http://www.sutterhealth.org/facilities/");
		
	}
	
	@Test(groups={"Sanity","Functional"})
	public void testFacilitiesPage(){
		
		String actualTitle =driver.getTitle();
		Assert.assertTrue(actualTitle.equals("Sutter Health Locations | Hospitals | Medical Groups | Other"));

	}
	
	@Test
	public void testAllImages(){
		
		boolean failed = false;
		
		SHFacilities fp = new SHFacilities(driver);
		List<WebElement> actualImages = fp.findAllImages();
		int actualCount = actualImages.size();
		
		System.out.println("Verifying Image Count");
		// Check for the count
		try {
			assertTrue(actualCount == 7); 
		}
		catch(AssertionError e){
			System.out.println("Images count do not match.");
			failed = true;
		}
		
		List<String> expectedSrc = new ArrayList<String>();
		expectedSrc.add("http://common.sutterhealth.org/logos/SH_190.png");
		expectedSrc.add("http://www.sutterhealth.org/images/locations/feature-locations.jpg");
		expectedSrc.add("http://www.sutterhealth.org/imags/general/facility.jpg");
		
		List<String> expectedAlt = new ArrayList<String>();
		expectedAlt.add("Sutter Health");
		expectedAlt.add("null");
		expectedAlt.add("nurse");
		
		
		List<String> actualSrc = new ArrayList<String>();
		List<String> actualAlt = new ArrayList<String>();
		Iterator<WebElement> it = actualImages.iterator();
		while( it.hasNext()){
			WebElement image = it.next();
			actualSrc.add(image.getAttribute("src"));
			actualAlt.add(image.getAttribute("alt"));
		}
		
		System.out.println("------------------------");
		System.out.println("Verifying Image Src");
		System.out.println("Actual Src :" + actualSrc);
		// Check for the Src attribute Values
		try {
			assertTrue(actualSrc.containsAll(expectedSrc));
		}
		catch(AssertionError e){
			System.out.println("Image Source do not match");
			failed = true;
		}
		
		System.out.println("------------------------");
		System.out.println("Verifying Image Alt");
		// Verify alt values for not null
		try {
			assertFalse(actualAlt.contains("null"));
			
		}
		catch(AssertionError e){
			System.out.println("Alt did not match");
			failed = true;
		}
		
		if (failed)
			fail();
	}
	

	
	@AfterMethod(groups={"Sanity","Functional"}) 
	public void closeBrowser(){
		
		if (driver != null)
			driver.close();
	
	}
}
