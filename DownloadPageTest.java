package com.jbk.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.pages.DownloadPage;
import com.jbk.pages.LogInPage;

public class DownloadPageTest {
	WebDriver driver;
	DownloadPage dwldpage;
	@BeforeMethod
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Offline%20website/pages/examples/downloads.html");
		dwldpage=new DownloadPage(driver);	
	}

	@AfterMethod
	public void closeBrowser(){
		driver.close();
	}
	
	@Test(priority=1)
	public void verifyTitle(){
		Assert.assertTrue(dwldpage.verifyTitle());
	}
	
	@Test(priority=2)
	public void verifyHeader(){
		Assert.assertTrue(dwldpage.checkTableHeaders());
	}
	
	@Test(priority=3)
	public void sortVendors(){
		Assert.assertTrue(dwldpage.sortVendors());
	}
	
	@Test(priority=4)
	public void verifyImg(){
		Assert.assertTrue(dwldpage.verifyImage());
	}
	
	@Test(priority=5)
	public void handleWindow(){
		Assert.assertTrue(dwldpage.handleWindow());
	}

}
