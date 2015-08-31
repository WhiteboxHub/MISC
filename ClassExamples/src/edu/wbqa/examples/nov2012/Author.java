package edu.wbqa.examples.nov2012;

public class Author {

	private String name;
	private String email ;
	private char gender;
	
	public String lastName;
	
		
	public Author(String fName,String lName, String email, char gender){
		this.name = fName;
		this.email = email;
		this.gender = gender;
		this.lastName = lName;
		System.out.println("Super class");
	}
	
	public String getName(){
		return name;
	}
	public String getEmail(){
		return email;
	}
	public char getGender(){
		return gender;
	}
	public void setEmail(String email){
		this.email = email;
	}
	@Override
	public String toString(){
		return (name + "(" + gender + ") at " + email);
	}
}
