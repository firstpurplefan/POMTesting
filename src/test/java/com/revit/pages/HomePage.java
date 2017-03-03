package com.revit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	public static WebDriver driver;

	public static void enterUsername(String username) {
		driver.findElement(By.name("userName")).sendKeys(username);
	}

	public static void enterPassword(String password) {
		driver.findElement(By.name("password")).sendKeys(password);
	}

	public static void login() {
		driver.findElement(By.name("login")).click();
	}
}
