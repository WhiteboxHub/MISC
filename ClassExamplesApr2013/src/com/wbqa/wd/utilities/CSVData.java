package com.wbqa.wd.utilities;

import java.util.ArrayList;
import java.util.List;

import com.wbqa.wd.pagedata.MCHomePageData;

public class CSVData {

	//this method would read data file
	public void readCSV(String filepath){
		
		List<MCHomePageData> list = new ArrayList<MCHomePageData>();
		
	//	FileReader fr 
	/*	
		while ((str= fr.readline())){
			String[] cols =  str.split("&");
			MCHomePageData pdata = new MCHomePageData(cols[0],cols[1],cols[2],cols[3]);
			list.add(pdata);
		}
		*/
	}
}
