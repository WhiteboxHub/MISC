package edu.wbqa.examples.nov2012;

import java.io.BufferedInputStream;
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
import java.io.PrintWriter;
import java.util.Scanner;

public class FileOperations {

	// This methods saves the object of Student class
	//this is serilaisation
	public static void createStudent(File myFile){
		Student s1 = new Student(1101,"Shilpi","QA Training");
		try{
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(myFile));
		out.writeObject(s1);
		out.close();
		}
		catch(Exception e){
			
		}
	}
	// deserialisation
	// This method reads the objects from a file
	public static void readStudent(File myFile){
		try {
		ObjectInputStream in = new ObjectInputStream (new FileInputStream(myFile));
		Student s ;
		s = (Student)in.readObject();
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getCourseId());
		in.close();
		}
		catch(Exception e){
			
		}
		
	}
	// This method reads data using byte stream.
	public static void readFromAFileUsingByteStream(File myFile){
		
		try {
			InputStream in = new FileInputStream(myFile);
			int c ;
			long stime = System.nanoTime();
			while ( (c=in.read())!= -1){
		//		System.out.print((char)c); // explicit casting
			}
			in.close();
			long etime = System.nanoTime();
			System.out.println("\nTotal time taken for ByteStream :" + (etime - stime)/100000.0 + " ms");
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	// This method reads data from a file using character stream
	public static void readFromAFileUsingCharacterStream(File myFile){
		try {
			FileReader fr = new FileReader(myFile);
			int c ;
			
			long stime = System.nanoTime();
			while ( (c = fr.read()) != - 1){
			//	System.out.print((char)c);
			}
			fr.close();
			long etime = System.nanoTime();
			System.out.println("\nTotal time taken for CharacterStream :" + (etime - stime)/100000.0 + " ms");
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	// this method reads a file using bufferedReader
	public static void readAFileusingBufferedReader(File myFile){
		
		try {
			BufferedReader buff = new BufferedReader ( new FileReader (myFile));
			String str ;
			
			long stime = System.nanoTime();
			while ( ( str = buff.readLine())!= null){
				System.out.println(str);
			}
			buff.close();
			long etime = System.nanoTime();
			System.out.println("\nTotal time taken for BufferedStream :" + (etime - stime)/100000.0 + " ms");
	
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	// this method counts the number of a particular character in a file
	public static int countCharinFile(File myFile , char ch){
		
		BufferedReader buff = null;
		int count = 0;
		int c  ;
		try{
			 buff =	new BufferedReader(new FileReader(myFile));
		
		while ( (c = buff.read())!= - 1){
			System.out.print((char)c);
			if ( c == ch) count ++;
		}
		buff.close();
		}
		catch (IOException e){
			System.out.println("Some file operation failed!!");
		}
		return count;
	}
	
	// this method counts the occurrence of a string in a file
	public static int countStringinFile(File myFile , String str){
		int count = 0;
		BufferedReader buff = null;
		try{
			buff = new BufferedReader(new FileReader(myFile));
			String line = null;
			while (( line = buff.readLine())!=null){
				int ret = 0;
				int index = 0;
				while (ret >= 0){
					ret = line.indexOf(str,index);
					if (ret < 0 ) break;
					index = ret + str.length();
					count ++;
				}
			}
			buff.close();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
		return count;
		
	}
	
	
	public static void readFileUsingBufferedByteStream(File myFile){
		BufferedInputStream in = null;
		try {
			in = new BufferedInputStream(new FileInputStream(myFile));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		int c ;
		byte[] arr = new byte[1024];
		long stime = System.nanoTime();
		try {
			while ((c = in.read(arr))!= -1){
		//		System.out.println(new String(arr));
			}
			in.close();
			long etime = System.nanoTime();
			System.out.println("\nTotal time taken for BufferedInputStream :" + (etime - stime)/100000.0 + " ms");
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void createFile(String path){
		
		File myFile = new File(path);
		if (myFile.mkdir())
			System.out.println("Directory is created");
		else
			System.out.println("There is some error");
		
	}
	
	public static void writeToCharacterStream(File myFile){
		FileWriter fw = null;
		PrintWriter pw = null;
		try{
		 fw = new FileWriter(myFile,true);
		 pw = new PrintWriter(fw);
		pw.println("This is a new line");
		pw.println("This is the second line");
	
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		finally{
			if ( pw != null)
			pw.close();
			if ( fw!= null)
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	// this method reads data from the console and write it into a file
	public static void readFromConsole(){
		
		try {
		Scanner in = new Scanner(System.in);
		
		FileWriter fw = new FileWriter("C:\\Users\\Shilpi\\SkyDrive\\training\\names.txt");
		PrintWriter pw = new PrintWriter(fw);
		
		for (int i = 0 ; i < 2 ; i++) {
		System.out.print("Enter your ID:");
		int id = in.nextInt();
		System.out.println("Enter your name");
		String name = in.next();
		pw.print(id);
		pw.print(" ");
		pw.println(name);
		}
		in.close();
		pw.close();
		fw.close();
		}
		catch(IOException e){
			
		}
		
	}
}
