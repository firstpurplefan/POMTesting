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

import com.revit.pages.BookFlightService;
import com.revit.pages.BookFlightServiceImpl;
import com.revit.pages.FindFlightService;
import com.revit.pages.FindFlightServiceImpl;
import com.revit.pages.HomePageService;
import com.revit.pages.HomePageServiceImpl;
import com.revit.pages.SelectFlightService;
import com.revit.pages.SelectFlightServiceImpl;

import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * Unit test for simple App.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AppTest {
	private static FirefoxDriver driver;
	static HomePageService lg;
	static FindFlightService ff;
	static SelectFlightService sf;
	static BookFlightService bf;
	

	@BeforeClass
	public static void openBrowser() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		lg = new HomePageServiceImpl(driver);
		ff = new FindFlightServiceImpl(driver);
		sf = new SelectFlightServiceImpl(driver);
		bf = new BookFlightServiceImpl(driver);
	}

	/**
	 * This is the stage-1 test for testing the login function.
	 */
	@Test
	public void stage_1_LoginTest() {
		lg.enterUsername("mercury");
		lg.enterPassword("mercury");
		lg.login();
		if (!driver.getCurrentUrl().contains("http://newtours.demoaut.com/mercuryreservation.php"))
			fail();
	}
	
	/**
	 * This is the stage-2 test for testing the finding flight function.
	 */
	@Test
	public void stage_2_FindFlightTest() {
		ff.selectOneway();
		ff.enterDeparting("Sydney");
		ff.enterArrival("London");
		ff.selectFirstClass();
		ff.findFlight();
		if (!driver.getCurrentUrl().contains("http://newtours.demoaut.com/mercuryreservation2.php"))
			fail();
		if (!sf.getFromPort().contains("Sydney"))
			fail();
		if (!sf.getToPort().contains("London"))
			fail();
		if (!sf.getServClass().contains("First"))
			fail();
	}

	/**
	 * This is the stage-3 test for testing the selecting flight function.
	 */
	@Test
	public void stage_3_SelectFlightTest() {
		sf.selectFlight();
		if (!driver.getCurrentUrl().contains("http://newtours.demoaut.com/mercurypurchase.php"))
			fail();
	}

	/**
	 * This is the stage-4 test for testing the purchasing flight function.
	 */
	@Test
	public void stage_4_BookFlightTest() {
		bf.enterFirstname("Yujie");
		bf.enterLastname("Cheng");
		bf.enterCreditNum("1234123412341234");
		bf.selectTickLess();
		bf.bookTicket();
		if (!driver.getCurrentUrl().contains("http://newtours.demoaut.com/mercurypurchase2.php"))
			fail();

	}

	@AfterClass
	public static void closeBrowser() {
		driver.close();
	}
}
