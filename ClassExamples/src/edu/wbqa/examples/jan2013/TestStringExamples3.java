package edu.wbqa.examples.jan2013;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import junit.framework.*;

public class TestStringExamples3 extends TestCase{
	
	StringExamples ex;
	String str ;
	
	protected void setUp(){
		ex = new StringExamples();
		str = "Hello World";
	}
	public void testReverseString(){
		String actual  = "";
		String expected = "";
	try{	
		actual= StringExamples.reverseStr(str);
		expected = "dlroW olleH";
		Assert.assertNull(actual);
	}
	catch(AssertionFailedError e) {
	
		File log = new File("C:\\Users\\Shilpi\\SkyDrive\\Documents\\training\\log.txt");
		try {
			FileWriter fw = new FileWriter(log);
			fw.write("TestCase : testReverseString " + "\tError Some Error in ReverseString " + System.currentTimeMillis() );
			fw.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	//	fail("The object is not null");
		
	}
	  Assert.assertEquals(  "Strings not matched",expected,actual);
	  
	
	
		
	}

}
