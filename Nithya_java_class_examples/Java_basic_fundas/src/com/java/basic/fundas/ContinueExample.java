package com.java.basic.fundas;

public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 0 ; i < 7 ; i++){

			if(i==4)
				continue; // It skips the loop when i = 4 and continue for the next i values 
			System.out.println("The value of i is " +i);
		}

		System.out.println("The Program Ends ");

	}

}
