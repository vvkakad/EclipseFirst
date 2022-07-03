package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	WebDriver dpdriver;
	
	public DashBoardPage(WebDriver driver)
	{
		this.dpdriver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h1")
	WebElement header;
	
	@FindBy(xpath= "//span[text()='Users']")
	WebElement UserBtn;
	
	public boolean verifyHeader()
	{
		return header.isDisplayed();
	}
	
	public Userpage clickUser()
	{
		UserBtn.click();
		return new Userpage(dpdriver);
	}
}
