package edu.wbqa.examples.jan2013;

import junit.framework.TestSuite;

public class MyTestSuite3A extends TestSuite {
	
	public static TestSuite suite(){
		TestSuite suite = new TestSuite();
		suite.addTestSuite(TestArrayExamples3.class);
		suite.addTestSuite(TestStringExamples3.class);
		
		return suite;
	}

}
