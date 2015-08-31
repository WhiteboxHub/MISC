package com.wbqa.demo;

public abstract class MyAbstractClass {
     int x;
	public MyAbstractClass(){
		x = -1;
		System.out.println("I m in super class");
	}
	public MyAbstractClass(int y){
		x = y;
	}
	public void somemethod(){
		System.out.println("abc");
	}
	
}
