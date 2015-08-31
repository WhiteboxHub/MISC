package com.java.basic.fundas;

import java.util.*;

public class TestCustomerSet {

	  public static void main(String[] args)
	    {
	        Set<Integer> cstset = new TreeSet<Integer>();
	        
	        Set<Integer> cstsetCopy = new TreeSet<Integer>();
	      
	        cstset.add(1);
	        cstset.add(25);
	        cstset.add(35);
	        
	     
	        
	        System.out.println("--------------Out put -----------------");
	  

	        Iterator<Integer> it = cstset.iterator();
	        
	        while (it.hasNext())
	        {
	        	Integer cst = it.next();
	            System.out.println(cst.intValue());
	        }
	        
	        
	        cstsetCopy.addAll(cstset); // add all method 
	        
	        Iterator<Integer> itCopy = cstset.iterator();
	        while (itCopy.hasNext())
	        {
	        	Integer cst = itCopy.next();
	            System.out.println(cst.intValue());
	        }
	        
	        
	       
	        
	        
	    }
	  
	  

}
