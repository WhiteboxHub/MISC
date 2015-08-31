package com.java.basic.fundas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExNullPointerException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = null ; 

		//System.out.println("Get the Lenght of the String"+str.length()); // Null pointer Excpetion . 


		//NumberFormat Exception

		String s = "ab";

		//int a = Integer.parseInt(s); // parsing the 12 String the out put would be 12 . 


		//System.out.println(Math.sqrt(a));


		// ArrayindexOut of bound Exception " 

		int arr[] = { 12 , 23,32} ;


		System.out.println("Array length = " +arr.length);
		for(int i = 0 ; i < arr.length;i++){

			System.out.println(arr[i]);

			//System.out.println(arr[3]);
		}


	/*	//FileNotFoundException 

		FileInputStream fis = null;

		fis = new FileInputStream("C:/Users/Innovapath/Documents/one.txt"); 

		int k; 

		fis.close(); 
		while(( k = fis.read() ) != -1) 
		{ 
			System.out.print((char)k); 
		} 
		*/


	}
}
