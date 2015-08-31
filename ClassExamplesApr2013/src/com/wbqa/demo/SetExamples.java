package com.wbqa.demo;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetExamples {

	public Set createSet(){
		
		Set s = new HashSet();
		s.add(10);
		s.add(20);
		s.add(30);
		
		return s;
	}
	
	public Set createSortedSet(){
		
		Set s = new TreeSet() ;
		
		s.add(20);
		s.add(10);
		s.add(30);
		s.add(10);
		return s;
	}
	public int printSet(Set s){
		int size = 0;
		
		for (Object o : s)
		{
			System.out.println(o);
			size++;
		
		}
		return size;
		
	}
	// this method removes the duplicate elements in an integer array
	// int[] arr = { 1,2,4,4,1}
	// int new arr ={1,2,4}
	public Integer[] removeDuplicate(int[] arr){
		Integer[] newarr = new Integer[arr.length];
		int index = 0;
		Set s = new HashSet();
		for (int x : arr){
		   s.add(x);
		}
		newarr  = (Integer[]) s.toArray();
	
	/*	int[] newarr1 = new int[s.size()];
		for (int i =0 ; i < s.size() ; i++){
			newarr1[i] = (Integer) newarr[i];
		}*/
		return newarr;
	
	}
}
