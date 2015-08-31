package com.java.testNg;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class secondTest {

	
	 @Test
	  public void f() {
		  
		  System.out.println("This is the output secondTest");
	  }
	 
	 @Test
	  public void f1() {
		  
		  System.out.println("This is the output secondTest 1111");
	  }
	 
	 @BeforeClass
	 public void classmethodbefore(){
		 System.out.println("@@BeforeClass- secondTest");
	 }
	 
	 @AfterClass
	 public void classmethodafter(){
		 System.out.println("@AfterClass- secondTest");
	 }
	 
	 @BeforeSuite
	 public void suitemethodbefore(){
		 System.out.println("@BeforeSuite");
	 }
	 
	 @AfterSuite
	 public void suitemethodafter(){
		 System.out.println("@AfterSuite");
	 }
	 
	 @BeforeMethod
	 public void methodbefore(){
		 System.out.println("@BeforeMethod- secondTest");
	 }
	 
	 @AfterMethod
	 public void methodafter(){
		 System.out.println("@AfterMethod- secondTest");
	 }
	 
	 @BeforeTest
	 public void BeforeTest(){
		 System.out.println("@BeforeTest-In class secondTest");
	 }
	 
	 
	 @AfterTest
	 public void AfterTest(){
		 System.out.println("@AfterTest-In class secondTest");
	 }
}
