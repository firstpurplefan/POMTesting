package com.revit.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookFlight {

	@FindBy(name = "passFirst0")
	private WebElement firstNameBox;

	@FindBy(name = "passLast0")
	private WebElement lastNameBox;

	@FindBy(name = "creditnumber")
	private WebElement creditNumberBox;

	@FindBy(name = "ticketLess")
	private WebElement ticketLessBox;

	@FindBy(name = "buyFlights")
	private WebElement buyFlightButton;

	public WebElement getFirstNameBox() {
		return firstNameBox;
	}

	public void setFirstNameBox(WebElement firstNameBox) {
		this.firstNameBox = firstNameBox;
	}

	public WebElement getLastNameBox() {
		return lastNameBox;
	}

	public void setLastNameBox(WebElement lastNameBox) {
		this.lastNameBox = lastNameBox;
	}

	public WebElement getCreditNumberBox() {
		return creditNumberBox;
	}

	public void setCreditNumberBox(WebElement creditNumberBox) {
		this.creditNumberBox = creditNumberBox;
	}

	public WebElement getTicketLessBox() {
		return ticketLessBox;
	}

	public void setTicketLessBox(WebElement ticketLessBox) {
		this.ticketLessBox = ticketLessBox;
	}

	public WebElement getBuyFlightButton() {
		return buyFlightButton;
	}

	public void setBuyFlightButton(WebElement buyFlightButton) {
		this.buyFlightButton = buyFlightButton;
	}
}
