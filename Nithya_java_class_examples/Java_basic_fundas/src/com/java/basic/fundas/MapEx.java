package com.java.basic.fundas;


//--- Begin: TestUsername.java ------------
import java.util.*;

class MapEx
{
  public static void main(String[] args)
  {
      Map<String, String> map = new HashMap<String, String>();// Map object Creations . 
      
      map.put("todd", "bluesky");// adding the elements .
      map.put("john", "greentree");
      map.put("mike", "clearwater");
      map.put("judy", "greyclouds");

      Set<String> usernames = map.keySet(); // To get the Key values in the frm of Set .
      Iterator<String> it = usernames.iterator();

      String uname, password;
      System.out.println(" Username   Password ");
      System.out.println(" ********************* ");

      while (it.hasNext())
      {
          uname = it.next();
          password = map.get(uname); // used to get the values from the map object
          System.out.println("  " + uname + "     " + password);
      }
  }
}
//--- End: TestUsername.java ---------------