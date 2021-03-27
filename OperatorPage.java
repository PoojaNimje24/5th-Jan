package com.jbk.pages;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.jbk.objectRepository.OperatorPageRepository;


public class OperatorPage extends OperatorPageRepository {
	WebDriver driver;

	public OperatorPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void verifyTitle(){
		String actTitle=driver.getTitle();
		String expTitle="JavaByKiran | Operators";
		Assert.assertEquals(actTitle, expTitle);
	}

	public boolean verifyTableDAta() throws Exception{
		FileInputStream fis = new FileInputStream("OperatorPage.xls");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh=wb.getSheetAt(0);
		int row =sh.getPhysicalNumberOfRows();
		int col=sh.getRow(row-1).getPhysicalNumberOfCells();
		System.out.println(row+","+col);
		List<String> expData=new ArrayList<String>();
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				Cell cell=sh.getRow(i).getCell(j);
				DataFormatter formater = new DataFormatter();
				/*String data=cell.getStringCellValue();*/
				
			}
			System.out.println();
		}
		List<WebElement> list=driver.findElements(By.xpath("//td"));
		ArrayList<String> actData = new ArrayList<String>();
		for(WebElement element : list ){
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
	
	public boolean sortWayToConnect1(){
		for(int i=0;i<connectWithWhatsApp.size();i++){
			String text=connectWithWhatsApp.get(i).getText();
			if(text.contains("Whats App Only")){
				int num=i+2;
				String uname=driver.findElement(By.xpath("//tr["+num+"]/td[2]")).getText();
				System.out.println("Person to whom WhatsApp only : "+uname);
			}
		}
		return true;
	}
	
	public boolean sortWayToConnect2(){
		for(int i=0;i<connectWithAll.size();i++){
			String person=connectWithAll.get(i).getText();
			if(person.contains("Whats App Phone Call SMS eMail")){
				String uname=userList.get(i).getText();
				System.out.println("Person name  : "+uname);
			}
		}
		return true;
	}
	
	public boolean sortTimings1(){
		for(int i=0;i<time1.size();i++){
			String text=time1.get(i).getText();
			if(text.contains("09:00 AM to 06:00 PM Monday-Saturday")){
				int num=i+2;
				String uname=driver.findElement(By.xpath("//tr["+num+"]/td[2]")).getText();
				System.out.println("Person name  : "+uname);
			}
		}
		return true;
	}
	
	public boolean sortTimings2(){
		for(int i=0;i<time2.size();i++){
			String text=time2.get(i).getText();
			if(text.contains("Technical")){
				int num=i+2;
				String uname=driver.findElement(By.xpath("//tr["+num+"]/td[2]")).getText();
				System.out.println("Person name  : "+uname);
			}
		}
		return true;
	}
}
