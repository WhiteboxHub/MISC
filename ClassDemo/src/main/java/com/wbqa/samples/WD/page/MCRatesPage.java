package com.wbqa.samples.WD.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MCRatesPage {

	WebDriver driver;
	
	public MCRatesPage(WebDriver driver){
		this.driver = driver;
	}
	
	public int getRates(String state, String loanType,  String amount){
		
		driver.get("http://www.mortgagecalculator.com/mortgage-rates/");
		Select stateList = new Select(driver.findElement(By.id("sh_state")));
		stateList.selectByVisibleText(state);
		
		String xpath = "//select[@id='sh_rp']/option[text()='" + loanType  + "']";
		WebElement loanTyp = driver.findElement(By.xpath(xpath));
		loanTyp.click();
		
		Select amountList = new Select(driver.findElement(By.id("sh_la")));
		amountList.selectByVisibleText(amount);
		
		WebElement rateBtn = driver.findElement(By.cssSelector(".mtgr_FilterFormBtnImg"));
		rateBtn.click();
		
		List<WebElement> list = driver.findElements(By.xpath("//div[starts-with(@class,'shad style')]"));
		
		return list.size();
	}
}
