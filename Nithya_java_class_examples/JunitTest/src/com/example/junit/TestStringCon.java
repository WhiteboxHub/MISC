package com.example.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.java.example.StringCon;

public class TestStringCon  {

	@Test
	public void stringcon() {
		
		StringCon sc = new StringCon();
		String actual = "";
		
		//try{
		
		actual= sc.getConcatString( "Hello", "World");
		
		
		//actual = null;
		//System.out.println(actual.length());
		//}catch(NullPointerException ne){
		//	System.out.println("Its Null");
		//}
		
		
		
		String Expected = "HelloWorld";
		
		assertEquals(Expected, actual);// Failure - Our assertions fails . Means ,  actual is not equal to the Excepted : Color blue
	}
	
	@Test(expected=NullPointerException.class)
	public void testNull(){
		
		String str = null ; 
		str.length(); // Junit Error , Means its becasuse of the error we made in writing the script or testcase : Color red .
		
		
	}

	
	//Success means Green Color
}
