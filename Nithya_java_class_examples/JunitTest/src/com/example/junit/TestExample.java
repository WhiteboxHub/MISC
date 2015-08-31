package com.example.junit;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Assert;
import org.junit.*;
import org.junit.BeforeClass;
import org.junit.Test;

import com.java.example.LargestSmallestNumberInArray;
import com.java.example.ReverseString;

public class TestExample {

	@Test(timeout=0)// Time out attribuet is used to check if testcase is executing with in the given ms. It it takes more than the time then it fails the testcases.//Kind of Performace testing
	public void testRevString() {

		ReverseString rev = new ReverseString();
		String actualOutput = rev.reverseAString("Hello");
		String excepted = "olleH";
		//assertEquals(excepted, actualOutput);
		
		Assert.assertTrue("The output is not as expected", actualOutput.equalsIgnoreCase(excepted));
		
		// Message will be displayed only if the assertion is false and will be displayed in the assertionserror.

	}

	//@Ignore // Used to skip this method alone when executing the test case .. Like commenting out 
	@Test
	public void testLargestSmallestNumberInArray() {

		LargestSmallestNumberInArray lsa = new LargestSmallestNumberInArray();

		int   numbers[] = new int[]{32,43,53,54,32,65,63,98,43,23};

		int[] actualOutput = lsa.getLargestSmallestNumber(numbers);
		int[] excepted = {98,23} ;
		/*for(int i = 0 ; i < excepted.length ; i++){
			assertEquals(excepted[i], actualOutput[i]);

		//	
		}*/
		Assert.assertArrayEquals(excepted, actualOutput);

	}
	
	//May be used for the DB Connections like that 
	@BeforeClass  // Only one time its called that the reason method is given as static . Used to exceuted the set of statmenst before the test case are executed .
	public static void printDate(){
		
			System.out.println("The Junit Test Starts at "+new Date());
	}
	
	@Before // Will get executed for all the test methods once . Used incase if there is common funtionalities between all the testcases like object creations .. .
	public void testStarts(){
		
		System.out.println("**********Test Started ****************** ");
		
	}
	
	@After//Will get executed for all the test methods 
	public void testEnds(){
		
		System.out.println("**********Test Ends ****************** ");
		
	}
	
	@AfterClass  // Only one time its called that the reason method is given as static . Used to exceuted the set of statmenst before the test case are executed .
	public static void End(){
		System.out.println("**********Test Ends class****************** ");
		
	}
}
