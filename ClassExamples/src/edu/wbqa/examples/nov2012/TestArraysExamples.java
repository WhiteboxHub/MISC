package edu.wbqa.examples.nov2012;

import java.util.Arrays;

public class TestArraysExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

        int []myArr = new int[]{1,3,4,5,7};
        int []myArr1 = new int[]{1,3,4,5,7};
	//	ArraysExamples.printArr(new int[]{1,3,5,7,9});
	//	ArraysExamples.printArr(new int[]{100,-3,50,7,9,87,2892});
	//	ArraysExamples.increaseAllElementsByx(new int[]{1,3,5,7,9}, 10);
	//	ArraysExamples.printSum( myArr);
    /*  
        boolean val = ArraysExamples.searchKey(myArr, 45)  ; 
        if (val == true) 
        	System.out.println("Key is found : " + val);
        else
        	System.out.println("key is not found : " + val);

	}
	*/
   //     System.out.println("Minimum value is : " + ArraysExamples.findMin(myArr));
   //     ArraysExamples.printOdd(myArr);
   //       ArraysExamples.printTable(17);
   //     System.out.println(ArraysExamples.getSumofMinAndMax(myArr));
    //    ArraysExamples.printArrayinReverse(myArr);
    //    ArraysExamples.printArr(myArr);
     //    ArraysExamples.reverseArrayusingTempArray(myArr);
     //   ArraysExamples.printArr(myArr);
     //   ArraysExamples.reverseArray(myArr);
     //   System.out.println(Integer.MIN_VALUE + " : " + Integer.MAX_VALUE);
     //   System.out.println(add(Integer.MAX_VALUE,1));
     //   System.out.println(ArraysExamples.searchForKey(myArr, 7));
     //   ArraysExamples.mergeArrays(myArr, myArr1);
     //   ArraysExamples.add2ArrayElements(myArr, myArr1);
     //   System.out.println(ArraysExamples.isPrime(19));
     //     fib(10);
//          Arrays.sort(myArr);
//          System.out.println(Arrays.toString(myArr));
//          System.out.println(Arrays.binarySearch(myArr, 34));
          int [] newArray= Arrays.copyOf(myArr, 2);
    //      System.out.println(Arrays.toString(newArray));
      //    int [] newArray1 = Arrays.copyOfRange(myArr, 4, 7);// second argument is the index , third argument is the position
       //   System.out.println(Arrays.toString(newArray1));
       //   System.out.println(Arrays.equals(myArr, myArr1));// content equality
       //   System.out.println(myArr == myArr1);
//          int[] x = {1,2,3};
//          int[] y = x;
//          System.out.println(y==x);
//          int []arr1 = new int[5];
//          Arrays.fill(arr1, -1);
//          System.out.println(Arrays.toString(arr1));
//          System.out.println(myArr[-6]);
          
                 
    /*      Student []s = new Student[3];
          s[0] = new Student(1,"fname","QA");
          s[1] = new Student(2,"fname","QA");
          s[2] = new Student(3,"fname","QA");
          
          for (Student x : s){
        	  x.printInfo();
          }
          for (int i = 0; i < s.length ; i++){
        	  s[i].printInfo();
          }*/
          // rectangular arrays
       /*   int[][] s1 = new int[3][4];
          s1[0] = new int[]  {2,3,4,4 };
          s1[1] = new int[]  {12,3,45,34 };
          s1[2] = new int[]  {12,3,100,101 };
        
          for ( int i = 0; i < 3 ; i++)
          {
        	  for (int j = 0 ; j < 4 ; j++)
          
        		  System.out.print(s1[i][j] + " ");
            System.out.println();
          }*/
          // triangular arrays
          int[][] s = new int[][] {
        	  {2,3,4 },
        	  {12,3,45,34 },
        	  {12,3,100,101 ,89},
           };
          for ( int i = 0; i < 3 ; i++)
          {
        	  for (int j = 0 ; j < s[i].length ; j++)
          
        		  System.out.print(s[i][j] + " ");
            System.out.println();
          }
         
          for (int[] x : s ){
        	  System.out.println(Arrays.toString(x));
          }
	}
  
	public static int[] fib(int n){
		int[] arr = new int[n];
		System.out.println(Arrays.toString(arr));
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		for ( int i = 1 ; i <=n ; i++){
		//	System.out.println(n1);
			arr[i-1] = n1;
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}
	public static int add(int a , int b){
		
		return a+ b;
	}
}
