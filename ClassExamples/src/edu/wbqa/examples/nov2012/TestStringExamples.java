package edu.wbqa.examples.nov2012;

import java.util.Arrays;

public class TestStringExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "This is a beautiful day";
		StringBuffer buf = new StringBuffer("This is a beautiful day");
		StringExamples.reverseWordsinSentence1(buf);
		System.out.println(buf);
		// TODO Auto-generated method stub
      //  System.out.println(StringExamples.findSubStr("This is a beautiful day", "ish"));
	//	System.out.println(StringExamples.findAllSubStr("This is a beautiful day", "is"));
//		System.out.println(S);
	//	StringExamples.changeString("This  is a beautiful day");
	/*	StringBuffer str = new StringBuffer("This  is a beautiful day");
		StringExamples.reverseWord(str);
		System.out.println(str);*/
	/*	StringExamples.reverseWord1(str);
		System.out.println(str);
	/*	StringBuffer bf = new StringBuffer(str);
		StringExamples.reverseWordsinSentence(bf);
		System.out.println(bf);*/
		/*int x = 10;
		StringExamples.changeMyParam(x);
		System.out.println(x);*/
		
		// dontmakeChangeinString(String str) // string is immutable
		// thechanges will not be reflected
		// makeChangesinString(StringBuffer str)
		// dontmakeChangeinInteger(int x ,Integer y) // Integer is immutable
		// thechanges will not be reflected
		// makeChangesinInteger(MutableInt y)
		
		
	//	Arrays.toString(StringExamples.printWordsLengths(str));
		/*String str1 = str.concat("WOW");
		System.out.println(str);
		System.out.println(str1);
		*/
		
	//	StringExamples.removeSubStr(str, "beautiful");
		
		// synchronised // thread safe // slow as compared to StringBuilder
	/*	StringBuffer bf = new StringBuffer("Hello");
		bf.append("World");
		System.out.println(bf);
		
		// not synchronised // not thread safe 
		StringBuilder br = new StringBuilder("Hello"); 
		br.append("World");*/
		
		long startTime = System.currentTimeMillis();
		StringBuilder[] sb = new StringBuilder[50000];
		for (int i = 0 ; i <50000 ; i++){
			sb[i] = new StringBuilder("Hello World");
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken by StringBuilder : " + (endTime - startTime)   );
		
		startTime = System.currentTimeMillis();
		StringBuffer[] sb1 = new StringBuffer[50000];
		for (int i = 0 ; i <50000 ; i++){
			sb1[i] = new StringBuffer("Hello World");
		}
		endTime = System.currentTimeMillis();
		System.out.println("Time taken by StringBuffer :" + (endTime - startTime)   );
		
		startTime = System.currentTimeMillis();
		String[] sb3 = new String[50000];
		for (int i = 0 ; i <50000 ; i++){
			sb3[i] = "Hello World";
		}
		endTime = System.currentTimeMillis();
		System.out.println("Time taken by String :" + (endTime - startTime)   );
		
	
	}
	

}
