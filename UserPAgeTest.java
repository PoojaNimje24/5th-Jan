package com.jbk.tests;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.pages.UserPage;

public class UserPAgeTest {
	WebDriver driver;
	UserPage up;
	@BeforeMethod
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Offline%20website/pages/examples/users.html");
		up=new UserPage(driver);
	}

	@AfterMethod
	public void closeBrowser() throws Exception{
		Thread.sleep(2000);
		driver.close();
	}
	
	@Test(priority=1)
	public void verifyPageTitle(){
		Assert.assertTrue(up.verifyPageTitle());
	}
	
	@Test(priority=2)
	public void verifyHeader(){
		Assert.assertTrue(up.verifyHeader());
	}
	
	@Test(priority=3)
	public void verifyTableHeading(){
		Assert.assertTrue(up.verifyTableHeading());
	}
	
	@Test(priority=4)
	public void verifyTableHeader(){
		Assert.assertTrue(up.verifyTableHeader());
	}
	
	@Test(priority=5)
	public void verifyRow1(){
		Assert.assertTrue(up.verifyRow1());
	}
	
	@Test(priority=6)
	public void verifyRow2(){
		Assert.assertTrue(up.verifyRow2());
	}
	
	@Test(priority=7)
	public void verifyRow3(){
		Assert.assertTrue(up.verifyRow3());
	}
	
	@Test(priority=8)
	public void verifyRow4(){
		Assert.assertTrue(up.verifyRow4());
	}
	
	@Test(priority=9)
	public void verifyColumn1(){
		Assert.assertTrue(up.verifyColumn1());
	}
	
	@Test(priority=10)
	public void verifyColumn2(){
		Assert.assertTrue(up.verifyColumn2());

	}
	
	@Test(priority=11)
	public void verifyColumn3(){
		Assert.assertTrue(up.verifyColumn3());

	}
	
	@Test(priority=12)
	public void verifyColumn4(){
		Assert.assertTrue(up.verifyColumn4());

	}
	
	@Test(priority=13)
	public void verifyColumn5(){
		Assert.assertTrue(up.verifyColumn5());

	}
	
	@Test(priority=14)
	public void verifyColumn6(){
		Assert.assertTrue(up.verifyColumn6());
	}
	
	@Test(priority=15)
	public void verifyColumn7(){
		Assert.assertTrue(up.verifyColumn7());	
	}
	
	@Test(priority=16)
	public void verifyColumn8(){
		Assert.assertTrue(up.verifyColumn8());
	}
	
	@Test(priority=17)
	public void verifyAddUserButton(){
		Assert.assertTrue(up.verifyAddUserButton());

	}
	
	@Test(priority=18)
	public void verifyFirstDeleteButton(){
		Assert.assertTrue(up.verifyFirstDeleteButton());

	}
	
	@Test(priority=19)
	public void verifySecondDeleteButton(){
		Assert.assertTrue(up.verifySecondDeleteButton());

	}
	
	@Test(priority=20)
	public void verifyEmailType(){
		Assert.assertTrue(up.verifyEmailType());

	}
	
	@Test(priority=21)
	public void sortUsername(){
		Assert.assertTrue(up.sortUsername());
	}
	
	@Test(priority=22)
	public void genderSorting(){
		ArrayList<String> expData=new ArrayList<String>();
		expData.add("Kiran");
		expData.add("Sagar");
		Assert.assertEquals(up.genderSorting(), expData);
	}
	
	@Test(priority=23)
	public void stateSorting(){
		ArrayList<String> expData=new ArrayList<String>();
		expData.add("Kiran");
		expData.add("Monica");
		Assert.assertEquals(up.stateSorting(), expData);
	}
	
	@Test(priority=24)
	public void verifyMobNoLength(){
		ArrayList<String> expData=new ArrayList<String>();
		expData.add("Sagar");
		expData.add("Kimaya");
		Assert.assertEquals(up.verifyMobNoLength(), expData);
	}
}
