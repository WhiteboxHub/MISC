package com.java.basic.fundas;

public class HandleNullPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = null ; 

		try
		{

			System.out.println("The String lenght is " + str.length());// Null pointer Excpetions . 

		}
		catch(NullPointerException ne ){
						
			System.out.println("There is the Null Object , Please enter the value for str Object");
			ne.printStackTrace();		 // Used to print the description abouth the exceotions in the eeor consiole	
			
		}
		
		catch(ArrayIndexOutOfBoundsException ae ){
			
			System.out.println("There is the Null Object , Please enter the value for str Object");
		

		}
		catch(NumberFormatException ne ){
			
			System.out.println("There is the Null Object , Please enter the value for str Object");
		

		}
	}

}
