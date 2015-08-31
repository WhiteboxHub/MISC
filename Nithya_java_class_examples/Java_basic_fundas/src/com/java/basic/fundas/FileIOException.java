package com.java.basic.fundas;

import java.io.*;
public class FileIOException {

	public static void main(String args[])
	{
		FileInputStream fis = null;
		try{
			
			
			fis = new FileInputStream("C:/Users/Innovapath/Documents/one.txt"); 
			
		}catch(FileNotFoundException fnfe){
			System.out.println("The specified file is not " +
					"present at the given path");
		}
		
		
		int k; 
		try{
			while(( k = fis.read() ) != -1) 
			{ 
				System.out.print((char)k); 
			} 
			fis.close(); 
		}catch(IOException ioe){
			System.out.println("I/O error occurred: "+ioe);
		}
	}
}