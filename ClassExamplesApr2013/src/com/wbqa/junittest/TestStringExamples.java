package com.wbqa.junittest;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.wbqa.demo.StringExamples;

@RunWith(value=Parameterized.class)
public class TestStringExamples {

	StringExamples ex;
	String str;
	int expectedResult;
	static FileWriter fw;
	static PrintWriter log;
	
	public TestStringExamples(String str, int expectedResult){
		this.str = str;
		this.expectedResult = expectedResult;
	}
	
	@BeforeClass
	public static void readTestData(){
		try {
			fw = new FileWriter(new File("C:\\Users\\Shilpi\\SkyDrive\\training\\test.log"));
			log = new PrintWriter(fw);
			log.println("I am in Before Class");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	@Before
	public void setUp() throws IOException{
		ex = new StringExamples();
	//	str = "This is a beautiful day!!";
		log.println("I am in setup.\n");
	}
	
	@Test
	public void testcountVowels() throws IOException{
		
		Calendar cal = Calendar.getInstance();
		Date today = cal.getTime();
		
		log.println("\ntestcases exceuted @ " + today);
		
		int actualResult = ex.countVowels(str);
		
		log.println("String = " + str);
		log.println("Actual Result = " + actualResult);
		log.println("Expected Result =" + expectedResult);
		
		assertTrue(actualResult == expectedResult);
	}
	
	@After
	public void tearDown(){
		ex = null;
		str = null;
	}
	
	@AfterClass
	public static void cleanUp() throws IOException{
		if (fw!=null) {
			fw.close();
		}
		if (log != null){
			log.close();
		}
	}
	
	@Parameters
	public static Collection<Object[]> data(){
		
		Object[][] data = new Object[][]{
				{"Its a beautiful day !" , 8 },
				{"Hello World" , 3}
		};
		return Arrays.asList(data);
	}
}
