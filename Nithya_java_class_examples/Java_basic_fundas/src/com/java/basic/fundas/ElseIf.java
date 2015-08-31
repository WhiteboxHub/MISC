package com.java.basic.fundas;

public class ElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int age = 24 ; 
		boolean done = true ; 
		
		System.out.println("The Program Starts ");
		
		if(age<=25 && age==25){
			
			System.out.println("You are qualified");
		}
		else if(age >=25 ){
			System.out.println("You are qualified though");
		}
		else{
			System.out.println("You are Not Qualified");
		}
		
		System.out.println("The Program Ends ");

		if(!done){
			System.out.println("True");
		}

	}

}
