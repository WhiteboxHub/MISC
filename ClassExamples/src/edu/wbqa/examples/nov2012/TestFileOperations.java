package edu.wbqa.examples.nov2012;

import java.io.File;

public class TestFileOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        // absolute
		String path = "C:\\Users\\Shilpi\\SkyDrive\\training\\test2.txt";
		File myFile = new File(path);
/*		FileOperations.readFromAFileUsingByteStream(myFile);
		FileOperations.readFromAFileUsingCharacterStream(myFile);
		FileOperations.readAFileusingBufferedReader(myFile);
		FileOperations.readFileUsingBufferedByteStream(myFile);*/
	//   FileOperations.createFile(path);
	//	System.out.println("\nNumber of characters in the file are " + FileOperations.countCharinFile(myFile, 'i'));
	//	System.out.println("\n Number of Occurences = " + FileOperations.countStringinFile(myFile, "is"));
	//	FileOperations.writeToCharacterStream(myFile);
	//	FileOperations.readFromConsole();
	//	FileOperations.createStudent(myFile);
		FileOperations.readStudent(myFile);

	}

}
