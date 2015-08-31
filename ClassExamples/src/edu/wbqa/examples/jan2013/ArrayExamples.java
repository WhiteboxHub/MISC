package edu.wbqa.examples.jan2013;

import java.util.Arrays;

public class ArrayExamples {
	
	int x;
	String str ;
	
   private void method(){
	   
   }
   public void method1(){
	   
	   int[] arr = new int[3] ;
	   arr[0] = 0;
	   arr[1] = 3;
	   arr[2] = 4;
	   
	//   System.out.println(arr[0] + arr[1] + arr[2]);
	   int[] arr1 = new int[] {2, 4 ,6 ,3};
	   method();
	   
   }
   // this method prints the elements of an array
   public int printIntArray(int[] a){
	   
	   if (a == null)
		   return -1;
	   
	//   System.out.println(a.length);
	   int len = a.length ;
	   for ( int i = 0 ; i <= len-1 ; i++ ){
		   System.out.println(a[i]);
	   }
	   return a.length;
	   
   }
   
   // this method prints the elements of string array
   public void printStringArray(String[] a){
	   int len = a.length;
	   for (String str : a){
		   System.out.println(str);
	   }
   }
   //this method searches for an element in an array
   public boolean searchKey(int[]a , int key){
	   boolean ret = false;
	   int len = a.length;
	   for (int i = 0 ; i< len ; i++){
		   if (a[i] == key) {
			   ret = true;
			   break;
		   }
		   
			   
	   }
	   
	   return ret;
   }
   // 2,3,4
   // this method adds the elements of an integer array
   public int sumofArrayElements(int[] a){
	   int sum = 0;
	   for (int i = 0 ; i < a.length ; i++){
		   sum =  sum + a[i];
	   }
	    return sum ;
   }
   // 1 ,3 ,2 ,1 ,1
   // This method counts the number of occurrences of an element in the array
   public int getCountofKey(int[]a , int key){
	   int count = 0;
	   int len = a.length;
	   for (int i = 0 ; i< len ; i++){
		   if (a[i] == key) {
	           count ++;
		
		   }
		   
			   
	   }
	   
	   return count;
   }
   // write a method which returns the maximum value of an element in array
   // { 3, -3,899,3 ,3000}
   public int getMax(int[] a){
	   int max = a[0];
	   
	   for (int i = 0 ; i < a.length ; i ++ ){
		   if ( max < a[i]) max = a[i];
	   }
	   
	   
	   return max;
   }
   // this method counts all the even numbers in an array
   // { 2 , 3,5 ,6}
   public int countEven(int [] a){
	   
	   int count = 0;
	   for ( int i = 0; i < a.length ; i++){
		   if (a[i]%2 == 0 ) count ++;
	   }
	   
	   return count;
   }
   // this method counts the prime numbers in an array
   
   // Usage of Arrays
   public void demoArrays(int [] a, int [] b){
	  int [] copy = new int [10];  
	/*  Arrays.sort(a);
	  printIntArray(a);
	  int x = Arrays.binarySearch(a, 4);
	  System.out.println(x);
	  
	  copy = Arrays.copyOf(a, 2);
	  printIntArray(copy);
	  
	  copy = Arrays.copyOfRange(a, 1, 3);
	  printIntArray(copy);
	  */
	  boolean ret = Arrays.equals(a, b);
	  System.out.println(ret);
	   
   }
   // this method returns true if two arrays are equal otherwise
   // if a and b have same number of elements as well as their corresponding elements are also equal
   public boolean equalsArrays(int [] a , int [] b){
	   
	   if (a.length != b.length) return false;
	   
	   for ( int i =0 ; i < a.length ; i ++){
		   
		   if (a[i] != b[i]) return false;
	   }
	   return true;
   }
   
}
