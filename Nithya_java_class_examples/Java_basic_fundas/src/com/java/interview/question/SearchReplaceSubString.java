package com.java.interview.question;

public class SearchReplaceSubString {

	   
        public static void main(String[] args) {

            String str = "This is a search and replace of substring example";

            System.out.println("The original String is: " + str);

            // We want to look for the String "search" and replace it with "find"
            
            
            String searchWord = "search";
            String replaceWord = "find";
            
            
            int startIndexVal = 0;
            int endIndexVal = 0;

            
            startIndexVal = str.indexOf(searchWord);// look for the starting index of searchQuery

           
            endIndexVal = startIndexVal + searchWord.length();  // evaluate the ending Index of searchQuery

           
            if(startIndexVal != -1){ // I m checking whether the search word is avaiable in the string
            str = str.substring(0, startIndexVal) + replaceWord
                    + str.substring(endIndexVal);
            System.out.println("The modified String is: " + str);
            }
            else{
            	 System.out.println("There is No match found");
            }
           

        }

    }