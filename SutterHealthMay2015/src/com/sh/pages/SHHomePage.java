package com.sh.pages;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SHHomePage {
	
	WebDriver driver;
	
	WebElement header1;
	WebElement header2;
	WebElement header3;
	
	public SHHomePage(WebDriver driver){
		this.driver = driver;
	}

	//sidemenu
	public List<WebElement> getSideBarHeaders(){
		
		List<WebElement> sideBarHeaders;
		sideBarHeaders = driver.findElements(By.cssSelector("div.sidebar strong"));
		
		return sideBarHeaders;
		
	}
	
	// This method checks for the images of the slider
	public Set<WebElement> getSliderImages(){
		
		Set<WebElement> images = new HashSet<WebElement>();
		long startTime = System.currentTimeMillis();
		long endTime ;
		do{
		 
			WebElement image = driver.findElement(By.cssSelector("div#features img"));
			images.add(image);
			endTime = System.currentTimeMillis();
		}while (endTime - startTime < 30000);
		
		return images;
	}
	
	public List<String> getLinksByHeader(String header){
		
		List<String> titles = new ArrayList<String>();
		List<String> hrefs = new ArrayList<String>();
		int indx = -1;
		List<WebElement> li;
			
		li = driver.findElements(By.xpath("//strong[text()='HEALTH NOTICES']/parent::*/following-sibling::ul[1]/li"));
		if (li == null)
			System.out.println("No matching nodes");
		Iterator<WebElement> it = li.iterator();
		while (it.hasNext()) {
			System.out.println("Inside Loop");
			WebElement myli = it.next();
			WebElement link = myli.findElement(By.tagName("a"));
			System.out.println("Tagname:" +link.getTagName());
			System.out.println("Href: " +link.getAttribute("href"));

			hrefs.add(link.getAttribute("href"));
			driver.navigate().back();
			
			
		}
		
		for (String url : hrefs){
			
			driver.get(url);
			titles.add(driver.getTitle());
		}
		
		return titles;
	}
	
	// This method deals with LikeUs popup
	public WebElement showLikeUs(){
		
		WebElement iframe = driver
				.findElement(By.cssSelector("iframe#facebooklike"));
		
		driver.switchTo().frame(iframe);
		WebElement likebtn = driver.findElement(By.xpath("(//span[text()='Like'])[1]"));
		likebtn.click();
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		while (it.hasNext()){
			
			String windowhandle = it.next();
			driver.switchTo().window(windowhandle);
			String currentTitle = driver.getTitle();
			if (currentTitle.equals("Facebook")) 
				break;
		}
		
		WebElement text = driver.findElement(By.xpath("//*[text()='Log in to your Facebook account to use this social plugin.']"));
		return text;
	}
	
	//aboutus
	
	//myhealthonline
	
	//specialaties
}
