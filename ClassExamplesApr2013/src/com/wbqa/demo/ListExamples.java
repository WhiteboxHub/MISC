package com.wbqa.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListExamples {

	public List createArrayList(){
		
		List list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add("Hello world");
		return list;
		
	}
	
	public List createLinkedList(){
		
		List list = new LinkedList();
		list.add(10.5);
		list.add(20.5);
		list.add(new StringBuffer("Hi! How are you"));
		
		return list;
	}
	
	public int printList(List l){
		
		for (Object x : l){
			System.out.println(x);
		}
		return l.size();
	}
	
	public int printListUsingIterator(List l){
		
		int size = 0;
		
		Iterator it = l.iterator();
		while (it.hasNext()){
			Object o = it.next();
			System.out.println(o);
			size++;
		}
		
		return size;
	}
	
	// this method prints the list in reverse order
	public int printListUsingListIterator(List l){
		
		int size = 0;
		
		ListIterator it = l.listIterator(l.size()-1);
		it.next();
		while (it.hasPrevious()){
			Object o = it.previous();
			System.out.println(o);
			size++;
		}
		return size;
	}
	
	//expectedArray={"HTML","HTML5","Java","SQL"); // test data 
	//actualArray={"HTML","HTML5"};
	public void checkArrays(String[] expected , String[] actual){
		List expList = new ArrayList();
		List actList = new ArrayList();
		
		// add arrayElements in the list
		for (String x :expected){
			expList.add(x);
		}
		
		for (String x : actual){
			actList.add(x);
		}
		
		if (expList.containsAll(actList))
			System.out.println("All the elements are present in the list");
		else
			System.out.println("Some unexpected elements");
		
		
	}
	
	// int[] x = { 1,2, 3 , 4, 6,7,8,9,10};
	
	
}
