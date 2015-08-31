package com.sh.tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

import com.sh.main.MyDataProvider;
import com.sh.pages.SHFindADoctor;
import com.sh.pages.SHProvideSearchResults;




public class SHFindADoctorTest {

	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser(){
		
		driver = new FirefoxDriver();
		driver.get("http://www.sutterhealth.org/findadoctor/index.html");
		driver.manage().window().maximize();
	}
	
	
	@Test(dataProvider = "searchdata" , dataProviderClass =MyDataProvider.class , dependsOnMethods ={"testFMSearchDoctor"})
	public void testSearch(String keyword, String expected){
		
		SHFindADoctor dp = new SHFindADoctor(driver);
		String actual = dp.searchValidData(keyword);
		assertTrue(actual.contains(expected));
		
	}
	
	@Test
	public void testFMSearchDoctor(){
		
		SHFindADoctor dp = new SHFindADoctor(driver);
		SHProvideSearchResults pg =dp.searchDoctor();
		String actual = pg.getHeader();
		System.out.println(actual);
		try{
		  assertTrue(actual.contains("Sutter Health Doctors"));
		}
		catch(AssertionError e){
		  
		  File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      try {
	    	long timestamp = System.currentTimeMillis();  
			FileUtils.copyFile(screenshot, new File("C:\\Users\\Shilpi\\SkyDrive\\training\\UIAutomationScreenShots\\error_" + timestamp +" .png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	      fail();	
		}
	}
	
	@AfterMethod
	public void closeBrowser(){
		
		if (driver != null)
			driver.close();
	
	}
	
}
