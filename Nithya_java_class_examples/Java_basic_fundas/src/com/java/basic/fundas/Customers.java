package com.java.basic.fundas;

public class Customers implements Comparable<Customers>
{
private String firstName;
private String lastName;
 private int age;
 private double orderValue;

 public Customers(String firstName, String lastName, int age, double orderValue )
 {
 this.firstName = firstName;
 this.lastName = lastName;
 this.age = age;
 this.orderValue = orderValue;
 }

 public String concatName() { return firstName + " " + lastName; }
 public String getFirstName() { return firstName; }
 public String getLastName() { return lastName; }
 public int getAge() { return age; }
 public double getOrderValue() { return orderValue; }

 public int compareTo( Customers c)
 {
  return lastName.compareTo(c.getLastName());
 }
}
//--- End: Customer.java --------------- 