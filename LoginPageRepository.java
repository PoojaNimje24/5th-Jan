package com.jbk.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageRepository {
	@FindBy(id="email")
	public WebElement wbUserName;
	
	@FindBy(id="password")
	public WebElement wbPassword;
	
	@FindBy(xpath="//button")
	public WebElement wbsubmit;
	
	@FindBy(xpath="//img")
	public WebElement wbImg;
	
	@FindBy(xpath="//b")
	public WebElement actHeading;
	
	@FindBy(xpath="//h4")
	public WebElement actSubHeading;
	
	@FindBy(id="email_error")
	public WebElement actEmailErrorMsg;
	
	@FindBy(id="password_error")
	public WebElement actPassErrorMsg;
	
	@FindBy(id="email_error")
	public WebElement actBlankEmailErrorMsg;
	
	@FindBy(id="password_error")
	public WebElement actBlankPassErrorMsg;
	
	@FindBy(xpath="//a[@class='text-center']")
	public WebElement regLink;
	
	@FindBy(name="name")
	public WebElement newmembername;
	
	@FindBy(name="mobile")
	public WebElement mobile;
	
	@FindBy(name="email")
	public WebElement enterEmail;
	
	@FindBy(name="password")
	public WebElement enterPassword;
	
	@FindBy(xpath="//button")
	public WebElement regButton;
	

}
