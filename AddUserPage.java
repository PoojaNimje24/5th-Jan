package com.jbk.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.objectRepository.AddUserPageRepository;

public class AddUserPage extends AddUserPageRepository{
	WebDriver driver;
	
	public AddUserPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public boolean verifyTitle(){
		String actTitle = driver.getTitle();
		String expTitle = "JavaByKiran | Add User";
		if(actTitle.equals(expTitle)){
			System.out.println("Title matched");
			return true;
		}else{
			System.out.println("Title not matched");
			return false;
		}
	}
	
	public boolean adduser1() {
		uname.sendKeys("Pooja Nimje");
		mb.sendKeys("9175339731");
		email.equals("poojanimje23@gmail.com");
		userCourse.sendKeys("Java");
		gender.click();
		
		Select state = new Select(states);
		state.selectByValue("Maharashtra");
		userpw.sendKeys("123456");
		submit.click();
		
		Alert al = driver.switchTo().alert();
		String actualmessage = al.getText();
		System.out.println(actualmessage);
		al.accept();
		String expaectedmessage = "User Added Successfully. You can not see added user.";
		System.out.println(expaectedmessage);
		if(actualmessage.equals(expaectedmessage)){
			System.out.println("User added");
			return true;
		}else{
			System.out.println("User not added");
            return false;
		}
	}

	public boolean adduserPage() {
		String actualheading = pageHeading.getText();
		String expecteddata = "Add User";
		if(actualheading.equals(expecteddata)){
			System.out.println("Heading matched");
			return true;
		}else{
			System.out.println("Heading not matched");
            return false;
		}
	}

	public boolean headingAdduser() {
		List<WebElement> list = pageLoc;
		ArrayList<String> expecteddata = new ArrayList<String>();
		expecteddata.add("Home");
		expecteddata.add("Add User");
		System.out.println(expecteddata);
		ArrayList<String> actualdata = new ArrayList<String>();
		for (WebElement element : list) {
			actualdata.add(element.getText());
		}
		System.out.println(actualdata);
		if(actualdata.equals(expecteddata)){
			System.out.println("Heading matched");
			return true;
		}else{
			System.out.println("Heading not matched");
            return false;
		}
	}
	
	public boolean verifyLabels(){
		ArrayList<String> expLabel = new ArrayList<String>();
		expLabel.add("Username");
		expLabel.add("Mobile");
		expLabel.add("Email");
		expLabel.add("Courses");
		expLabel.add("Gender");
		expLabel.add("State");
		expLabel.add("Password");
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='box-body']//child::div[@class='form-group']"));
		ArrayList<String> actLabel = new ArrayList<String>();
		for(WebElement element : list){
			actLabel.add(element.getText());
		}
		if(actLabel.equals(expLabel)){
			System.out.println("Heading matched");
			return true;
		}else{
			System.out.println("Heading not matched");
            return false;
		}
		}
}
