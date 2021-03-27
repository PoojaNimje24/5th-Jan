package com.jbk.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.jbk.objectRepository.UserPageRepository;

public class UserPage extends UserPageRepository {
	WebDriver driver;
	
	public UserPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	public boolean verifyPageTitle(){
		String actTitle=driver.getTitle();
		String expTitle="JavaByKiran | User";
		if(actTitle.equals(expTitle)){
			System.out.println("Title matched");
			return true;
		}else{
			System.out.println("Title not metched");
			return false;
		}
	}

	public boolean verifyHeader(){
		String actHeader=header.getText();
		String expHeader="Users";
		if(actHeader.equals(expHeader)){
			System.out.println("Header matched");
			return true;
		}else{
			System.out.println("Header not metched");
			return false;
		}
	}

	public boolean verifyTableHeading(){
		String actTableHead=tableHeading.getText();
		String expTableHead="User List";
		if(actTableHead.equals(expTableHead)){
			System.out.println("Table heading matched");
			return true;
		}else{
			System.out.println("Table heading not metched");
			return false;
		}
	}

	public boolean verifyTableHeader(){
		ArrayList<String> expData = new ArrayList<String>();
		expData.add("#");
		expData.add("Username");
		expData.add("Email");
		expData.add("Mobile");
		expData.add("Course");
		expData.add("Gender");
		expData.add("State");
		expData.add("Action");
		System.out.println(expData);
		List<WebElement> list = tableHeader;
		ArrayList<String> actData = new ArrayList<String>();
		for(WebElement element : list){
			actData.add(element.getText());
		}
		if(actData.equals(expData)){
			System.out.println("Table header matched");
			return true;
		}else{
			System.out.println("Table header not metched");
			return false;
		}
	}

	public boolean verifyRow1(){
		ArrayList<String> expData = new ArrayList<String>();
		expData.add("1");
		expData.add("Kiran");
		expData.add("kiran@gmail.com");
		expData.add("9898989898");
		expData.add("Java/J2EE");
		expData.add("Male");
		expData.add("Maharashtra");
		expData.add("Delete");
		System.out.println(expData);
		List<WebElement> list = row1;
		ArrayList<String> actData = new ArrayList<String>();
		for(WebElement element : list){
			actData.add(element.getText());
		}
		if(actData.equals(expData)){
			System.out.println("List matched");
			return true;
		}else{
			System.out.println("List not metched");
			return false;
		}
	}

	public boolean verifyRow2(){
		ArrayList<String> expData = new ArrayList<String>();
		expData.add("2");
		expData.add("Sagar");
		expData.add("sagar@gmail.com");
		expData.add("999999999");
		expData.add("Selenium");
		expData.add("Male");
		expData.add("Punjab");
		expData.add("Delete");
		System.out.println(expData);
		List<WebElement> list = row2;
		ArrayList<String> actData = new ArrayList<String>();
		for(WebElement element : list){
			actData.add(element.getText());
		}
		if(actData.equals(expData)){
			System.out.println("List matched");
			return true;
		}else{
			System.out.println("List not metched");
			return false;
		}
	}

	public boolean verifyRow3(){
		ArrayList<String> expData = new ArrayList<String>();
		expData.add("3");
		expData.add("Monica");
		expData.add("monica@gmail.com");
		expData.add("1111111111");
		expData.add("Python");
		expData.add("Female");
		expData.add("Maharashtra");
		expData.add("Delete");
		System.out.println(expData);
		List<WebElement> list = row3;
		ArrayList<String> actData = new ArrayList<String>();
		for(WebElement element : list){
			actData.add(element.getText());
		}
		if(actData.equals(expData)){
			System.out.println("List matched");
			return true;
		}else{
			System.out.println("List not metched");
			return false;
		}
	}

	public boolean verifyRow4(){
		ArrayList<String> expData = new ArrayList<String>();
		expData.add("4");
		expData.add("Kimaya");
		expData.add("kimaya@gmail.com");
		expData.add("999999999");
		expData.add("PHP");
		expData.add("Female");
		expData.add("Punjab");
		expData.add("Delete");
		System.out.println(expData);
		List<WebElement> list = row4;
		ArrayList<String> actData = new ArrayList<String>();
		for(WebElement element : list){
			actData.add(element.getText());
		}
		if(actData.equals(expData)){
			System.out.println("List matched");
			return true;
		}else{
			System.out.println("List not metched");
			return false;
		}
	}

		public boolean verifyColumn1(){
			ArrayList<String> expData = new ArrayList<String>();
			expData.add("1");
			expData.add("2");
			expData.add("3");
			expData.add("4");
			System.out.println(expData);
			List<WebElement> list = col1;
			ArrayList<String> actData = new ArrayList<String>();
			for(WebElement element : list){
				actData.add(element.getText());
			}
			if(actData.equals(expData)){
				System.out.println("List matched");
				return true;
			}else{
				System.out.println("List not metched");
				return false;
			}
		}

		public boolean verifyColumn2(){
			ArrayList<String> expData = new ArrayList<String>();
			expData.add("Kiran");
			expData.add("Sagar");
			expData.add("Monica");
			expData.add("Kimaya");
			System.out.println(expData);
			List<WebElement> list = col2;
			ArrayList<String> actData = new ArrayList<String>();
			for(WebElement element : list){
				actData.add(element.getText());
			}
			if(actData.equals(expData)){
				System.out.println("List matched");
				return true;
			}else{
				System.out.println("List not metched");
				return false;
			}
		}

		public boolean verifyColumn3(){
			ArrayList<String> expData = new ArrayList<String>();
			expData.add("kiran@gmail.com");
			expData.add("sagar@gmail.com");
			expData.add("monica@gmail.com");
			expData.add("kimaya@gmail.com");
			System.out.println(expData);
			List<WebElement> list = col3;
			ArrayList<String> actData = new ArrayList<String>();
			for(WebElement element : list){
				actData.add(element.getText());
			}
			if(actData.equals(expData)){
				System.out.println("List matched");
				return true;
			}else{
				System.out.println("List not metched");
				return false;
			}
		}

		public boolean verifyColumn4(){
			ArrayList<String> expData = new ArrayList<String>();
			expData.add("9898989898");
			expData.add("999999999");
			expData.add("1111111111");
			expData.add("999999999");
			System.out.println(expData);
			List<WebElement> list = col4;
			ArrayList<String> actData = new ArrayList<String>();
			for(WebElement element : list){
				actData.add(element.getText());
			}
			if(actData.equals(expData)){
				System.out.println("List matched");
				return true;
			}else{
				System.out.println("List not metched");
				return false;
			}
		}

		public boolean verifyColumn5(){
			ArrayList<String> expData = new ArrayList<String>();
			expData.add("Java/J2EE");
			expData.add("Selenium");
			expData.add("Python");
			expData.add("PHP");
			System.out.println(expData);
			List<WebElement> list = col5;
			ArrayList<String> actData = new ArrayList<String>();
			for(WebElement element : list){
				actData.add(element.getText());
			}
			if(actData.equals(expData)){
				System.out.println("List matched");
				return true;
			}else{
				System.out.println("List not metched");
				return false;
			}
		}

		public boolean verifyColumn6(){
			ArrayList<String> expData = new ArrayList<String>();
			expData.add("Male");
			expData.add("Male");
			expData.add("Female");
			expData.add("Female");
			System.out.println(expData);
			List<WebElement> list = col6;
			ArrayList<String> actData = new ArrayList<String>();
			for(WebElement element : list){
				actData.add(element.getText());
			}
			if(actData.equals(expData)){
				System.out.println("Title matched");
				return true;
			}else{
				System.out.println("Title not metched");
				return false;
			}
		}

		public boolean verifyColumn7(){
			ArrayList<String> expData = new ArrayList<String>();
			expData.add("Maharashtra");
			expData.add("Punjab	");
			expData.add("Maharashtra");
			expData.add("Punjab	");
			System.out.println(expData);
			List<WebElement> list = col7;
			ArrayList<String> actData = new ArrayList<String>();
			for(WebElement element : list){
				actData.add(element.getText());
			}
			if(actData.equals(expData)){
				System.out.println("List matched");
				return true;
			}else{
				System.out.println("List not metched");
				return false;
			}
		}

		public boolean verifyColumn8(){
			ArrayList<String> expData = new ArrayList<String>();
			expData.add("Delete");
			expData.add("Delete	");
			expData.add("Delete");
			expData.add("Delete	");
			System.out.println(expData);
			List<WebElement> list = col8;
			ArrayList<String> actData = new ArrayList<String>();
			for(WebElement element : list){
				actData.add(element.getText());
			}
			if(actData.equals(expData)){
				System.out.println("List matched");
				return true;
			}else{
				System.out.println("List not metched");
				return false;
			}
		}

		public boolean verifyAddUserButton(){
			addUserBtn.click();
			String actTitle = driver.getTitle();
			System.out.println(actTitle);
			String expTitle = "JavaByKiran | Add User";
			if(actTitle.equals(expTitle)){
				System.out.println("Title matched");
				return true;
			}else{
				System.out.println("Title not metched");
				return false;
			}
		}

		public boolean verifyFirstDeleteButton(){
			firstDltBtn.click();
			Alert al = driver.switchTo().alert();
			String actMsg = al.getText();
			String expMsg = "You can not delete Default User";
			al.accept();
			if(actMsg.equals(expMsg)){
				System.out.println("Msg matched");
				return true;
			}else{
				System.out.println("Msg not metched");
				return false;
			}
		}

		public boolean verifySecondDeleteButton(){
			secondDltBtn.click();
			Alert al = driver.switchTo().alert();
			String actMsg=al.getText();
			System.out.println(actMsg);
			al.accept();
			String actMsg1=al.getText();
			System.out.println(actMsg1);
			String expMsg="User deleted successfully.";
			al.accept();
			/*driver.findElement(By.xpath("//span[@class='label label-danger ss']")).click();
			Alert al1 = driver.switchTo().alert();
			Thread.sleep(2000);
			al1.dismiss();*/
			if(actMsg1.equals(expMsg)){
				System.out.println("Msg matched");
				return true;
			}else{
				System.out.println("Msg not metched");
				return false;
			}
			
		}

		public boolean verifyEmailType(){
			ArrayList<String> expData=new ArrayList<String>();
			expData.add("Kiran");
			expData.add("Sagar");
			expData.add("Monica");
			expData.add("Kimaya");
			List<WebElement> list = emailType;
			ArrayList<String> actData = new ArrayList<String>();
			for(WebElement element : list){
				actData.add(element.getText());	
			}
			for(String id : actData){
				boolean flag=id.contains("@gmail.com");
				if(flag == true){
					System.out.println("Id is of domain gmail");

				}else{
					System.out.println("Id is not of domain gmail");
				}
			}
			if(actData.equals(expData)){
				System.out.println("List matched");
				return true;
			}else{
				System.out.println("List not metched");
				return false;
			}
		}

		public boolean sortUsername(){
			ArrayList<String> expData=new ArrayList<String>();
			expData.add("Kimaya");
			expData.add("Kiran");
			expData.add("Monica");
			expData.add("Sagar");
			List<WebElement> list = userList;
			ArrayList<String> actData = new ArrayList<String>();
			for(WebElement element : list){
				actData.add(element.getText());	
				Collections.sort(actData);
			}
			System.out.println(actData);
			if(actData.equals(expData)){
				System.out.println("Msg matched");
				return true;
			}else{
				System.out.println("Msg not metched");
				return false;
			}
		}

		public List genderSorting(){
			int rowNum;
			/*ArrayList<String> expData=new ArrayList<String>();
			expData.add("Kiran");
			expData.add("Sagar");*/
			//List<WebElement> genders = genderList;
			ArrayList<String> actData=new ArrayList<String>();
			for(int i=0;i<genderList.size();i++){
				String text=genderList.get(i).getText();
				if(text.contains("Male")){
					rowNum=i+2;
					String uname=driver.findElement(By.xpath("//tr["+rowNum+"]/td[2]")).getText();
					System.out.println("This user having gender as Male : "+uname);
					actData.add(uname);
				}
			}
			return actData;
		}

		public List stateSorting(){
			int rowNum;
			//List<WebElement> genders = stateList;
			ArrayList<String> actData=new ArrayList<String>();
			for(int i=0;i<stateList.size();i++){
				String text=stateList.get(i).getText();
				if(text.contains("Maharashtra")){
					rowNum=i+2;
					String uname=driver.findElement(By.xpath("//tr["+rowNum+"]/td[2]")).getText();
					System.out.println("This user having gender as Male : "+uname);
					actData.add(uname);
				}
			}
			return actData;
		}

		public List verifyMobNoLength(){
			int rowNum;
			//List<WebElement> genders = mobList;
			ArrayList<String> actData=new ArrayList<String>();
			for(int i=0;i<mobList.size();i++){
				String text=mobList.get(i).getText();
				if(text.length()==10){
					rowNum=i+2;
					String uname=driver.findElement(By.xpath("//tr["+rowNum+"]/td[2]")).getText();
					System.out.println("This user having mob no of 10 digits : "+uname);
					actData.add(uname);
				}
			}
			return actData;
		}

	}

