package com.revit.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectFlight {
	@FindBy(name = "reserveFlights")
	private WebElement selectFlightsButton;
	
	@FindBy(name = "fromPort")
	private WebElement fromPortValue;
	
	@FindBy(name = "toPort")
	private WebElement toPortValue;
	
	@FindBy(name = "servClass")
	private WebElement servClassValue;

	public WebElement getSelectFlightsButton() {
		return selectFlightsButton;
	}

	public void setSelectFlightsButton(WebElement selectFlightsButton) {
		this.selectFlightsButton = selectFlightsButton;
	}

	public WebElement getFromPortValue() {
		return fromPortValue;
	}

	public void setFromPortValue(WebElement fromPortValue) {
		this.fromPortValue = fromPortValue;
	}

	public WebElement getToPortValue() {
		return toPortValue;
	}

	public void setToPortValue(WebElement toPortValue) {
		this.toPortValue = toPortValue;
	}

	public WebElement getServClassValue() {
		return servClassValue;
	}

	public void setServClassValue(WebElement servClassValue) {
		this.servClassValue = servClassValue;
	}
}
