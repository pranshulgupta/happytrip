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

public class ScheduleFlightTestCase2 extends TestBase {
	
	private static Logger Log = LogManager.getLogger(ScheduleFlightTestCase2.class);
	
FillScheduleFlightDetails filldetails;
String sheetname = "Sheet2";
	
	
	
	
	public ScheduleFlightTestCase2() {
		super();
	}
	
	
	@BeforeMethod
	public void setup() {
		Log.info("initializing the method");
		initialization();
		filldetails = new FillScheduleFlightDetails();
		
	}
	@DataProvider
	public Object[][] getexceldata() {
		Object data[][] = TestUtil.getTestData(sheetname);
		
		return data;
		
		
	}
	
	@Test(dataProvider="getexceldata")
	public void validateFlightSelect(String username, String password,String flight){
		Log.info("entering the flight");
		filldetails.addFlight(username, password, flight);
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
