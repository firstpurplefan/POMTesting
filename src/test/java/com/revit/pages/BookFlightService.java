package com.revit.pages;

public interface BookFlightService {

	/**
	 * This method will enter the first name to the text box. 
	 * @param firstName
	 */
	public void enterFirstname(String firstName);

	/**
	 * This method will enter the last name to the text box. 
	 * @param lastName
	 */
	public void enterLastname(String lastName);

	/**
	 * This method will enter the credit card number to the text box. 
	 * @param number
	 */
	public void enterCreditNum(String number);

	/**
	 * This method will check the tickless box. 
	 */
	public void selectTickLess();

	/**
	 * This method will click on the buy flights button. 
	 */
	public void bookTicket();
}
