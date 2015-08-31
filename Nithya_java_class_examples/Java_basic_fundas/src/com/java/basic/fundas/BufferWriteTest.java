package com.java.basic.fundas;


import java.io.*;
class BufferWriteTest
{
	public static void main (String[] args)
	{
		try
		{
			File tmpFile = new File ("C:/Users/Innovapath/Desktop/Nithya/TestOutput.txt");
			
		//	BufferedWriter bw1 = new BufferedWriter(new FileWriter(tmpFile.getPath()));
			
			//or
			
			BufferedWriter bw = new BufferedWriter(
					new OutputStreamWriter(new FileOutputStream(tmpFile.getPath(),true)));
			bw.write("  This is a test output using a BufferWriteTest");
			bw.close();
		}
		catch (IOException e) 
		{ 
			System.out.println ("error: " + e.getMessage());
		}
	}
}