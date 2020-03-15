package org.stepdefinition;

import org.base.on.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.*;

public class Stepdefinition extends Baseclass{
	
@Given("User in the fg login page")
public void user_in_the_fg_login_page() 
{
	launchChromeBrowser();
	loadUrl();
	 
}

@When("The user to enter the valid {string} and {string}")
public void the_user_to_enter_the_valid_and(String s1, String s2 ) 
{
	WebElement user = driver.findElement(By.id("email"));
	fill(user, s1);
	WebElement pass = driver.findElement(By.id("pass"));
	fill(pass, s2);
	
}

@Then("The user navigation to the next page")
public void the_user_navigation_to_the_next_page()
{
	WebElement button = driver.findElement(By.id("loginbutton"));
	btnClick(button);
}




}
