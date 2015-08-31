package com.java.testNg;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.java.example.StringCon;

public class StringConTest {
  
	// Always this test case is run , if it true. 
	//If its false then this is ignored on execution of this class.
	//	It Also this will run even if it is has some dependency method on it .
	//This will be ignored if the method doesnot depend on any methods or group.
	//Enable will be give preferece though the method is dependent by other method or group. 
	@Test(alwaysRun=false,enabled=false)
  public void stringNotNull() {
	  StringCon sc = new StringCon();
	  String s = sc.getConcatString("Java", "Programming");
	// s = null;
	  Assert.assertNotNull(s, "Its value is Null in the method");
	  System.out.println("Inside the stringNotNull ");
	  
  }
	 // Only if the StringNotNull passed ,  this test will excute.
	//	Also it makes the StringNotnull test case to be executed frist as it depends on it
	@Test(groups="positive" , dependsOnMethods="stringNotNull")
	  public void stringGroups() {
		  StringCon sc = new StringCon();
		  String s = sc.getConcatString("Java", "Programming");
		 //s = null;
		  Assert.assertNotNull(s, "Its value is Null in the method");
		  System.out.println("Inside the stringNotNull ");
	}
		  
	
	// If the testcase is going to retrun any exceptions then it we handle 
	//that by expectedExceptions annotation test
	@Test(description = "This is the User readabel comment about the test case " , expectedExceptions=NullPointerException.class) 
	  public void stringNullException() {
		  StringCon sc = new StringCon();
		  String s = sc.getConcatString("Java", "Programming");
		  s = null;
		  s.length();
		  Assert.assertNotNull(s, "Its value is Null in the stringNullException");
		  System.out.println("Inside the stringNullException ");
		  
	  }
	
	@Test(invocationCount=2) // how many times the testcase can be run .
	  public void innovaction() {
		
		  System.out.println("Inside the invocationCount " );
		  
	  }
	
	//Data Driven testing , means take data dynamically from any file and 
	//passing it to a test and making it run the testcase iteraively till the last data exist in the file.
	//This can be achieved by dataProvider.
	@Test(dataProvider="details")
	public void personDetails(String name, int age){
		
		System.out.println("Hello your name :" +name + " and your age is :  " + age);
		
	}
	  
	@DataProvider(name="details")
	public Object[][] dataPool(){
		
		return new Object[][]{{"Bob", 5},{"John", 3},{"Keti", 6}};
	}
	  
}
