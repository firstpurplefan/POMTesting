package com.revit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectFlight {
	public static WebDriver driver;

	public static void selectFlight() {
		driver.findElement(By.name("reserveFlights")).click();
	}

	public static String getFromPort() {
		return driver.findElement(By.name("fromPort")).getAttribute("value");
	}

	public static String getToPort() {
		return driver.findElement(By.name("toPort")).getAttribute("value");
	}

	public static String getServClass() {
		return driver.findElement(By.name("servClass")).getAttribute("value");
	}
}
