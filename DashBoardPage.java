package com.jbk.pages;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
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

import com.jbk.objectRepository.DashBoardPageRepository;

public class DashBoardPage extends DashBoardPageRepository{
	WebDriver driver;
	Workbook wb;
	Sheet sh;
	
	public DashBoardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	public boolean verifyCourse() throws Exception{
		DashboardMethods.baseMethod("Book1.xls");
		/*FileInputStream fis = new FileInputStream("Book1.xls");
		wb = WorkbookFactory.create(fis);
		sh=wb.getSheetAt(0);
		int row =sh.getPhysicalNumberOfRows();
		int col=sh.getRow(row-1).getPhysicalNumberOfCells();
		System.out.println(row+","+col);
		List<String> expData=new ArrayList<String>();
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				Cell cell=sh.getRow(i).getCell(j);
				String data=cell.getStringCellValue();
				System.out.println(data+" ");
				expData.add(data);	
			}
		}*/
		//System.out.print(expData);
		//List<WebElement> list = driver.findElements(By.xpath("//div/h3"));
		List<String> expData=new ArrayList<String>();
		ArrayList<String> actData = new ArrayList<String>();
		for(WebElement elements : courselist){
			actData.add(elements.getText());
				
		}
		System.out.println("actData:"+actData);
		if(actData.equals(expData)){
			System.out.println("Courses verified");
			return true;
		}else{
			System.out.println("Courses are not verified");
			return false;
		}
	}

	public boolean verifySideBar() throws Exception{
		FileInputStream fis = new FileInputStream("Book2.xls");
		wb = WorkbookFactory.create(fis);
		sh=wb.getSheetAt(0);
		int row =sh.getPhysicalNumberOfRows();
		int col=sh.getRow(row-1).getPhysicalNumberOfCells();
		System.out.println(row+","+col);
		List<String> expData=new ArrayList<String>();
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				Cell cell=sh.getRow(i).getCell(j);
				String data=cell.getStringCellValue();
				System.out.println(data+" ");
				expData.add(data);	
			}
		}
		System.out.print(expData);	
		ArrayList<String> actData = new ArrayList<String>();
		for(WebElement elements : sidebarlist){
			actData.add(elements.getText());
			System.out.println(actData);	
		}
		if(actData.equals(expData)){
			System.out.println("Sidebar verified");
			return true;
		}else{
			System.out.println("Sidebar are not verified");
			return false;
		}
	}

	public boolean verifyCourseSubtitle() throws Exception{
		FileInputStream fis = new FileInputStream("Book3.xls");
		Workbook wb = WorkbookFactory.create(fis);
		sh=wb.getSheetAt(0);
		int row =sh.getPhysicalNumberOfRows();
		int col=sh.getRow(row-1).getPhysicalNumberOfCells();
		System.out.println(row+","+col);
		List<String> expData=new ArrayList<String>();
		for(int i=0;i<col;i++){
			for(int j=0;j<row;j++){
				Cell cell=sh.getRow(j).getCell(i);
				String data=cell.getStringCellValue();
				System.out.println(data+" ");
				expData.add(data);	
			}
			System.out.print(expData);	
			break;
		}
		//List<WebElement> list = driver.findElements(By.xpath("//div[@class='inner']//following::p"));
		ArrayList<String> actData = new ArrayList<String>();
		for(WebElement elements : coursesubtitle){
			actData.add(elements.getText());
			System.out.println(actData);	
		}
		if(actData.equals(expData)){
			System.out.println("Courses Subtitle verified");
			return true;
		}else{
			System.out.println("Courses Subtitle are not verified");
			return false;
		}
	}

	public boolean verifyCOurse01(){
		ArrayList<String> exp = new ArrayList<String>();
		exp.add("Selenium");
		exp.add("Java / J2EE");
		exp.add("Python");
		exp.add("Php");
		System.out.println(exp);
		ArrayList<String> act = new ArrayList<String>();
		for(WebElement elements : courselist){
			act.add(elements.getText());
		}
		if(act.equals(exp)){
			System.out.println("Courses verified");
			return true;
		}else{
			System.out.println("Courses are not verified");
			return false;
		}
	}

	public boolean verifySideBar01(){
		ArrayList<String> exp = new ArrayList<String>();
		exp.add("Dashboard");
		exp.add("Users");
		exp.add("Operators");
		exp.add("Useful Links");
		exp.add("Downloads");
		exp.add("Logout");
		System.out.println(exp);
		//List<WebElement> list = driver.findElements(By.xpath("//a[text()='LOGOUT']//following::span"));
		ArrayList<String> act = new ArrayList<String>();
		for(WebElement elements : sidebarlist){
			act.add(elements.getText());
		}
		if(act.equals(exp)){
			System.out.println("Courses verified");
			return true;
		}else{
			System.out.println("Courses are not verified");
			return false;
		}
	}

	public boolean verifyCourseSubtitle01(){
		ArrayList<String> exp = new ArrayList<String>();
		exp.add("Automation Testing");
		exp.add("Software Development");
		exp.add("Data Science");
		exp.add("Web Development");
		System.out.println(exp);
		//List<WebElement> list = driver.findElements(By.xpath("//div[@class='inner']//following::p"));
		ArrayList<String> act = new ArrayList<String>();
		for(WebElement elements : coursesubtitle){
			act.add(elements.getText());
		}
		if(act.equals(exp)){
			System.out.println("Courses verified");
			return true;
		}else{
			System.out.println("Courses are not verified");
			return false;
		}
	}

	public boolean verifyMoreInfo(){
		//List<WebElement> list = driver.findElements(By.xpath("//a[@class='small-box-footer']"));
		int actCount = moreinfocount.size();
		if(actCount==4){
			System.out.println("COunt matched");
			return true;
		}else{
			System.out.println("COunt not matched");
			return false;
		}
	}

	public boolean verifySeleniumTitle(){
		String actText=seleniumtitle.getText();
		String expText="Selenium";
		if(actText.equals(expText)){
			return true;
		}else{
			return false;
		}
	}

	public boolean verifyJavaTitle(){
		//String actText=driver.findElement(By.xpath("//h3[text()='Java / J2EE']")).getText();
		String actText=javatitle.getText();
		String expText="Java / J2EE";
		if(actText.equals(expText)){
			return true;
		}else{
			return false;
		}
	}

	public boolean verifyPythonTitle(){
		//String actText=driver.findElement(By.xpath("//h3[text()='Python']")).getText();
		String actText=pythontitle.getText();
		String expText="Python";
		if(actText.equals(expText)){
			return true;
		}else{
			return false;
		}
	}

	public boolean verifyPhpTitle(){
		//String actText=driver.findElement(By.xpath("//h3[text()='Php']")).getText();
		String actText=phptitle.getText();
		String expText="Php";
		if(actText.equals(expText)){
			return true;
		}else{
			return false;
		}
	}

	public boolean verifySeleniumSubTitle(){
		//String actText=driver.findElement(By.xpath("//h3[text()='Selenium']//following-sibling::p")).getText();
		String actText=seleniumsubtitle.getText();
		String expText="Automation Testing";
		if(actText.equals(expText)){
			return true;
		}else{
			return false;
		}
	}

	public boolean verifyJavaSubTitle(){
		//String actText=driver.findElement(By.xpath("//h3[text()='Java / J2EE']//following-sibling::p")).getText();
		String actText=javasubtitle.getText();
		String expText="Software Development";
		if(actText.equals(expText)){
			return true;
		}else{
			return false;
		}
	}

	public boolean verifyPythonSubTitle(){
		//String actText=driver.findElement(By.xpath("//h3[text()='Python']//following-sibling::p")).getText();
		String actText=pythonsubtitle.getText();
		String expText="Data Science";
		if(actText.equals(expText)){
			System.out.println("Courses verified");
			return true;
		}else{
			System.out.println("Courses are not verified");
			return false;
		}
	}

	public boolean verifyPhpSubTitle(){
		//String actText=driver.findElement(By.xpath("//h3[text()='Php']//following-sibling::p")).getText();
		String actText=phpsubtitle.getText();
		String expText="Web Development";
		if(actText.equals(expText)){
			System.out.println("Courses verified");
			return true;
		}else{
			System.out.println("Courses are not verified");
			return false;
		}
	}

	public boolean verifySeleniumTitle01(){
		//String actText=driver.findElement(By.xpath("//p[text()='Automation Testing']//preceding::h3")).getText();
		String actText=seleniumtitle.getText();
		String expText="Selenium";
		if(actText.equals(expText)){
			return true;
		}else{
			return false;
		}
	}

	public boolean verifyJavaTitle01(){
		//String actText=driver.findElement(By.xpath("//p[text()='Software Development']//preceding-sibling::h3")).getText();
		String actText=javatitle.getText();
		String expText="Java / J2EE";
		if(actText.equals(expText)){
			return true;
		}else{
			return false;
		}
	}

	public boolean verifyPythonTitle01(){
		//String actText=driver.findElement(By.xpath("//p[text()='Data Science']//preceding-sibling::h3")).getText();
		String actText=pythontitle.getText();
		String expText="Python";
		if(actText.equals(expText)){
			return true;
		}else{
			return false;
		}
	}

	public boolean verifyPhpTitle01(){
		//String actText=driver.findElement(By.xpath("//p[text()='Web Development']//preceding-sibling::h3")).getText();
		String actText=phptitle.getText();
		String expText="Php";
		if(actText.equals(expText)){
			return true;
		}else{
			return false;
		}
	}

	public boolean verifyUserText(){
		//String actText=driver.findElement(By.xpath("//span[text()='Users']")).getText();
		String actText=user.getText();
		String expText="Users";
		if(actText.equals(expText)){
			return true;
		}else{
			return false;
		}
	}

	public boolean verifyOperatorsText(){
		//String actText=driver.findElement(By.xpath("//span[text()='Operators']")).getText();
		String actText=operators.getText();
		String expText="Operators";
		if(actText.equals(expText)){
			return true;
		}else{
			return false;
		}
	}

	public boolean verifyUsefulLinksText(){
		//String actText=driver.findElement(By.xpath("//span[text()='     Useful Links']")).getText();
		String actText=usefullinks.getText();
		String expText="Useful Links";
		if(actText.equals(expText)){
			return true;
		}else{
			return false;
		}
	}

	public boolean verifyDownloadsText(){
		//String actText=driver.findElement(By.xpath("//span[text()='Downloads']")).getText();
		String actText=downloads.getText();
		String expText="Downloads";
		if(actText.equals(expText)){
			return true;
		}else{
			return false;
		}
	}

	public boolean verifyLogOutText(){
		//String actText=driver.findElement(By.xpath("//span[text()='Logout']")).getText();
		String actText=logout.getText();
		String expText="Logout";
		if(actText.equals(expText)){
			return true;
		}else{
			return false;
		}
	}

	public boolean verifyTitle(){
		String actTitle=driver.getTitle();
		String expTitle="JavaByKiran | Dashboard";
		if(actTitle.equals(expTitle)){
			return true;
		}else{
			return false;
		}
	}
	
	public UserPage navigateToUserPage(){
		user.click();
		return new UserPage(driver);
	}
	
	public OperatorPage navigateToOperatorPage(){
		operators.click();
		return new OperatorPage(driver);
	}
	
	public UserPage navigateToUsefulLinksPage(){
		user.click();
		return new UserPage(driver);
	}
	
	public DownloadPage navigateToDownloadsPage(){
		downloads.click();
		return new DownloadPage(driver);
	}
}
