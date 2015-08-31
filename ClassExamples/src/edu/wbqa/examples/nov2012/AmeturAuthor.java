package edu.wbqa.examples.nov2012;

public class AmeturAuthor extends Author {
  public AmeturAuthor(String fname , String lname , String email , char gender){
	  super(fname,lname,email,gender);
	  System.out.println("SubClass Constructor");
  }
}
