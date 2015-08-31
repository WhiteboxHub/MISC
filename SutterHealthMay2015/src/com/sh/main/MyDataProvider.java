package com.sh.main;

import org.testng.annotations.DataProvider;

public class MyDataProvider {

	@DataProvider(name = "searchdata", parallel = true)
	public static Object[][] getSearchData(){
		Object[][] data = new Object [][]{
				{"Flu Shots" , "86"},
				{"Ebola" , "5"},
				{"Patients" , "3432"}
		};
		 return data;
		
	}
}
