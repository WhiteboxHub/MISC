package com.java.basic.fundas;

public class StringExmaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello" ;

		System.out.println("Memory of Str Hello "+str.hashCode());

		String str2 = "Hello";

		System.out.println("Memory of st2 = " + str2.hashCode());

		str = "Hello World" ; 

		System.out.println("Memory of Str changed Hello World"+str);

		String str1 = new String("Hello");

		System.out.println("Memory of Str1 with NEW  "+str1.hashCode());

		String str3 = new String("Hello");

		System.out.println("Memory of Str3 with NEW  "+str3.hashCode());

		System.out.println("gives you the Character at that Index = " +str.charAt(0));

		System.out.println(" Give you the substring from the current index and till last index value charater" +  str.substring(0, 3));

		System.out.println("Gives the length of the String = " + str.length());

		System.out.println("Equals Method = " +str.equals(str2));

		System.out.println("EQUALS iGNORE cASE "+ str.equalsIgnoreCase(str2));
		
		str.concat("!!! " ); // Concat to the string 
		
		str = str + "Hello ".concat("!!!");
		
		String s = "Hello" + " Welcome to Java" + " Programming" ; 
		
		System.out.println(str);
		
		System.out.println(s);
		
		
	
	}
	

}
