package com.jbk.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.objectRepository.LoginPageRepository;


public class LogInPage extends LoginPageRepository{
	WebDriver driver;
	public LogInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}


	public boolean verifyTitle(){

		String actualTitle=driver.getTitle();
		String expectedTitle="JavaByKiran | Log in";
		if(actualTitle.equals(expectedTitle)){
			System.out.println("Title is matched");
			return true;
		}else{
			System.out.println("Title is not matched");
			return false;
		}
		}

	public boolean checkImage(){
		driver.findElement(By.xpath("//img"));
		wbImg.isDisplayed();
		if(true){
			System.out.println("Image displayed");
			return true;
		}else{
			System.out.println("Image not matched");
			return false;
		}
	}

	public boolean verifyHeading(){
		String actHead=actHeading.getText();
		String expHeading="Java By Kiran";
		if(actHead.equals(expHeading)){
			System.out.println("Heading matched");
			return true;
		}else{
			System.out.println("Heading not matched");
			return false;
		}
	}

	public boolean verifySubHeading(){
		String actSubHead=actSubHeading.getText();
		String expSubHead="JAVA | SELENIUM | PYTHON";
		if(actSubHead.equals(expSubHead)){
			System.out.println("Subheading matche");
			return true;
		}else{
			System.out.println("Subheading not matched");
			return false;
		}
	}

	public boolean correctLogIn(){
		driver.findElement(By.id("email")).sendKeys("kiran@gamil.com");
		wbUserName.sendKeys("kiran@gmail.com");
		wbPassword.sendKeys("123456");
		wbsubmit.click();
		String actTitle=driver.getTitle();
		String expTitle="JavaByKiran | Dashboard";
		if(actTitle.equals(expTitle)){
			System.out.println("Title is matched");
			return true;
		}else{
			System.out.println("Title is not matched");
			return false;
		}
	}

	public boolean checkIncorrectEmailError(){
		wbUserName.sendKeys("anhf");
		wbsubmit.click();
		String actMsg=actEmailErrorMsg.getText();
		System.out.println(actMsg);
		String expMsg="Please enter valid email.";
		if(actMsg.equals(expMsg)){
			System.out.println("Error msg matched");
			return true;
		}else{
			System.out.println("Error msg not matched");
			return false;
		}
	}

	public boolean checkIncorrectPasswordError(){
		wbPassword.sendKeys("123045");
		wbsubmit.click();
		String actMsg=actPassErrorMsg.getText();
		String expMsg="Please enter password 123456";
		if(actMsg.equals(expMsg)){
			System.out.println("Error msg matched");
			return true;
		}else{
			System.out.println("Error msg not matched");
			return false;
		}
	}

	public boolean checkBlankEmailError(){
		wbUserName.sendKeys("");
		wbsubmit.click();
        String expMsg="Please enter email.";
        String actMsg=actBlankEmailErrorMsg.getText();
		if(actMsg.equals(expMsg)){
			System.out.println("Error msg matched");
			return true;
		}else{
			System.out.println("Error msg not matched");
			return false;
		}
	}

	public boolean checkBlankPasswordError(){
		wbPassword.sendKeys("");
		wbsubmit.click();
		String actMsg=actBlankPassErrorMsg.getText();
		String expMsg="Please enter password.";
		if(actMsg.equals(expMsg)){
			System.out.println("Error msg matched");
			return true;
		}else{
			System.out.println("Error msg not matched");
			return false;
		}
	}

	public boolean verifyRegisterNewMemberLink(){
		driver.findElement(By.xpath("//a[@class='text-center']")).click();
		if(true){
			System.out.println("Link is correct");
			return true;
		}else{
			System.out.println("Link is not correct");
			return false;
		}
	}

	public boolean registerNewMember(){
		/*driver.findElement(By.xpath("//a[@class='text-center']")).click();
		driver.findElement(By.id("name")).sendKeys("pooja");
		driver.findElement(By.id("mobile")).sendKeys("8975689843");
		driver.findElement(By.id("email")).sendKeys("pooja@gmail.com");
		driver.findElement(By.id("password")).sendKeys("125436");
		driver.findElement(By.xpath("//button")).click();*/
		regLink.click();
		newmembername.sendKeys("pooja");
		mobile.sendKeys("8975689843");
		enterEmail.sendKeys("pooja@gmail.com");
		enterPassword.sendKeys("125436");
		regButton.click();
		
		Alert al=driver.switchTo().alert();
		String actMsg=al.getText();
		al.accept();
		String expMsg="User registered successfully.";
		if(actMsg.equals(expMsg)){
			System.out.println("Registered successfully");
			return true;
		}else{
			System.out.println("Not registered successfully");
			return false;
		}
		

	}
}
