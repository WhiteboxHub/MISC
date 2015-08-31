package com.wbqa.junittest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.wbqa.demo.ArraysExamples;

public class TestArrayExamples {

	ArraysExamples ex ;
	int[] arr;
	
	@Before
	public void initData(){
	    ex	= new ArraysExamples();
		arr = new int []{ 1,3, 4,5};
	}
	
	
	@Test
	public void testreverseArr(){
		
	//	ArraysExamples ex = new ArraysExamples();
	
		int [] actualResult = ex.reverseArr(arr);
		int [] expectedResult = new int[]{5,4,3,1};
		
		Assert.assertArrayEquals(expectedResult,actualResult);
		
	}
	
	@Test(expected=NullPointerException.class)
	public void testcountEven(){
		
		int actualResult = ex.countMultiplesof5(null);
		
	}
	
	@Category(BrokenTests.class)
	@Test
	public void testCount1(){
		try{
		    ex.countMultiplesof5(null);
		    fail("Null passing fails in countMultipleof5");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	@Category(BrokenTests.class)
	@Test
	public void testsumofElements(){
		
	//	ArraysExamples ex = new ArraysExamples();
		int actualResult = ex.sumOfElements(arr);
		int expectedResult = 13;
		
		Assert.assertEquals(expectedResult,actualResult);
		
		
	}
	
	@Test
	public void testCons(){
		
		ArraysExamples ex = new ArraysExamples(arr);
		Assert.assertNotNull(ex);
		Assert.assertArrayEquals(arr, ex.myarr);
		
	}
	@After
	public void cleanData(){
		ex = null;
		arr = null;
	}
	
	
}
