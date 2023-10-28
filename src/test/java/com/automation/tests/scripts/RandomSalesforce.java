package com.automation.tests.scripts;

import org.openqa.selenium.By;
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
	//	launchBrowser("firefox");
	//	gotoUrl("https://login.salesforce.com/");
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
	//	closeBrowser();
	}

}
