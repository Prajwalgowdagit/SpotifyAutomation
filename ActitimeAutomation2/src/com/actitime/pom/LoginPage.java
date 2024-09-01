package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//initialization	
	@FindBy(id ="username")
	private WebElement usnTbx;
	@FindBy(name="pwd")
	private WebElement pwdTbx;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginbtn;
	
	
	
	//Declaration
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Utilization
	public void login(String un, String pwd) {
		usnTbx.sendKeys(un);
		pwdTbx.sendKeys(pwd);
		loginbtn.click();
		
	}
	
}
