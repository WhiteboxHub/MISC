package edu.wbqa.examples.nov2012;

import java.text.SimpleDateFormat;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public class CommandLineExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// This is a test script 
		// we need to log in the details of the time  and date the test is executed
		
		// abstract class
	//	Calendar cal = Calendar.getInstance();
		
	/*	GregorianCalendar cal = new GregorianCalendar();
			
		Date today = cal.getTime();
		SimpleDateFormat d = new SimpleDateFormat("hh:mm:ss MM/dd/yy");
		d.format(today);
		System.out.println("Starting time of the script : " + d.format(today));
		
*/		//Gregorian Calendar
	
		// can be used to generate some random/dummy test data
		Random  r = new Random();
		for (int i = 0 ;  i <10  ;i++){
			System.out.println("Email Address : wbqa" + r.nextInt() + "@gmail.com");
		}
		
	}

}
