package com.automation.tests.scripts;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.tests.base.BaseSalesforce;

public class UserMenuDropDownsalesforce extends BaseSalesforce{
	
@Test

	private static void my_settings_from_drop_down() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("*********Select settings from drop down test case started*******");
		Thread.sleep(2000);
		 logintoBrowser();
		 Thread.sleep(3000);		
		 WebElement usermenu= driver.findElement(By.cssSelector("#userNav"));
		 	waitForVisibility(usermenu,80);
		 	clickElement(usermenu, "UserNavigation ");
		 	WebElement setting = driver.findElement(By.linkText("My Settings"));
		 	waitForVisibility(setting,50);
		 	clickElement(setting,"Setting ");
		 Thread.sleep(2000);
		 WebElement personal = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[1]/div/div[4]/div[2]/a"));
		 clickElement(personal,"Personal");
		 WebElement login = driver.findElement(By.xpath("//*[@id=\"LoginHistory_font\"]"));
		 waitForVisibility(login,60);
		 clickElement(login,"Login ");
		 WebElement download = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/div[3]/div[1]/div/div[2]/div/a"));
		 waitForVisibility(download,90);
		 clickElement(download,"Download ");
		 Thread.sleep(2000);
		 driver.switchTo().defaultContent();
		 driver.navigate().refresh();
		 WebElement display = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[1]/div/div[4]/div[3]/a"));
		 waitForVisibility(display,90);
		 Thread.sleep(4000);
		 clickElement(display,"Display ");
		
		 WebElement customize = driver.findElement(By.xpath("//*[@id=\"CustomizeTabs_font\"]"));
		 clickElement(customize,"Customize ");
		 waitForVisibility(customize,90);

		 	System.out.println("*********Select settings from drop down test case ended****");
	}
	
@Test
	private static void select_myprofile_from_drop_down() throws InterruptedException, Exception {
		// TODO Auto-generated method stub
		
		System.out.println("*********Select My profile from drop down test case started*******");
		String actual_text="Hello";
		Thread.sleep(2000); 
		logintoBrowser();
		 Thread.sleep(4000);		
		 WebElement usermenu= driver.findElement(By.cssSelector("#userNav"));
		 	waitForVisibility(usermenu,60);
		 	 clickElement(usermenu,"Usernav ");
		 	WebElement profile = driver.findElement(By.linkText("My Profile"));
		 	waitForVisibility(profile,50);
		 	 clickElement(profile,"My profile");
		 	 Thread.sleep(2000);
	 	WebElement edit_button = driver.findElement(By.cssSelector(".contactInfoLaunch > img:nth-child(1)"));
		 	waitForVisibility(edit_button,50);
		 	 clickElement(edit_button,"Edit ");
		 	Thread.sleep(2000);
		 	driver.switchTo().frame("contactInfoContentId");
		 	WebElement about_tab= driver.findElement(By.xpath("/html/body/div/div/div/div[1]/ul/li[1]/a"));	
		 	waitForVisibility(about_tab,85);
		 	 clickElement(about_tab,"About ");
		 	WebElement lastname = driver.findElement(By.id("lastName"));
		 	enterText(lastname,"x","lastname");
		 	
		 	WebElement save = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div/input[1]"));
		 	waitForVisibility(save,70);
		 	 clickElement(save,"Save ");
		 	Thread.sleep(1000);
		 	
		 	driver.switchTo().defaultContent();
		 	
		 	WebElement title = driver.findElement(By.xpath("//*[@id=\"tailBreadcrumbNode\"]"));
		 	String originalString = title.getText();
		 	String updatedString = originalString.replaceAll("\\s+$", "");
		 	Assert.assertEquals("Jency x",updatedString);
		 	WebElement pst_button = driver.findElement(By.xpath("//*[@id=\"publisherAttachTextPost\"]"));
		 	clickElement(pst_button,"Post ");
		 	
		 	Thread.sleep(3000);
		 	WebElement frame1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td/div/div[3]/div[1]/div/div[1]/div/div[2]/ul/li[1]/div/div/div[1]/div[1]/div[1]/div[1]/div/div[2]/div[2]/div/div/iframe"));
		 	//WebElement frame1= driver.findElement(By.className("cke_wysiwyg_frame"));
		 	//	String new =frame1.getAttribute(frame1);
		 	driver.switchTo().frame(frame1);
		
			WebElement text_area= driver.findElement(By.cssSelector("body"));
			Thread.sleep(3000);
			waitForVisibility(text_area,120);
			clickElement(text_area,"Text area");
		//		enterText(text_area, "Hello", "Text");
			text_area.sendKeys("Hello");
				driver.switchTo().defaultContent();
				Thread.sleep(2000);
				WebElement share_button = driver.findElement(By.xpath("//*[@id=\"publishersharebutton\"]"));
				clickElement(share_button,"Share ");
				Thread.sleep(4000);
				
				WebElement text_entered = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td/div/div[3]/div[1]/div/div[1]/div/div[2]/ul/li[1]/div/div/div[2]/div/div[5]/div/div[1]/div[1]/div[2]/div[1]/span"));
				Assert.assertEquals(text_entered.getText(),actual_text,"Text entered not same");
				
				WebElement file = driver.findElement(By.linkText("File"));
				waitForVisibility(file,60);
				clickElement(file,"File ");
				WebElement file_upload = driver.findElement(By.id("chatterUploadFileAction"));
				waitForVisibility(file_upload,60);
				clickElement(file_upload,"File Upload");
				Thread.sleep(2000);
				WebElement browse_button = driver.findElement(By.xpath("//*[@id=\"chatterFile\"]"));
				waitForVisibility(browse_button,60);
				
				JavascriptExecutor js =(JavascriptExecutor)driver;
				js.executeScript("arguments[0].click();", browse_button);
	
				 StringSelection stringSelection = new StringSelection("C:\\untitled.png");
				    Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
				    clpbrd.setContents(stringSelection, null);
				    Thread.sleep(7000);
				Robot robot=new Robot();  
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(2000);
				browse_button.sendKeys("C:\\untitled.png");
				WebElement share_button1 = driver.findElement(By.xpath("//*[@id=\"publishersharebutton\"]"));
				clickElement(share_button1,"Share ");			
				WebElement upload_photo = driver.findElement(By.id("uploadLink"));
				mouseOver(driver, upload_photo);
				waitForVisibility(upload_photo,20);
				clickElement(upload_photo,"Upload Photo");
				
				driver.switchTo().frame("uploadPhotoContentId");
				Thread.sleep(2000);
				WebElement browse_butt= driver.findElement(By.xpath("//*[@id=\"j_id0:uploadFileForm:uploadInputFile\"]"));
				waitForVisibility(browse_butt,30);
	
				JavascriptExecutor js1 =(JavascriptExecutor)driver;
				js1.executeScript("arguments[0].click();", browse_butt);
	
				 StringSelection stringSelection1 = new StringSelection("C:\\untitled.png");
				    Clipboard clpbrd1 = Toolkit.getDefaultToolkit().getSystemClipboard();
				    clpbrd.setContents(stringSelection, null);
				    Thread.sleep(7000);
				Robot robot1=new Robot();  
				robot1.keyPress(KeyEvent.VK_CONTROL);
				robot1.keyPress(KeyEvent.VK_V);
				robot1.keyRelease(KeyEvent.VK_V);
				robot1.keyRelease(KeyEvent.VK_CONTROL);
				
				robot1.keyPress(KeyEvent.VK_ENTER);
				robot1.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(2000);
				browse_butt.sendKeys("C:\\untitled.png");
				
				WebElement save_button1 = driver.findElement(By.xpath("//*[@id=\"j_id0:uploadFileForm:uploadBtn\"]"));
				clickElement(save_button1,"Save ");
					Thread.sleep(4000);
				WebElement save1 = driver.findElement(By.xpath("//*[@id=\"j_id0:j_id7:save\"]"));
				clickElement(save,"Save ");		
			Thread.sleep(2000);
		
		 	System.out.println("*********Select My profile from drop down test case ended*******");
	}

@Test

	private static void select_developer_console_from_drop_down() throws InterruptedException {
		// TODO Auto-generated method stub
	System.out.println("**********Select developer console from drop down test case started*************");
	String username1="Jency x";	
		Thread.sleep(2000);
		 logintoBrowser();
		 Thread.sleep(2000);		
		 WebElement usermenu= driver.findElement(By.cssSelector("#userNav"));
		 waitForVisibility(usermenu,20);
		 clickElement(usermenu,"Usermenu");
		 	List<WebElement> list = driver.findElements(By.xpath("//div[@id='userNav-menuItems']//a"));
			for(WebElement ele:list)
			{
			System.out.println(ele.getAttribute("title"));
			}
			WebElement developer_con= driver.findElement(By.xpath("/html/body/div/div[1]/table/tbody/tr/td[3]/div/div[3]/div/div/div[2]/div[3]/a[3]"));
			clickElement(developer_con,"Dwveloper Console");
		 	Thread.sleep(2000);
			ArrayList<String> openwindow=new ArrayList<String>(driver.getWindowHandles());
			openwindow.size();
		//	System.out.println(openwindow.size());
			driver.switchTo().window(openwindow.get(1));
			Thread.sleep(2000);
			driver.close();
			driver.switchTo().window(openwindow.get(0));
	
			System.out.println("**********Select developer console from drop down test case started*************");
	
	}
@Test

	private static void logout_from_user_menu() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("**********Select logout from drop down test case started*************");
		String username1="Jency x";
		Thread.sleep(2000);
		logintoBrowser();	
		 Thread.sleep(2000);
			WebElement userName = driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
			waitForVisibility(userName,20);
		    Assert.assertEquals(userName.getText(), username1);
		   	WebElement usermenu= driver.findElement(By.cssSelector("#userNav"));
		 	waitForVisibility(usermenu,20);
		 	clickElement(usermenu,"usermenu ");	
		 	List<WebElement> list = driver.findElements(By.xpath("//div[@id='userNav-menuItems']//a"));
			for(WebElement ele:list)
			{
			System.out.println(ele.getAttribute("title"));
			}
		 	WebElement logout = driver.findElement(By.xpath("/html/body/div/div[1]/table/tbody/tr/td[3]/div/div[3]/div/div/div[2]/div[3]/a[5]"));
		 	clickElement(logout,"Logout");
		
	System.out.println("**********Select logout from drop down test case ended*************");

}

	@Test
	private static void select_user_menu_from_drop_down() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("**********Select user menu from drop down test case started*************");
		String username1="Jency x";
		Thread.sleep(2000);
		 logintoBrowser();
		 Thread.sleep(3000);	
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
		waitForVisibility(userName,20);
	    Assert.assertEquals(userName.getText(), username1);
	 	WebElement usermenu= driver.findElement(By.cssSelector("#userNav"));
	 	waitForVisibility(usermenu,20);
	 	clickElement(usermenu,"usermenu ");
		List<WebElement> list = driver.findElements(By.xpath("//div[@id='userNav-menuItems']//a"));
		for(WebElement ele:list)
		{
		System.out.println(ele.getAttribute("title"));
		}
	
	System.out.println("**********Select user menu from drop down test case ended*************");

}
}

