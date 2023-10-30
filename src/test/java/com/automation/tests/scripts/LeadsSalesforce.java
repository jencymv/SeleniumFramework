package com.automation.tests.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.tests.base.BaseSalesforce;

public class LeadsSalesforce extends BaseSalesforce {

	
@Test

	private static void validate_view_drop_down_list_contents() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("*********Validate view drop down list contents test case started******");
		String actual="Jency x";
		 Thread.sleep(2000);
		 logintoBrowser();
		 Thread.sleep(3000);
		 WebElement string_expected = driver.findElement(By.cssSelector("#userNavLabel"));
		 Assert.assertEquals(actual, string_expected.getText());
		 WebElement leads = driver.findElement(By.linkText("Leads"));
		 waitForVisibility(leads,5);
		 clickElement(leads,"Leads ");
		 WebElement Leads_text = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div[1]/h1"));
		 Assert.assertEquals("Leads", Leads_text.getText());
		 WebElement leads_drop_down = driver.findElement(By.id("fcf"));
		 clickElement(leads_drop_down,"Leads drop down");
		 selectDropDown(leads_drop_down,"Today's Leads");
		 System.out.println("***********Validate view drop down list contents test case ended******");
	
	}

@Test
	private static void list_item_todays_leads_work() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("*********** List Item todays leads work test case started******");
		String actual="Jency x";
		Thread.sleep(2000);
		 logintoBrowser();
		 Thread.sleep(3000);
		 WebElement string_expected = driver.findElement(By.cssSelector("#userNavLabel"));
		 Assert.assertEquals(actual, string_expected.getText());
		 Thread.sleep(2000);
		 WebElement leads = driver.findElement(By.linkText("Leads"));
		 waitForVisibility(leads,5);
		 clickElement(leads,"Leads ");
		 WebElement Leads_text = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div[1]/h1"));
		 Assert.assertEquals("Leads", Leads_text.getText());
		 WebElement today_leads = driver.findElement(By.id("fcf"));
		 waitForVisibility(today_leads,5);	 
		 selectDropDown(today_leads,3);
		 WebElement go_button= driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/form/div/span/span[1]/input"));
		 clickElement(go_button,"Go ");
		 WebElement Today_Leads_text = driver.findElement(By.xpath(" /html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/form/div[1]/div/select/option[4]"));
		 Assert.assertEquals("Today's Leads", Today_Leads_text.getText());
		 System.out.println("*********** List Item todays leads work test case ended******");
	}
@Test

	private static void check_new_button_on_leads_home() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("*********** Check new button on leads home test case started******");
		String actual="Jency x";
		Thread.sleep(2000);
		 logintoBrowser();
		 Thread.sleep(3000);
		 WebElement string_expected = driver.findElement(By.cssSelector("#userNavLabel"));
		 Assert.assertEquals(actual, string_expected.getText());
		 Thread.sleep(2000);	 
		 WebElement leads = driver.findElement(By.linkText("Leads"));
		 waitForVisibility(leads,5);
		 clickElement(leads,"Leads ");
		 WebElement Leads_text = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div[1]/h1"));
		 Assert.assertEquals("Leads", Leads_text.getText());
		 WebElement New_button = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[3]/div[1]/div/div[1]/form/table/tbody/tr/td[2]/input"));
		 waitForVisibility(New_button,5);
		 clickElement(New_button,"New ");
		 WebElement New_button_text = driver.findElement(By.xpath(" /html/body/div[1]/div[2]/table/tbody/tr/td[2]/div/div[1]/div[1]/h2"));
		 Assert.assertEquals("New Lead", New_button_text.getText());
		 WebElement last_name = driver.findElement(By.id("name_lastlea2"));
		 waitForVisibility(last_name,5);
		 enterText(last_name,"ABCD","lastname");
		 WebElement company_name = driver.findElement(By.id("lea3"));
		 waitForVisibility(company_name,5);
		 enterText(company_name,"ABCD","Company name");
		 WebElement save_button = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[1]/table/tbody/tr/td[2]/input[1]"));
		 waitForVisibility(save_button,5);
		 clickElement(save_button,"Save ");
		 WebElement New_lead = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h2"));
		 Assert.assertEquals("ABCD", New_lead.getText()); 
		 System.out.println("***********Check new button on leads home test case ended******");
	}

@Test

	private static void leads_select_view() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("*********** Leads select view test case started******");
		String actual="Jency x";
		Thread.sleep(2000);
		logintoBrowser();
		 Thread.sleep(3000);
		 WebElement string_expected = driver.findElement(By.cssSelector("#userNavLabel"));
		 Assert.assertEquals(actual, string_expected.getText());
		 Thread.sleep(2000);
		 WebElement leads = driver.findElement(By.linkText("Leads"));
		 waitForVisibility(leads,5);
		 clickElement(leads,"Leads ");
		 WebElement Leads_text = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div[1]/h1"));
		 Assert.assertEquals("Leads", Leads_text.getText());
		 WebElement leads_dropdown = driver.findElement(By.xpath("//*[@id=\"fcf\"]"));
		 clickElement(leads_dropdown,"Leads dropdown");
		 System.out.println("***********Leads select view test case ended******");
	}

	
@Test

	private static void leads_tab_link() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("***********Check Leads tab link test case started******");
		String actual="Jency x";
			Thread.sleep(2000);
		 logintoBrowser();
		 Thread.sleep(3000);
		 WebElement string_expected = driver.findElement(By.cssSelector("#userNavLabel"));
		 Assert.assertEquals(actual, string_expected.getText());
		 Thread.sleep(2000);
		 WebElement leads = driver.findElement(By.linkText("Leads"));
		 waitForVisibility(leads,5);
		 clickElement(leads,"Leads ");
		 WebElement Leads_text = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div[1]/h1"));
		 Assert.assertEquals("Leads", Leads_text.getText());
		 System.out.println("***********Check Leads tab link test case ended******");
	}

@Test
	public static void functionality_of_go_button() throws InterruptedException
	{
	System.out.println("***********Functionality of go button test case started******");
	String actual="Jency x";
	Thread.sleep(2000);
	 logintoBrowser();
	 Thread.sleep(3000);
	 WebElement string_expected = driver.findElement(By.cssSelector("#userNavLabel"));
	 Assert.assertEquals(actual, string_expected.getText());
	 Thread.sleep(2000);
	 WebElement leads = driver.findElement(By.linkText("Leads"));
	 waitForVisibility(leads,5);
	 clickElement(leads,"Leads ");
	 WebElement Leads_text = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div[1]/h1"));
	 Assert.assertEquals("Leads", Leads_text.getText());
	 WebElement leads_dropdown = driver.findElement(By.xpath("//*[@id=\"fcf\"]"));
	 clickElement(leads_dropdown,"Leads Drop Down");
	 selectDropDown(leads_dropdown,1);
	 WebElement nav_button = driver.findElement(By.id("userNavLabel"));
		clickElement(nav_button,"Navigation ");
		WebElement logout_but= driver.findElement(By.xpath("/html/body/div[1]/div[1]/table/tbody/tr/td[3]/div/div[3]/div/div/div[2]/div[3]/a[5]"));
		waitForVisibility(logout_but,10);
		clickElement(logout_but,"Logout ");
		Thread.sleep(2000);
		logintoBrowser();
		Thread.sleep(2000);
		 WebElement leads1 = driver.findElement(By.linkText("Leads"));
		 waitForVisibility(leads1,5);
		 clickElement(leads1,"Leads ");
		 WebElement Go_butt1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/form/div/span/span[1]/input"));
		 clickElement(Go_butt1,"Go");
		 WebElement dropdown = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/form/div[1]/div/select/option[2]"));
		 Assert.assertEquals("My Unread Leads",dropdown.getText());
		 
	 System.out.println("***********Functionality of go button test case ended******");

	}


}
