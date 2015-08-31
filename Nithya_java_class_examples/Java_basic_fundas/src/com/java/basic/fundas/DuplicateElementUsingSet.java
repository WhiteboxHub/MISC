package com.java.basic.fundas;

import java.util.*;

public class DuplicateElementUsingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<Integer> i = new TreeSet<Integer>();
		
		i.add(10);
		i.add(80);
		i.add(20);
		i.add(20);
		i.add(20);
		
		Iterator< Integer> it = i.iterator();
		
		while(it.hasNext()){
			
			System.out.println(it.next().intValue());
		}
		

		Set<String> s = new TreeSet<String>();
		
		s.add("Java");
		s.add("Java");
		s.add("Programming");
		
		Iterator< String> its = s.iterator();
		
		while(its.hasNext()){
			
			System.out.println(its.next().toString());
		}
		
	}

}
