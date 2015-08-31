package edu.wbqa.examples.jan2013;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionsExamples {
	
	
	public void somemethod(){
		badArray();
	}
	//ArrayIndexOutOfBoundsException
	public void badArray(){
		
		int [] arr = new int[] {23 , -45, 100};
		System.out.println(arr[3]);
	}
    // NullPointerException
	public void badString() {
	try{
		String str = null;
		System.out.println(str.length());
	}
	catch(NullPointerException e){
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	}
	// ArithmeticException
	public void badMaths() throws FileNotFoundException , IOException , Exception{
		System.out.println(34/0);
	
	}
	//
	@SuppressWarnings("finally")
	public String badIO() {
		FileReader fr = null;
		String str = null;
	try {	
		
		File myFile = new File("C:\\Users\\Shilpi\\SkyDrive\\training\\abc.txt");
		fr  = new FileReader(myFile);
		if (fr == null)
			throw new FileNotFoundException();
		myFile.createNewFile();
		
		
//		return "I am in try"; // Bad statement to write return in try block
	}
	catch (FileNotFoundException e){
		
	}
	catch (IOException e){
		
	}
	catch (Exception e){
		
	}
	finally {
		if ( fr!= null )
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//		return "I am in catch";
	}
	
	return "I am outside";
	
	}
}
