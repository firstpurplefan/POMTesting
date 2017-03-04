package com.revit.dao;

import org.openqa.selenium.WebDriver;

import com.revit.model.HomePage;

public class HomePageDaoImpl extends AbstractDao<HomePage> implements HomePageDao{
	
	HomePage page;

	public HomePageDaoImpl(WebDriver browser, String url) {
		super(browser, url);
		page = this.getPage();
		// TODO Auto-generated constructor stub
	}

	public void passUsername(String username) {
		// TODO Auto-generated method stub
		page.getUsernameBox().sendKeys(username);
	}

	public void passPassword(String password) {
		// TODO Auto-generated method stub
		page.getPasswordBox().sendKeys(password);
	}

	public void clickLogin() {
		// TODO Auto-generated method stub
		page.getLoginButton().click();
	}
	
	public void navi()
	{
		this.navigate();
	}

}
