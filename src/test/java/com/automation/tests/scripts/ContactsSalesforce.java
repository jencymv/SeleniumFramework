package com.automation.tests.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.tests.base.BaseSalesforce;

public class ContactsSalesforce extends BaseSalesforce{
		
@Test
	private static void View_contact_in_contact_page() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("********View contact in contact_page test case started*********");
		String username1="Jency x";
		Thread.sleep(1000);
		logintoBrowser();
		Thread.sleep(3000);
		
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
	    Assert.assertEquals(userName.getText(), username1);
		
	    WebElement contacts = driver.findElement(By.linkText("Contacts"));
		waitForVisibility(contacts ,10);
		clickElement(contacts ,"Contacts ");
		
		WebElement contact_title = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div[1]/h1"));
		 Assert.assertEquals(contact_title.getText(),"Contacts","It's not contact page");
		
		 
			Thread.sleep(2000);
	
			System.out.println("********View contact in contact page test case ended*********");
	}
	@Test
	private static void check_recently_created_contact() throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("********Check recently created contact test case started*********");
		String username1="Jency x";
	//	launchBrowser("firefox");
	//	gotoUrl("https://login.salesforce.com/");
		Thread.sleep(3000);
		logintoBrowser();
		Thread.sleep(3000);
		
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
	    Assert.assertEquals(userName.getText(), username1);
		
	    WebElement contacts = driver.findElement(By.linkText("Contacts"));
		waitForVisibility(contacts ,10);
		clickElement(contacts ,"Contacts ");
		
		WebElement contact_title = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div[1]/h1"));
		 Assert.assertEquals(contact_title.getText(),"Contacts","It's not contact page");
		
		    WebElement recently_created = driver.findElement(By.xpath("	//*[@id=\"hotlist_mode\"]"));
			waitForVisibility(recently_created ,10);
			  selectDropDown(recently_created,0);
			  
			    WebElement recently_created_text=driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[3]/div[1]/div/div[1]/form/table/tbody/tr/td[1]/h3"));
			    Assert.assertEquals(recently_created_text.getText(),"Recent Contacts");
			
	Thread.sleep(2000);
	//	closeBrowser();
		System.out.println("********Check recently created contact test case ended*********");
	}
	@Test
	
	private static void Check_my_contacts_view() throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("********Check my contacts view test case started*********");
		String username1="Jency x";
	//	launchBrowser("firefox");
	//	gotoUrl("https://login.salesforce.com/");
		Thread.sleep(3000);
		logintoBrowser();
		Thread.sleep(3000);
		
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
	    Assert.assertEquals(userName.getText(), username1);
		
	    WebElement contacts = driver.findElement(By.linkText("Contacts"));
		waitForVisibility(contacts ,10);
		clickElement(contacts ,"Contacts ");
		
		WebElement contact_title = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div[1]/h1"));
		 Assert.assertEquals(contact_title.getText(),"Contacts","It's not contact page");
		
		 WebElement my_contact =driver.findElement(By.xpath("//*[@id=\"fcf\"]"));
		 waitForVisibility(my_contact ,20);
		 selectDropDown(my_contact,3);
		 clickElement(my_contact,"My contact");
		 
		 WebElement Go_button = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/form/div/span/span[1]/input"));
		 clickElement(Go_button,"Go");
		Thread.sleep(2000);
		
		 WebElement my_contact_text = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/form/div[1]/div/select/option[4]"));
				 //("//*[@id=\"00BHr00000DyTSi_listSelect\"]"));
		 Assert.assertEquals(my_contact_text.getText(),"My Contacts");
	
	//	 closeBrowser();
		 System.out.println("********Check my contacts view test case ended*********");
	}
	
	
	@Test
	
	private static void create_new_contact() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("********Create new contact test case started*********");
		String username1="Jency x";
	//	launchBrowser("firefox");
	//	gotoUrl("https://login.salesforce.com/");
		Thread.sleep(3000);
		logintoBrowser();

		//waitForVisibility(login_but,20,"login_button");
		Thread.sleep(3000);
		
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
	    Assert.assertEquals(userName.getText(), username1);
		
	    WebElement contacts = driver.findElement(By.linkText("Contacts"));
		waitForVisibility(contacts ,10);
		clickElement(contacts ,"Contacts ");
		
		WebElement contact_title = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div[1]/h1"));
		 Assert.assertEquals(contact_title.getText(),"Contacts","It's not contact page");
		
		WebElement contact_new = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[3]/div[1]/div/div[1]/form/table/tbody/tr/td[2]/input"));
		waitForVisibility(contact_new ,5);
		clickElement(contact_new ,"Contact new ");
		
		WebElement contact_new_title = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div[1]/h2"));
		 Assert.assertEquals(contact_new_title.getText(),"New Contact","It's not new contact page");
		
		 WebElement last_name= driver.findElement(By.id("name_lastcon2"));
		 waitForVisibility(last_name,5);
		 enterText(last_name,"xyz","last name");
		 //elementDisplayed(last_name,"Last name");
		// Assert.assertEquals(last_name.getText(),"xyz","last name not same");
		 
		 
		 WebElement Account_name= driver.findElement(By.id("con4"));
		 waitForVisibility(Account_name,5);
		 enterText(Account_name,"Abc Shipping ","Account name");
		 
		 WebElement Save_button= driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[1]/table/tbody/tr/td[2]/input[1]"));
		 waitForVisibility(Save_button,5);
		clickElement(Save_button,"Save");
		 
		 Thread.sleep(2000);
	//	closeBrowser();
		System.out.println("********Create new contact test case ended*********");
	}

}
