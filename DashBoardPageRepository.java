package com.jbk.objectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPageRepository {
	@FindBy(tagName="h3")
	public List<WebElement> courselist;
	
	@FindBy(xpath="//a[text()='LOGOUT']//following::span")
	public List<WebElement> sidebarlist;
	
	@FindBy(xpath="//div[@class='inner']//following::p")
	public List<WebElement> coursesubtitle;
	
	@FindBy(xpath="//a[@class='small-box-footer']")
	public List<WebElement> moreinfocount;
	
	@FindBy(xpath="//h3[text()='Selenium']")
	public WebElement seleniumtitle;
	
	@FindBy(xpath="//h3[text()='Java / J2EE']")
	public WebElement javatitle;
	
	@FindBy(xpath="//h3[text()='Python']")
	public WebElement pythontitle;
	
	@FindBy(xpath="//h3[text()='Php']")
	public WebElement phptitle;
	
	@FindBy(xpath="//h3[text()='Selenium']//following-sibling::p")
	public WebElement seleniumsubtitle;
	
	@FindBy(xpath="//h3[text()='Java / J2EE']//following-sibling::p")
	public WebElement javasubtitle;
	
	@FindBy(xpath="//h3[text()='Python']//following-sibling::p")
	public WebElement pythonsubtitle;
	
	@FindBy(xpath="//h3[text()='Php']//following-sibling::p")
	public WebElement phpsubtitle;
	
	@FindBy(xpath="//span[text()='Users']")
	public WebElement user;
	
	@FindBy(xpath="//span[text()='Operators']")
	public WebElement operators;
	
	@FindBy(xpath="//span[text()='     Useful Links']")
	public WebElement usefullinks;
	
	@FindBy(xpath="//span[text()='Downloads']")
	public WebElement downloads;
	
	@FindBy(xpath="//span[text()='Logout']")
	public WebElement logout;
	

}
