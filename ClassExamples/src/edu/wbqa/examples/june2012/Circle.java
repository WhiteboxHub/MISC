package edu.wbqa.examples.june2012;

public abstract class Circle implements Shape {

	   int radius ;
	   public double getArea(){
		   return (3.14 * radius * radius);
	   }
	@Override
	public abstract double getParameter() ;
		
}
