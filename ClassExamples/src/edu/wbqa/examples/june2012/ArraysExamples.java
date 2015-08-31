package edu.wbqa.examples.june2012;

import java.util.Arrays;

public class ArraysExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

           int[] a ;
           a = new int[5];
           
           a[0]= 10;
           a[1] =20;
           a[2] =30;
           a[3] =40;
           a[4] =50;
           
     //      int[] b = {100,200,300,400,500};
          
     //      int [] c ;
           
       //    Arrays.sort(b);
       //    System.out.println(Arrays.binarySearch(b, -100));
           System.out.println(Arrays.toString(a));
        		   
       //    add2Arrays(a,b);
       //    getSquares(a);
       //      System.out.println("Maximum element in a = " + findMax(a));
       //      b = createRandomArray(5);
       //   reverseArray(a);
          }
	// adds two arrays and creates a new array
	public static void add2Arrays(int []a,int []b ){
		if ( a.length != b.length)
			return;
		int [] c = new int [a.length];
		for (int i =0 ; i < c.length ; i++ ){
			c[i] = a[i] + b[i];
		}
		printArr(c);
	} 
	// changes the array elements by their squares
	public static void getSquares(int [] a){
		for ( int i = 0 ; i < a.length ; i++){
		//	a[i] = a[i] * a[i];
			a[i] *= a[i]; // a[i] = a[i] * a[i] 
		}
		printArr(a);
	}
	public static void printArr(int [] a){
		for ( int x : a){
			System.out.println(x);
		}
	}
	public static int findMax(int []a){
		if (a == null)  return -1;
		
		int max = a[0];
		for ( int j = 0 ; j< a.length ; j++){
			if (! (a[j] > Integer.MIN_VALUE &&  a[j] < Integer.MAX_VALUE) ) return -1; 
		}
		for ( int i = 1 ; i < a.length ; i++ ){
		   	
			if ( max < a[i])
				max = a[i];
		}
		return max;
	}
	public static int findSumofMinAndMax(int []a){
		int sum = 0;
		int max = a[0];
		int min= a[0];
		for ( int i = 1 ; i < a.length ; i++ ){
			if ( max < a[i])
				max = a[i];
			if ( min > a[i])
				min = a[i];
		}
		sum =  min + max;
		return sum;
	}
	public static int[] createRandomArray(int size) {
		int [] a = new int[size];
		for (int i = 0; i< a.length ; i++ ){
			int y  =(int) (10 +  Math.random()*40) ;
			a[i] = y;
		}
		printArr(a);
		return a;
	}
	public static void swap(int a, int b){
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
	}
	public static void reverseArray(int []a){
	/*
		int[] b = new int [a.length];
		for (int i = 0 ; i < b.length ; i++){
			b[i]= a[b.length -i -1 ];
		}
	*/	
	
		System.out.println("Initial Array \n");
		printArr(a);
		
		for (int i =0 ; i <= a.length/2 ; i++ ){
			int temp = 0;
			temp = a[i];
			a[i] = a[a.length - i -1];
			a[a.length - i -1] = temp;
		}
		
		System.out.println("Reversed Array \n");
		printArr(a);
		
	}

}
