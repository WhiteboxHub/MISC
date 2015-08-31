package edu.wbqa.examples.june2012;

import java.awt.Point;
import java.io.*;

public class SystemIO {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
	/*	
		StringBuffer strBuff = new StringBuffer("");
		String strName = "";
		String strCity = "";
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
	/*	while ( (str = buff.readLine())!= null) {
			strBuff.append(str);
		}
     
		 System.out.println("What is your name?\n");
		 strName = buff.readLine();
		 System.out.println("What is your city?\n");
		 strCity = buff.readLine();
		 
		 buff.close();
        
		System.out.println("You have entered your name as " + strName);
		System.out.println("You have entered your city as " + strCity);
		if (!strCity.endsWith("Fremont"))
			System.err.println("You have entered wrong city name");
*/		
		int x = 34;
		double y = 23.4D;
		boolean b = true;
		Point p = new Point(0,1);
		System.out.print("Integer:" + x + " Double:" + y + " Boolean:" + b + "\n");
		System.out.println(p);
	}

}
