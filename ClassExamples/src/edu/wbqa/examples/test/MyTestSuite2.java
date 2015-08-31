package edu.wbqa.examples.test;

import junit.framework.TestSuite;

public class MyTestSuite2 extends TestSuite{

	public static TestSuite suite(){
		TestSuite suite = new TestSuite();
		suite.addTest(new TestArraysExamples("testIsPrime"));
		suite.addTest(new TestStringExamples("testPrintWordsLength"));
		
		return suite;
	}
}
