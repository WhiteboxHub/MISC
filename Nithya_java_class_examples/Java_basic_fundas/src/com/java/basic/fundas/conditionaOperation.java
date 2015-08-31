package com.java.basic.fundas;

public class conditionaOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ?: this is same as if - else condition . by this we do in single statment .
		
		int a = 10 ; 
		//  valriable = Condition ? if its true return the valuehere : otherwiese retrun the value here.
		
		int result = a>5?a:5;
		
		
		System.out.println("The result is "+ result );
		
		int result1 ;
		
		if(a>5){
			result1 = a ;
		}else{
			result1 = 5 ;
		}
		
		System.out.println("The result1 = " + result1);
	}
	
	/*
	 * Exercise:

Define age as an integer variable with an initial value of 20, and tuition as a double-type variable.  Then, write an assignment statement for tuition 
using the ?: operator to represent the condition that tuition is free if age is more than 65; 
otherwise, the tuition is 100.0. 

Solution:

int age = 20;
double tuition;
tuition = age > 65 ? 0.0 : 100.0;
	 */

}
