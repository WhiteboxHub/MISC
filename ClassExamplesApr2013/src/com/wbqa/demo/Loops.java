package com.wbqa.demo;

public class Loops {

	/**
	 * @param args
	 */
	//this method prints the table of n
	public static void basicForLoop(int n){
		
		int i ;
		int prod ;
		
		for ( i =  1 ; i <= 10 ; i++){
			prod = n * i;
			System.out.println(n + " * " + i + " = " + prod);
		}
		
	}

	// this method prints odd numbers between x and y
	public static void printOdd(int x, int y){
		
		for (int i = x ; i <= y ; i++ ){
			int rem = i%2;
			if ( rem != 0 ) 
				System.out.println(i);
		}
		
	}
	
	// this method prints even numbers from 1 to n
	public static void printEven(int n){
		
		for ( int i = 2 ; i <= n ; i+=2){
			System.out.println(i);
		}
	}
	// this method prints the sum of first n natural numbers
	public static int findSum(int n){
		
		int sum = 0;
		
		for (int i = 1 ; i <= n ; i++ ){
			System.out.print(sum + "+" + i + "=");
			sum = sum + i;
			System.out.println(sum);
		}
		
		//System.out.println(sum);
		return sum;
		
	}
	
	// print all the numbers which are divisible by 5 and less than n
	public static void printMultiples(int n){
		
		int i = 5 ;
		while (i <= n){
			
			if (i%5 == 0)
				System.out.println(i);
			i++;
		}
		System.out.println(i);
	}
	
	public static void findProd(int m){
		
		for (int i = 0 ; i <=m ; i ++){
			
			if ( i%2 != 0)
				continue; // take the next iteration . do not go beyond this line
		
			int prod = 2 * i;
			System.out.println(prod);
			if (prod == 20)
				break; // come out of the loop instantly
			
		}
		
	}
	
	public static void Loop2(){
		
	/*	for (int i = 0 ,  j = 10 ; i <= 10  ; i++ , j--){
			System.out.print(" i = " + i);
			System.out.println(" j = " + j);
		}*/
		
		for (int i  = 1 ; i <= 3 ; i ++){
			System.out.print("i = " + i);
			for ( int j = 1 ; j <= 2 ; j ++)
				System.out.print(" j =" + j);
			System.out.println("\n");
		}
		
	}
	
	
	public static void main(String[] args) {
		
	//	 basicForLoop(43);
	//   printOdd(20,90);
	//	int mysum = findSum(5);
	//	System.out.println("The sum of first 5  natural numbers is " + mysum);
		
	//	basicForLoop(mysum);
	//	printEven(101);
	//	printMultiples(100);
	//	findProd(100);
		Loop2();
	}
	
	
}
