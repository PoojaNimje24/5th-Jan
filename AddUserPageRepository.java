package com.jbk.objectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUserPageRepository {
	
	@FindBy(id="username")
	public WebElement uname;

	@FindBy(id="mobile")
	public WebElement mb;
	
	@FindBy(id="email")
	public WebElement email;
	
	@FindBy(id="course")
	public WebElement userCourse;
	
	@FindBy(xpath="//input[@value='Female']")
	public WebElement gender;
	
	@FindBy(xpath="//label[text()='State']")
	public WebElement states;
	
	@FindBy(id="password")
	public WebElement userpw;
	
	@FindBy(xpath="//button[text()='Submit']")
	public WebElement submit;
	
	@FindBy(xpath="//h1")
	public WebElement pageHeading;
	
	@FindBy(xpath="//ol/li")
	public List<WebElement> pageLoc;
}
