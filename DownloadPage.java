package com.jbk.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.jbk.objectRepository.DownloadPAgeRepository;

public class DownloadPage extends DownloadPAgeRepository {
	WebDriver driver;
	String mw;

	public DownloadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	public boolean verifyTitle(){
		String actTitle=driver.getTitle();
		String expTitle="JavaByKiran | Downloads";
		if(actTitle.equals(expTitle)){
			System.out.println("Title get matched");
			return true;
		}else{
			System.out.println("Title does not get matched");
			return false;
		}
	}

	public boolean checkTableHeaders(){
		ArrayList<String> expData = new ArrayList<String>();
		expData.add("Sr");
		expData.add("Name");
		expData.add("Vendor");
		expData.add("Version");
		expData.add("32bit");
		expData.add("64bit");
		expData.add("Common");
		expData.add("Official Source"+"\n"+"*For prevoius and latest releases");
		//List<WebElement> list=driver.findElements(By.xpath("//th"));
		ArrayList<String> actData=new ArrayList<String>();
		for(WebElement element : tableHeader ){
			actData.add(element.getText());
		}
		if(actData.equals(expData)){
			System.out.println("Data matched");
			return true;
		}else{
			System.out.println("Data not matched");
			return false;
		}
	}

	public boolean sortVendors(){
		//List<WebElement> list= driver.findElements(By.xpath("//td[3]"));
		ArrayList<String> actData = new ArrayList<String>();
		for(WebElement element : vendorList){
			actData.add(element.getText());
			Collections.sort(actData);
			System.out.println(actData);
		}
		return true;
	}

	public boolean verifyImage(){
		//List<WebElement> list= driver.findElements(By.xpath("//td[2]"));
		for(WebElement element : imgList){
			boolean flag=element.isDisplayed();
			if(flag==true){
				System.out.println("Displayed");
			}else{
				System.out.println("Not displayed");
			}
		}
		return true;
	}

	public boolean handleWindow(){
		//List<WebElement> links = driver.findElements(By.xpath("//span[text()='Official Website']"));
		for(WebElement element : websiteList)
			element.click();
		Set<String> ow = driver.getWindowHandles(); 
		for(String id : ow){
			if(!id.equals(mw)){
				driver.switchTo().window(id);
				driver.close();
			}
		}
		return true;
	}
}
