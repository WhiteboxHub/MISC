package com.java.basic.fundas;

public class HandleNumberFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ab";

		try{ // there should be only one try block and many catch block consiqutivley . & like this we can have may try-catch block in a single program.
			int a = Integer.parseInt(s); // parsing the 12 String the out put would be 12 . 

			System.out.println(Math.sqrt(a));
		}
		catch(NumberFormatException nfe){

			System.out.println("Please Enter the Number Format:");
			return; // Though there is the return statement , Finaaly will be exceuted after completing the finally block statements the return will be excuted.

		}
		finally{ 
			// You can always rite try-finally block alone ny ignoring the catch block that will also work . But You cannot have try alone . 
			
			System.out.println("The Program End "); // Immate
			//rial of whether the exception has occurned or not , the finally block will get exceuted.
			
			// Finaly is mainly used for the purpose like Closing the database connections or close the files or clearing the memory . 
		}

	}

}
