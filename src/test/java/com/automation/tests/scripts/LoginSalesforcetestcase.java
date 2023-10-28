package com.automation.tests.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.tests.base.BaseSalesforce;

public class LoginSalesforcetestcase extends BaseSalesforce{
	
@Test

private static void forgot_password() throws InterruptedException {
	// TODO Auto-generated method stub
	System.out.println("***********************Forgot password testcase started*******************");
//	launchBrowser("firefox");
	//gotoUrl("https://login.salesforce.com/");
	Thread.sleep(3000);
	
	WebElement forgot_pass= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/div/a[1]"));
	clickElement(forgot_pass,"Forgot");
	//forgot_pass.click();
	Thread.sleep(2000);
	WebElement id = driver.findElement(By.id("un"));
	if(id.isDisplayed())
	{
		id.sendKeys("jencyv1619@gmail.com");
		WebElement continu= driver.findElement(By.id("continue"));
		clickElement(continu,"Continue ");
		System.out.println("Password reset link send");
	}
	//	driver.close();
System.out.println("************Forgot Password Test case ended*****************");
}

@Test

private static void check_remember_me() throws InterruptedException {
	// TODO Auto-generated method stub
	System.out.println("**********Check Remeber me Test case started*************");
	String expected ="jencyv1619@gmail.com";
	
	Thread.sleep(3000);
	//logintoBrowser();
	WebElement username = driver.findElement(By.id("username"));
	//username.clear();
	waitForVisibility(username,10);
	if(username.isDisplayed())
	{
		username.sendKeys("jencyv1619@gmail.com");
	System.out.println("Username is displayed");
}
else
{
	System.out.println("Username not displayed");
}
	
	WebElement password = driver.findElement(By.id("password"));
	
	if(password.isDisplayed())
	{
	password.clear(); 
	password.sendKeys("Password123");
	
	}
	else
	{
		System.out.println("Wrong Password");
	}

	WebElement remember_me = driver.findElement(By.id("rememberUn"));
	waitForVisibility(remember_me,20);
	clickElement(remember_me,"Remember Me ");

	WebElement login_but= driver.findElement(By.id("Login"));
	waitForVisibility(login_but,5);
	if(login_but.isDisplayed())
	{
	login_but.click();
	System.out.println("Login Successful");
	}
	else
	{
		System.out.println("Login failed");
	}
	Thread.sleep(4000);
	WebElement nav_button = driver.findElement(By.id("userNavLabel"));
	clickElement(nav_button,"Navigation ");
	WebElement logout_but= driver.findElement(By.xpath("/html/body/div[1]/div[1]/table/tbody/tr/td[3]/div/div[3]/div/div/div[2]/div[3]/a[5]"));
	waitForVisibility(logout_but,10);
	clickElement(logout_but,"Logout ");
	Thread.sleep(5000);
/*	WebElement username1 = driver.findElement(By.id("username"));
	waitForVisibility(username1,20);
	String id = username1.getAttribute("value");
	Assert.assertEquals(expected, id);

	*/
	System.out.println("**********Check Remember me Test case Ended**********************");
}

@Test
private static void validate_login_error_message() throws InterruptedException {
	// TODO Auto-generated method stub
	
	System.out.println("**************Validate login error message test case started***********");
//	WebDriver driver= new FirefoxDriver();
//	driver.get("https://login.salesforce.com/");
	

Thread.sleep(2000);
	WebElement username = driver.findElement(By.id("username"));
	if(username.isDisplayed())
	{
		username.clear();
		username.sendKeys("123");
		System.out.println("Username is displayed");
	}
	else
	{
		System.out.println("Username not displayed");
	}
	
	
	WebElement password= driver.findElement(By.id("password"));
	if(password.isDisplayed())
	{
	password.clear(); 
	password.sendKeys("22131");
	
	}
	else
	{
		System.out.println("");
	}
	
	WebElement login_but= driver.findElement(By.id("Login"));
	if(login_but.isDisplayed())
	{
	login_but.click();
	System.out.println("Login Button is displayed & Wrong username,password");
	}
	else
	{
		System.out.println("Login button not displayed");
	}

	Thread.sleep(4000);
	//closeBrowser();
	System.out.println("*****Validate Login Error message test case ended*****");
}	
@Test
private static void login_to_salesforce() throws InterruptedException {
	// TODO Auto-generated method stub
System.out.println("************Login to Salesforce test case started******");
Thread.sleep(2000);
	logintoBrowser();
	//closeBrowser();
System.out.println("*************Login to Salesforce test case ended*****");	
}	


@Test
private static void login_error_message() throws InterruptedException {
	// TODO Auto-generated method stub
	System.out.print("******Login Error Message test case started*******");
//	WebDriver driver= new FirefoxDriver();
	//driver.get("https://login.salesforce.com/");
	

Thread.sleep(2000);
	WebElement username = driver.findElement(By.id("username"));
	if(username.isDisplayed())
	{
		username.clear();
		username.sendKeys("jencyv1619@gmail.com");
		System.out.println("Username is displayed");
	}
	else
	{
		System.out.println("Username not displayed");
	}
	
	
	WebElement password= driver.findElement(By.id("password"));
	if(password.isDisplayed())
	{
	password.clear(); 
	
	}
	else
	{
		System.out.println("");
	}
	
	WebElement login_but= driver.findElement(By.id("Login"));
	if(login_but.isDisplayed())
	{
	login_but.click();
	System.out.println("Login Button is displayed");
	}
	else
	{
		System.out.println("Login button not displayed");
	}

	//driver.close();
System.out.println("********Login error message test case ended***********");	
}	
}


