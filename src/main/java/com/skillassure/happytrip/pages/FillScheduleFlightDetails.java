package com.skillassure.happytrip.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.skillassure.happytrip.base.TestBase;

public class FillScheduleFlightDetails extends TestBase{
	
	
	@FindBy(xpath="/html/body/div[1]/ul/li[2]/a")
	@CacheLookup
	WebElement loginasadminbutton;
	
	@FindBy(id="username")
	@CacheLookup
	WebElement username;
	
	@FindBy(id="password")
	@CacheLookup
	WebElement password;
	
	@FindBy(id="signInButton")
	@CacheLookup
	WebElement signInButton;
	
	@FindBy(xpath="//*[@id=\"MainTabs\"]/li[5]/a")
	@CacheLookup
	WebElement scheduleFlight;
	
	@FindBy(id="flight")
	@CacheLookup
	WebElement flight;
	
	@FindBy(id="route")
	@CacheLookup
	WebElement route;
	
	@FindBy(id="distance")
	@CacheLookup
	WebElement distance;
	
	@FindBy(id="departureDate")
	@CacheLookup
	WebElement departureDate;
	
	@FindBy(id="departureTime")
	@CacheLookup
	WebElement departureDateSelect;
	
	@FindBy(id="arrivalDate")
	@CacheLookup
	WebElement arrivalDate;
	
	@FindBy(id="arrivalTime")
	@CacheLookup
	WebElement arrivalDateSelect;
	
	@FindBy(id="classBusiness")
	@CacheLookup
	WebElement Businessclass;
	
	@FindBy(id="classEconomy")
	@CacheLookup
	WebElement Economyclass;
	
	@FindBy(id="signInButtn")
	@CacheLookup
	WebElement addbutton;
	
	public FillScheduleFlightDetails() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void LoginasAdmin(String user, String pass) {
		loginasadminbutton.click();
		username.sendKeys(user);
		password.sendKeys(pass);
		signInButton.click();	
	}
	
	public void scheduleFlight() {
		scheduleFlight.click();
	}
	
	
	
	public void selectFlight(String title) {
		Select flightdata = new Select(flight);
		flightdata.selectByVisibleText(title);
	}
	
	public void selectroute(String routes) {
		Select routesdata = new Select(route);
		routesdata.selectByVisibleText(routes);
	}
	
	public void filldistance(String dist) {
		distance.click();
		distance.clear();
		distance.sendKeys(dist);
	}
	
	public void Depaturedate(String depaturedate) {
		((JavascriptExecutor)driver).executeScript ("document.getElementById('departureDate').removeAttribute('readonly',0);");
		departureDate.click();
		departureDate.clear();
		departureDate.sendKeys(depaturedate);
	}
	
	public void selectdeparturetime(String departuretime) {
		Select depature_time = new Select(departureDateSelect);
		depature_time.selectByVisibleText(departuretime);
	}
	
	public void Arrivaldate(String arrivaldate) {
		((JavascriptExecutor)driver).executeScript ("document.getElementById('arrivalDate').removeAttribute('readonly',0);");
		arrivalDate.click();
		arrivalDate.clear();
		arrivalDate.sendKeys(arrivaldate);
		
		
	}
	
	public void selectarrivaltime(String arrivaltime) {
		Select arrival_time = new Select(arrivalDateSelect);
		arrival_time.selectByVisibleText(arrivaltime);
	}
	
	public void businessclass(String businessmoney) {
		Businessclass.click();
		Businessclass.clear();
		Businessclass.sendKeys(businessmoney);
		
	}
	
	public void economyclass(String economymoney) {
		Economyclass.click();
		Economyclass.clear();
		Economyclass.sendKeys(economymoney);
		
	}
	
	public void add(){
		addbutton.click();
		
		
	}
	
	public void addFlight(String user, String pass, String title) {
		LoginasAdmin(user, pass);
		scheduleFlight();
		selectFlight(title);
		
	}
	public void addRoutes(String user, String pass, String title, String routes) {
		LoginasAdmin(user, pass);
		scheduleFlight();
		selectFlight(title);
		selectroute(routes);
		
	}
	
	public void addDistance(String user, String pass, String title, String routes, String dist) {
		LoginasAdmin(user, pass);
		scheduleFlight();
		selectFlight(title);
		selectroute(routes);
		filldistance(dist);
		
	}
	
	public void selectdeparturedate(String user, String pass, String title, String routes, String dist, String depaturedate) {
		LoginasAdmin(user, pass);
		scheduleFlight();
		selectFlight(title);
		selectroute(routes);
		filldistance(dist);
		Depaturedate(depaturedate);
		
	}
	
	public void selectdeparturetime(String user, String pass, String title, String routes, String dist, String depaturedate,String departuretime) {
		LoginasAdmin(user, pass);
		scheduleFlight();
		selectFlight(title);
		selectroute(routes);
		filldistance(dist);
		Depaturedate(depaturedate);
		selectdeparturetime(departuretime);
	}
	
	public void selectarrivaldate(String user, String pass, String title, String routes, String dist, String depaturedate,String departuretime,String arrivaldate) {
		LoginasAdmin(user, pass);
		scheduleFlight();
		selectFlight(title);
		selectroute(routes);
		filldistance(dist);
		Depaturedate(depaturedate);
		selectdeparturetime(departuretime);
		Arrivaldate(arrivaldate);
	}
	
	public void selectarrivaltime(String user, String pass, String title, String routes, String dist, String depaturedate,String departuretime,String arrivaldate, String arrivaltime) {
		LoginasAdmin(user, pass);
		scheduleFlight();
		selectFlight(title);
		selectroute(routes);
		filldistance(dist);
		Depaturedate(depaturedate);
		selectdeparturetime(departuretime);
		Arrivaldate(arrivaldate);
		selectarrivaltime(arrivaltime);
	
	}
	
	public void fillbusinessfees(String user, String pass, String title, String routes, String dist, String depaturedate,String departuretime,String arrivaldate, String arrivaltime, String businessmoney) {
		LoginasAdmin(user, pass);
		scheduleFlight();
		selectFlight(title);
		selectroute(routes);
		filldistance(dist);
		Depaturedate(depaturedate);
		selectdeparturetime(departuretime);
		Arrivaldate(arrivaldate);
		selectarrivaltime(arrivaltime);
		businessclass(businessmoney);
	}
	
	
	
	public void fillscheduledata(String user, String pass, String title, String routes,String dist,String depaturedate,String departuretime,String arrivaldate, String arrivaltime,String businessmoney, String economymoney) {
		LoginasAdmin(user, pass);
		scheduleFlight();
		selectFlight(title);
		selectroute(routes);
		filldistance(dist);
		Depaturedate(depaturedate);
		selectdeparturetime(departuretime);
		Arrivaldate(arrivaldate);
		selectarrivaltime(arrivaltime);
		businessclass(businessmoney);
		economyclass(economymoney);
		add();

		
		
	}

	
	
	
}
