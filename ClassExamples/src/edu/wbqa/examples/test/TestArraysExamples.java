package edu.wbqa.examples.test;

import edu.wbqa.examples.nov2012.ArraysExamples;
import junit.framework.TestCase;

public class TestArraysExamples extends TestCase{
	
	private int [] arr ;
	
	public TestArraysExamples(String str){
		super(str);
	}
	
	// this method is used to initialize test data
	// this method is called before every test method
	protected void setUp(){
		arr = new int[]{12,34,-90,0};
		System.out.println("In Setup");
	}
	
	public void testFindMin(){
	
		int actualOutput = ArraysExamples.findMin(arr);
		int expectedOutput = -89;
		
		assertEquals(expectedOutput, actualOutput);
	}
	public void testIsPrime(){
		boolean actual = ArraysExamples.isPrime(23);
		boolean expected = true;
		assertEquals(expected, actual);
		
		
		
	}
	public void anyMethod(){
		System.out.println("Not executed");
	}
	protected void tearDown(){
		// for all cleanup actions on test data
	}

}
