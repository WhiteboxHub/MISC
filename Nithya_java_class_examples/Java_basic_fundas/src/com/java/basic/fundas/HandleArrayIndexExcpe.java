package com.java.basic.fundas;

public class HandleArrayIndexExcpe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int arr[] = { 12 , 23,32} ;
		
		String str = null ; 


		System.out.println("Array length = " +arr.length);

		try{

			for(int i = 0 ; i <arr.length;i++){

				System.out.println(arr[i]);

				//System.out.println(arr[3]);
			}
			
			str.length();
		}
		catch(ArrayIndexOutOfBoundsException ae ){

			System.out.println("Its crossing the Index ");
		}
		catch(Exception e ){ // Always give this Exception Super class at the last Catch only .
			//If you try to give in the frist then the remialning code will be unreachable .
			System.out.println("Main Exception caught");
			e.printStackTrace(); // system.err // system.in
			
		}
		
	}

}
