package com.skillassure.happytrip.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.skillassure.happytrip.base.TestBase;
import com.skillassure.happytrip.pages.FillScheduleFlightDetails;
import com.skillassure.happytrip.utils.TestUtil;

public class ScheduleFlightTestCase4 extends TestBase{
	private static Logger Log = LogManager.getLogger(ScheduleFlightTestCase4.class);
	
	FillScheduleFlightDetails filldetail;
	String sheetname = "Sheet4";
	
	public ScheduleFlightTestCase4() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		filldetail = new FillScheduleFlightDetails();
		
	}
	@DataProvider
	public Object[][] getexceldata() {
		Object data[][] = TestUtil.getTestData(sheetname);
		
		return data;
		
		
	}
	
	@Test(dataProvider="getexceldata")
	public void validatedistance(String username, String password,String flight, String route, String distance){
		Log.info("flll the distance");
		filldetail.addDistance(username, password, flight, route, distance);
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	

}
