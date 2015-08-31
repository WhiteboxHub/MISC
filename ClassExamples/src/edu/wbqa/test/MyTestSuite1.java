package edu.wbqa.test;

import junit.framework.TestSuite;

public class MyTestSuite1 extends TestSuite {

	public static TestSuite suite(){
		TestSuite suite = new TestSuite();
		suite.addTest(new TestArrayExamples("testIsPrime" , 23));
		suite.addTest(new TestArrayExamples("testIsPrime" , 29));
		suite.addTest(new TestStudent("testToString"));
		return suite;
	}
}
