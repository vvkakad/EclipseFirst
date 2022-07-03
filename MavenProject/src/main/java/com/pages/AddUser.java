package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUser {
	WebDriver audriver;
	public AddUser(WebDriver driver) {
		this.audriver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="submit")
	WebElement subBtn;
	
	public void sumitUser()
	{
		subBtn.click();
	}
}
