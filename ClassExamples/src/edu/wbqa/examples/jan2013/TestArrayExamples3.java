package edu.wbqa.examples.jan2013;
import org.junit.experimental.categories.Category;

import junit.framework.*;

public class TestArrayExamples3 extends TestCase{
	
	int[] arr;
	ArrayExamples ex;
	
	public TestArrayExamples3(String str){
		super(str);
	}
	
	protected void setUp(){
		arr = new int[] {1,2,3,4,5};
		ex = new ArrayExamples();
	}
	
	@Category(BrokenTests.class)
	public void testPrintIntArray1(){
		
		int len = ex.printIntArray(arr);
	    Assert.assertEquals(5, len);
		
	}

	
	public void testPrintIntArray2(){
	
		int len = ex.printIntArray(null);
		Assert.assertEquals(-1, len) ;
	}
	
	public void testSumofArrayElements1(){
		
		int actualSum = ex.sumofArrayElements(arr);
		Assert.assertEquals(15, actualSum);
	}
	
	protected void teardown(){
		
		arr = null;
		ex = null;
	}
}
