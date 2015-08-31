package edu.wbqa.examples.june2012;

public class StringArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	 String [] a = {"LA","SFO","NY"};
	 int [] len = null ;
	 
	 String str = "Tim Kim Jim";
	 // Tim0 Kim1 Jim2
	
	// getLenArray(a,len);
	  splitArr(str);
	  
	 
	}
	public static void printStrArr(String [] a){
		for ( String x : a){
			System.out.println(x);
		}
	}
	public static void printIntArr(int [] a){
		for ( int x : a){
			System.out.println(x);
		}
	}
    public static void getLenArray(String [] a, int [] len){
      	len= new int [a.length];
		for (int i=0; i<a.length; i++)
		{			
		    len[i]= a[i].length();
		}
    	printIntArr(len);
    }
    public static void splitArr(String str){
    	String [] arrStr = str.split(" ");
    	for (int i =0; i<arrStr.length ; i++){
    		arrStr[i] = arrStr[i] + i;
    	}
    	printStrArr(arrStr);
    	
    }
}
