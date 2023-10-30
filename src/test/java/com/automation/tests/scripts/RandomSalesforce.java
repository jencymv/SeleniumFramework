package com.automation.tests.scripts;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.tests.base.BaseSalesforce;

public class RandomSalesforce extends BaseSalesforce {

@Test

	private static void verify_fname_lname() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("********Verify first name and last name test case started*********");
		String username1="Jency x";
		Thread.sleep(3000);
		logintoBrowser();
		Thread.sleep(3000);
		WebElement Home = driver.findElement(By.linkText("Home"));
		clickElement(Home,"Home ");
		WebElement username = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div/div[2]/span[1]/h1/a"));
		Assert.assertEquals(username.getText(),"Jency x");
		clickElement(username,"Name ");
		WebElement profile_username = driver.findElement(By.xpath("//*[@id=\"tailBreadcrumbNode\"]"));
		Assert.assertEquals(profile_username.getText(),"Jency x");
		
		Thread.sleep(2000);
	/*	String firstPageSource = driver.getPageSource();
		WebDriver driver1=null;
		
		String secondPageSource = driver1.getPageSource();

		if (firstPageSource.equals(secondPageSource)) {
		    // Pages have the same content
		} else {
		    // Pages have different content
		}
		
		*/
		System.out.println("********Verify first name and last name test case ended*********");
	
	}
@Test

	public static void verify_tab_customization() throws InterruptedException
	{
	System.out.println("********Verify tab customization test case started*********");
	String username1="Jency x";
	Thread.sleep(3000);
	logintoBrowser();
	Thread.sleep(3000);

	WebElement tab = driver.findElement(By.cssSelector(".allTabsArrow"));
	waitForVisibility(tab,15);
	clickElement(tab,"Tab ");
	
	WebElement tab_text = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div[1]/h1"));
	Assert.assertEquals("All Tabs",tab_text.getText());
	
	WebElement customize_tab = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/div[3]/div[1]/table/tbody/tr/td[2]/input"));
	waitForVisibility(customize_tab,15);
	clickElement(customize_tab,"Customize Tab ");
	
	WebElement customize_tab_text = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div[1]/h1"));
	Assert.assertEquals("Customize My Tabs", customize_tab_text.getText());
	
	WebElement select = driver.findElement(By.xpath("//*[@id=\"duel_select_1\"]"));
	selectDropDown(select,2);
	
	WebElement remove = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[2]/table/tbody/tr[4]/td/div/table/tbody/tr/td[2]/div[3]/a/img"));
	waitForVisibility(remove,15);
	clickElement(remove,"Remove ");
	
	WebElement Save = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/form/div/div[3]/table/tbody/tr/td[2]/input[1]"));
	waitForVisibility(Save,5);
	clickElement(Save,"Save ");
	
	WebElement nav_button = driver.findElement(By.id("userNavLabel"));
	clickElement(nav_button,"Navigation ");
	WebElement logout_but= driver.findElement(By.xpath("/html/body/div[1]/div[1]/table/tbody/tr/td[3]/div/div[3]/div/div/div[2]/div[3]/a[5]"));
	waitForVisibility(logout_but,10);
	clickElement(logout_but,"Logout ");
	
	Thread.sleep(2000);
	logintoBrowser();
	
	Thread.sleep(2000);
	
	}

@Test

public static void blocking_an_event() throws InterruptedException
{
	System.out.println("********Blocking an event in calendar test case started*********");
	String username1="Jency x";
	Thread.sleep(3000);
	logintoBrowser();
	Thread.sleep(3000);
	
	WebElement home = driver.findElement(By.linkText("Home"));
	clickElement(home,"Home ");
	WebElement name = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div/div[2]/span[1]/h1/a\r\n"));
	waitForVisibility(name,5);
	//clickElement(name,"Name ");
	
	WebElement date = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div/div[2]/span[2]/a"));
	waitForVisibility(date,5);
	clickElement(date,"Date ");
	

	WebElement date_text = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div/div[1]/div[1]/h1"));
	waitForVisibility(date_text,5);
//	clickElement(date_text,"Date ");
	Assert.assertEquals("Calendar for Jency x - Day View", date_text.getText());
	
	WebElement time = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/table/tbody/tr/td[1]/form/div[1]/div/div[1]/table/tbody/tr[2]/td[1]/div[29]/a"));
			waitForVisibility(time,5);
			clickElement(time,"Time ");
			WebElement icon = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/form/div[1]/div[2]/div[4]/table/tbody/tr[2]/td[2]/div/a/img"));
			waitForVisibility(icon,15);
			clickElement(icon,"Icon ");

			Thread.sleep(3000);

			ArrayList<String> openwindow=new ArrayList<String>(driver.getWindowHandles());
			openwindow.size();
//			System.out.println(openwindow.size());
			driver.switchTo().window(openwindow.get(1));
			 WebElement pop_up = driver.findElement(By.xpath("/html/body/div[2]/ul/li[5]/a"));
				clickElement(pop_up,"Pop ");
			Thread.sleep(2000);
	//		driver.close();
			driver.switchTo().window(openwindow.get(0));
			
			Thread.sleep(1000);
			WebElement subject_text = driver.findElement(By.id("evt5"));
//			Assert.assertEquals("Other",subject_text.getText());
			
			WebElement end_time = driver.findElement(By.id("EndDateTime_time"));
			clickElement(end_time,"End time ");
			WebElement select_time= driver.findElement(By.xpath("//*[@id=\"timePickerItem_42\"]"));
			clickElement(select_time,"Select time ");
			WebElement save= driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div[1]/div[1]/table/tbody/tr/td[2]/input[1]"));
			clickElement(save,"Save ");
		/*	
			WebElement verify_event = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div[1]/div[1]/table/tbody/tr/td[2]/input[1]"));
			Assert.assertEquals(verify_event.getText(), "jency v");
			*/
			Thread.sleep(2000);
			
}
@Test

public static void verify_edited_lastname() throws InterruptedException
{
	System.out.println("********Verify edited lastname test case started*********");
	String username1="Jency x";
	Thread.sleep(3000);
	logintoBrowser();
	Thread.sleep(3000);
	WebElement home = driver.findElement(By.linkText("Home"));
	clickElement(home,"Home ");
	WebElement name = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div/div[2]/span[1]/h1/a\r\n"));
	waitForVisibility(name,5);
	clickElement(name,"Name ");
	
//	WebElement name_verify = driver.findElement(By.xpath("//*[@id=\"tailBreadcrumbNode\"]"));
//	Assert.assertEquals("Jency x",name_verify.getText());
	
	WebElement edit_button = driver.findElement(By.cssSelector(".contactInfoLaunch > img:nth-child(1)"));
 	waitForVisibility(edit_button,5);
 	 clickElement(edit_button,"Edit ");
 
 	Thread.sleep(2000);
 	driver.switchTo().frame("contactInfoContentId");
 	WebElement about_tab= driver.findElement(By.xpath("/html/body/div/div/div/div[1]/ul/li[1]/a"));	
 	waitForVisibility(about_tab,85);
 	 clickElement(about_tab,"About ");

 	WebElement lastname = driver.findElement(By.id("lastName"));
 	enterText(lastname,"Abcd","lastname");
 	
 	WebElement save = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div/input[1]"));
 	waitForVisibility(save,70);
 	 clickElement(save,"Save ");
	driver.switchTo().defaultContent();
 	 Thread.sleep(1000);
 	WebElement name_verify1 = driver.findElement(By.xpath("//*[@id=\"tailBreadcrumbNode\"]"));
 	String originalString = name_verify1.getText();
 	String updatedString = originalString.replaceAll("\\s+$", "");
 	Assert.assertEquals("Jency Abcd",updatedString);
 	 WebElement usermenu= driver.findElement(By.cssSelector("#userNav"));
 	Assert.assertEquals("Jency Abcd",usermenu.getText());
	System.out.println("********Verify edited lastname test case ended*********");
}

@Test

public static void blocking_event_calender_recurrance() throws InterruptedException
{

	System.out.println("********Blocking event calender recurrance test case started*********");
	String username1="Jency x";
	Thread.sleep(3000);
	logintoBrowser();
	Thread.sleep(3000);
	WebElement home = driver.findElement(By.linkText("Home"));
	clickElement(home,"Home ");
	WebElement name = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div/div[2]/span[1]/h1/a\r\n"));
	waitForVisibility(name,5);
	//clickElement(name,"Name ");
	
	WebElement date = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div/div[2]/span[2]/a"));
	waitForVisibility(date,5);
	clickElement(date,"Date ");
	
	
	WebElement date_text = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div/div[1]/div[1]/h1"));
	waitForVisibility(date_text,5);
//	clickElement(date_text,"Date ");
	Assert.assertEquals("Calendar for Jency x - Day View", date_text.getText());
	
	WebElement time = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/table/tbody/tr/td[1]/form/div[1]/div/div[1]/table/tbody/tr[2]/td[1]/div[21]/a"));
	clickElement(time,"Time ");
	
	WebElement icon = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/form/div[1]/div[2]/div[4]/table/tbody/tr[2]/td[2]/div/a/img"));
	waitForVisibility(icon,15);
	clickElement(icon,"Icon ");

	Thread.sleep(3000);


	ArrayList<String> openwindow=new ArrayList<String>(driver.getWindowHandles());
	openwindow.size();
//	System.out.println(openwindow.size());
	driver.switchTo().window(openwindow.get(1));
	 WebElement pop_up = driver.findElement(By.xpath("/html/body/div[2]/ul/li[5]/a"));
		clickElement(pop_up,"Pop ");
	
	Thread.sleep(2000);
	driver.close();
	driver.switchTo().window(openwindow.get(0));
	
	
	WebElement subject_text = driver.findElement(By.id("evt5"));
	Assert.assertEquals("Other", subject_text.getText());
	
	
	 Thread.sleep(2000);
//     driver.close();

     // Switch back to the original window
    // driver.switchTo().defaultContent();
	
	//Thread.sleep(2000);
}

}
