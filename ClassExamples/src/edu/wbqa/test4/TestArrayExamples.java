package edu.wbqa.test4;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import edu.wbqa.examples.nov2012.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class TestArrayExamples {
	
	int [] arr;
	int min;
	int num;
	public TestArrayExamples(int [] a , int min, int num){
		this.arr = a;
		this.min = min;
		this.num = num;
	}
	@Parameters
	public static Collection data(){
		return Arrays.asList(new Object[][]{
				{new int[]{1,3,5} , 1 , 23},
				{new int[]{2,4,6} , 2 , 56},
				{new int[]{2,4,6} , 2 , 67}
		});
	}

	
	
	
	@Test
	public void testIsPrime(){
		boolean ret = ArraysExamples.isPrime(num);
		assertTrue(ret);
	}
	
	
    @Test()
    public void testFindMin(){
    	int actual = ArraysExamples.findMin(arr);
    	assertEquals(min, actual);
    }
}
