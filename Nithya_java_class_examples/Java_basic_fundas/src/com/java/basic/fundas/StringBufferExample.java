package com.java.basic.fundas;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StringBuffer sb = new StringBuffer("Hello Java"); // this is not Imutable . This is thread safe . Its faster than string builder .
		
		//StringBuffer sb1 = "Not correct " ;  // This canot hold the String value , It can hold only the String buffer value.
		
		System.out.println(sb);
		
		sb.append(" Programing");
		
		System.out.println(sb);
		
		if(sb.equals(sb)){
			
			System.out.println("The String buffer is same");
		}
		
		StringBuilder sbuild = new StringBuilder("Hello Good day ") ;
		
				
			
	}

}
