package com.Stepdef;

import org.openqa.selenium.By;

import org.testng.Assert;

import com.common.OSBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignIn extends OSBase {

	@Given("^I am on the webpage$")
	public void launch_web_browser_to_go_to_oscommerce_web_page()  {
		 driver = getDriver();
		    driver.get("https://demo.oscommerce.com");
		    
	  
	}

	@When("^click on my account button$")
	public void click_on_my_account_button()  {
	   driver.findElement(By.xpath("(//span[@class='ui-button-text'][2]")).click();
	  
	}

	@When("^enter user name and password$")
	public void enter_user_name_and_password()  {
		driver.findElement(By.name("email_address")).sendKeys("bolod@gmail.com");
	    driver.findElement(By.name("password")).sendKeys("whats up");
	    
	  
	}

	@When("^click on sign in button$")
	public void click_on_sign_in_button()  {
		driver.findElement(By.className("(//*[@id=\"tdb1\"]/span[2]")).click(); 
	  
	}

	@Then("^sign in should be successfull$")
	public void sign_in_should_be_successfull()  {
		String title = driver.getTitle();
	    Assert.assertEquals(title,"osCommerce Demo");
	    driver.close();
	  
	}

	}


