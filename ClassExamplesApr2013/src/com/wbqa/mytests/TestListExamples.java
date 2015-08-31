package com.wbqa.mytests;

import java.util.Arrays;
import java.util.List;

import com.wbqa.demo.ListExamples;

public class TestListExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ListExamples l = new ListExamples();
		List myList = l.createArrayList();
	/*	System.out.println("Original List");
		l.printList(myList);
		
		List myList2 = l.createArrayList();
		myList.addAll(myList2);
		
		System.out.println("Modified List");
		int size = l.printList(myList);
		
		System.out.println("The new list has " + size + " elements");

		System.out.println(myList.get(1));
		
		List ll = l.createLinkedList();
		l.printList(ll);
		
		l.printListUsingIterator(myList);
		myList.set(0, "New Element");
		System.out.println("Printing elements in reverse order");
		l.printListUsingListIterator(myList);
		
	*/	
	 l.checkArrays(new String[] {"HTML","HTML5","Java","SQL"}, new String[]{"HTML","HTML5","Element3"});
     System.out.println(myList.contains(10));
     myList.remove(0);
     l.printList(myList);
     
     Object[] arr = myList.toArray();
     System.out.println(Arrays.toString(arr));
     
	}

	// write a method which removes duplicate elements from an integer array
	
}
