package edu.wbqa.examples.nov2012;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// by default Java reserves 10 spaces for list
		// we can always give the initial capacity
		// Generics
		//List is an ordered collection
 /*    List<Integer> myList = new ArrayList<Integer>(100);
     myList.add(1000);
     myList.add(3000);
     myList.add(5000);
*/
/*     System.out.println(myList.get(1));
      
     List<Integer> myList1 = new ArrayList<Integer>();
     myList1.add(20);
     myList1.add(21);
     
     myList.addAll(myList1);
     printList(myList);
   
     if (myList.contains(10001))
    	 System.out.println("Element is present");
     else
    	 System.out.println("Element is not present");
     */
     
   /*  addIncrement(myList);
     
    List<String> lList = new LinkedList<String>();
    
    lList.add("str1");
    lList.add("str2");
    lList.add("str3");
    
    printList(lList);
    */
  /*  List<String> expectedLinks = new ArrayList<String>();

    expectedLinks.add("HTML8");
    expectedLinks.add("HTML6");
    expectedLinks.add("HTML7");
    
    List<String> actualLinks = new ArrayList<String>();
    actualLinks.add("HTML7");
    actualLinks.add("HTML5");
    actualLinks.add("HTML6");
    actualLinks.add("HTML");
    */
    
    /*
    if (contains(actualLinks,expectedLinks))
    	System.out.println("test case passes");
    else
    	System.out.println("test case fails");*/
		
	/*	int [] a = {1,1,2,3,4,5};
		int[] b = {1,3,5};
		
		removeSame(a,b);
    */
		getStudentList();
		
	}
	public static void printList(List myList){
   	 
		   Iterator it = myList.iterator();
		     while (it.hasNext()){
		    	 System.out.println(it.next());
		     }
    }
	//this method checks whether one list is contained in another list
	public static boolean contains(List list , List sublist){
		if (list.containsAll(sublist))
			return true;
		else return false;
	}
	
	public static void addIncrement(List myList){
		
		 Iterator it = myList.iterator();
		 System.out.println(myList.size());
		 
	     while (it.hasNext()){
	    	 System.out.println((Integer)it.next() +  100);
	     }
	}
	// this method removes all the elements from an array A which are present in array B
	// array A = { 1, 2, 3 ,4, 5}
	// array B = { 1 ,3 ,5 }
	//output array A = {2,4 }
	public static void removeSame(int[] a , int[] b){
		List<Integer> lA = new ArrayList<Integer>();
		for (int x : a){
			lA.add(x);
		}
		System.out.println("Original List");
		printList(lA);
		
		List<Integer> lB = new ArrayList<Integer>();
		for (int x : b){
			lB.add(x);
		}
		
		lA.removeAll(lB);
		System.out.println("Changed List");
		printList(lA);
		
		
	}
	// this method contains list of students
	public static void getStudentList(){
		List<Student> s = new ArrayList<Student>();
		Student s1 = new Student(1,"shilpi","QA");
		Student s2 = new Student(2,"Sam","QA");
		
		s.add(s1);
		s.add(s2);
	
		Student s3 = new Student(1,"shilpi","QA");
		
		if (s.contains(s3))
			System.out.println("Student is present");
		else
			System.out.println("Student is not present");
		
	}
}
