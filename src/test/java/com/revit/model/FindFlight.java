package com.revit.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindFlight {
	@FindBy(xpath = "//input[@value='oneway']")
	private WebElement onewayRadio;
	
	@FindBy(xpath = "//input[@value='roundtrip']")
	private WebElement roundTripRadio;
	
	@FindBy(name = "fromPort")
	private WebElement depBox;
	
	@FindBy(name = "toPort")
	private WebElement arrBox;
	
	@FindBy(xpath = "//input[@value='First']")
	private WebElement firstClassBox;
	
	@FindBy(name = "findFlights")
	private WebElement findFlighButton;

	public WebElement getOnewayRadio() {
		return onewayRadio;
	}

	public void setOnewayRadio(WebElement onewayRadio) {
		this.onewayRadio = onewayRadio;
	}

	public WebElement getRoundTripRadio() {
		return roundTripRadio;
	}

	public void setRoundTripRadio(WebElement roundTripRadio) {
		this.roundTripRadio = roundTripRadio;
	}

	public WebElement getDepBox() {
		return depBox;
	}

	public void setDepBox(WebElement depBox) {
		this.depBox = depBox;
	}

	public WebElement getArrBox() {
		return arrBox;
	}

	public void setArrBox(WebElement arrBox) {
		this.arrBox = arrBox;
	}

	public WebElement getFirstClassBox() {
		return firstClassBox;
	}

	public void setFirstClassBox(WebElement firstClassBox) {
		this.firstClassBox = firstClassBox;
	}

	public WebElement getFindFlighButton() {
		return findFlighButton;
	}

	public void setFindFlighButton(WebElement findFlighButton) {
		this.findFlighButton = findFlighButton;
	}
	
	

}
