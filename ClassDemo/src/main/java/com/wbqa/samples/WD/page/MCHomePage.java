package com.wbqa.samples.WD.page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MCHomePage {
	
	WebDriver driver;

	public MCHomePage (WebDriver driver){
		this.driver = driver;
	}
		

	public Map<String,List<WebElement>> searchForKeyword(){
		Map<String,List<WebElement>> uiObject = new HashMap<String,List<WebElement>>();
		
		driver.get("http://www.mortgagecalculator.com");
		
		WebElement searchInputBox = driver.findElement(By.id("s"));
		searchInputBox.sendKeys("home loan");
		WebElement searchBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		searchBtn.click();
		List<WebElement> link1 = driver.findElements(By.linkText("Mortgage Calculatr"));
		uiObject.put("link1", link1);
		
		List<WebElement> link2 = driver.findElements(By.xpath("//div[@class='text-1']"));
		uiObject.put("link2", link2);
		
		return uiObject;
	}

   public WebElement searchForKeyword1(){
		
		driver.get("http://www.mortgagecalculator.com");
		WebElement searchInputBox = driver.findElement(By.id("s"));
		searchInputBox.sendKeys("home loan");
		WebElement searchBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		searchBtn.click();
		WebElement link1 = driver.findElement(By.xpath("//div[@class='text-1']"));
		
		return link1;
	}
   
   public List<WebElement> findAllImages(){
	   
	   driver.get("http://www.mortgagecalculator.com");
	   List<WebElement> allImages = driver.findElements(By.tagName("img"));
	   
	   return allImages;
	   
   }
}
