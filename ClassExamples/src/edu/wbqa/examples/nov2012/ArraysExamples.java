package edu.wbqa.examples.nov2012;

public class ArraysExamples {
	
	// Array is a data structure which holds homegeneus elements in consecutive memory locations
	
	// print all the elements of the array
	public static void printArr(int[] arr){
		
		
		for (int i =0 ; i < arr.length ; i++){
			System.out.println(arr[i]);
		}
	}
	//this method checks for arrays equality
	// Equal arrays are those which have same length , same elements in the same order
	public static boolean checkEquality(int[]a,int[]b){
		
		if ( a.length !=b.length) return false;
		for ( int i =0 ; i < a.length ; i ++){
			if (a[i]!=b[i]) return false;
		}
		return true;
	}
	public static boolean isPrime(int x){
		if (x == 0 ) return false; 
		for ( int i = 2 ; i <= x/2 ; i++){
			if ( x%i == 0) return false;
		}
		return true;
	}
	// this method would merge arrays a and b into one single array
	public static void mergeArrays(int[] a , int[] b){
	  int []c = new int[a.length + b.length];
	  int i = 0;
	  for ( i = 0 ; i <a.length ; ){
		  c[i++] = a[i];
	  }
	  for(int j=0 ; j <b.length ; j++)
		  c[i++] = b[j];
	  
	  printArr(c);
	  
	}
	// this method adds corresponding elements of the arrays of same size
	public static void add2ArrayElements(int[]a , int []b)
	{
		if (a.length != b.length) {
			System.out.println("Arrays are not of same size");
			return;
		}
		for (int i = 0 ;i < a.length;i++ ){
			a[i] = a[i] + b[i];
		}
		printArr(a);
	}
	// print the first and last element of the array
	public static void printFirstAndLast(int[] arr){
		// let us assume the length of the array is x
		int x = arr.length;
		/* if length = 4 , last index = 4-1 = 3
		 * if length = x , last index = x-1
		 */
		System.out.println("First Element of the array is :" + arr[0] );
		System.out.println("Last Element in the array is :" + arr[x-1]);
	}
	// { 1, 3 ,5 ,7 } = { 1+3, 3+3 ,5+3 ,7+3} 
	public static void increaseAllElementsByx(int[]arr , int x){
		
		System.out.println("My initial Array is :");
		printArr(arr);
		for (int i = 0 ; i < arr.length ; i++){
			arr[i] = arr[i] + x;
		}
		System.out.println("My new Array is :");
		printArr(arr);
	}
    // this method finds the sum of all the elements in the array
	// { 1, 3 ,5 ,7 } = { 1+3+5+7} = 16
	// sum = 0 , a[0]=  1 ; sum = 0 + 1 = 1
	// sum = 1 , a[1]= 3 ; sum = 1 + 3 = 4
	// sum = 4 , a[2] = 5 ; sum = 4 + 5 = 9
	// sum = 9 , a[3] = 7 ; sum = 9 + 7 = 16
	public static void printSum(int [] arr){
	
		int sum = 0;
		for (int i = 0 ; i < arr.length ; i++){
			sum = sum + arr[i];
		
		}
		
		System.out.println("The sum of the array elements is :" + sum );
	}
//{ 1,1 ,3,5,6,5}	
   public static int searchForKey(int[]arr , int key){
		int count = 0;
		for (int i = 0 ; i < arr.length ; i ++){
			if (arr[i] == key) count++;
		}
		return count;
	}
	// this method finds an element in the array
	// { 1, 13 ,5 ,-7 } 4 
	// { 1, 3 ,5 ,7 ,9} 5
   //linear search
	public static boolean searchKey(int[]arr , int key){
		
		for (int i = 0 ; i < arr.length ; i ++){
			if (arr[i] == key) return true;
		}
		return false;
	}
	// { 1, 3, 5 ,7 } = { 2 ,6 ,10 ,14 } 
	public static void multiplyAllElementsByx(int[] arr, int x){
		System.out.println("My initial Array is :");
		printArr(arr);
		for (int i = 0 ; i < arr.length ; i++){
		//	arr[i] = arr[i] * x;
			arr[i] *= x;
			
		}
		System.out.println("My new Array is :");
		printArr(arr);
	}
	// the method finds the minimum value of the element in an unsorted array
	// {100 , -90, 7 ,-34 }  -90
	// min = 100 , min = -90
	public static int findMin(int[] arr){
		int min = arr[0];
		for (int i = 1; i < arr.length ; i++){
			if ( min > arr[i]) min = arr[i] ;
		}
		return min;
		
	}
	
	// x/y  = Quotient x%y = Remainder
	
	// { -98 , 76 ,21 , 54} 
	// print the odd numbers in the array
	public static void printOdd(int[] arr){
		
		for (int i =0 ; i < arr.length ; i++){
			{	
				int rem = arr[i]%2 ;
				if (rem != 0) 
				   System.out.println(arr[i]);
			
			}
		}
	}
	
	// this method would check whether two arrays have same length or not
	public static boolean checkSameLength(int[]a , int[] b){
		int lenA = a.length;
		int lenB = b.length;
		
		if ( lenA == lenB) return true;
		else return false;
	}
	
	// this method prints the table of a number
	// 2 * 1 = 2 , 2 * 2 = 4...
	public static void printTable(int x){
		int prod = 0;
		for ( int i = 1 ; i <= 10 ; i++){
			prod = x * i ;
			System.out.println(x  + " * " + i + " = " + prod );
		}
		
	}
	
	// this method finds the sum of minimum and maximum from an integer array
	// { -3 ,30,4, - 100}  -100 , 30  return -100 + 30 = -70
	public static int getSumofMinAndMax(int [] arr){
		int min = 0;
		int max = 0;
		for ( int i =0 ; i < arr.length ; i++){
			if ( min > arr[i]) min = arr[i];
			if ( max < arr[i]) max = arr[i];
		}
		return (min + max);
	}
	
	// this method finds the sum of positive element in the array
	public static void printSumOfPositive(int arr[]){
	
		for (int i =0 ; i < arr.length ; i++){
		{	
			if ( arr[i] > 0)
			   System.out.println(arr[i]);
		
		}
	}
	}
	
	// this methods prints the elements of the array in reverse order
	// { 1, 9 ,73 ,4 }  4 73 9 1
	public static void printArrayinReverse(int [] arr){
		
		for ( int i = arr.length - 1 ; i >=0 ; i-- ){
			System.out.println(arr[i]);
		}
	}
	// this method reverses the elements in the array ( use a temporary array)
	 // { 1, 9 ,73 ,4 } {4 , 73 , 9 ,1}
	 // 0  - 3 len-0-1
	 // 1 - 2  len-1-1
	// 2 - 1
	// 3 - 0
	public static void reverseArrayusingTempArray(int[] arr){
		int len = arr.length;
		int [] newArr = new int[arr.length];
	/*	for (int i = 0 ; i < arr.length ; i ++){
			newArr[i] = arr[arr.length -i -1];
		}
		*/
		for (int i = 0 , j = len-1 ; i < len ; i++ , j--){
			newArr[i] = arr[j];
		}
		
		arr = newArr;
		printArr(arr);
	}
	//{1,5,7,8,0}
	// this method reverses the elements in the array ( without using temporary array )
	public static void reverseArray(int[] arr){
		
		int len = arr.length;
		for (int i=0 ; i < len /2 ; i ++){
			int temp = arr[i];
			arr[i] = arr[len-i-1];
			arr[len-i-1] = temp;
		}
		
		printArr(arr);
	}
}

