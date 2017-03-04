package com.revit.services;

import org.openqa.selenium.WebDriver;

import com.revit.dao.BookFlightDao;
import com.revit.dao.BookFlightDaoImpl;
import com.revit.dao.FindFlightDao;
import com.revit.dao.FindFlightDaoImpl;

public class FindFlightServiceImpl implements FindFlightService{

	private FindFlightDao dao;

	/**
	 * This method will enter the first name to the text box.
	 * 
	 * @param firstName
	 * @return
	 */
	public FindFlightServiceImpl(WebDriver driver) {
		dao = new FindFlightDaoImpl(driver, "http://newtours.demoaut.com/mercuryreservation.php");
	}
	public void selectOneway() {
		// TODO Auto-generated method stub
		dao.checkOneway();
	}

	public void selectRoundTrip() {
		// TODO Auto-generated method stub
		dao.checkRoundTrip();
	}

	public void enterDeparting(String depFrom) {
		// TODO Auto-generated method stub
		dao.passDeparting(depFrom);
	}

	public void enterArrival(String arrTo) {
		// TODO Auto-generated method stub
		dao.passArrival(arrTo);
	}

	public void findFlight() {
		// TODO Auto-generated method stub
		dao.clickFindFlight();
	}

	public void selectFirstClass() {
		// TODO Auto-generated method stub
		dao.checkFirstClass();
	}
	
	public void navigate()
	{
		dao.navi();
	}

}
