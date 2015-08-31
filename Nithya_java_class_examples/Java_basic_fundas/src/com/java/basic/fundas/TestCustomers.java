package com.java.basic.fundas;


//--- Begin: TestCustomer.java ---------------
import java.util.*;

class TestCustomers
{
public static void main(String[] args)
{
  Customers[] cstArray = new Customers[3];
  cstArray[0] = new Customers("John", "Smith", 30, 100.0);
  cstArray[1] = new Customers("Judy", "Miller", 25, 150.0);
  cstArray[2] = new Customers("Neil", "Armstrong", 27, 200.0);

  System.out.println(" *** BEFORE SORT ****** " );
  System.out.println("---------------------------------");
  System.out.println(" Name Age Order Value");
  System.out.println("---------------------------------");

  for (int i = 0; i < cstArray.length; i++)
  {
    Customers cst = cstArray[i];
    System.out.println(cst.concatName() + " " + cst.getAge()
          + " " + cst.getOrderValue());
  }

  Arrays.sort(cstArray);

  System.out.println("\n *** AFTER SORT ****** " );
  System.out.println("---------------------------------");
  System.out.println(" Name Age Order Value");
  System.out.println("---------------------------------");

  for (int i = 0; i < cstArray.length; i++)
  {
    Customers cst = cstArray[i];
    System.out.println(cst.concatName() + " " + cst.getAge()
          + " " + cst.getOrderValue());
  }
}
}
//--- End: TestCustomer.java ---------------
