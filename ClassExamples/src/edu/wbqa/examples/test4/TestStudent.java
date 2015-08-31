package edu.wbqa.examples.test4;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;
import edu.wbqa.examples.nov2012.GradeSheet;
import edu.wbqa.examples.nov2012.Student;

public class TestStudent {

	Student s , s1;
	GradeSheet sheet ;
	
	@Before
	public void setUp(){
		s =  new Student(1,"Shilpi","QA Training");
		sheet = new GradeSheet(50,70,90);
		s1 = new Student(1,"Shilpi","QA Training",sheet);
	}
	
	@Ignore
	@Test
	public void testConst1(){
		assertNotNull(s);
	}
	
	@Test
	public void testConst2(){
	
		assertNotNull(sheet);
		assertNotNull(s);
	}
	@Test
	public void testToString(){
		String actualStr = s1.toString();
		
		assertTrue(actualStr.contains("Shilpi"));
	}
	
	@Test(expected=Exception.class)
	public void testCreateStudent(){
		try{
		  s.createStudent(null);
		  fail("Failed to throw exception");
		}
		catch(Exception e){
			
		}
	}
	
	@After
	public void tearDown(){
		// to clear test data
	}
}
