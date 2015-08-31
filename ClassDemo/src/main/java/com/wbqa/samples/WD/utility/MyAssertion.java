package com.wbqa.samples.WD.utility;

import org.junit.Assert;
import org.testng.Reporter;

public class MyAssertion {
	
	

	public void verifyNotNull(Object obj,String msg){
		
		try{
			Assert.assertNotNull(obj);
		}
		catch(AssertionError e){
			Reporter.log(msg);
		}
	
		
	}
	public void verifyTrue(boolean condition,String msg){
	
		try{
			Assert.assertTrue(condition);
		}
		catch(AssertionError e){
			Reporter.log(msg);
		}
	}
}
