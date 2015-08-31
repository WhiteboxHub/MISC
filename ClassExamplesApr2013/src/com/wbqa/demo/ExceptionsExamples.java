package com.wbqa.demo;

import java.io.File;
import java.io.IOException;

public class ExceptionsExamples {

	
	public void nullpointerDemo(String str){
		
		int[] arr = {1 ,2 ,3};
		System.out.println(arr[4]);
	
		System.out.println(str.length());
	}
	
	public void divisionByZero(int n){
		
		int div = 10/n;
		System.out.println(div);
	}
	
	public int readFile(String filePath){
		int ret =-1 ;
		File myfile = new File(filePath);
		try {
			myfile.createNewFile();
			ret = 1;
		} catch (IOException e) {
			e.getMessage();
			e.printStackTrace();
			System.out.println("Some Exception in readFile method");
			System.out.println("The file is not found. Can't create new file");
			ret = -1;
		}
		// this block of code is always exceuted no matter the exception is created or not
		// is used to clean up the code
		// to close file handles
		// to close database connection pools
		finally{
			System.out.println("I have read the file");
			
		}
		return ret;
		
	}
    public void readFile1(String filePath) throws IOException, Exception{
		
		File myfile = new File(filePath);
		myfile.createNewFile();
	
	}
    
    public void processAge(int age){
    	if (age < 0)
			try {
				throw new MyCheckedException("Error in age:" + age);
			//	throw new NullPointerException();
			} catch (MyCheckedException e) {
			   
			   System.out.println("Please enter a positive age. "+ e.getMessage());
			}
    }
}
