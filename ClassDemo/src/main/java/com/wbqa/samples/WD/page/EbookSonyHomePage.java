package com.wbqa.samples.WD.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class EbookSonyHomePage {

	WebDriver driver;
	
	public EbookSonyHomePage(WebDriver driver){
		this.driver = driver;
	}
	
	public int searchForValidKeyword(String keyword){
		driver.findElement(By.id("keyword")).sendKeys(keyword);
		driver.findElement(By.id("submitSearch")).click();
	//	WebDriverWait wait = new WebDriverWait(driver,10);
	//	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@class='hreview']")));
		List<WebElement> entries = driver.findElements(By.xpath("//li[@class='hreview']"));
	
		Reporter.log("Entries in  the valid search on Ebook Sony Reader :" + entries.size());
		return entries.size();
	}
	
	public int searchForInvalidKeyword(String keyword){
		driver.findElement(By.id("keyword")).sendKeys(keyword);
		driver.findElement(By.id("submitSearch")).click();
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("warning")));
		
		List<WebElement> msg = driver.findElements(By.className("warning"));
		Reporter.log("Entries in invalid1 search Ebook sony Reader :" + msg.size());
		return msg.size();
	}
}
