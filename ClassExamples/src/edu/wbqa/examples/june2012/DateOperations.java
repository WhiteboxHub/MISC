package edu.wbqa.examples.june2012;

import java.util.Calendar;
import java.util.Random;
import java.util.StringTokenizer;

public class DateOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   /*      
		Calendar cal = Calendar.getInstance();
		long t1 =  cal.getTimeInMillis();
		System.out.println("Time at Beginning " + t1);
	
		for ( int i = 0 ; i< 10000; i++)
		{
			
			int x  = 100;
		}
	*/
		StringTokenizer str = new StringTokenizer("This is a test");
		
		System.out.println(str.countTokens());
		
		while ( str.hasMoreTokens()) {
			System.out.println(str.nextToken());
		}
		Random random = new Random();
		
		
		
		
	}

}
