package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.AddUser;
import com.pages.DashBoardPage;
import com.pages.LoginPage;
import com.pages.Userpage;

public class LoginTest {
	WebDriver driver= null;
	
	@Test
	public void loginTest()
	{
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("file:///C:/Users/ADMIN/Desktop/Provided%20Software/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		LoginPage lp = new LoginPage(driver);
		
		DashBoardPage dp = lp.validLogin();
		
		Userpage up = dp.clickUser();
		
		AddUser ad= up.addClick();
		
		ad.sumitUser();
		
	}
	
}