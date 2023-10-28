package com.automation.tests.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.tests.base.BaseSalesforce;

public class CreateopportunitiesSalesforce  extends BaseSalesforce{


@Test
	private static void create_new_opportunity() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("********Create new opportunity test case started*********");
		String actual="Jency x";
	
		Thread.sleep(3000);
		logintoBrowser();
		Thread.sleep(2000);
		WebElement string_expected = driver.findElement(By.cssSelector("#userNavLabel"));
		Assert.assertEquals(actual, string_expected.getText());
		
		WebElement opportunity = driver.findElement(By.linkText("Opportunities"));
		waitForVisibility(opportunity ,10);
		clickElement(opportunity ,"Opportunity ");
		//Thread.sleep(1000);
		 WebElement opportunity_text = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div[1]/h1"));
		 Assert.assertEquals("Opportunities",opportunity_text.getText());
		 
	}

@Test

	private static void test_opportunity_pipeline_report() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("********Test opportunity pipeline report test case started*********");
		String actual="Jency x";
	
		Thread.sleep(3000);
		logintoBrowser();
		Thread.sleep(2000);
		WebElement string_expected = driver.findElement(By.cssSelector("#userNavLabel"));
		Assert.assertEquals(actual, string_expected.getText());
		
		WebElement opportunity = driver.findElement(By.linkText("Opportunities"));
		waitForVisibility(opportunity ,10);
		clickElement(opportunity ,"Opportunity ");
		//Thread.sleep(1000);
		 WebElement opportunity_text = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div[1]/h1"));
		 Assert.assertEquals("Opportunities",opportunity_text.getText());
		 
		 WebElement opportunity_pipeline = driver.findElement(By.linkText("Opportunity Pipeline"));
			waitForVisibility(opportunity_pipeline ,10);
			clickElement(opportunity_pipeline ,"Opportunity Pipeline ");
		 
			
			 WebElement opportunity_pipe_text = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/div[1]/div[1]/h1"));
			 Assert.assertEquals("Opportunity Pipeline",opportunity_pipe_text.getText());
			 

		 System.out.println("********Test opportunity pipeline report test case ended*********");
	}
@Test

	private static void test_quarterly_summary_report() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("********Test quartely summary report test case started*********");
		String actual="Jency x";

		Thread.sleep(3000);
		logintoBrowser();
		Thread.sleep(2000);
		WebElement string_expected = driver.findElement(By.cssSelector("#userNavLabel"));
		Assert.assertEquals(actual, string_expected.getText());
		
		WebElement opportunity = driver.findElement(By.linkText("Opportunities"));
		waitForVisibility(opportunity ,20);
		clickElement(opportunity ,"Opportunity ");
		
		 WebElement opportunity_text = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div[1]/h1"));
		 Assert.assertEquals("Opportunities",opportunity_text.getText());
		 
	
		System.out.println("**********Test quartely summary report test case ended********");

	}
@Test
	private static void test_stuck_opportunities_report() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("********Stuck opportunities report test case started*********");
		String actual="Jency x";

		Thread.sleep(3000);
		logintoBrowser();
		//waitForVisibility(login_but,20,"login_button");
		Thread.sleep(3000);
		WebElement string_expected = driver.findElement(By.cssSelector("#userNavLabel"));
		Assert.assertEquals(actual, string_expected.getText());
		
		WebElement opportunity = driver.findElement(By.linkText("Opportunities"));
		waitForVisibility(opportunity ,10);
		clickElement(opportunity ,"Opportunity ");
		

		 WebElement opportunity_text = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div[1]/h1"));
		 Assert.assertEquals("Opportunities",opportunity_text.getText());
		 
		
		WebElement stuck_opp = driver.findElement(By.linkText("Stuck Opportunities"));
		waitForVisibility(stuck_opp ,8);
		clickElement(stuck_opp ,"Stuck Opportunities ");
		
		 WebElement stuck_opp_text = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/div[1]/div[1]/h1"));
		 Assert.assertEquals("Stuck Opportunities",stuck_opp_text.getText());
		 

		System.out.println("**********Stuck opportunities report test case ended********");
		
	}
@Test

	private static void opportunities_drop_down() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("********Opportunity Drop Down test case started*********");
		String actual="Jency x";

		Thread.sleep(3000);
		logintoBrowser();

		Thread.sleep(2000);
		
		WebElement string_expected = driver.findElement(By.cssSelector("#userNavLabel"));
		Assert.assertEquals(actual, string_expected.getText());
		
		WebElement opportunity = driver.findElement(By.linkText("Opportunities"));
		waitForVisibility(opportunity ,10);
		clickElement(opportunity ,"Opportunity ");
		

		 WebElement opportunity_text = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div[1]/h1"));
		 Assert.assertEquals("Opportunities",opportunity_text.getText());
		 
		WebElement opportunity_drop_down = driver.findElement(By.xpath("//*[@id=\"fcf\"]"));
		//waitForVisibility(opportunity_report ,40);
		clickElement(opportunity_drop_down ,"opportunity drop down  ");
		selectDropDown(opportunity_drop_down,"new_opportunity");
	
		System.out.println("***********Opportunity drop down test case ended********");
	}

}
