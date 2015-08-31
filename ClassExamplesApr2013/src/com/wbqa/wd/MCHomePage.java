package com.wbqa.wd;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MCHomePage {

	WebDriver driver;
	
	public MCHomePage(WebDriver driver){
		this.driver = driver;
	}
	
	public WebElement calculateMortgage(String loanType, String loanAmount, String zipCode){
		
		driver.get("http://www.mortgagecalculator.com/");
	
		Select loanTypeDD = new Select(driver.findElement(By.id("shmktpl_rp")));
		loanTypeDD.selectByVisibleText(loanType);
		
		WebElement loanAmountTB  = driver.findElement(By.name("la"));
		loanAmountTB.sendKeys(loanAmount);
		
		WebElement zipCodeTB = driver.findElement(By.name("zipcode"));
		zipCodeTB.sendKeys(zipCode);
		
		WebElement searchBtn = driver.findElement(By.name("search"));
		searchBtn.click();
		
		// This lands on the next page
		
		WebElement loanAmt = driver.findElement(By.className("mtgr_LoanAmount"));
		
		return loanAmt;
		
	}
	public String clickFBLike(){
		
		driver.get("http://www.mortgagecalculator.com/");
		
		WebElement myFrame =  driver.findElement(By.xpath(("//iframe[@src='http://www.facebook.com/plugins/fan.php?id=mortgagecalculator&width=250&connections=8&stream=false&header=true&locale=en_US']")));
		driver.switchTo().frame(myFrame);
		
		String oldHandle = driver.getWindowHandle();
		
		WebElement likeBtn = driver.findElement(By.xpath("//span[text()='Like']"));
		likeBtn.click();
		
		Set<String> allHandles = driver.getWindowHandles();
		Iterator<String> it = allHandles.iterator();
		String newHandle ="";
		while (it.hasNext()){
			newHandle = (String) it.next();
			System.out.println(newHandle);
//			driver.switchTo().window(newHandle);
//			String actualTitle = driver.getTitle();
//			if (actualTitle.equals("Twitter")) break;
		}
		driver.switchTo().window(newHandle);
		String actualTitle = driver.getTitle(); // This should give Facebook
	//	driver.close();
		
		driver.switchTo().window(oldHandle);
		
		return actualTitle;
		
	}
	public boolean getRatesforLoanTerms() throws InterruptedException{
		
		boolean ret = false;
	//	driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.get("http://www.mortgagecalculator.org/");
		try{
		   WebElement frame = driver.findElement(By.xpath("//iframe[@src='http://www.mortgagecalculator.org/qnst/index.php']"));
		   driver.switchTo().frame(frame);
		
		   WebElement select = driver.findElement(By.xpath("//option[@value='150000']"));
		   select.click();
	   		
		    
		    WebElement img = driver.findElement(By.xpath("//img[@alt='CapWest Mortgage']"));
		    System.out.println(img.getAttribute("alt"));
		    ret = true;
		}
		catch(TimeoutException e){
			e.printStackTrace();
			ret = false;
		}
		catch(NoSuchElementException e){
			e.printStackTrace();
			ret = false;
		}
		
		return ret;
	}
}
