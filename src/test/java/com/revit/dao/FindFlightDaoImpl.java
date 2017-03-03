package com.revit.dao;

import org.openqa.selenium.WebDriver;

import com.revit.model.FindFlight;

public class FindFlightDaoImpl extends AbstractDao<FindFlight> implements FindFlightDao{
	FindFlight page;

	public FindFlightDaoImpl(WebDriver browser, String url) {
		super(browser, url);
		page = this.getPage();
		// TODO Auto-generated constructor stub
	}

	public void checkOneway() {
		// TODO Auto-generated method stub
		page.getOnewayRadio().click();
	}

	public void checkRoundTrip() {
		// TODO Auto-generated method stub
		page.getRoundTripRadio().click();
	}

	public void passDeparting(String depFrom) {
		// TODO Auto-generated method stub
		page.getDepBox().sendKeys(depFrom);
	}

	public void passArrival(String arrTo) {
		// TODO Auto-generated method stub
		page.getArrBox().sendKeys(arrTo);
	}

	public void clickFindFlight() {
		// TODO Auto-generated method stub
		page.getFindFlighButton().click();
	}

	public void checkFirstClass() {
		// TODO Auto-generated method stub
		page.getFirstClassBox().click();
	}

}
