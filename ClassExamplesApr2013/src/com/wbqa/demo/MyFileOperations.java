package com.wbqa.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class MyFileOperations {

	// serialisation
	public void createObjectFile(File myFile , Student s){
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream(myFile));
			out.writeObject(s);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if (out!=null)
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	// deserialisation
	public void readAnObject(File myFile){
		ObjectInputStream in = null;
		try {
			in =  new ObjectInputStream(new FileInputStream(myFile));
			Student s = (Student) in.readObject();
			System.out.println("Student id: " + s.getsId());
			System.out.println("Student name: " + s.getName());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if (in!=null)
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
	// this method reads a txt file using byte stream
	public void readAFileusingBS(File myFile){
		InputStream in = null;
		try {
			 long startTime = System.nanoTime();
			  in = new FileInputStream(myFile);
			int c;
			//EOF is marked by -1
			while ( (c=in.read())!= -1){
				char ch = (char)c;
				System.out.print(ch);
			}
            long endTime = System.nanoTime();
    		System.out.println("\nTotal time taken =" + (endTime - startTime)/100000.0);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		finally{
			if (in != null){
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}
	public void readAFileusingCS(File myFile){
		FileReader fr = null;
		try {
			long startTime = System.nanoTime();
			fr = new FileReader(myFile);
			int c;
			//EOF is marked by -1
			while ( (c=fr.read())!= -1){
				char ch = (char)c;
				System.out.print(ch);
			}
			long endTime = System.nanoTime();
			System.out.println("\nTotal time taken =" + (endTime - startTime)/100000.0);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if (fr!=null){
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	// using Buffered Stream API with Character Stream
	public void readAFileusingBuffS(File myFile){
		
		BufferedReader buff = null;
		String str;
		try {
			long startTime = System.nanoTime();
			buff = new BufferedReader(new FileReader(myFile) );
			while ( (str = buff.readLine())!= null){
				System.out.println(str);
			}
			long endTime = System.nanoTime();
			System.out.println("\nTotal time taken =" + (endTime - startTime)/100000.0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if (buff!=null)
				try {
					buff.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
	
	public void readFromConsole(){
		// Scanner is an API to read and write primitive data types
		Scanner s = new Scanner(System.in);
		System.out.println("What is your age");
		
		while (s.hasNext()){
			int x = s.nextInt();
			System.out.println("My age is " + x);
		    System.out.println("What is your name?");
		    String name = s.next();
		    System.out.println("Welcome " + name);
		}
		
	}
	
	public void createFile(String pathname){
		
		File myFile = new File(pathname);
		try {
			if (myFile.createNewFile())
				System.out.println("The file has been created");
			else
				System.out.println("The file can't be created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void createDir(String pathname){
		
		File myDir = new File(pathname);
		if (myDir.mkdir())
			System.out.println("The dir is created");
		else
			System.out.println("The dir can't be created");
		
		
	}
	// this method writes on to afile using Byte stream
	// not effecient way to create character streams
	public void writeToaFileusingBS(File myFile){
		OutputStream out = null;
		try {
			 out = new FileOutputStream(myFile);
			out.write('c');
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if (out!=null)
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	public void writetoaFileusingCS(File myFile){
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			 fw = new FileWriter(myFile);
			  pw = new PrintWriter(fw);
		//	fw.write("Hello World");
			 pw.println("My String");
			 pw.println(1234);
			 pw.println(23.5);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			pw.close();
			if (fw!=null)
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
