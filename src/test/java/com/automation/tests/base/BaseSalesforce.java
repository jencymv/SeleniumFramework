
	package com.automation.tests.base;

	import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class BaseSalesforce {

		protected static WebDriver driver = null;
		static WebDriverWait wait= null;
		
		@BeforeMethod
		@Parameters("browsername")
		public static void setUpBeforeTestMethod(@Optional("firefox") String browser_name) {
		//	PropertiesUtility pro=new PropertiesUtility();
	//		Properties applicationProFile=pro.loadFile("applicationDataProperties");
		//	String url=applicationProFile.getProperty("url");
			launchBrowser(browser_name);
			maximiseBrowser();
			goToUrl("https://login.salesforce.com/");
		}
		@AfterMethod
		public void tearDownAfterTestMethod() {
			closeBrowser();
		
		}
		
		public static  void launchBrowser(String browserName)
		{
			
			switch (browserName)
			{
			case "firefox":
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("https://www.mozilla.org/en-US/firefox/new/?redirect_source=firefox-com");
				System.out.println("Firefox Browser launched");
				break;
				
			case "chrome":
				driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.chrome.com");
				System.out.println("Chrome Browser launched");
				break;

			case "edge":
				driver= new EdgeDriver();
				driver.manage().window().maximize();
				driver.get("www.chrome.com");
				System.out.println("Edge Browser launched");
				break;
				
			case "explorer":
				driver= new InternetExplorerDriver();
				driver.manage().window().maximize();
				driver.get("www.chrome.com");
				System.out.println("Internet Explorer Browser launched");
				break;

			default:
				System.out.println("You have not entered the correct browser");
			}
	}
		public static void logintoBrowser()
		{
			WebElement username = driver.findElement(By.id("username"));
			username.clear();
			waitForVisibility(username,80);
			if(username.isDisplayed())
			{
				username.sendKeys("jencyv1619@gmail.com");
			System.out.println("Username is displayed");
		}
		else
		{
			System.out.println("Username not displayed");
		}
			
			WebElement password = driver.findElement(By.id("password"));
			password.clear();
			if(password.isDisplayed())
			{
			password.clear(); 
			password.sendKeys("Password123");
			
			}
			else
			{
				System.out.println("Wrong Password");
			}
		
			WebElement login_but= driver.findElement(By.id("Login"));
			if(login_but.isDisplayed())
			{
			login_but.click();
			System.out.println("Login Successful");
			}
			else
			{
				System.out.println("Login failed");
			}

		}
		
		public static void waitForVisibility(WebElement ele,int time,int pollingtime,String objectName)
		{
			FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
			wait.withTimeout(Duration.ofSeconds(5))
			.pollingEvery(Duration.ofSeconds(2))
			.ignoring(ElementNotInteractableException.class);
			wait.until(ExpectedConditions.visibilityOf(ele));
			
			System.out.println(objectName+"is waited for visibilty using fluent wait");
		}
		
		public static void waitForVisibility(WebElement ele,int time)
		{
			WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(time));
			wait.until(ExpectedConditions.visibilityOf(ele));
			
		}
		public static void goToUrl(String url)
		{
			driver.get(url);
			System.out.println(url+"is enetered");
		}
		
		public static void maximiseBrowser() {
			driver.manage().window().maximize();
		}
		
		
		public static void enterText(WebElement ele,String data,String ObjectName)
		{
			if(ele.isDisplayed())
			{
				ele.clear();
				ele.sendKeys(data);
				System.out.println(ObjectName+" is enetered in the object");
			}
			else
			{
				System.out.println("username element is not displayed");
			}
		}
		
		
		public static void elementDisplayed(WebElement ele,String ObjectName)
		{
			if(ele.isDisplayed())
			{
				
				System.out.println(ObjectName+" Elemnet is enetered in the object");
			}
			else
			{
				System.out.println(" Element is not displayed");
			}
		}
		
		public static void clickElement(WebElement ele,String i) {
			if(ele.isEnabled()) {
				ele.click();
				System.out.println(i+"button is clicked");
				}
				else {
					System.out.println("button element is not enabled");
				}
		}
		
		
	
		public static void webElementToBeClickable(WebElement elem,int time) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementToBeClickable(elem));
		}


		public static String getTextFromElement(WebElement ele)
		{
			String data= ele.getText();
			return data;
		}
		public static void selectDropDown(WebElement ele,int index)
		{
			Select select = new Select(ele);
			select.selectByIndex(index);
		}
		
		public static void selectDropDown(WebElement ele,String text)
		{
			Select select = new Select(ele);
			select.selectByVisibleText(text);
		
			ArrayList<WebElement> list = (ArrayList<WebElement>)select.getOptions();
			for(WebElement ele1:list)
			{
			System.out.println(ele1.getText());
			}
		}
	/*	public static void selectDropDown(WebElement ele)
		{
		List<WebElement> list1 = driver.findElements(By.xpath("//div[@id='userNav-menuItems']//a"));
		for(WebElement ele1:list1)
		{
			System.out.println(ele1.getAttribute("title"));
		}
		}
		*/
		public static void mouseOver(WebDriver driver,WebElement ele)
		{
			if(ele.isDisplayed())
			{
				Actions action = new Actions(driver);
				action.moveToElement(ele).build().perform();
				System.out.println("Element is prsesnt");
			}
			{
				System.out.println("Element not present");
			}
		}
		public static void gotoUrl(String url)
		{
			driver.get(url);
			System.out.println("Url is entered");
		}
		
		public static void closeBrowser()
		{
			driver.close();
		}
		
 
		}


