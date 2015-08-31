package edu.wbqa.examples.june2012;

public abstract class Animal {
       int legs ;
       public Animal(int legs){
    	   this.legs = legs;
       }
       public  abstract void move();
       public abstract void eat();
       public String toString(){
    	   String str = "This Animal has " + this.legs ;
    	   return str;
    	   
       }
}
