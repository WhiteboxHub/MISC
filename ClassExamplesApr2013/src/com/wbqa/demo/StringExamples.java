package com.wbqa.demo;

import java.util.Arrays;

public class StringExamples {

	
	//this method returns the length of a string
	public int getLength(String str){
		int len = -1;
		if (str == null) 
			return len; // error code
		
		
		len = str.length();
		return len;
		
	}
	
	// this method reverses a string
	// str = "abc" , "cba"
	// char[] copyStr = { 'a' ,'b' ,'c'}
	public String reverseMe(String str){
	
		String retStr = null;
		
		char [] strArr = str.toCharArray();
	    // {'H','e','l','l','o'}
		int len = strArr.length;
		
		for (int i = 0 ; i<len/2 ; i++ ){
			char temp = strArr[i];
			strArr[i] = strArr[len-i-1 ];
			strArr[len-i-1] = temp;
		}
		
		
		retStr = String.valueOf(strArr);
		return retStr;
	}
	
	// this method counts the number of vowels in a STring
	// abcde = 2
	public int countVowels(String str){
		int count = 0;
		if (str == null ) return -1 ;
		for (int i =0 ; i < str.length() ; i++){
			char c = str.charAt(i);
			if ( c == 'a' || c == 'e' || c == 'i' || c =='o' || c=='u' ||
					c == 'A' || c== 'E' || c =='I' || c=='O' || c== 'U')
				count ++;
			
		}
		return count;
	
	}
	// this method prints all the occurences of a letter in a String
	// abca
	public void printAllIndexes(String str , char c){
		
		int sindex = 0;
	
		while (sindex != -1 ){
		    sindex = str.indexOf(c , sindex);
		    if ( sindex == - 1) break;
		    System.out.println(sindex);
		    sindex++;
		    
		}
	}
	// this method count the number of letters in each word of a sentence
	// string str ="This is nice"
	// 4 2 4
	public void countLettersinWords(String str){
		
		String[] words = str.split(" ");
		for (String x : words){
			System.out.print(x);
			System.out.println(x.length());
		}
	}
	
	
}
