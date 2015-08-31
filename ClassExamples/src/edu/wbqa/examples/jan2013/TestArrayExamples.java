package edu.wbqa.examples.jan2013;

public class TestArrayExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 
		 ArrayExamples ex = new ArrayExamples();
		 int [] arr = new int[] {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE , Integer.MAX_VALUE, Integer.MIN_VALUE};
		 int [] a =  new int[] {1000 , 30 , 5 ,67};
		 
	/*	 ex.printIntArray(arr);
		 
		 String[] strArr = new String[] { "abc" ,"xyz" , "pqrs"};
		 ex.printStringArray(strArr);
		 boolean ret = ex.searchKey(arr, 56);
		 if ( ret == true)
		     System.out.println("The key is found");
		 else
			 System.out.println("The key is not found");
	*/	 
	//	 System.out.println("The sum of the elements of array  = " + ex.sumofArrayElements(arr) );
	//	 System.out.println("Key Occurences " + ex.getCountofKey(arr, Integer.MAX_VALUE));
	//	 System.out.println("The max value in the array is " + ex.getMax(a));
	//	 ex.demoArrays(a, arr);
	//	 boolean ret =  ex.equalsArrays(new int[]{1 , 2, 3} , new int [] { 1,2 ,3 ,5});
	//	 System.out.println(ret);
		// Rectangular arrays are arrays where each sub array has same number of elements
		  int [][] scores = new int[][]{
				  { 45 , 55, 65,56}, // 4
				  { 34, 57 , 78 , 78}, // 4
				  { 100 , 87 ,99,98}  // 4
				  
		  };
		  
		 scores[0][0] = 45;
		 scores[0][1] = 55;
	     scores[0][2] = 65;
		 scores[0][3] =56;
		 
		 scores[1][0] = 34;
		 scores[2][-2] = 99;
		 System.out.println("World");
		 System.out.println( scores[2][-2]);
		 System.out.println("Hello");
		 
		 // triangular arrays
		 
		 int [][] arr1 = new int[][]{
				 { 100 , 45},
				 { -23, 45, 56},
				 { 100}
				 
		 };
		 
	}

}
