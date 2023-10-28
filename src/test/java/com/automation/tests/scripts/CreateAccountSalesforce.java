package com.automation.tests.scripts;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.tests.base.BaseSalesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class CreateAccountSalesforce extends BaseSalesforce {

@Test

	private static void create_account_report() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("********Create Account Report test case started*********");
		String username1="Jency x";

		Thread.sleep(3000);
		logintoBrowser();
		Thread.sleep(4000);
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
		Assert.assertEquals(userName.getText(),"Jency x");
	
		Thread.sleep(2000);
		WebElement account = driver.findElement(By.xpath("//a[text()='Accounts']"));
		clickElement(account,"Accounts ");
		
		
		WebElement accout_30days= driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/table/tbody/tr/td[1]/div/div/div[1]/ul/li[2]/a"));
		waitForVisibility(accout_30days,50);
		clickElement(accout_30days,"Account with last activity");

		WebElement unsaved_title= driver.findElement(By.xpath("	/html/body/div[1]/div/div/div/div[2]/div/div/span/div/div/div[1]/h2"));
		Assert.assertEquals(unsaved_title.getText(), "Unsaved Report");

		
		System.out.println("**********Create Account Report test case ended*******");
		
	}

@Test
	private static void merge_accounts() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("********Merge accounts test case started*********");
		String username1="Jency x";

		Thread.sleep(3000);
		logintoBrowser();

		//waitForVisibility(login_but,20,"login_button");
		Thread.sleep(5000);
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
		
		if(userName.getText().equals(username1))
		{
			System.out.println("Correct username");
		}else
		{
			System.out.println("Wrong username");
	}
		Thread.sleep(2000);
		WebElement account = driver.findElement(By.linkText("Accounts"));
		account.click();

		//waitForVisibility(account,50);
		Thread.sleep(3000);
		WebElement merge = driver.findElement(By.linkText("Merge Accounts"));
		waitForVisibility(merge,20);
		clickElement(merge,"merge ");
			
		WebElement searchbox = driver.findElement(By.id("srch"));
		searchbox.clear();
		waitForVisibility(searchbox,10);
		searchbox.sendKeys("abc");
		
		WebElement find_button = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[4]/input[2]"));
		waitForVisibility(find_button,20);
		clickElement(find_button,"Find");
		
		WebElement table_data = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[4]/div/div[1]/div/div[2]/table/tbody/tr[2]/td[1]"));
		if(table_data.isDisplayed())
		{
			WebElement next_butt = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[5]/div/input[1]"));
			waitForVisibility(next_butt,30);
			clickElement(next_butt,"Next");
			System.out.println("Records found for merging");
			
			WebElement merge_butt = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[1]/div/input[2]"));
			waitForVisibility(merge_butt,20);
			clickElement(merge_butt,"Merge");
			
		}
		else
		{
			System.out.println("No records found for merging");
		}
		Thread.sleep(2000);
	//	driver.close();
		
		System.out.println("*************Merge accounts test case ended*******");

	}
@Test
	private static void edit_view() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("********Edit view test case started*********");
		String username1="Jency x";

		Thread.sleep(3000);
		logintoBrowser();

		//waitForVisibility(login_but,20,"login_button");
		Thread.sleep(5000);
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
		Assert.assertEquals(username1, userName.getText(),"Wrong username");
		Thread.sleep(2000);
		WebElement account = driver.findElement(By.linkText("Accounts"));
		clickElement(account,"Account ");
	

		//waitForVisibility(account,50);
		Thread.sleep(1000);
		
		System.out.println("*************Edit view test case ended*******");
		
	}

		@Test
	private static void create_new_view() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("********Create a new view test case started*********");

		Thread.sleep(3000);
		logintoBrowser();

		//waitForVisibility(login_but,20,"login_button");
		Thread.sleep(5000);
		
		String username1="Jency x";
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
		Assert.assertEquals(userName.getText(), username1);
	
			Thread.sleep(2000);
			WebElement account = driver.findElement(By.linkText("Accounts"));
			clickElement(account,"Account ");

			//waitForVisibility(account,50);
			Thread.sleep(3000);
			WebElement newacctbtn =	driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/form/div/span/span[2]/a[2]"));
			//newacctbtn.click();
			clickElement(newacctbtn,"Create new view");

			WebElement view_name = driver.findElement(By.id("fname"));
			clickElement(view_name,"View name ");
			enterText(view_name,"AB4","view name");
			
			WebElement view_uname = driver.findElement(By.id("devname"));
			clickElement(view_uname,"View name ");
			enterText(view_uname,"XY5","Unique name");
			
			WebElement save_butt = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/div[2]/form/div[1]/table/tbody/tr/td[2]/input[1]"));
			clickElement(save_butt,"Save ");
			Thread.sleep(1000);
			WebElement new_view = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/form/div[1]/div/select/option[0]"));
			Assert.assertEquals(new_view .getText(), "AB4");
			
			Thread.sleep(2000);
//		driver.close();
		System.out.println("**********Create a new view test case ended*********");
	}
@Test
	private static void create_an_account() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("********Create an account test case started*********");
	
		Thread.sleep(3000);
		logintoBrowser();

		//waitForVisibility(login_but,20,"login_button");
		Thread.sleep(5000);
		
	String username1="Jency x";
		
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
		Assert.assertEquals(userName.getText(), username1);
	
		Thread.sleep(2000);
			WebElement account = driver.findElement(By.linkText("Accounts"));
			account.click();
		waitForVisibility(account,25);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement newacctbtn = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[3]/div[1]/div/div[1]/form/table/tbody/tr/td[2]/input"));
		webElementToBeClickable(newacctbtn,30);
		js.executeScript("arguments[0].click()", newacctbtn);
		
/*
		WebElement new_button = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[3]/div[1]/div/div[1]/form/table/tbody/tr/td[2]/input"));
		new_button.click();
		waitForVisibility(new_button,25);
	*/
		
		/*	WebElement search = driver.findElement(By.id("phSearchButton"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(search).build().perform(); 
		System.out.println("Search button clicked"); 
 
		WebElement home = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div/nav/ul/li[1]/a"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(home).build().perform();
		
		System.out.println("Home button clicked"); 
		 	Thread.sleep(2000);*/

	//		driver.close();	
			System.out.println("***********Create an account test case ended********");
	
	}

}
