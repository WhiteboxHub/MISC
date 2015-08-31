package com.java.interview.question;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] number = { 10,20,30,35,45,60};

		int numToFind =10 ,i = 0; 

		while(i<number.length){
			if(numToFind==number[i]){
				System.out.println("Missing Number In Array is " + number[i] + " Index location is " + i);
				i++;
				break;

			}
			else{

				i++;
				continue;

			}


		}

	}

}
