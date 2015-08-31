package edu.wbqa.examples.jan2013;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFileOperations {
	
	// for non character based file use 
	// use BufferedInputStream with FileInputStream
	//
	// this method reads a text file and prints the content on the console
	@SuppressWarnings("finally")
	public StringBuffer readAFile(File myfile){
		BufferedReader buff = null;
		StringBuffer filecontent = new StringBuffer();
		try {
			buff = new BufferedReader(new FileReader(myfile));
			String str ="";
			while ( (str = buff.readLine())!=null ){
			//	System.out.println(str);
				filecontent.append(str);
				filecontent.append("\n");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if ( buff!= null)
				try {
					buff.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			return filecontent;
		}
		
		
	}

	//this method creates a text file using Filewriter
	public FileWriter writeAFile(File myFile){
		
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			fw = new FileWriter(myFile);
			pw = new PrintWriter(fw);
			
		//	fw.write("Hi ! How are you? \n");
		//	fw.write("I am very good!");
			pw.println("Hi ! How are you?");
			pw.println("I am very good!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			 if (fw != null )
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 if (pw != null )
				pw.close();
		}
		return fw;
	}
	
	//this method would read bytes from keyboard and prints it on the console
	public String readFromStandardInput(){
		byte [] barr = new byte[1024];
		String str="";
		try {
			int x = System.in.read(barr);
			for (byte b : barr ){
				str += (char)b;
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				System.in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return str;
	}
	
	// this method creates a new file
	public boolean createFile(String path){
		boolean ret = false;
		File myFile = new File(path);
		try {
			if (myFile.exists())
			ret = myFile.createNewFile();
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
	}
	
	// this method creates a new directory
		public boolean createDir(String path){
			boolean ret = false;
			File myFile = new File(path);
			ret = myFile.mkdir();
			return ret;
		}
		
	//this method reads the number of characters in a file
      public int countChar(File myfile){
    	  
    	  StringBuffer str =  readAFile(myfile);
    	  return (str.length());
    	  
      }
      
      // this method reads the number of characters from the file
      public int countChar1(File myFile){
    	  
    	  int count = 0;
    	  FileReader fr = null;
    	  try {
			fr = new FileReader(myFile);
			int c ;
			while (  (c =fr.read())!= -1){
				count++;
				System.out.println((char)c);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  finally{
    		  try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	  }
    	  return count;
      }
}

