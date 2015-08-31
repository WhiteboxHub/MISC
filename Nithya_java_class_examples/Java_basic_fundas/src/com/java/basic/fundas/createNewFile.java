package com.java.basic.fundas;

import java.io.*;

public class createNewFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		    File tmpFile = new File("C:/Users/Innovapath/Desktop/Nithya/TestNewfile1.txt");
		    tmpFile.createNewFile();
		    FileWriter fw = new FileWriter(tmpFile.getPath(), true);
		    fw.write("This is a test 12121245478787  new things ");
		    fw.close();
		}catch(IOException io){
			System.out.println("Exception");
		}
	}

}
