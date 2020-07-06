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

public class ScheduleFlightTestCase3 extends TestBase{
	
	private static Logger Log = LogManager.getLogger(ScheduleFlightTestCase3.class);
	
	
	FillScheduleFlightDetails filldetail;
	String sheetname = "Sheet3";
	
	public ScheduleFlightTestCase3() {
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
	
	public void validateroutesdetails(String username, String password,String flight, String route){
		Log.info("select the route");
		filldetail.addRoutes(username, password, flight, route);
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	

}
