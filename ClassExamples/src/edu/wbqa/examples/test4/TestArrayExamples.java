package edu.wbqa.examples.test4;


import static org.junit.Assert.*;


import java.util.Arrays;
import java.util.Collection;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import edu.wbqa.examples.nov2012.ArraysExamples;
import edu.wbqa.examples.nov2012.Author;

@RunWith(value = Parameterized.class)
public class TestArrayExamples {
	
	int x;
	boolean ret;
	Author a ;
	String email;
	boolean ret1;
	
	public TestArrayExamples(int x , boolean ret , Author a , String email,boolean ret1 ){
		this.x = x;
		this.ret = ret;
		this.a = a;
		this.email = email;
		this.ret1 = ret1;
	}

	@Test
	public void testIsPrime(){
		boolean actual = ArraysExamples.isPrime(x);
		assertEquals(ret , actual);
		
	}
	
	@Parameters
	public static Collection data(){
		Object[][] obj = {
				{23 , true},
				{24 , false},
				{19 , true},
				{0 , false}
		};
		return Arrays.asList(obj);
	}
	
	@Parameters
	public static Collection data1(){
		Author a1 = new Author("Shilpi@test.com","Jain","Shilpi",'F');
		Author a2 = new Author("Shilpi@test.com","Jain","Shilpi",'F');
		Author a3 = new Author("Shilpi@test.com","Jain","Shilpi",'F');
		
		Object[][] obj = {
				{a1},
				{a2},
				{a3}
		};
		return Arrays.asList(obj);
	}
	
	@Test
	public void testAuthor(){
		a.toString();
	}
	
	@Parameters
	public static Collection data2(){
		Object[][] data = {
				{"13242552",true},
				{"fsfhg44h",false}
		};
		
		return Arrays.asList(data);
	}
	
	public void testAuthor1(){
		
		Author a1 = new Author(email,"Jain","Shilpi",'F');
		
	}
}
