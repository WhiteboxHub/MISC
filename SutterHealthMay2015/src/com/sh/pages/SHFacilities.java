package com.sh.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SHFacilities {

	WebDriver driver;
	
	public SHFacilities(WebDriver driver){
		this.driver = driver;
	}
	
	// getAllImages and Attributes
	public List<WebElement> findAllImages(){
		
		List<WebElement> allimages =  null;
		
		allimages = driver.findElements(By.tagName("img"));
		return allimages;
	}
	
	
}
