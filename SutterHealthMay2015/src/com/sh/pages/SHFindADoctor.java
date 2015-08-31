package com.sh.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SHFindADoctor {

	protected WebDriver driver;
	
	public SHFindADoctor(WebDriver driver){
		
		this.driver = driver;
	}
	
	// 
	public SHProvideSearchResults searchDoctor(){
		
		WebElement dropdown = driver.findElement(By.id("primSpec"));
		Select dd = new Select(dropdown);
		dd.selectByVisibleText("Family Medicine");
		driver.findElement(By.id("zip")).sendKeys("94568");
		driver.findElement(By.id("ps_submit")).click();
		
		SHProvideSearchResults pg = new SHProvideSearchResults(driver);
		
		return pg;
	}
	
	public String searchValidData(String keyword){
		
		String resultsNo = "";
		
		   driver.findElement(By.id("quicksearch")).sendKeys(keyword);
		   driver.findElement(By.xpath("//button[text()='Search']")).click();
		   
		   try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		   WebElement strong = driver.findElement(By.cssSelector("div.kws_pager_left strong:nth-of-type(2)"));
		   resultsNo = strong.getText();
		
		return resultsNo;
	}
}
