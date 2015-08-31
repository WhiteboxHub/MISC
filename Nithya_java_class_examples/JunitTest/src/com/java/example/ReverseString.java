package com.java.example;

import java.util.Scanner;

public class ReverseString {


	public static void main(String args[])
	{

		ReverseString rev = new ReverseString();
		String original, reverse = "";
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a string to reverse");
		original = in.nextLine();


		reverse = rev.reverseAString(original);

		System.out.println("Reverse of entered string is: "+reverse);
	}

	public  String reverseAString(String original){

		String rev = "" ; 
		int length = original.length();

		for ( int i = length - 1 ; i >= 0 ; i-- ){
			rev = rev + original.charAt(i);//o//o+l//ol+l//oll+e//olle+h//olleh//
		}
		System.out.println("Reverse of entered string is: "+rev);
		return rev ; 
	}
}