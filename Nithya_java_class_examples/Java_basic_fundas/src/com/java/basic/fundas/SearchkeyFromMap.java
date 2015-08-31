package com.java.basic.fundas;

import java.util.*;

public class SearchkeyFromMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please Enter the Key :" );
		Scanner s = new Scanner(System.in);
		String key = s.nextLine();
		boolean found = true;
		Map<String , String> map = new HashMap<String,String>();

		map.put("todd", "bluesky");
		map.put("john", "greentree");
		map.put("mike", "clearwater");
		map.put("judy", "greyclouds");

		Set<String> usernames = map.keySet();
		Iterator<String> it = usernames.iterator();

		while(it.hasNext()){

			String curKey = it.next().toString();

			if(key.equals(curKey)){

				System.out.println("Here is the Password for the " +map.get(curKey) );
				found = false;
			}

		}
		if(found){
			
			System.out.println("Please Enter the valid Key");
	}
}

}
