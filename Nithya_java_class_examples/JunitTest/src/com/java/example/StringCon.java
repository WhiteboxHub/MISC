package com.java.example;

public class StringCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringCon sc = new StringCon();
		sc.getConcatString("Nithya","Lakshmi");
		
	}

	public String getConcatString(String s1 , String s2){
		
		String str = s1 + s2 ;
		
		System.out.println("The Lenght of the concated String" + str.length() );
		
		return str;
	}
}
