package com.java.basic.fundas;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char grade = 'Z';
		int gradePoints = 0;


		switch(grade){

		case 'A' : gradePoints = 500 ;
					System.out.println("Your Grade is A and your Score is " + gradePoints);
					break;
		case 'B' : gradePoints = 400 ;
					System.out.println("Your Grade is B and your Score is " + gradePoints);
					break;
		case 'C' : gradePoints = 300 ;
					System.out.println("Your Grade is C and your Score is " + gradePoints);
					break;
		case 'D' : gradePoints = 200 ;
					System.out.println("Your Grade is D and your Score is " + gradePoints);
					break;
		default : System.out.println("Your Grade is Not up to the mark");
					break;
		}

	}
}
