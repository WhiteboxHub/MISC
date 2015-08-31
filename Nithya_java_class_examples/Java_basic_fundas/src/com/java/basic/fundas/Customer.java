package com.java.basic.fundas;

public class Customer {
	
	private String fristName;
	private String lastName;
	private int empId;
	
	public Customer(){
		
	}
	
	public Customer(String fName,String lName,int id){
		this.fristName = fName;
		this.lastName = lName;
		this.empId = id ;
	}
	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}

}
