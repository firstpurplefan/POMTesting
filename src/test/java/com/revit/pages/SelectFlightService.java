package com.revit.pages;

public interface SelectFlightService {
	public void selectFlight();

	public String getFromPort();

	public String getToPort();

	public String getServClass();
	
	public void navigate();
}
