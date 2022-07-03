package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Userpage {
	WebDriver usdriver;
	public Userpage(WebDriver driver)
	{
		this.usdriver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='btn btn-block btn-primary btn-sm pull-right']")
	WebElement AddBtn;
	
	public AddUser addClick()
	{
		AddBtn.click();
		return new AddUser(usdriver);
	}
}
