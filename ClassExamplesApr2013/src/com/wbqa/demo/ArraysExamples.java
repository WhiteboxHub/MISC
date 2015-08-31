package com.wbqa.demo;

public class ArraysExamples {

	public int[] myarr;

    
	public ArraysExamples(){
		
	}
	public ArraysExamples(int [] arr){
		this.myarr=arr;
	}
	
	public void transpose(int[][] arr){
		
		for (int i = 0 ; i < arr[0].length ; i++)
		{
			for ( int j = 0 ; j < arr.length ; j ++)
				System.out.print(arr[j][i] + " ");
			System.out.println();
		}
		  
		
	}
	
	// this method to print the elements of an array and return its length
	public int printElements(int[] a){
		
		int len = a.length;
		
		for (int i = 0 ; i < len ; i ++){
			System.out.println(a[i]);
		}
		
		return len;
	}
	
	
	//write a method that takes an array of integers as an argument and
	//returns the sum of the elements in the array
	//{1,2,3,0}
	public int sumOfElements(int[] arr){
		int sum =  0;
		
		for (int x : arr){
			sum = sum + x;
		}
		return sum;
	}
	
	// write  a method that returns sum of the odd elements in the array
	// { 1, 2 ,2, 3 ,5} sum = 9
	public int sumOfOddElements(int[] arr){
		int sum =  0;
		
		for (int x : arr){
			if (x%2 != 0)
			sum = sum + x;
		}
		return sum;
	}
	
	
	
	// write a method that counts the multiples of 5 in an array
	// {10 , -100 , 34 , 75} count = 3
	public int countMultiplesof5(int[] arr){
		int count =  0;
		
		for (int x : arr){
			if (x%5 == 0) count++;
		}
		return count;
	}
	
	// this method implements linear search
	// arr = {828,56, 98,-82} x= 56
	public int searchForKey(int[] arr, int key){
		int index = -1;
		for (int i =0 ; i<arr.length ; i++){
			if (arr[i]==key){
				index = i;
				break;
			}
		}
		
		return index;
		
	}
	// arr ={1,36, 98,100}
	// reverse the elements of the array
	// arr = {100,98,36,1}
	// using temp array
	// 
	public int[] reverseArr(int[] arr){
		int [] tempArr = new int[arr.length];
		
		for (int i = arr.length -1 , j =0 ; i >=0  ; i--, j++){
			tempArr[j] = arr[i];
		}
		
		for (int i = 0 ; i<arr.length ; i++){
			tempArr[i] = arr[arr.length-i-1];
		}
		
		return tempArr;
		
	}
	//{ 1,2,3, 4,5} 5/2 = 2
    //{  5,2,3,4,1}
	//{ 5,4,3,2,1}
	public void reverseArr1(int[] arr){
		int len = arr.length;
		for (int i = 0 ; i < len/2 ; i++){
			int temp = arr[i];
			arr[i] = arr[len-1-i];
			arr[len-1-i] = temp;
		}
		
	}
	
	public  void myMain(){
		
		int x = 15;
		
		int[] arr ; // will create arr, a reference var in the stack
		arr = new int[5]; // will save spaces for 5 integers in the heap
		// and arr will hold the address of the first integer
	
		//access the elements
		arr[0] = 100;
		arr[1] = 25;
		arr[2] = 56;
		arr[4] = 98;
		
/*		System.out.println(arr[0] );
		System.out.println(arr[1] );
		System.out.println(arr[2] );
		System.out.println(arr[3] );
		System.out.println(arr[4] );*/
		
		
		int len = arr.length;
		for (int i = 0 ; i < len ; i ++){
			System.out.println(arr[i]);
		}
		
		int[] arr1 = new int []{2,4,6,10,15};
		
		Student s1 = new Student(1,"Sam",99.5);
		Student s2 = new Student(2,"Pam",98);
		
		
	
	    // array of objects
		
		Student [] arrOfStudents = new Student[2];
		
		arrOfStudents[0] = new Student(3,"Sam",99.52);
		arrOfStudents[1] = new Student(4,"Sam",99.53);
		
		Student [] arrOfStudents1 = {
				
				new Student(3,"Sam",99.52),
				new Student(4,"Sam",99.53)
		};
		
		
		String[] arrStr = new String[] {"Apple" ,"Banana" ,"Pear"};
		
		for (int i = 0 ;i <arrStr.length ; i++){
			System.out.println(arrStr[i]);
		}
		
		String[] arrStr2 = {"LA","SFO","Dublin"};
		
		
		
	}
	
	
}
