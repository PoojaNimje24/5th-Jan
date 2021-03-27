package com.jbk.objectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DownloadPAgeRepository {
	
	@FindBy(xpath="//th")
	public List<WebElement> tableHeader;
	
	@FindBy(xpath="//td[3]")
	public List<WebElement> vendorList;
	
	@FindBy(xpath="//td[2]")
	public List<WebElement> imgList;
	
	@FindBy(xpath="//td[//span[text()='Official Website']]")
	public List<WebElement> websiteList;
	
	/*@FindBy(xpath="//th")
	public List<WebElement> tableHeader;*/

}
