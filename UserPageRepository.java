package com.jbk.objectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPageRepository {
@FindBy(tagName="h1")
public WebElement header;

@FindBy(tagName="h3")
public WebElement tableHeading;

@FindBy(tagName="th")
public List<WebElement> tableHeader;

@FindBy(xpath="//tr[2]/td")
public List<WebElement> row1;

@FindBy(xpath="//tr[3]/td")
public List<WebElement> row2;

@FindBy(xpath="//tr[4]/td")
public List<WebElement> row3;

@FindBy(xpath="//tr[5]/td")
public List<WebElement> row4;

@FindBy(xpath="//tr/td[1]")
public List<WebElement> col1;

@FindBy(xpath="//tr/td[2]")
public List<WebElement> col2;

@FindBy(xpath="//tr/td[3]")
public List<WebElement> col3;

@FindBy(xpath="//tr/td[4]")
public List<WebElement> col4;

@FindBy(xpath="//tr/td[5]")
public List<WebElement> col5;

@FindBy(xpath="//tr/td[6]")
public List<WebElement> col6;

@FindBy(xpath="//tr/td[7]")
public List<WebElement> col7;

@FindBy(xpath="//tr/td[8]")
public List<WebElement> col8;

@FindBy(xpath="//button[text()='Add User']")
public WebElement addUserBtn;

@FindBy(xpath="//span[text()='Delete']")
public WebElement firstDltBtn;

@FindBy(xpath="//span[@class='label label-danger ss']")
public WebElement secondDltBtn;

@FindBy(xpath="//td[3]")
public List<WebElement> emailType;

@FindBy(xpath="//td[2]")
public List<WebElement> userList;

@FindBy(xpath="//td[6]")
public List<WebElement> genderList;

@FindBy(xpath="//td[7]")
public List<WebElement> stateList;

@FindBy(xpath="//td[4]")
public List<WebElement> mobList;
}
