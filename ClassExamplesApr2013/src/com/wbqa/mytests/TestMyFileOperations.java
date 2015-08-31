package com.wbqa.mytests;

import java.io.File;
import java.io.ObjectOutputStream;

import com.wbqa.demo.MyFileOperations;
import com.wbqa.demo.Student;

public class TestMyFileOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pathname = "C:\\Users\\Shilpi\\SkyDrive\\training\\student.ser";
		File myFile = new File (pathname);
		MyFileOperations op = new MyFileOperations();
		Student s = new Student(1,"Sam",99.7);
		
	//	op.readAFileusingBS(myFile);
	//	op.readAFileusingCS(myFile);
	//	op.readAFileusingBuffS(myFile);
	//    op.readFromConsole();
	//	 op.writeToaFileusingBS(myFile);
	//	op.writetoaFileusingCS(myFile);
	//	op.createFile(pathname);
	//	op.createDir("C:\\Users\\Shilpi\\SkyDrive\\training\\demoDir");
        
	//	op.createObjectFile(myFile, s);
		op.readAnObject(myFile);
	}

}
