package com.java.basic.fundas;

public class ArithmeticOperatorsCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	+ - Additional 
		- subraction 
		* Multiplication 
		/ division - qutioent
		 
		%  Modulo operator - Reminder value 
*/
		
		int a = 10 , b = 20 ;
		int c = a + b ;
		//System.out.println("Addition = " + c);
		
		int s = a + b ; // Left Hand and Right hand operand 
		
		double i = 3/2; //No Casting 
		
		System.out.println("Double Value but with the decimal as 0 = "+ i);
		 
		double d = 3.0/2 ; //implicit Casting
		
		System.out.println("Double Value - Implicit Casting = "+ d);
		
		double d1 = (double)3/2 ; //Explicit Casting
		
		System.out.println("Double Value - Explicit Casting = "+ d1);

	}

}
