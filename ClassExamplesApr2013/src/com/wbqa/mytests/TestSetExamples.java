package com.wbqa.mytests;

import java.util.Arrays;
import java.util.Set;

import com.wbqa.demo.SetExamples;

public class TestSetExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		SetExamples ex = new SetExamples();
		Set s = ex.createSet();
		ex.printSet(s);
		
		Set s1 = ex.createSortedSet();
		ex.printSet(s1);
		
		Integer [] arr = ex.removeDuplicate(new int[]{1,-2,1,3,-4,4,0});
		System.out.println(Arrays.toString(arr));

	}

}
