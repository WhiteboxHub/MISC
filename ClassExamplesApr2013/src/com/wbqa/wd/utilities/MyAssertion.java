package com.wbqa.wd.utilities;

import org.testng.Assert;
import org.testng.Reporter;

public class MyAssertion {

	public void verifyTrue(boolean condition,String message){
		
		try{
			Assert.assertTrue(condition);
			
		}
		catch(AssertionError e){
			Reporter.log(message);
		    Assert.fail(message);
		}
		
	}
}
