package com.java.basic.fundas;

import java.util.*;

public class TestCustomerList {

	  public static void main(String[] args)
	    {
	        List<Customer> cstList = new ArrayList<Customer>();
	        
	        cstList.add(new Customer("John", "Smith", 30));
	        cstList.add(new Customer("Judy", "Miller", 25));
	        cstList.add(new Customer("Neil", "Armstrong", 27));

	        System.out.println("-------------------------------");
	        System.out.println(" Name  EmpId");
	        System.out.println("-------------------------------");

	       Iterator<Customer> it = cstList.iterator();
	        while (it.hasNext())
	        {
	        	//cstList.remove(0);//(new Customer("John", "Smith", 30));//concurrent modification exception
	            Customer cst = it.next();
	            System.out.println("Iterator" + cst.getFristName() + " " + cst.getEmpId());
	            
	        }
	        
	        ListIterator<Customer> itList = cstList.listIterator();
	        while(itList.hasNext())
	        	
	        	System.out.println("Forward Directions " + itList.next().getFristName() );

	        while (itList.hasPrevious())
	        {
	        	
	        	itList.set(new Customer("John1", "Smith1", 301) );// replaces the currect element returned by previous or next() .
	        	//itList.add(new Customer("John3", "Smith1", 301));
	        	itList.remove(); // Modifications are acceptable even if we are  iterating it .
	            Customer cst1 = itList.previous();
	            
	            System.out.println("Reverse === " + cst1.getFristName() );
	        }
	    }
	  
	  

}
