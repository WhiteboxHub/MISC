package edu.wbqa.examples.nov2012;

import java.util.Arrays;

public class StringExamples {
    String str ;
	public StringExamples(){
		str = "This is my default string";
	}
	
public static void changeMyParam(int a){
	a = 100;
}
public static void changeMyParam1(Integer a){
	a = 100;
}	
//this method finds whether a substring is present in a string or not
public static boolean findSubStr(String str,String subStr){
	System.out.println(str.indexOf(subStr));
	return true;
}
// this method reverses the word
public static void reverseWord(StringBuffer str){
	
	str.reverse();
	
	
}

//this method reverses the word
public static void reverseWord1(String str){
	char[] myStr = str.toCharArray();
	for (int i = 0 ; i < myStr.length/2 ; i++){
		char temp = myStr[i];
		myStr[i] = myStr[myStr.length-1-i];
		myStr[myStr.length-1-i] =  temp;
	}
	
	str = String.valueOf(myStr);
//	System.out.println(str);
}
//String = "abc def xyz"
//output = "cba fed zyx"
public static void reverseWordsinSentence(StringBuffer str){
	 
	    String sentence = str.toString();
		String[] words = sentence.split(" ");
	    str.delete(0, str.length());
		for (int i = 0 ; i < words.length ; i++){
			StringBuffer bf = new StringBuffer(words[i]);
			bf.reverse();
			str.append(bf);
			str.append(" ");
		}
      
}
public static void reverseWordsinSentence1(StringBuffer str){
	
	String sentence = str.toString();
	String[] words = sentence.split(" ");
	str.delete(0, str.length());
	for (String s : words){
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length/2 ; i++){
			char temp = arr[i];
			arr[i] = arr[arr.length - i -1];
			arr[arr.length - i -1] = temp;
		}
		str.append(arr);
		str.append(" ");
	}

}

public static int[] printWordsLengths(String str){
	
	String[] words = str.split(" ");
	int[] len = new int[words.length];
	for (int i = 0; i < words.length ; i++){
		len[i] = words[i].length();
		System.out.println(len[i]);
	}
	
	return len;
}
//This method counts the number of occurrences of a substring in a string
public static int findAllSubStr(String str,String subStr){
	int startIndex  = 0;
	int count = 0;
	for (int i = 0 ; i < str.length(); ){
		startIndex = str.indexOf(subStr, i);
		
		if (startIndex < 0) break;
		i = startIndex + subStr.length();
		count++;
		System.out.println(startIndex);
	}
	return count ;
}
// String = "abbc"
// String = "ac"
public static void removeSubStr(String str, String subStr){
/*	
	StringBuffer sb = new StringBuffer();
	int startIndex = 0;
	for (int i = 0; i < str.length() ; i++){
		startIndex = str.indexOf(subStr, i);
		if (startIndex < 0 ) sb.append(str , startIndex , str.length() - startIndex );
	}
*/	
	StringBuffer sb = new StringBuffer(str);
	int startIndex = str.indexOf(subStr);
	if (startIndex >= 0) sb.delete(startIndex, startIndex + subStr.length() );
	System.out.println(sb);
	
}
public static void replaceStr(String str,String oldSubStr, String newSubStr){
	
}
//String = "abc def xyz"
//output = "abc1 def2 xyz3"
public static void changeString(String str){
	
	StringBuffer sb = new StringBuffer();
	String [] words = str.split(" ");
	for (int i = 0 ; i < words.length ; i ++){
		sb.append(words[i]) ;
		sb.append(i+1);
		sb.append(" ");
	}
	System.out.println(Arrays.toString(words));
	System.out.println(sb);

	//str.replaceAll(regex, replacement)
}
}
