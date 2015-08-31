package com.java.basic.fundas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class ListStringIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    List<String> cstList = new ArrayList<String>();
        cstList.add("Java");
        cstList.add("Programing");
        cstList.add("Welcomes you all ");
        cstList.add("For Testing ");

      
        Iterator<String> it = cstList.iterator(); // Iterator 
        while (it.hasNext())
        {
            String cst = it.next();
            System.out.println("Your List Contains = "+cst);
        }
        
       Object[] s =  cstList.toArray(); // Converting list to Array !!! 
       
       for(int i = 0 ; i<s.length ;i++){
    	   System.out.println("For Content " + s[i].toString());
       }
       
       //Sorting the Array
       Arrays.sort(s);
       for(int i = 0 ; i<s.length ;i++){
    	   System.out.println("For Content after Sorting Arrays " + s[i].toString());
       }
        
    }

	}


