package edu.wbqa.examples.june2012;
import junit.framework.*;


public class TestArrays extends TestCase {
	
	public TestArrays(){
		super();
	}
	
	public TestArrays(String methodName){
		super(methodName);
	}
	  
	public void testFindMaxSimple(){
		int actual = ArraysExamples.findMax(new int [] {1,2,3,4});
		assertEquals(4, actual);
	}
	
	public void testFindMaxOrder(){
		int actual = ArraysExamples.findMax(new int [] {2,2,3,4});
		assertEquals(4, actual);
		actual = ArraysExamples.findMax(new int [] {4,3,3,1});
		assertEquals(4, actual);
	}
	
	public void testFindMaxLargeValues(){
		int actual = ArraysExamples.findMax(new int [] {100000,200,3,49});
		assertEquals(100000, actual);
	}
	
	public void testFindMaxBoundries(){
		int actual = ArraysExamples.findMax(new int [] {Integer.MAX_VALUE + 61277,Integer.MAX_VALUE,3,49});
		assertEquals(Integer.MAX_VALUE, actual);
	}
	
	public static Test testSuite(){
		
		TestSuite myTestSuite = new TestSuite();
		myTestSuite.addTest(new TestArrays("testFindMaxSimple"));
		myTestSuite.addTest(new TestArrays("testFindMaxOrder"));
		myTestSuite.addTest(new TestArrays("testFindMaxBoundries"));
		return myTestSuite;
	}

}
