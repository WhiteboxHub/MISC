package edu.wbqa.test4;

import org.junit.Test;
import static org.junit.Assert.*;

import edu.wbqa.examples.nov2012.StringExamples;

public class TestStringExamples {

	@Test
	public void testPrintWordsLengths(){
		String str ="Life is good";
		int []a = StringExamples.printWordsLengths(str);
		assertArrayEquals(new int[]{4,2,4} , a);
	}
}
