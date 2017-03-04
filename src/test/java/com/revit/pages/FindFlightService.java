package com.revit.pages;

public interface FindFlightService {

	public void selectOneway();

	public void selectRoundTrip();

	public void enterDeparting(String depFrom);

	public void enterArrival(String arrTo);

	public void findFlight();

	public void selectFirstClass();

}
