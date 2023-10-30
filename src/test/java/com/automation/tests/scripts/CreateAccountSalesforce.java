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
		Assert.assertEquals(userName.getText(), username1);
		
		Thread.sleep(2000);
		WebElement account = driver.findElement(By.linkText("Accounts"));
		clickElement(account,"Account ");
	
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
		
	WebElement table = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[4]/div/div[1]/div/div[2]/table"));
	  WebElement check_box= driver.findElement(By.xpath("//input[@type='checkbox']"));
	List<WebElement> rows = driver.findElements(By.tagName("tr"));
	for( int rnum=0;rnum<rows.size();rnum++)
	{
		
		List<WebElement> cells = rows.get(rnum).findElements(By.tagName("td"));
		 for (int cell = 0; cell < cells.size(); cell++) {
		        String cellText = cells.get(cell).getText();

		      
		        // Check if the cell text contains "abc"
		        if (cellText.contains("abc")) {
		      //  	  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cells.get(cell));		           

		            // Click the checkbox or perform any other action if needed
		            //cells.get(cell).click();
		        	  check_box.click();
		            System.out.println("Element clicked");
			//.System.out.println(header.get(head).getText());
		}
	}
	}
	/*	 List<WebElement> rows = driver.findElements(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[4]/div/div[1]/div/div[2]/table/tbody/tr[2]/td[1]"));
	
		        for (WebElement row : rows) {
		            // Locate the checkbox within the current row
		        	
		            WebElement checkbox = row.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[4]/div/div[1]/div/div[2]/table/tbody/tr[1]/th[1]\r\n"));

		            // Locate the data within the current row (adjust the XPath to your table structure)
		            WebElement data = row.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[4]/div/div[1]/div/div[2]/table/tbody/tr[1]/th"));
		            System.out.println(data.getText());
		            // Check the checkbox if the data meets the criteria
		            if (data.getText().contains("abc")) {
		            	System.out.println(data.getText());
		                if (!checkbox.isSelected()) {
		                    checkbox.click();
		                    System.out.println("Element clicked");
		                }
		            }
		        }
		*/        Thread.sleep(1000);
			WebElement next_butt = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[5]/div/input[1]"));
			waitForVisibility(next_butt,30);
			clickElement(next_butt,"Next");
			System.out.println("Records found for merging");
			Thread.sleep(3000);
			WebElement merge_butt = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[1]/div/input[2]"));
			waitForVisibility(merge_butt,20);
			clickElement(merge_butt,"Merge");
			
	
		Thread.sleep(2000);
		
		System.out.println("*************Merge accounts test case ended*******");

	}
@Test
	private static void edit_view() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("********Edit view test case started*********");
		String username1="Jency x";
		Thread.sleep(3000);
		logintoBrowser();
		Thread.sleep(5000);
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
		Assert.assertEquals(username1, userName.getText(),"Wrong username");
		Thread.sleep(2000);
		WebElement account = driver.findElement(By.linkText("Accounts"));
		clickElement(account,"Account ");
	
		System.out.println("*************Edit view test case ended*******");
		
	}

		@Test
	private static void create_new_view() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("********Create a new view test case started*********");
		
		String username1="Jency x";
		Thread.sleep(3000);
		logintoBrowser();
		Thread.sleep(5000);
		
			WebElement userName = driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
			Assert.assertEquals(userName.getText(), username1);
	
			Thread.sleep(2000);
			WebElement account = driver.findElement(By.linkText("Accounts"));
			clickElement(account,"Account ");
			WebElement newacctbtn =	driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/form/div/span/span[2]/a[2]"));
			clickElement(newacctbtn,"Create new view");
			WebElement view_name = driver.findElement(By.id("fname"));
			clickElement(view_name,"View name ");
			enterText(view_name,"AB3","view name");
			WebElement view_uname = driver.findElement(By.id("devname"));
			clickElement(view_uname,"View name ");
			enterText(view_uname,"XY17","Unique name");
			WebElement save_butt = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/div[2]/form/div[1]/table/tbody/tr/td[2]/input[1]"));
			clickElement(save_butt,"Save ");
	
	/*		WebElement new_view = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/form/div[1]/div/select"));
			selectDropDown(new_view, "AB3");
			Assert.assertEquals(new_view .getText(), "AB3");
			*/
			Thread.sleep(2000);

		System.out.println("**********Create a new view test case ended*********");
	}
@Test
	private static void create_an_account() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("********Create an account test case started*********");
		String username1="Jency x";
		Thread.sleep(2000);
		logintoBrowser();
		Thread.sleep(3000);
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
		Assert.assertEquals(userName.getText(), username1);
			WebElement account = driver.findElement(By.linkText("Accounts"));
			waitForVisibility(account,15);
			clickElement(account,"Account ");
		WebElement newacctbtn = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[3]/div[1]/div/div[1]/form/table/tbody/tr/td[2]/input"));
		clickElement(newacctbtn,"New Account ");
		WebElement account_name = driver.findElement(By.id("acc2"));
		clickElement(account_name,"Account name");
		enterText(account_name,"Communication","Account name");
		WebElement type = driver.findElement(By.id("acc6"));
		clickElement(type,"Type");
		selectDropDown(type,6);
		WebElement customer_prior = driver.findElement(By.xpath("//*[@id=\"00NHr00000IHTOa\"]"));
		clickElement(customer_prior,"Customer Priority");
		selectDropDown(customer_prior,1);
		WebElement save_Account = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[3]/table/tbody/tr/td[2]/input[1]"));
		clickElement(save_Account,"Save Account");
		WebElement Account_text = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h2"));
		Assert.assertEquals(Account_text.getText(),"Communication");

			System.out.println("***********Create an account test case ended********");
	
	}

}
