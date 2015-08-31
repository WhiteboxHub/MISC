package com.mc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MCHomePage {

	WebDriver driver;
	
	public MCHomePage(WebDriver driver){
		
		this.driver = driver;
	}
	
	public String getMortgageRates(){
		
		WebElement h2 = driver.findElement(By.xpath("//h2[contains(text(),'Low Mortgage')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", h2);
	/*	
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	*/	
		WebElement iframe = driver.findElement(By.cssSelector("iframe[src*='widgets.bankrate.com']"));
		driver.switchTo().frame(iframe);
		WebElement txtBox  = driver.findElement(By.id("search-loanamt"));
		txtBox.clear();
		txtBox.sendKeys("$350,000");
		
		WebDriverWait wait = new WebDriverWait(driver, 8);
	//	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='Search']"))))
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='Search']"))))
		.click();
		
		WebElement rate = driver.findElement(By.xpath("(//li[@class='apr']/div[contains(@class,'ratenum')])[1]"));
		System.out.println("Rate:" + rate.getText());
		return rate.getText();
		
	}
}
