package com.revit.services;

import org.openqa.selenium.WebDriver;

import com.revit.dao.SelectFlightDao;
import com.revit.dao.SelectFlightDaoImpl;

public class SelectFlightServiceImpl implements SelectFlightService {
	private SelectFlightDao dao;

	public SelectFlightServiceImpl(WebDriver driver)
	{
		dao = new SelectFlightDaoImpl(driver, "http://newtours.demoaut.com/mercuryreservation2.php");
	}

	public void selectFlight() {
		dao.clickSelectFlight();
	}

	public String getFromPort() {
		return dao.readFromPort();
	}

	public String getToPort() {
		return dao.readToPort();
	}

	public String getServClass() {
		return dao.readServClass();
	}
	
	public void navigate()
	{
		dao.navi();
	}
}
