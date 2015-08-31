package com.java.interview.question;

public class SwapNumbers {


   public static void main(String args[])
   {
	   
	   /*int a = 10;
	   int b = 20 ; 
	   int c = 0 ; 

	   a = b ; 
	   c= b ;
	   a = c ; */

      int x, y;
      x =10;
      y = 20;
 
      System.out.println("Before Swapping x = "+x+" y = "+y);
 
      x = x + y; // 10 + 20 = 30
      y = x - y; // 30 - 20  = 10 
      x = x - y; // 30 - 10 = 20 
 
      System.out.println("After Swapping x = "+x+ " y = "+y);
   }
}