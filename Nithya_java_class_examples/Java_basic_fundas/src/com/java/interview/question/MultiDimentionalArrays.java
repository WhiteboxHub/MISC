package com.java.interview.question;

import java.util.Scanner;

public class MultiDimentionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] multiArray = new int[3][2];


		int numToFind = 0 ;
		multiArray[0][0] = 10 ; 
		multiArray[0][1] = 20 ; 

		multiArray[1][0] = 100 ; 
		multiArray[1][1] = 200 ; 


		multiArray[2][0] = 50 ; 
		multiArray[2][1] = 60 ; 

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the search Number please"); 
		numToFind = s.nextInt();

		for(int i = 0 ; i < 3 ; i++){

			for(int j = 0 ; j < 2 ; j++){

				if(multiArray[i][j]== numToFind)
					System.out.println("Number Found is = " +multiArray[i][j]);
				
				
				//System.out.println("All the Elements in the Array = "+ multiArray[i][j]);
			}

		}


	}

}


/* 	0		1

0  00		01

1  10		11

2  20		21*/