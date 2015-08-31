package edu.wbqa.examples.jan2013;

import junit.framework.TestSuite;

public class MyTestSuite3B extends TestSuite {
	
	public static TestSuite suite(){
		TestSuite suite = new TestSuite();
		suite.addTest(new TestArrayExamples3("testPrintIntArray2"));
		suite.addTestSuite(TestStringExamples3.class);
		
	
		return suite;
	}

}
