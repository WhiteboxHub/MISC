package com.java.testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	  System.out.println("This is the output NewTest");
  }
  
	 @BeforeClass
	 public void classmethodbefore(){
		 System.out.println("@@BeforeClass- NewTest");
	 }
	 
	 @AfterClass
	 public void classmethodafter(){
		 System.out.println("@AfterClass- NewTest");
	 }
	 
	 @BeforeSuite
	 public void suitemethodbefore(){
		 System.out.println("@BeforeSuite");
	 }
	 
	 @AfterSuite
	 public void suitemethodafter(){
		 System.out.println("@AfterSuite");
	 }
	 
}
