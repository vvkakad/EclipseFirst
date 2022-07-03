package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver rgdriver;
	public RegisterPage(WebDriver driver)
	{
		this.rgdriver=driver;
		PageFactory.initElements(driver, this);
	}
}
