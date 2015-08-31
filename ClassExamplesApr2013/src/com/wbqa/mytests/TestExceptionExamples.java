package com.wbqa.mytests;

import java.io.IOException;

import com.wbqa.demo.ExceptionsExamples;

public class TestExceptionExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args)  {
		
		ExceptionsExamples ex = new ExceptionsExamples();
/*	//	ex.nullpointerDemo("Shilpi");
		try{
		   ex.divisionByZero(0);
		   ex.nullpointerDemo(null);
		}
		catch(ArithmeticException e){
			System.out.println("Some Arithmetic error");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("The array index is out of bounds");
		}
		catch(NullPointerException e){
			
			System.out.println("Hey , you are passing Null somewhere!!");
		}
		catch(Exception e){
			System.out.println("Some Exception");
		}
		System.out.println("Here the program ends!!");
*/
     //   ex.readFile("C:\\Users\\Shilpi\\SkyDrive\\training\\abcDemo.txt");
		   ex.readFile("C:\\Users\\Shilpi1\\abcDemo.txt");
		/*	try {
			ex.readFile1("C:\\Users\\Shilpi\\SkyDrive\\training\\abcDemo.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ex.processAge(-2);
		*/
	}
	
}