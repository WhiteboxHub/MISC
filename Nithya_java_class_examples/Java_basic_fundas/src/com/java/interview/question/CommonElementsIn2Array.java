package com.java.interview.question;

public class CommonElementsIn2Array {


	public static void main(String a[]){

		int[] arr1 = {4,7,3,9,2};
		int[] arr2 = {3,2,12,9,40,32,4};

		for(int i=0;i<arr1.length;i++){

			for(int j=0;j<arr2.length;j++){

				if(arr1[i]==arr2[j]){

					System.out.println(arr1[i]);
				}
			}
		}
	}
}








/*int arr[] = { 10, 29 , 34 , 2 };
int arr2[] = { 10, 23,34,5};

for ( int i = 0 ; i < arr.length ;i++) 
{

	for ( int j = 0 ;  i< arr2.length ;i++) {

		if (arr[i]) == arr2[j]){
			System.out.println("arr[i] = " + arr[i]);
		}
	}
	
}
*/











