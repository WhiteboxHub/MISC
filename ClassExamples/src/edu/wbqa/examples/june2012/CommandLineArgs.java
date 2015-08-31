package edu.wbqa.examples.june2012;

import java.io.*;
import java.util.Enumeration;
import java.util.Properties;

public class CommandLineArgs {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		
	//	 System.out.println(System.getenv("OS") + "\n" +   System.getenv("PATH"));
    /*   
		 Properties myPropList = new Properties();
		 
		 myPropList.setProperty("EmailId", "www.demo.yahoo.com");
		 myPropList.setProperty("uri", "whiteboxqa.com");
		 
		 FileOutputStream fso = new FileOutputStream("c:\\training\\myPropList.txt");
		 PrintStream ps = new PrintStream(fso);
			 
		 myPropList.store(ps, "This is my property List");
		 
		 ps.close();
		 fso.close();
	*/	 
		 Properties wbqaList = new Properties();
		 InputStream input = new FileInputStream("c:\\training\\myPropList.txt");
		 wbqaList.load(input);
		 Enumeration<Object> list = wbqaList.keys();
		 
		 while (list.hasMoreElements()) {
			 System.out.println(list.nextElement());
		 }
		 
	//	 String uri = wbqaList.get("uri").toString();
		 
	//	 System.out.println(uri);
		 
		 
	}

}
