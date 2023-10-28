package com.automation.tests.base;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {

	protected static WebDriver driver = null;
	protected static WebDriverWait wait= null;
	
	/*@BeforeMethod
	@Parameters("browsername")
	public static void setUpBeforeTestMethod(@Optional("firefox") String browser_name) {
		PropertiesUtility pro=new PropertiesUtility();
		Properties applicationProFile=pro.loadFile("applicationDataProperties");
		String url=applicationProFile.getProperty("url");
		launchBrowser(browser_name);
		maximiseBrowser();
		goToUrl(url);
	}
	@AfterMethod
	public void tearDownAfterTestMethod() {
		closeBrowser();
	
	}
	*/
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
			driver.get("www.chrome.com");
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
	
	
	public static void waitForVisibility(WebElement ele,int time,int pollingtime,String objectName)
	{
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(5))
		.pollingEvery(Duration.ofSeconds(2))
		.ignoring(ElementNotInteractableException.class);
		wait.until(ExpectedConditions.visibilityOf(ele));
		
		System.out.println(objectName+"is waited for visibilty using fluent wait");
	}
	
	public static void waitForVisibility(WebElement ele,int time,String objectName)
	{
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5));
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
			System.out.println("username is enetered in the object"+ObjectName);
		}
		else
		{
			System.out.println("username element is not displayed");
		}
	}
	
	public static void clickElement(WebElement ele,String ObjectName) {
		ele.click();
	}
	public static String getTextFromElement(WebElement ele)
	{
		String data= ele.getText();
		return data;
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
