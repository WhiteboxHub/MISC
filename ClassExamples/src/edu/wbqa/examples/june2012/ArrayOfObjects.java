package edu.wbqa.examples.june2012;

public class ArrayOfObjects {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student [] aprilBatch = new Student[3];
       
       /*
       for ( int i =0 ; i < aprilBatch.length ; i++) {
    	   aprilBatch[i] = new Student("abc",100,100.5);
       }
      */
       aprilBatch[0] = new Student("abc",89,100.5);
       aprilBatch[1] = new Student("def",78,45.5);
       aprilBatch[2] = new Student("xyz",29,39.5);
       
       for ( Student x : aprilBatch) {
    	   System.out.println("Name:" + x.name + " Id:" + x.Id + " score:" + x.score );
       }
       
       
	}

}
