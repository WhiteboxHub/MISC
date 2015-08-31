package com.wbqa.wd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver ;
	static final String APPURL = "https://ebookstore.sony.com/";
	
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	private int getLength(String str){
		return str.length();
	}
	
	// this method launches the browser, and loads the site homepage
	public String visitSRHomePage(){
		
		driver.get("https://ebookstore.sony.com/");
		String title = driver.getTitle();
		
		getLength("Some");
		return title;
	}
	
	// this method finds the images 
	public List<Boolean> findLogoImages(){
		
		List<Boolean> images = new ArrayList<Boolean>();
		
		driver.get("https://ebookstore.sony.com/");
		try{
		  WebElement sonyLogo = driver.findElement(By.xpath("(//img[@alt='Readers Store'])[1]"));
		  images.add(true);
		}
		catch(NoSuchElementException e){
		  images.add(false);
		}
		
		try{
		  WebElement readerLogo = driver.findElement(By.xpath("(//img[@alt='Reader Store'])[2]"));
		  images.add(true);
		}
		catch(NoSuchElementException  e){
		  images.add(false);
		}
		
		return images;
	}
	
	//this method defines the search functionality on home page
	public String searchFlow(String searchString){
		
		// go to homepage
		driver.get(APPURL);
		// type <keyword> in the search box.
		WebElement searchBox = driver.findElement(By.id("keyword"));
		searchBox.sendKeys("Oliver");
		// press Go button
		WebElement goBtn = driver.findElement(By.id("submitSearch"));
		goBtn.click();
		// on the landing page locate the list of items displayed
		String title = driver.getTitle();
		return title;
	}
	
	//this method locates the Browse list
	public List<String> findBrowseList(){
		
		List<String> linksText = new ArrayList<String>();
		driver.get(APPURL);
		
		List<WebElement> links = driver.findElements(By.xpath("//h2[text()='Browse']/following-sibling::ol/li"));
//		int size = links.size();
		Iterator<WebElement> it = links.iterator();
		while (it.hasNext()){
			String text = it.next().getText();
			linksText.add(text);
		}
		
		return linksText;
	}
	
	//this method checks the search feature by keyword
	public void searchByKeyword(){
		
		searchFlow("keyword");
		
	}
	
	//this methid checks the search feature by author
	public void searchByAuthor(){
		
		searchFlow("AuthorName");
		
	}
	
	
}
