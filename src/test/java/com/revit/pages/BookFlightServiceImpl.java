/**
 * BookFlight.java
 * @author Yujie Cheng
 * This is a POM class for book flight page. 
 */
package com.revit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.revit.model.BookFlight;

public class BookFlightServiceImpl extends PageService<BookFlight> implements BookFlightService {
	public BookFlightServiceImpl(WebDriver browser, String url) {
		super(browser, url);
	}

	public static WebDriver driver;

	/**
	 * This method will enter the first name to the text box. 
	 * @param firstName
	 */
	public void enterFirstname(String firstName) {
		driver.findElement(By.name("passFirst0")).sendKeys(firstName);
	}

	/**
	 * This method will enter the last name to the text box. 
	 * @param lastName
	 */
	public void enterLastname(String lastName) {
		driver.findElement(By.name("passLast0")).sendKeys(lastName);
	}

	/**
	 * This method will enter the credit card number to the text box. 
	 * @param number
	 */
	public void enterCreditNum(String number) {
		driver.findElement(By.name("creditnumber")).sendKeys(number);
	}

	/**
	 * This method will check the tickless box. 
	 */
	public void selectTickLess() {
		driver.findElement(By.name("ticketLess")).click();
	}

	/**
	 * This method will click on the buy flights button. 
	 */
	public void bookTicket() {
		driver.findElement(By.name("buyFlights")).click();
	}

}
