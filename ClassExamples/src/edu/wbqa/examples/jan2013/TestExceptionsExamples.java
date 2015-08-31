package edu.wbqa.examples.jan2013;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestExceptionsExamples {

	/**
	 * @param args
	 * @throws Exception 
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
		// TODO Auto-generated method stub
		
		ExceptionsExamples ex = new ExceptionsExamples();
	//	ex.badArray();
	//	ex.somemethod();
	//	ex.badString();
		ex.badMaths();
		/*String str =null;
		try {
			 str = ex.badIO();
		     System.out.println(str);
	//	     int [] arr = new int[] {};
	//	     System.out.println(arr.length);
		}
		catch (NullPointerException e){
			System.out.println("String is null. Handle this. the program continues without string");
		    str ="gjsgjd";
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Arrays Exception");
		}
		catch (Exception e){
		   System.out.println("Some Exception");	
		}
		finally {
			System.out.println("This is always executed");
		}
	*/	
	
		String url ="www.whiteboxqa.co";
		
		if (!url.endsWith(".com"))
			throw new BadUrlException(".com not found");
		
        System.out.println("The program continues");
	}

}
