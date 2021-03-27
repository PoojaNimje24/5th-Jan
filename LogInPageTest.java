package com.jbk.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.pages.LogInPage;

public class LogInPageTest {
	WebDriver driver;
	LogInPage loginpage=null;
	@BeforeMethod
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Offline%20website/index.html");
		loginpage=new LogInPage(driver);	
	}

	@AfterMethod
	public void closeBrowser(){
		driver.close();
	}
	@Test(priority=1)
	public void verifyTitle(){
		Assert.assertTrue(loginpage.verifyTitle());
	}
	@Test(priority=2)
	public void checkImage(){
		Assert.assertTrue(loginpage.checkImage());
	}
	@Test(priority=3)
	public void verifyHeading(){
		Assert.assertTrue(loginpage.verifyHeading());
	}
	@Test(priority=4)
	public void verifySubHeading(){
		Assert.assertTrue(loginpage.verifySubHeading());
	}
	@Test(priority=5)
	public void correctLogIn(){
		Assert.assertTrue(loginpage.correctLogIn());
	}
	@Test(priority=6)
	public void checkIncorrectEmailError(){
		Assert.assertTrue(loginpage.checkIncorrectEmailError());
	}
	@Test(priority=7)
	public void checkIncorrectPasswordError(){
		Assert.assertTrue(loginpage.checkIncorrectPasswordError());
	}
	@Test(priority=8)
	public void checkBlankEmailError(){
		Assert.assertTrue(loginpage.checkBlankEmailError());
	}
	@Test(priority=9)
	public void checkBlankPasswordError(){
		Assert.assertTrue(loginpage.checkBlankPasswordError());
	}
	@Test(priority=10)
	public void verifyRegisterNewMemberLink(){
		Assert.assertTrue(loginpage.verifyRegisterNewMemberLink());
	}
	@Test(priority=11)
	public void registerNewMember(){
		Assert.assertTrue(loginpage.registerNewMember());
	}
}
