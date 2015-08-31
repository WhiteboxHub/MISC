package com.java.basic.fundas;

public class ArraysEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int mark[] = { 75 , 80 , 90 };
		
		String[] subject = new String[3]; 

		subject[0] = "English" ; 
		subject[1] = "Maths" ; 
		subject[2] = "Science" ; 
			
		
		for(int i = 0 ; (i<3) ; i++ )
		{
			System.out.println(" your "  + subject[i] +" Mark = " +mark[i]);
		}
		
		
	}

}
