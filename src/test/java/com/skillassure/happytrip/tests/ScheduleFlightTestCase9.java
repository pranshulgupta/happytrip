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

public class ScheduleFlightTestCase9 extends TestBase{
	private static Logger Log = LogManager.getLogger(ScheduleFlightTestCase9.class);
	FillScheduleFlightDetails filldetail;
	String sheetname = "Sheet9";
	
	public ScheduleFlightTestCase9() {
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
	public void Validatebusinessfill(String username, String password,String flight, String route, String distance, String depaturedate,String depaturetime,String arrivaldate, String arrivaltime, String business){
		Log.info("fill the business seat amount");
		filldetail.fillbusinessfees(username, password, flight, route, distance, depaturedate, depaturetime, arrivaldate, arrivaltime, business);
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	

}
