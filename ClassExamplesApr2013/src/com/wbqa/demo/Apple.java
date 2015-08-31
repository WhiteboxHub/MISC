package com.wbqa.demo;

public class Apple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "<html> <head> </head></html>";
		System.out.println(str);
		String str1 = str.replaceAll("<head>", "");
		System.out.println(str1);
		
		int s = str.indexOf("<head>");
		if ( s >= 0){
			
			String pre = str.substring(0 , s-1);
			
			String post = str.substring(s + "<head>".length() - 1);
			
			System.out.println(pre + post);
		}
		
		
	}

}
