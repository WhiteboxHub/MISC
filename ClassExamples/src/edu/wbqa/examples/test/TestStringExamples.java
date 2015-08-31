package edu.wbqa.examples.test;

import edu.wbqa.examples.nov2012.StringExamples;
import junit.framework.TestCase;

public class TestStringExamples extends TestCase {

	String str;
	
	public TestStringExamples(String str){
		super(str);
	}
	
	public void setUp(){
		str = "This is a beautiful day";
	}
	public void testPrintWordsLength(){
		int [] actualLen = StringExamples.printWordsLengths(str);
		int [] expectedLen = {4 , 2 ,1 , 9 ,7};
		if (actualLen.length != expectedLen.length)
			fail("Length of the arrays are unequal");
		for (int i = 0 ; i < actualLen.length ; i++){
			if (actualLen[i]!= expectedLen[i])
			fail(i + "th element did not match");
		}
	
	}
}
