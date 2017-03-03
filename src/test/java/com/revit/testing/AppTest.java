/**
 * AppTest.java
 * @author Yujie Cheng
 * This is the main class for JUnit runner. 
 */
package com.revit.testing;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.revit.pages.BookFlight;
import com.revit.pages.FindFlight;
import com.revit.pages.HomePage;
import com.revit.pages.SelectFlight;

import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * Unit test for simple App.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AppTest {
	private static FirefoxDriver driver;
	WebElement element;

	@BeforeClass
	public static void openBrowser() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
	}

	/**
	 * This is the stage-1 test for testing the login function.
	 */
	@Test
	public void stage_1_LoginTest() {
		HomePage.driver = driver;
		HomePage.enterUsername("mercury");
		HomePage.enterPassword("mercury");
		HomePage.login();
		System.out.println(driver.getCurrentUrl());
		if (!driver.getCurrentUrl().contains("http://newtours.demoaut.com/mercuryreservation.php"))
			fail();
	}
	
	/**
	 * This is the stage-2 test for testing the finding flight function.
	 */
	@Test
	public void stage_2_FindFlightTest() {

		FindFlight.driver = driver;
		FindFlight.selectOneway();
		FindFlight.enterDeparting("Sydney");
		FindFlight.enterArrival("London");
		FindFlight.selectFirstClass();
		FindFlight.findFlight();
		if (!driver.getCurrentUrl().contains("http://newtours.demoaut.com/mercuryreservation2.php"))
			fail();
		SelectFlight.driver = driver;
		if (!SelectFlight.getFromPort().contains("Sydney"))
			fail();
		if (!SelectFlight.getToPort().contains("London"))
			fail();
		if (!SelectFlight.getServClass().contains("First"))
			fail();
	}

	/**
	 * This is the stage-3 test for testing the selecting flight function.
	 */
	@Test
	public void stage_3_SelectFlightTest() {

		SelectFlight.driver = driver;
		SelectFlight.selectFlight();
		if (!driver.getCurrentUrl().contains("http://newtours.demoaut.com/mercurypurchase.php"))
			fail();
	}

	/**
	 * This is the stage-4 test for testing the purchasing flight function.
	 */
	@Test
	public void stage_4_BookFlightTest() {

		BookFlight.driver = driver;
		BookFlight.enterFirstname("Yujie");
		BookFlight.enterLastname("Cheng");
		BookFlight.enterCreditNum("1234123412341234");
		BookFlight.selectTickLess();
		BookFlight.bookTicket();
		if (!driver.getCurrentUrl().contains("http://newtours.demoaut.com/mercurypurchase2.php"))
			fail();

	}

	@AfterClass
	public static void closeBrowser() {
		driver.close();
	}
}
