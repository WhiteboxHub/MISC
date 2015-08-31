package com.java.interview.question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCount {
	
	public static void main(String args[]){
		
		//System.out.println("Please enter the filename: ");
	  //  Scanner input = new Scanner(System.in);
	    
	    String fileName = "C:/Users/Innovapath/Desktop/Nithya/testfile.txt";
	    
	     FileReader fReader;
	   //  FileWriter fW;
	        try {
	            fReader = new FileReader(fileName);
	            BufferedReader reader = new BufferedReader(fReader);
	            BufferedWriter out = new BufferedWriter(new FileWriter(fileName,true));

	            String cursor; // 
	            String content = "";
	            int lines = 0;
	            int words = 0;
	            int chars = 0;
	            String searchWord = "Good";
	       
	            int searchOccurence = 0;
	            while((cursor = reader.readLine()) != null){
	                // count lines
	                lines += 1;
	                content += cursor;
	                
	                // count words
	                String []_words = cursor.split(" ");
	                for( String w : _words) // w = _words[1], sTring w : means int i = 0
	                {
	                  words++;  
	                  if(w.equalsIgnoreCase(searchWord)){ // Search a String in file 
	                	  
	                	  searchOccurence++;
	                	 
	                  }
	                 
	                }
	                
	            }
	            chars = content.length();
	            
	            System.out.println("File " + fileName + " has ");
	            System.out.println(chars + " Characters,");
	            System.out.println(words + " words and " + lines + " lines.");
	            System.out.println(searchOccurence + " search Occurence ");
	            
	            
	        } catch (FileNotFoundException ex) {
	           // Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
	            System.out.println("File not found!");
	        } catch (IOException ex) {
	            //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
	             System.out.println("An error has occured: " + ex.getMessage());
	        }
	}
}