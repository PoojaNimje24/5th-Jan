package com.jbk.objectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OperatorPageRepository {
	@FindBy(xpath="//td")
	public List<WebElement> webTable;
	
	@FindBy(xpath="//td[4]")
	public List<WebElement> connectWithWhatsApp;
	
	@FindBy(xpath="//td[4]")
	public List<WebElement> connectWithAll;
	
	@FindBy(xpath="//td[6]")
	public List<WebElement> time1;
	
	@FindBy(xpath="//td[6]")
	public List<WebElement> time2;
	
	@FindBy(xpath="//td[2]")
	public List<WebElement> userList;
}
