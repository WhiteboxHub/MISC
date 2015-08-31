package edu.wbqa.examples.test;

import edu.wbqa.examples.june2012.ArraysExamples;
import junit.framework.TestSuite;

public class MyTestSuite extends TestSuite{

	public static TestSuite suite(){
		TestSuite suite = new TestSuite();
		suite.addTestSuite(TestArraysExamples.class);
		suite.addTestSuite(TestStringExamples.class);
		return suite;
	}
}
