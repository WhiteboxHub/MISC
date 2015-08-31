package com.sh.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SHProvideSearchResults {

	WebDriver driver;
	
	public SHProvideSearchResults(WebDriver driver){
		
		this.driver = driver;
	}
	
	public String getHeader(){
		String headerText ="";
		
		headerText = driver.findElement(By.tagName("h1")).getText();
		
		return headerText;
	}
}
