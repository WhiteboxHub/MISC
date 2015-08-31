package com.java.interview.question;

public class SumOf10Numbers {

	public static void main(String args[])
	{		
		int n, sum=0;
		int arr[] = {10 , 20 , 30};
		int sumArr = 0  , i = 0;
		
		for(n=1;n<=10;n++)
		{
			sum+=n;    //or sum=sum+n;
		}
		System.out.println(sum);
		
		while(i<arr.length){
			sumArr += arr[i] ;
			i++;
		}
		
		System.out.println("Sum of Array Values " + sumArr);
	}
}