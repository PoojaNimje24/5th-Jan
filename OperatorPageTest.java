package com.jbk.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.pages.LogInPage;
import com.jbk.pages.OperatorPage;

public class OperatorPageTest {
	WebDriver driver;
	OperatorPage op=null;
	@BeforeMethod
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Offline%20website/index.html");
		op=new OperatorPage(driver);	
	}

	@AfterMethod
	public void closeBrowser(){
		driver.close();
	}
	
	@Test(priority=1)
	public void verifyTableData() throws Exception{
		Assert.assertTrue(op.verifyTableDAta());
	}
	
	@Test(priority=2)
	public void connectOnWhatsAppOnly(){
		Assert.assertTrue(op.sortWayToConnect1());
	}
	
	@Test(priority=3)
	public void connectOnAllWay(){
		Assert.assertTrue(op.sortWayToConnect2());
	}
	
	@Test(priority=4)
	public void availableTime1(){
		Assert.assertTrue(op.sortTimings1());
	}
	
	@Test(priority=5)
	public void availableTime2(){
		Assert.assertTrue(op.sortTimings2());
	}
}
