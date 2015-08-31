package edu.wbqa.examples.jan2013;
import java.util.Arrays;
import java.util.Collection;

import junit.framework.Assert;

import org.junit.*;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;



@RunWith (value=Parameterized.class)
public class TestArrayExamples4 {
	
    int[] arr;
    int expected;
	ArrayExamples ex;
	
	public TestArrayExamples4(int[] arr, int expected){
		this.arr = arr;
		this.expected = expected;
	 	ex = new ArrayExamples();
	}
	
	
	/*
	@Before
	public void initData(){
	    	arr = new int []{1,2,3,4,5};
	    	ex = new ArrayExamples();
	    	System.out.println("@Test Before");
	    	
	}
   */  
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
				
				{new int[]{1,2,3,4,4,5,6,5} , 8 },
				{new int[]{}, 0},
				{new int[]{Integer.MAX_VALUE ,Integer.MIN_VALUE}, 2}
		});
		
				
	}
	@Test
	public void printIntArrayTest1(){
		

		int len = ex.printIntArray(arr);
	    Assert.assertEquals(expected, len);
	}
	
	
	
	
	@Test
	public void printIntArrayTest2(){
		
		int len = ex.printIntArray(null);
	    Assert.assertEquals(-1, len);
		
	}
	
	@Category(BrokenTests.class)
	@Test(expected=NullPointerException.class)
	public void testEqualsArrays(){
		
		boolean ret = ex.equalsArrays(null, null);
		Assert.assertTrue(ret);
		
	}
	
	

	
/*	
	@After
	public void cleanup(){
		arr = null;
		ex = null;
		System.out.println("@Test After");
	}
	*/
}
