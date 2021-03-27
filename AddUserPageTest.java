package com.jbk.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.pages.AddUserPage;

public class AddUserPageTest {
	WebDriver driver;
	AddUserPage add=null;
	@BeforeMethod
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Offline%20website/pages/examples/add_user.html");
		add=new AddUserPage(driver);
	}

	@AfterMethod
	public void closeBrowser() throws Exception{
		Thread.sleep(3000);
		driver.close();
	}
	
	@Test(priority=1)
	public void verifyTitle(){
		Assert.assertTrue(add.verifyTitle());
	}
	
	@Test(priority=2)
	public void addUser(){
		Assert.assertTrue(add.adduser1());
	}
	
	@Test(priority=3)
	public void verifyPageHeading(){
		Assert.assertTrue(add.adduserPage());
	}
	
	@Test(priority=4)
	public void verifyPageLocation(){
		Assert.assertTrue(add.headingAdduser());
	}
	
	@Test(priority=4)
	public void verifyLabel(){
		Assert.assertTrue(add.verifyLabels());
	}

}
