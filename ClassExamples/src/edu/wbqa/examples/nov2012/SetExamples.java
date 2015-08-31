package edu.wbqa.examples.nov2012;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExamples {


	public static void main(String[] args) {
	
	/*	Set<Integer> mySet = new HashSet<Integer>();
		mySet.add(10);
		if (!mySet.add(10)) System.out.println("The element is not added");
		mySet.add(100);
		mySet.add(1000);
		
		printSet(mySet);*/
		
		int[] arr = {1,3,4,3,1,6,7};
		findDuplicate(arr);
	}
	public static void printSet(Set s){
		Iterator it = s.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
	}
   // this method finds the duplicate elements in an array
   // a ={ 1,2,3,1,3,6}
	public static void findDuplicate(int[] a){
		
		Set<Integer> s = new HashSet<Integer>();
		for (int x :a){
		if (!s.add(x)) System.out.println(x);
		}
		Object[] b = s.toArray();
		System.out.println(Arrays.toString(b));
	}
	// this method finds the unique elements in an array
}
