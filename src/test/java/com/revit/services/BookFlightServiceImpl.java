/**
 * BookFlight.java
 * @author Yujie Cheng
 * This is a POM class for book flight page. 
 */
package com.revit.services;

import org.openqa.selenium.WebDriver;

import com.revit.dao.BookFlightDao;
import com.revit.dao.BookFlightDaoImpl;

public class BookFlightServiceImpl implements BookFlightService {
	private BookFlightDao dao;

	/**
	 * This method will enter the first name to the text box.
	 * 
	 * @param firstName
	 * @return
	 */
	public BookFlightServiceImpl(WebDriver driver) {
		dao = new BookFlightDaoImpl(driver, "http://newtours.demoaut.com/mercurypurchase.php");
	}

	public void enterFirstname(String firstName) {
		dao.passFirstname(firstName);
	}

	/**
	 * This method will enter the last name to the text box.
	 * 
	 * @param lastName
	 */
	public void enterLastname(String lastName) {
		dao.passLastname(lastName);
	}

	/**
	 * This method will enter the credit card number to the text box.
	 * 
	 * @param number
	 */
	public void enterCreditNum(String number) {
		dao.passCreditNum(number);
	}

	/**
	 * This method will check the tickless box.
	 */
	public void selectTickLess() {
		dao.checkTickLess();
	}

	/**
	 * This method will click on the buy flights button.
	 */
	public void bookTicket() {
		dao.clickBookTicket();
	}
	
	public void navigate()
	{
		dao.navi();
	}

}
