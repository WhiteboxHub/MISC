package com.java.basic.fundas;

import java.io.IOException;

	class ReadSystem
	{
	    public static void main(String[] args)
	    {
	        System.out.print("Enter Last Name: ");
	       // byte[] b = new byte[100];
	        try
	        {
	        	
	        	
	             System.in.read();// return int .

	     //       String str = new String(b);
	           // System.out.println("Value entered was: " + str );
	        }
	        catch (IOException e) {}
	    }
	}