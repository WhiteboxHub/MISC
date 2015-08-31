package com.wbqa.demo;

public class Student implements java.io.Serializable {

	private int sId;
	transient private String name;
	private double sTestScore;
	public int age;
	
	public Student(int sId, String name, double sTestScore){
		this.sId = sId;
		this.name = name;
		this.sTestScore = sTestScore;
	}
	
	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getsTestScore() {
		return sTestScore;
	}

	public void setsTestScore(double sTestScore) {
		this.sTestScore = sTestScore;
	}

	

}
