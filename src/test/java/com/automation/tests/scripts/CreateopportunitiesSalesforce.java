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
	
			WebElement new_opportunity = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[3]/div[1]/div/div[1]/form/table/tbody/tr/td[2]/input\r\n"));
			waitForVisibility(new_opportunity ,10);
			clickElement(new_opportunity ,"New Opportunity ");
		 
			WebElement opportunity_name = driver.findElement(By.id("opp3"));
			clickElement(opportunity_name ,"Opportunity Name ");
			enterText(opportunity_name,"New opp1","Opportunity name");
			
			WebElement account_name = driver.findElement(By.id("opp4"));
			clickElement(account_name ,"Account Name ");
			enterText(account_name,"Abc","Account name");
			
			WebElement close_date = driver.findElement(By.id("opp9"));
			clickElement(close_date ,"Close date ");
			WebElement close_date1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/div[2]/table/tbody/tr[4]/td[2]"));
			clickElement(close_date1 ,"Close date sel ");
			
			//enterText(close_date,"10/11/2023","Close date");
			
			WebElement stage = driver.findElement(By.id("opp11"));
			clickElement(stage,"Stage ");
			//enterText(stage,"New account","Account name");
			selectDropDown(stage,1);
			

			WebElement probability = driver.findElement(By.id("opp12"));
			clickElement(probability,"Probability  ");
			enterText(probability ,"10","Probability ");
			
			WebElement lead_source = driver.findElement(By.id("opp6"));
			clickElement(lead_source ,"Lead source ");
			selectDropDown(lead_source,2);
			//enterText(lead_source,"10/11/2023","Close date");
			

			WebElement primary_source = driver.findElement(By.id("opp17"));
			clickElement(primary_source,"Primary Source ");
			enterText(primary_source,"Primary","Primary source");
			
			WebElement save_butt = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[1]/table/tbody/tr/td[2]/input[1]"));
			clickElement(save_butt,"Save ");
			//enterText(primary_source,"Primary","Primary source");
	
			//Thread.sleep(2000);
			System.out.println("********Create new opportunity test case ended*********");	
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
		 

			WebElement interval = driver.findElement(By.xpath("//*[@id=\"quarter_q\"]"));
			waitForVisibility(interval ,5);
			clickElement(interval,"Interval");
			selectDropDown(interval,0);
			
			WebElement include = driver.findElement(By.xpath("//*[@id=\"open\"]"));
			waitForVisibility(include ,5);
			clickElement(include,"Include");
			selectDropDown(include,0);
			
			
			WebElement run_report = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div/div/div/form/table/tbody/tr[3]/td/input"));
			waitForVisibility(run_report ,5);
			clickElement(run_report,"Run Report");
			WebElement title = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/div[1]/div[1]/h1"));
			 Assert.assertEquals("Opportunity Report",title.getText());
		/*	clickElement(interval,"Interval");
			selectDropDown(interval,0);
			clickElement(include,"Include");
			selectDropDown(include,1);
			
			clickElement(run_report,"Run Report");*/
			
		
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
	//	waitForVisibility(stuck_opp ,8);
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
