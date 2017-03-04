package com.revit.services;

import org.openqa.selenium.WebDriver;

import com.revit.dao.HomePageDao;
import com.revit.dao.HomePageDaoImpl;

public class HomePageServiceImpl implements HomePageService{
	private HomePageDao dao;

	public HomePageServiceImpl(WebDriver driver)
	{
		dao = new HomePageDaoImpl(driver, "http://newtours.demoaut.com/mercurywelcome.php");
	}
	
	public void enterUsername(String username) {
		dao.passUsername(username);
	}

	public void enterPassword(String password) {
		dao.passPassword(password);
	}

	public void login() {
		dao.clickLogin();
	}
	
	public void navigate()
	{
		dao.navi();
	}
}
