package com.revit.dao;

public interface FindFlightDao {
	public void checkOneway();

	public void checkRoundTrip();

	public void passDeparting(String depFrom);

	public void passArrival(String arrTo);

	public void clickFindFlight();

	public void checkFirstClass();
	
	public void navi();
}
