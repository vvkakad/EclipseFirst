package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	
	WebDriver lpdriver;

	public LoginPage(WebDriver driver) {
		this.lpdriver=driver;
		PageFactory.initElements(driver, this); 
	}

	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath = "//button")
	private WebElement loginBtn;
	
	@FindBy(partialLinkText = "Register")
	private WebElement link;
	
	public void loginToApplication(String uname,String pass)
	{
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginBtn.click();
	}
	
	public DashBoardPage validLogin()
	{
		username.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		loginBtn.click();
		return new DashBoardPage(lpdriver);
	}
	
	public RegisterPage clickRegister()
	{
		link.click();
		return new RegisterPage(lpdriver);
	}
}
