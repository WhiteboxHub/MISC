package com.wbqa.mytests;

import com.wbqa.demo.StringExamples;

public class TestStringExamples {

public static void main(String[] args)	{
	
	StringExamples ex = new StringExamples();
	String str = "Hello World !";
	
	String str1 = null;
	
	int strlen = ex.getLength(str1);
	System.out.println("String length = " + strlen);
	
	String reverseStr = ex.reverseMe(str);
	System.out.println("Reversed String = " + reverseStr);
	
	int vowelCount = ex.countVowels("Hello");
	System.out.println("No. of vowels  = " + vowelCount) ;
	
	//immutable
	String str11 = "Hello";
	System.out.println(str11.concat("World"));
	System.out.println(str11);
	
	//mutable // thread safe // synchronized
	StringBuffer buff =  new StringBuffer("Hello");
	System.out.println(buff.append("World"));
	System.out.println(buff);
	
	// StringBuilder are not thread safe 
	// mutable
	String x = "Life is beautiful";
	System.out.println(x.contains("is1"));
	
	System.out.println(x.startsWith("Life1"));
	
//	System.out.println(x.hashCode());
	
	str1 ="Hello";
	String str2 = new String("Hello");
	System.out.println(str1.hashCode());
	System.out.println(str2.hashCode());
	
    // checks for content equality
	if ( str1.equals(str2)) 
		System.out.println("Both strings values are equal");
	
	// check for reference equality
	if (str1 == str2)
		System.out.println("Both string objects are same");
	
	int index = "Hello".indexOf('u');
	int index1 = "Hello World!".indexOf("ello");
	
	int index2 = "Hello World".indexOf('o',6 );
	System.out.println(index);
	
	ex.printAllIndexes("abcaaa90aa", 'a');
	System.out.println("----------------");
	ex.countLettersinWords("This is nice");
	
	System.out.println("Hello World".substring(3, 7));
	System.out.println("Hello World".substring(3));
	
	
	
    }
}
