package com.java.basic.fundas;

import java.io.*;
public class TestFileOutput
{
    public static void main (String[] args)
    {
    	
    	 String fileName = "C:/Users/Innovapath/Desktop/Nithya/testfile.txt";
       try
        {
          
            FileWriter fw = new FileWriter (fileName, true);
            fw.write("This is for todays class output2");
            fw.close();
        }
       catch (IOException e)
        {
           System.out.println("error: " + e.getMessage());
        }
    }
}