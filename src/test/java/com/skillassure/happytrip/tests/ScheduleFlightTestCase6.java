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

public class ScheduleFlightTestCase6 extends TestBase{
	private static Logger Log = LogManager.getLogger(ScheduleFlightTestCase6.class);
	FillScheduleFlightDetails filldetail;
	String sheetname = "Sheet6";
	
	public ScheduleFlightTestCase6() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		Log.info("initializing the method");
		initialization();
		filldetail = new FillScheduleFlightDetails();
		
	}
	@DataProvider
	public Object[][] getexceldata() {
		Object data[][] = TestUtil.getTestData(sheetname);
		
		return data;
		
		
	}
	
	@Test(dataProvider="getexceldata")
	public void ValidatedepartureTime(String username, String password,String flight, String route, String distance, String depaturedate,String depaturetime){
		Log.info("select the departure time");
		filldetail.selectdeparturetime(username, password, flight, route, distance, depaturedate, depaturetime);
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	

}
