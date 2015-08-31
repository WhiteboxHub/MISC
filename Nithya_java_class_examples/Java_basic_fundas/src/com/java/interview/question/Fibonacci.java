package com.java.interview.question;

public class Fibonacci {


	public static void main(String[] args) 
	{
		int prev, next, sum, n;
		prev= 1; next=1 ; 
		for(n=1;n<=10;n++)
		{
			System.out.println(prev); // 1  //  1 // 2  //3 // 5 // 
			
			sum=prev+next; // 2 // 1+2 = 3 // 2 + 3 = 5 // 3 + 5 = 8
			prev=next; // 1  // 2 // 3 // 5 
			next=sum; //  2 // 3 // 5 // 8
		}
	}
}


