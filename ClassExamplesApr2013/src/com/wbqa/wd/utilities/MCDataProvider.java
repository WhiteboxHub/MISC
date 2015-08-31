package com.wbqa.wd.utilities;

import org.testng.annotations.DataProvider;
import com.wbqa.wd.pagedata.*;
public class MCDataProvider {

	@DataProvider(name="hpdata", parallel =true)
	public static Object[][] homepageData(){
		
		MCHomePageData obj1 = new MCHomePageData("New Home Purchase","500,000","94568");
		MCHomePageData obj2 = new MCHomePageData("Home Refinance","300,000","94538");
		
		return new Object[][]{
				{obj1},
				{obj2}
		};
		
	}
}
