package com.revit.dao;

import org.openqa.selenium.WebDriver;

import com.revit.model.BookFlight;

public class BookFlightDaoImpl extends AbstractDao<BookFlight> implements BookFlightDao{
	
	private BookFlight page;

	public BookFlightDaoImpl(WebDriver browser, String url) {
		super(browser, url);
		page = this.getPage();
		// TODO Auto-generated constructor stub
	}

	public void passFirstname(String firstName) {
		// TODO Auto-generated method stub
		page.getFirstNameBox().sendKeys(firstName);
	}

	public void passLastname(String lastName) {
		// TODO Auto-generated method stub
		page.getLastNameBox().sendKeys(lastName);
	}

	public void passCreditNum(String number) {
		// TODO Auto-generated method stub
		page.getCreditNumberBox().sendKeys(number);
	}

	public void checkTickLess() {
		// TODO Auto-generated method stub
		page.getTicketLessBox().click();
	}

	public void clickBookTicket() {
		// TODO Auto-generated method stub
		page.getBuyFlightButton().click();
	}
	
	public void navi()
	{
		this.navigate();
	}

}
