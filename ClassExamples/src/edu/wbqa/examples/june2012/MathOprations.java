package edu.wbqa.examples.june2012;

public class MathOprations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int x1 = 10;
		int x2 = -25;
		double y1 = 25.6D;
		double y2 = -100.4D;
		
		System.out.println("Ceil operations :" + Math.ceil(y1) + " " + Math.ceil(y2) );
		System.out.println("Floor oprations :" + Math.floor(y1) + " " + Math.floor(y2));
		System.out.println("Round Oprations :" + Math.round(y1) + " " + Math.round(y2));
		
		System.out.println("Max : " + Math.max(y1, y2));
		System.out.println("Max : " + Math.max(x1, x2));
		
		System.out.println("Abs: " + Math.abs(y2));
		
		double rad = Math.PI / 2;
		System.out.println("Sin :" + rad + " " + Math.sin(rad));
	//	System.out.println("Asin :" + Math.asin(1.5));
		System.out.println("Sqrt:" + Math.sqrt(25.5));
		
		System.out.println("Random Number: " + Math.random());
		
		String str = "Hello";
		String str1 ="World";
		
		// Java does String interning
		
		StringBuffer buff = new StringBuffer(100);
		
		System.out.println(str.concat(str1));
		System.out.println(str.replaceAll("Hello","World"));
		System.out.println(str.substring(0, 2));
        System.out.println(str.indexOf("ll"));
        
        
	}

}
