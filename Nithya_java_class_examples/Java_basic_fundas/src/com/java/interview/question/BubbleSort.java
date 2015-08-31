package com.java.interview.question;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] a={12,4,1};

	
		int[] des= sortDescendingOrder(a);

		int[] asc= sortAsscendingOrder(a);

		System.out.println("Array Sorted In Descending order ");
		
		for(int i=0;i<des.length;i++){
			System.out.println(des[i]);	
		}
		
	
		
		System.out.println("Array Sorted in Ascending order ");
		
		for(int i=0;i<asc.length;i++){
			System.out.println(asc[i]);
		}
	}
	
	public static int[] sortDescendingOrder(int[] a){
		
		int[] b=sortAsscendingOrder(a);
		for(int i=0;i<b.length ;i++)
		System.out.println(b[i]);
		int c[]=new int[b.length];
		int j=0;
		
		for(int i=b.length-1;i>=0;i--){
			
			c[j]=b[i];
			j++;
		}
		return c;
	}
	
	public static int[] sortAsscendingOrder(int[] a){
		int swap;
		for(int i=0;i<a.length-1;i++){
			
			for(int j=0;j<a.length-1-i;j++){
				
				if(a[j]>a[j+1]){ // 12 > 4 // 12 > 1 
					
					swap=a[j]; // 12 // 12
					a[j]=a[j+1]; // a[0] = a[1] ; a[0] = 4 // a[1] = a[2] ; a[1] = 1 ;// 
					a[j+1]=swap; // a[1] = 12 // a[2] = 12
				}
			} 
		}
		return a;
	}
}
