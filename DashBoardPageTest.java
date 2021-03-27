package com.jbk.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.pages.DashBoardPage;

public class DashBoardPageTest {
	WebDriver driver;
	DashBoardPage dbpage=null;
	@BeforeMethod
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Offline%20website/pages/examples/dashboard.html");
		dbpage=new DashBoardPage(driver);
	}

	@AfterMethod
	public void closeBrowser() throws Exception{
		Thread.sleep(3000);
		driver.close();
	}
	@Test(priority=1)
	public void verifyCourse() throws Exception{
		Assert.assertTrue(dbpage.verifyCourse());
	}
	@Test(priority=2)
	public void verifySideBar() throws Exception{
		Assert.assertTrue(dbpage.verifySideBar());
	}
	@Test(priority=3)
	public void verifyCourseSubtitle() throws Exception{
		Assert.assertTrue(dbpage.verifyCourseSubtitle());
	}
	@Test(priority=4)
	public void verifyCOurse01(){
		Assert.assertTrue(dbpage.verifyCOurse01());
	}
	@Test(priority=5)
	public void verifySideBar01(){
		Assert.assertTrue(dbpage.verifySideBar01());
	}
	@Test(priority=6)
	public void verifyCourseSubtitle01(){
		Assert.assertTrue(dbpage.verifyCourseSubtitle01());
	}
	@Test(priority=7)
	public void verifyMoreInfo(){
		Assert.assertTrue(dbpage.verifyMoreInfo());
	}
	@Test(priority=8)
	public void verifySeleniumTitle(){
		Assert.assertTrue(dbpage.verifySeleniumTitle());
	}
	@Test(priority=9)
	public void verifyJavaTitle(){
		Assert.assertTrue(dbpage.verifyJavaTitle());
	}
	@Test(priority=10)
	public void verifyPythonTitle(){
		Assert.assertTrue(dbpage.verifyPhpTitle());
	}
	@Test(priority=11)
	public void verifyPhpTitle(){
		Assert.assertTrue(dbpage.verifyPhpTitle());
	}
	@Test(priority=12)
	public void verifySeleniumSubTitle(){
		Assert.assertTrue(dbpage.verifySeleniumSubTitle());
	}
	@Test(priority=13)
	public void verifyJavaSubTitle(){
		Assert.assertTrue(dbpage.verifyJavaSubTitle());
	}
	@Test(priority=14)
	public void verifyPythonSubTitle(){
		Assert.assertTrue(dbpage.verifyPythonSubTitle());
	}
	@Test(priority=15)
	public void verifyPhpSubTitle(){
		Assert.assertTrue(dbpage.verifyPhpSubTitle());
	}
	@Test(priority=16)
	public void verifySeleniumTitle01(){
		Assert.assertTrue(dbpage.verifySeleniumTitle01());
	}
	@Test(priority=17)
	public void verifyJavaTitle01(){
		Assert.assertTrue(dbpage.verifyJavaTitle01());
	}
	@Test(priority=18)
	public void verifyPythonTitle01(){
		Assert.assertTrue(dbpage.verifyPythonTitle01());
	}
	@Test(priority=19)
	public void verifyPhpTitle01(){
		Assert.assertTrue(dbpage.verifyPhpTitle01());
	}
	@Test(priority=20)
	public void verifyUserText(){
		Assert.assertTrue(dbpage.verifyUserText());
	}
	@Test(priority=21)
	public void verifyOperatorsText(){
		Assert.assertTrue(dbpage.verifyOperatorsText());
	}
	@Test(priority=22)
	public void verifyUsefulLinksText(){
		Assert.assertTrue(dbpage.verifyUsefulLinksText());
	}
	@Test(priority=23)
	public void verifyDownloadsText(){
		Assert.assertTrue(dbpage.verifyDownloadsText());
	}
	@Test(priority=24)
	public void verifyLogOutText(){
		Assert.assertTrue(dbpage.verifyLogOutText());
	}
	@Test(priority=25)
	public void verifyTitle(){
		Assert.assertTrue(dbpage.verifyTitle());
	}
}
