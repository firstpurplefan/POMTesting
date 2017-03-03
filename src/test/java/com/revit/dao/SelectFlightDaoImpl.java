package com.revit.dao;

import org.openqa.selenium.WebDriver;

import com.revit.model.SelectFlight;

public class SelectFlightDaoImpl extends AbstractDao<SelectFlight> implements SelectFlightDao{
	
	private SelectFlight page;

	public SelectFlightDaoImpl(WebDriver browser, String url) {
		super(browser, url);
		page = this.getPage();
		// TODO Auto-generated constructor stub
	}

	public void clickSelectFlight() {
		// TODO Auto-generated method stub
		page.getSelectFlightsButton().click();
		
	}

	public String readFromPort() {
		// TODO Auto-generated method stub
		return page.getFromPortValue().getAttribute("value");
	}

	public String readToPort() {
		// TODO Auto-generated method stub
		return page.getToPortValue().getAttribute("value");
	}

	public String readServClass() {
		// TODO Auto-generated method stub
		return page.getServClassValue().getAttribute("value");
	}

}
