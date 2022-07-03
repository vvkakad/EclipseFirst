package com.stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStepDefs {

WebDriver driver;

//hooks in cucumber
	@Before //will run before every scenario
	public void setup() {
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		driver= new ChromeDriver();
	}
	
	@After //will run after every scenario
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.close();
	}


	@Given("^User should be on login page$")
		public void user_should_be_on_login_page() throws Throwable {
		driver.get("file:///C:/Users/ADMIN/Desktop/Provided%20Software/javabykiran-Selenium-Softwares/Offline%20Website/index.html");  
	}

	@When("^User enter \"([^\"]*)\" and \"([^\"]*)\"$")
		public void user_enter_and(String userName, String pass) throws Throwable {
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
    
}

	@Then("^User will be on Home page$")
		public void user_will_be_on_Home_page() throws Throwable {
		Assert.assertEquals("JavaByKiran | Dashboard", driver.getTitle());
}

	@Then("^User should see JBK logo$")
		public void user_should_see_JBK_logo() throws Throwable {
		WebElement logo= driver.findElement(By.tagName("img"));
		Assert.assertTrue(logo.isDisplayed());
}
}
	

