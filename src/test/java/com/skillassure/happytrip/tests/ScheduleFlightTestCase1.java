package com.skillassure.happytrip.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.skillassure.happytrip.base.TestBase;
import com.skillassure.happytrip.pages.FillScheduleFlightDetails;
import com.skillassure.happytrip.utils.TestUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;




public class ScheduleFlightTestCase1 extends TestBase {
	
	private static Logger Log = LogManager.getLogger(ScheduleFlightTestCase1.class);
	
	FillScheduleFlightDetails filldetails;
	String sheetname = "Sheet1";
	
	
	
	
	public ScheduleFlightTestCase1() {
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
	public void validatelogindetails(String username, String password){
		Log.info("entering as admin");
		filldetails.LoginasAdmin(username, password);
	}
	
	
	
	
	@AfterMethod
	public void teardown() {
		Log.info("closing the browser");
		driver.quit();
	}
	
	
	
	
	
	
	
	

}
