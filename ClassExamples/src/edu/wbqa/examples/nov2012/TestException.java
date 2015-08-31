package edu.wbqa.examples.nov2012;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		try {
			String url = readAFile();
			if (!url.endsWith(".com"))
				throw new BadUrlException("Invalid domain name");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BadUrlException e){
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	//	divideByZero();
	}
    public static void check(){
    	   int[] arr = {1 ,2 ,3};
           System.out.println(arr[4]);
    }
    public static void nullString(){
    	String str = null;
    	System.out.println(str.length());
    }
    public static void divideByZero(){
   try{
    	int x = 100;
    	int y = 0;
    	System.out.println(x/y);
   }
   finally{
	   
   }
     }
    public static String readAFile() throws FileNotFoundException ,IOException,Exception{
    	BufferedReader bf = null;
    	String url = null;
    		
			bf = new BufferedReader(new FileReader("C:\\Users\\Shilpi\\SkyDrive\\training\\log.txt"));
			String str = null;
			str = bf.readLine();
			url = String.valueOf(str);
			System.out.println(str.length());
			while ( (str = bf.readLine())!= null)
				System.out.println(str);
			
	
			bf.close();
			return url;
		 
   
    
    }
}
