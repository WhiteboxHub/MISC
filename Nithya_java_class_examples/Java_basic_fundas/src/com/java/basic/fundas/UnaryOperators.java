package com.java.basic.fundas;

public class UnaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*	++
		--
		*=
		+=
		-=
		
		*/
		
		int i = 10 ; 
		
		int a = i++ ; // i = i+i;  a = 10 ; i = 11
		
		System.out.println("a= "+a + " i = " +i);
		
		int b = ++i; // i = 12 ; b = 12 
		
		
		System.out.println("b= "+b + " i = " +i);
		
		

		i+=12; // i = i+12
		
		 
		//Excercise 
		
		int z = 34 ; 
		
		int z1 = ++z; // 35
		
		int z2 = z++; // 35 ;z = 36
		
		int z3 = z+=4; // 36+4 = Z = 40 = z3
		
		System.out.println("z1 = " + z1);
		
		System.out.println("z2 = " + z2);
		
		System.out.println("z3 = " + z3);
		
	}

}
