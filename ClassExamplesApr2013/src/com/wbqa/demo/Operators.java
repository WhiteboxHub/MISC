package com.wbqa.demo;

public class Operators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	/*	int x = 10;
		
	//	double y = x + 5 / 2 * 10 - 2 ;
		int y = 10;
		
		int z = 100 ;
		
		int exp1 = x++ + 100; //
		System.out.println("x = " + x + " exp1 = " + exp1); // x= 11
		int exp2 = ++x + 100; //
		System.out.println("x = " + x + " exp2 = " + exp2);
	
		boolean exp3 = x != y;
		boolean exp4 = x + 100 > y;
		
		System.out.println("exp3 = " + exp3);
		System.out.println("exp4 = " + exp4);
		
		boolean val1 = exp3 && exp4 ;
		boolean val2 = exp3 || exp4 ;
		
		System.out.println("val = " + val2);
		
		boolean exp5 =  x == 10 || ++ x + y > 10 ;
		
		System.out.println("x =" + x + " exp = " + exp5);
		
        int exp6 = x != 10 ? 30 : 40 ;
        
        System.out.println("exp6 = " + exp6);
        
        String x1  = "Hello" + (5 + 56);
        
             
        z = x + y;
        
        System.out.println(x1);
        
        System.out.println(x1 instanceof String);*/
		
		int x = 2;
		int exp = ~2;
		System.out.println(exp);
		
		 x += 5;
		 
		 x = x + 5;
		 
		 x /= 5;
		 
		 x = x / 5;
		 
	//	 castingEx();
	//	 branchingEx();
		 switchEx();
	}
	
	public static void castingEx(){
		
		int x = 35; // 4 bytes
		
		double y = 20D; // 8 bytes 
		
		double z = x + y ; // impilcit casting - upcasting
		
		x = (int)y ; // explicit casting - downcasting
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		
	}

	public static void branchingEx(){
		int  x = 45;
		boolean bool ;
		 if ( x > 100 ){
			 
			 System.out.println("x is greater than 100");
		 	 bool = true;
		 }
		 else
			 System.out.println("x is less than 100");
		 
	}
	
	public static void isPositive(){
		
		int x = 0;
		
		if ( x > 0 ) {
			
			x ++ ;
			System.out.println("x is positive , x = " + x);
		}
		else if ( x < 0 ){
			x--;
			System.out.println("x is negative , x = " + x);
		}
		else {
			x = 10;
			System.out.println("x is zero");
		}
			System.out.println("x = " + x);
		
			
		
	}
	
	public static void switchEx(){
		int x = 1000;
		switch(x){
		  case  100 : System.out.println("x is 100");
		         
		  case 1000 : System.out.println("x is 1000");
		             
		  case 10001 : System.out.println("x is 10001");
                       break;
		  default : System.out.println("x is something else");
		
		}
		
		
	}
} 
