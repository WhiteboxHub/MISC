package com.sh.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleSHDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       SampleSHDemo ex = new SampleSHDemo();
       ex.validSearch();
	}
	public void validSearch(){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.sutterhealth.org/");
		WebElement input = driver.findElement(By.id("quicksearch"));
		input.sendKeys("Flu Shots");
		WebElement searchBtn = driver.findElement(By.xpath("//button[text()='Search']"));
		searchBtn.click();
		
	}

}
