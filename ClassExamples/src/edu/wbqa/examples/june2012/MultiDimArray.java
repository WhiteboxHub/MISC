package edu.wbqa.examples.june2012;

public class MultiDimArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int [][] arr1 = new int [2][3];
       
		int [][] scoreCard = {
		                {10,20,15},
		                {7,25}
		               };
		String [][] myClass = {
								{"Tim" ,"Kim"},
								{"John","Rick"}
							  };
		String [][] yourClass = myClass;
		
		
	  	//print2DArray(scoreCard);
		printRowSum(scoreCard);
	}
	// prints 2D array
	public static void print2DArray(int [][] arr ){
		for ( int i = 0 ; i < arr.length ; i ++ ){
			for (int j  = 0 ; j < arr[i].length ; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println("\n");
		}
   	 
    }
	// prints rowsum
	public static void printRowSum(int [][] arr){
		
		for ( int i = 0 ; i < arr.length ; i ++ ){
			 int sum = 0;
			for (int j  = 0 ; j < arr[i].length ; j++){
			   	sum += arr[i][j];
			   	System.out.print(arr[i][j] + " " );
			}
			System.out.println(sum + "\n");
	   }
    }
}
