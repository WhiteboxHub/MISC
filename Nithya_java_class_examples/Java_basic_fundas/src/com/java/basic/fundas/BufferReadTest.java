package com.java.basic.fundas;


import java.io.*;
import java.util.*;

	class BufferReadTest
	{
	    public static void main (String[] args)
	    {
	        try
	        {
	            File tmpFileIn = new File ("C:/Users/Innovapath/Desktop/Nithya/TestOutput.txt");
	            BufferedReader br = new BufferedReader(new InputStreamReader(
	                                                new FileInputStream(tmpFileIn)));
	            String str = null;
	          
	            System.out.println("Data read from input file:");
	            while (( str=br.readLine() )!=null)
	            {	               
	                 System.out.println("Your Line : "+str);
	                 
	                 
	                StringTokenizer tokenizer = new StringTokenizer(str, " ");
	                 while(tokenizer.hasMoreTokens())
	                 {
	                	 System.out.println("your tokens : " +tokenizer.nextToken());
	                 }
	            }
	        br.close();
	    }
	    catch (IOException e) { System.out.println ("error: " + e); }
	    }
	}