package edu.wbqa.test;

import edu.wbqa.examples.nov2012.GradeSheet;
import edu.wbqa.examples.nov2012.Student;
import junit.framework.TestCase;

public class TestStudent extends TestCase {
	
	Student s , s1;
	GradeSheet sheet;

	public TestStudent(String string) {
		super(string);
	}
	public void setUp(){
		try {
		 sheet = new GradeSheet(50,70,90);
		assertNotNull(sheet);
		s1 = new Student(2 ,"Shilpi1" , "QA1" , sheet);
		assertNotNull(s1);
		}
		catch(Exception e){
			fail("Constructor 2 failed");
		}
	}
	public void testStudentCons1(){
		try{
		s = new Student(1 ,"Shilpi" , "QA");
		assertNotNull(s);
		}
		catch(Exception e){
			fail("Constructor 1 failed");
		}
	}
    
	public void testToString(){
		try{
		
		String str = s1.toString();
		assertTrue(str.contains("B"));
		}
		catch(Exception e){
			fail("ToString Method failed" + e.getMessage());
		}
	}
	
}
