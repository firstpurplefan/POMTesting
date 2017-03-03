package com.revit.dao;

import java.lang.reflect.ParameterizedType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AbstractDao<T> {
	private WebDriver driver;
	private final Class<T> pageModel;
	private String url = "http:// www.google.com/";

	@SuppressWarnings("unchecked")
	public AbstractDao(WebDriver browser, String url) {
		this.pageModel = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
		this.driver = browser;
		PageFactory.initElements(browser, pageModel);
	}

	public void Navigate() {
		this.driver.navigate().to(this.url);
	}
	
	@SuppressWarnings("unchecked")
	public T getPage() {
		return (T) pageModel;
	}
}