package edu.wbqa.test;


import junit.framework.TestSuite;

public class MyTestSuite extends TestSuite {
	
	
	 public static TestSuite suite(){
		 TestSuite suite = new TestSuite();
		 suite.addTestSuite(TestArrayExamples.class);
		 suite.addTestSuite(TestStudent.class);
		 return suite;
	 }
	
	

}
