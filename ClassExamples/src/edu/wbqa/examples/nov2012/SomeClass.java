package edu.wbqa.examples.nov2012;

public class SomeClass {

	int x ;
	private SomeClass(int x){
		this.x = x;
	}
	
	public static SomeClass getInstance(){
		return new SomeClass(5);
	}
}
