package edu.wbqa.examples.june2012;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> l1 = new LinkedList<String>();
		
		l1.add("Tim");
		l1.add("Kim");
		l1.add("John");
		
		l1.remove(0);
		
		l1.add(1, "Perry");
		
		
		Iterator itr = l1.iterator();
		
		while (itr.hasNext())
			System.out.println(itr.next());
		
	  
		Set<Integer> s  = new HashSet<Integer>();
		
		s.add(2);
		s.add(4);
		s.add(2);
		
         Iterator itr1 = s.iterator();
		System.out.println("Number of elements " +  s.size());
		while (itr1.hasNext())
			System.out.println(itr1.next());
		
		
		Map myProperties = new HashMap();
		
		myProperties.put("a", "1");
		myProperties.put("b", "3");
	   
	    System.out.println(myProperties);
		

	}

}
