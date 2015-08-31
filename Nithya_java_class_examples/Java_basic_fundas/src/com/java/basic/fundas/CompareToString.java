package com.java.basic.fundas;

public class CompareToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s3 = "Hello World";
		String s4 = "Hello";
		
		  String s = new String("being");  
          String s1 = new String("beingjava");  
          String s2 = new String("beingjavaguys");  

         System.out.println( s.compareTo(s1)); // -4  
         System.out.println(s1.compareTo(s2)); // -4  
         System.out.println(s2.compareTo(s)); // 8  
         
         System.out.println(s3.compareTo(s4)); // 6 // returns the  integer .  
         
         System.out.println(s3.compareTo(s3)); // 0 
         
         s.equals("s"); // Equals will check the equaility of the two strings and returns the boolean result.
         
 
	}

}
