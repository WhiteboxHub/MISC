package edu.wbqa.examples.june2012;
import java.io.*;

public class FileIO {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        
		File myFile = new File("c:\\training");
		String [] files = myFile.list();
		for ( String x : files){
			System.out.println(x);
		}
		
//		writeToFile("This is a test File","c:\\training\\test.txt");
//		readFromFile("c:\\training\\test.txt");
//		writeCharToFile("\nThis is appended data","c:\\training\\test1.txt");
//		readFromTextFile(myFile);
	}
	// This method writes bytes to a text file
   public static void writeToFile(String str,String filePath) throws FileNotFoundException,IOException{
	   
	   
	   FileOutputStream output = new FileOutputStream(filePath);
	   PrintStream ps = new PrintStream(output);
	   ps.print(str);
	   ps.close();
	  
	   output.close();
   }
   // This method reads bytes from a text file
   public static void readFromFile(String filePath) throws IOException{
	   
	   StringBuffer strBuff = new StringBuffer("");
	   FileInputStream input = new FileInputStream(filePath);
	   int ch =0;
	   while ( (ch = input.read()) != -1){
		   strBuff.append((char)ch);
	   }
	   System.out.println("The file " + filePath + "contains following text : \n");
	   System.out.println(strBuff);
	   
   }
   //This method writes characters to a text file
   public static void writeCharToFile(String str,String filePath) throws FileNotFoundException,IOException{
	   
	   FileWriter fw =  new FileWriter(filePath,true);
	   fw.write(str);
	   fw.close();
   }
   // This method reads characters from a text file
   public static void readFromTextFile(File filePath) throws IOException {
	   
	   StringBuffer strBuff = new StringBuffer("");
	   int ch=0;
	   FileReader fr = new FileReader(filePath);
	   
	   while ((ch=fr.read())!=-1) {
		   strBuff.append((char)ch);
	   }
	   
	   fr.close();
	   
	   System.out.println("This text file contains following data\n" + strBuff);
	   
   }
}
