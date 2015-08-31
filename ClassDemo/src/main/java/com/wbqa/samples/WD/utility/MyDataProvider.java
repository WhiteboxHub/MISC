package com.wbqa.samples.WD.utility;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import  org.testng.annotations.DataProvider;
import com.csvreader.*;

public class MyDataProvider {


	@DataProvider(name="data")
	public static Object[][] testData(){
		Object[][] data = new Object[][] {
				{"Sandra Brown", "valid" },
				{"hdjkhsjs" , "invalid"}
		};
		return data;
	}
	
	@DataProvider
	public static Object[][] testDataFromCSV(){
		int rows = 0;
		List<String[]> list = new ArrayList<String[]>();
		try {
			CsvReader reader = new CsvReader("C:\\Users\\Shilpi\\SkyDrive\\training\\mcData.csv");
			
			reader.readHeaders();
			String[] cols =  new String[3];
			while(reader.readRecord()){
				
				cols[0] = reader.get("State");
				cols[1] = reader.get("LoanType");
				cols[2] = reader.get("Amount");
				rows++;
				list.add(cols);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Object[][] data =  new Object[rows][3];
		 for (int i = 0 ; i < rows ; i++){
			  data[i] = list.get(i);
		  }
		
		return data;
		
		
	}
}