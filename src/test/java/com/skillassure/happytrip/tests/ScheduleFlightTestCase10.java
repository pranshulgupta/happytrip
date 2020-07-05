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

public class ScheduleFlightTestCase10 extends TestBase{
	private static Logger Log = LogManager.getLogger(ScheduleFlightTestCase10.class);
	FillScheduleFlightDetails filldetail;
	String sheetname = "Sheet10";
	
	public ScheduleFlightTestCase10() {
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
	public void Validatesignupbutton(String username, String password,String flight, String route, String distance, String depaturedate,String depaturetime,String arrivaldate, String arrivaltime, String business, String economy){
		Log.info("checking add button");
		filldetail.fillscheduledata(username, password, flight, route, distance, depaturedate, depaturetime, arrivaldate, arrivaltime, business, economy);
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	

}
