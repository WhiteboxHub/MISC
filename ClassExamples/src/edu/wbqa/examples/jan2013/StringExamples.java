package edu.wbqa.examples.jan2013;

public class StringExamples {
	
	public void showStringAPI(){
		
		String str = "HelloWorld";
		
	//	String str1 = new String("HelloWorld1");
		
		int len = str.length();
		// to find the character at the end of the string
		/*str.charAt(len-1);
		String s1 = "ahc1";
		String s2 = "ahcde3";
		System.out.println(s1.compareTo(s2));
		
		if ( s1 == s2)
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are not equal");*/
		
		String s11 = new String("hello");
		String s21 = new String("hello");
		
		/*if ( s11 == s21) // reference equality
			System.out.println("Strings Objects are equal");
		else
			System.out.println("Strings Objects are not equal");
		
		if (s11.equals(s21)) // content equality
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are not equal");*/
		
		System.out.println("Hello".concat("World"));
		
		String s3 = s11 + " World"; // hello World
		
		s3.endsWith("ld");
		s3.startsWith("he");
		
	/*	int index1 = s3.indexOf('o'); // 4
		System.out.println(index1);
		System.out.println(s3.indexOf("Worl"));
		System.out.println(s3.indexOf('o', index1 + 1));
		
		System.out.println(s3.lastIndexOf('o'));
		
		s3 = s3.replace('o', 'O');
		System.out.println(s3);
		*/
		String sentence = "This is a beautiful day!!";
		
		String[] words = sentence.split(" ");
		for (String x : words){
			
			System.out.println(x);
		}
		
	    String newSentence = sentence.substring(4);
	    System.out.println(newSentence);
	    
	    System.out.println(sentence.substring(3, 9));
	    
	    int i = 5;
	    char [] arr = new char [] {'a' ,'b', 'c'};
	    int [] arr1 = new int[] {1,4,5};
		String s4 = s3.valueOf(i);
		
		System.out.println(String.valueOf(arr1));
	    char [] myStrArr = s3.toCharArray();
	    s3 = " ab  c   ".trim();
	    System.out.println(s3);
		
	    
	}
    // this method reverses a string
	// String = "abcdef" cba
	public static String reverseStr(String str){
		char [] arr = str.toCharArray();
		String ret = "";
		for (int i = str.length()-1 ; i >= 0 ; i--){
			ret += arr[i];
		}
		return ret;
	}
	//
	public static String reverseStr1(String str){
		char [] arr = str.toCharArray();
		String ret = "";
		int len = str.length();
		for (int i = 0 ; i < len/2 ; i ++){
			char temp = arr[i];
			arr[i] = arr[len-i-1];
			arr[len-i-1] = arr[i];
		}
		return ret;
	}
	// String str = "Life is good"
	// String str1 = "Life1 is2 good3"
	public static String changeStr(String str){
		String newstr ="";
		String[] words = str.split(" ");
		for(int i = 0 ; i < words.length ; i ++){
			newstr += words[i] + (i + 1) + " " ;
		}
		return newstr;
	}
	// String url = http://www.whiteboxqa.com;http://www.newtours.com
	// This method counts the number of urls in the string
	//indexOf
	//split
	
	
}
