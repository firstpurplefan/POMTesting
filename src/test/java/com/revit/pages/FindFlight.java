package com.revit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FindFlight {
	public static WebDriver driver;

	public static void selectOneway() {
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
	}

	public static void selectRoundTrip() {
		driver.findElement(By.xpath("//input[@value='roundtrip']")).click();
	}

	public static void enterDeparting(String depFrom) {
		new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText(depFrom);
	}

	public static void enterArrival(String arrTo) {
		new Select(driver.findElement(By.name("toPort"))).selectByVisibleText(arrTo);
	}

	public static void findFlight() {
		driver.findElement(By.name("findFlights")).click();
	}

	public static void selectFirstClass() {
		driver.findElement(By.xpath("//input[@value='First']")).click();

	}

}
