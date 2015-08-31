package edu.wbqa.test;

import edu.wbqa.examples.nov2012.ArraysExamples;
import junit.framework.TestCase;

public class TestArrayExamples extends TestCase {
	
	int x ;
	


	public TestArrayExamples(String string , int x) {
		super(string);
		this.x = x;
	}

	protected void setUp() throws Exception {
		super.setUp();
		x =  100;
		x = 23;
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testIsPrime() {
		try{
		boolean ret = ArraysExamples.isPrime(x);
		assertTrue(ret);
		}
		catch(Exception e){
		  fail("Is prime failed");
		}
	}

	public void testPrintFirstAndLast() {
		fail("Not yet implemented");
	}

	public void testPrintSum() {
		fail("Not yet implemented");
	}

	public void testSearchKey() {
		fail("Not yet implemented");
	}

}
