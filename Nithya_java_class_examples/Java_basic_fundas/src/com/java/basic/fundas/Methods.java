package com.java.basic.fundas;

public class Methods {

	static int classvara = 10 ; // Class level Varibale . Can be used any where inside the class . out side any method 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printHello();
		
		int a = 10 , b = 20 ; // local variable or method level 
		
		int sumValue = add(); // Method Calling 
		
		System.out.println("Sum with out Parameters= "+sumValue);
		
		classvara = classvara+10;
		
		System.out.println("In the Main Method after changing the value by 10 " + classvara);
		
		int sumValuebyPara = addbyParameters(a,b);
		System.out.println("Sum with Method Parameters = "+sumValuebyPara);
	}
	
	
	static void printHello(){
		
		System.out.println("Hello World");
		
		
	}
	
	static int add(){ // method definition , bec I m writing/defining what that mothod is going to do for us .
		
		int a = 10 ; // local variable which is accessed only inside this methd and canot be accessed from any other methods.
		int b = 20 ; 
		int sum = a +b ;
		
		return sum; // return the value .
		
	}


	static int addbyParameters(int a1 , int b1){
		
		 
		int sum = a1 + b1 ;
		System.out.println("In the addbyParameters Method  " + classvara);

		return sum; // return the value .
		
	}
}
