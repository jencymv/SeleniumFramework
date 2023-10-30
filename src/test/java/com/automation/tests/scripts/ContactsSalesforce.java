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
			
		WebElement contact_details = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[3]/div[1]/div/div[2]/table/tbody/tr[2]/th/a"));
		clickElement(contact_details,"Contact Details ");
		
		WebElement contact1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h2"));
		Assert.assertEquals("xy", contact1.getText());
		
			System.out.println("********View contact in contact page test case ended*********");
	}
	@Test
	private static void check_recently_created_contact() throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("********Check recently created contact test case started*********");
		String username1="Jency x";
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
	
		 
		WebElement recently_created = driver.findElement(By.xpath("//*[@id=\"hotlist_mode\"]"));
		waitForVisibility(recently_created ,10);
		selectDropDown(recently_created,0);
			  
	    WebElement recently_created_text=driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[3]/div[1]/div/div[1]/form/table/tbody/tr/td[1]/h3"));
	    Assert.assertEquals(recently_created_text.getText(),"Recent Contacts");
			
	
		System.out.println("********Check recently created contact test case ended*********");
	}
	@Test
	
	private static void Check_my_contacts_view() throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("********Check my contacts view test case started*********");
		String username1="Jency x";
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
		 WebElement Go_button = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/form/div/span/span[1]/input"));
		 clickElement(Go_button,"Go");
		Thread.sleep(2000);
		 WebElement my_contact_text = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/form/div[1]/div/select/option[4]"));
		 Assert.assertEquals(my_contact_text.getText(),"My Contacts");
		 System.out.println("********Check my contacts view test case ended*********");
	}
	
	
	@Test
	
	private static void create_new_contact() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("********Create new contact test case started*********");
		String username1="Jency x";
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
		
		WebElement contact_new = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[3]/div[1]/div/div[1]/form/table/tbody/tr/td[2]/input"));
		waitForVisibility(contact_new ,5);
		clickElement(contact_new ,"Contact new ");
		
		WebElement contact_new_title = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div[1]/h2"));
		 Assert.assertEquals(contact_new_title.getText(),"New Contact","It's not new contact page");
		
		 WebElement last_name= driver.findElement(By.id("name_lastcon2"));
		 waitForVisibility(last_name,5);
		 enterText(last_name,"gv","last name");
		 
		 WebElement Account_name= driver.findElement(By.id("con4"));
		 waitForVisibility(Account_name,15);
		// selectDropDown(Account_name,"Abc");
		 enterText(Account_name,"Abc","Account name");


	
		System.out.println("********Create new contact test case ended*********");
	}

	@Test
	
	public static void Check_Error_message() throws InterruptedException
	{
		System.out.println("********Check error message test case started*********");
		String username1="Jency x";
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
		
		WebElement contact_new = driver.findElement(By.linkText("Create New View"));
		waitForVisibility(contact_new ,5);
		clickElement(contact_new ,"Contact new ");
		
		WebElement contact_new_text = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div[1]/h2"));
		Assert.assertEquals("Create New View", contact_new_text.getText());
		
		WebElement unique_name = driver.findElement(By.id("devname"));
		waitForVisibility(unique_name ,5);
		clickElement(unique_name ,"Unique name ");
		enterText(unique_name,"EFGH","Unique name");
		
		WebElement Save_butt = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/div[2]/form/div[1]/table/tbody/tr/td[2]/input[1]"));
		waitForVisibility(Save_butt ,5);
		clickElement(Save_butt ,"Save ");
		
	//	Thread.sleep(2000);
		System.out.println("********Check error message test case ended*********");

	}
	
	@Test
	
	public static void Check_Cancel_button_Create_New_View() throws InterruptedException
	{
		
		System.out.println("********Check cancel button in create new view test case started*********");
		String username1="Jency x";
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
		
		WebElement contact_new = driver.findElement(By.linkText("Create New View"));
		waitForVisibility(contact_new ,5);
		clickElement(contact_new ,"Contact new ");
		
		WebElement contact_new_text = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div[1]/h2"));
		Assert.assertEquals("Create New View", contact_new_text.getText());
		
		
		WebElement view_name = driver.findElement(By.id("fname"));
		waitForVisibility(view_name ,5);
		clickElement(view_name ,"View name ");
		enterText(view_name,"ABCD","view name");
		
		WebElement unique_name = driver.findElement(By.id("devname"));
		waitForVisibility(unique_name ,5);
		clickElement(unique_name ,"Unique name ");
		enterText(unique_name,"EFGH","Unique name");
		
		WebElement cancel_butt = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/div[2]/form/div[1]/table/tbody/tr/td[2]/input[2]"));
		waitForVisibility(cancel_butt ,5);
		clickElement(cancel_butt ,"Cancel ");
		
		WebElement contact_title1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div[1]/h1"));
		 Assert.assertEquals(contact_title1.getText(),"Contacts","It's not contact page");
		
		 
		 
		System.out.println("********Check cancel button in create new view test case started*********");
	}

	@Test

public static void Check_SaveandNew_button_New_Contact_page() throws InterruptedException
{
	
		System.out.println("********Check_SaveandNew_button_New_Contact_page test case started*********");
		String username1="Jency x";
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
		
		WebElement contact_new = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[3]/div[1]/div/div[1]/form/table/tbody/tr/td[2]/input"));
		waitForVisibility(contact_new ,5);
		clickElement(contact_new ,"Contact new ");
		
		WebElement contact_new_title = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div[1]/h2"));
		 Assert.assertEquals(contact_new_title.getText(),"New Contact","It's not new contact page");
		
		 
		 WebElement last_name= driver.findElement(By.id("name_lastcon2"));
		 waitForVisibility(last_name,5);
		 enterText(last_name,"Indian","last name");
		 
		 WebElement Account_name= driver.findElement(By.id("con4"));
		 waitForVisibility(Account_name,15);
		// selectDropDown(Account_name,"Abc");
		 enterText(Account_name,"Global Media","Account name");
		 
		 
		 WebElement Save_new= driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[1]/table/tbody/tr/td[2]/input[2]"));
		 waitForVisibility(Save_new,5);
		clickElement(Save_new,"Save & new ");
	

		System.out.println("********Check_SaveandNew_button_New_Contact_page test case started*********");
		 
}

}
