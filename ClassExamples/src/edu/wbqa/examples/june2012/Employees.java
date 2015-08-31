package edu.wbqa.examples.june2012;

import java.sql.Connection;
import java.sql.Driver;

public class Employees {
	
	 private int empId;
	 private String empName;
	 public static String companyName ;
	 public static Connection conn = null;
	 
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Employees(int empId, String empName) {
		
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public void print(){
	//	Employee e  = new Employee(1113,"abc");
		System.out.println("This is employee class");
	}
	
	static {
		 companyName = "Innova-Path";

		
	}

}
