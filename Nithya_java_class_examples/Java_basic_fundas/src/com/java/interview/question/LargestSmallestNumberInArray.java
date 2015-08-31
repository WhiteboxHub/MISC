package com.java.interview.question;

public class LargestSmallestNumberInArray {

	
	  public static void main(String[] args) {
          
          //array of 10 numbers
          int numbers[] = new int[]{32,43,53,54,32,65,63,98,43,23};
         
          //assign first element of an array to largest and smallest
          int smallest = numbers[0]; // 32 
          int largetst = numbers[0]; // 32 
         
          for(int i=1; i< numbers.length; i++)
          {
                  if(numbers[i] > largetst) // 43 > 32 // 53 > 43 // 54 > 53 // 32 > 54 // 65 >54 // 63 > 65 // 98 > 65 // 43 > 98 // 23 > 98
                          largetst = numbers[i]; // 43 // 53 // 54 // 65 // 98 
                  else if (numbers[i] < smallest) // 32 < 32 // 63 < 32 // 43 < 32 // 23 < 32
                          smallest = numbers[i]; // 23
                 
          }
         
          System.out.println("Largest Number is : " + largetst);
          System.out.println("Smallest Number is : " + smallest);
  }
}