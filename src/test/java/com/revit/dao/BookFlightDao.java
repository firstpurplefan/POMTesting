package com.revit.dao;

public interface BookFlightDao {
	/**
	 * This method will enter the first name to the text box. 
	 * @param firstName
	 */
	public void passFirstname(String firstName);

	/**
	 * This method will enter the last name to the text box. 
	 * @param lastName
	 */
	public void passLastname(String lastName);

	/**
	 * This method will enter the credit card number to the text box. 
	 * @param number
	 */
	public void passCreditNum(String number);

	/**
	 * This method will check the tickless box. 
	 */
	public void checkTickLess();

	/**
	 * This method will click on the buy flights button. 
	 */
	public void clickBookTicket();

}
