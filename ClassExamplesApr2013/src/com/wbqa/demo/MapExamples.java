package com.wbqa.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapExamples {

	public Map createMap(){
		Map map = new HashMap();
		
		List address = new ArrayList();
		address.add("Fremont");
		address.add("Dublin");
		
		map.put("username", "Sam");
		map.put("password","wbqa");
		map.put("address", address);
		
		
		return map;
	}
	
	public int printMap(Map map){
		int size = 0;
		Set keySet = map.keySet();
	//	List values = (List) map.values();
		Iterator it = keySet.iterator();
		while(it.hasNext()){
			Object key = it.next();
			System.out.println(key + "=" + map.get(key));
			size++;
		}
		return size;
	}
	
}
