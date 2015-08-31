package com.wbqa.mytests;

import java.util.Arrays;


import com.wbqa.demo.ArraysExamples;

public class TestArrayExamples {

	public static void main(String[] args){
		
		ArraysExamples ex = new ArraysExamples();
		
		int[] a = {1,2,3,4,5};
		
	//	int len = ex.printElements(a);
		
//		System.out.println("There are " + len + " elements in the array.");
		
		int[][] a1 = {
				{ 1,2,3 ,4},
				{ 5,6,7,8}
		};
		
		ex.transpose(a1);
		
	/*	int[] a1 = {7373,-1818,-27277,Integer.MAX_VALUE};
		len = ex.printElements(a1);
		
		System.out.println("There are " + len + " elements in the array.");
		
		int sum = ex.sumOfElements(a);
		
		System.out.println("The sum of elements of a is " + sum);
		
		
		sum = ex.sumOfOddElements(a);
		System.out.println("The sum of odd elements of a is " + sum);
		
		
		int count = ex.countMultiplesof5(new int[]{100,-35,89});
		System.out.println("The number of multiples of 5 are" + count);
	
		int [] reversedArr = ex.reverseArr(a);
		
		System.out.println(Arrays.toString(reversedArr));
		System.out.println(Arrays.toString(a));
		
		ex.reverseArr1(a);
		System.out.println(Arrays.toString(a));
		
		Integer x1 = new Integer(100);
		
	*/	
		
	}
}
