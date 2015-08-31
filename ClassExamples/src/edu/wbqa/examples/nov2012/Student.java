package edu.wbqa.examples.nov2012;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Student  implements java.io.Serializable{
	
  private int id;
  private String name;
  private String courseId;
  private GradeSheet sheet;
  
  public Student(int id, String name, String courseId) {
		super();
		this.id = id;
		this.name = name;
		this.courseId = courseId;
		
	}
 public Student(int id, String name, String courseId, GradeSheet sheet) {
	super();
	this.id = id;
	this.name = name;
	this.courseId = courseId;
	this.sheet = sheet;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCourseId() {
	return courseId;
}
public void setCourseId(String courseId) {
	this.courseId = courseId;
}
public String toString(){
	
	return("Student Id :" + this.id + "\nStudent Name:" + this.name
	+ "Student Course" + this.courseId 
	+ "Student Grade" + this.sheet.getGrade());
}
public void createStudent(File myFile) throws Exception{
	
	
	ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(myFile));
	out.writeObject(this);
	out.close();
	
	
}
public void readStudent(File myFile){
	try {
	ObjectInputStream in = new ObjectInputStream (new FileInputStream(myFile));
	Student s ;
	s = (Student)in.readObject();
	System.out.println(s.getId());
	System.out.println(s.getName());
	System.out.println(s.getCourseId());
	in.close();
	}
	catch(Exception e){
		System.out.println(e.getMessage());
	}
	
}
}
