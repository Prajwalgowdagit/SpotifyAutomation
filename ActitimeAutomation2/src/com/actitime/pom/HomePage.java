package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//initialization
	@FindBy(xpath="//div[text()='TASKS123']")
	private WebElement taskOpt;
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewbtn;
	
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement newProjOpt;
	
	@FindBy(id="projectPopup_projectNameField")
	private WebElement projnameTbx;
	
	@FindBy(xpath="//button[contains(text(),' Please Select Customer')]")
	private WebElement custdropdown;
	
	@FindBy(linkText="Architects Bureau")
	private WebElement CustOpt;
	
	@FindBy(id="projectPopup_projectDescriptionField")
	private WebElement desctbx;
	
	@FindBy(xpath="//span[text()='Create Project']")
	private WebElement createproj;
	
	@FindBy(id="logoutLink")
	private WebElement logoutbtn;

	
	
	
	public WebElement getLogoutbtn() {
		return logoutbtn;
	}


	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getTaskOpt() {
		return taskOpt;
	}

	public WebElement getAddNewbtn() {
		return addNewbtn;
	}

	public WebElement getNewProjOpt() {
		return newProjOpt;
	}

	public WebElement getProjnameTbx() {
		return projnameTbx;
	}

	public WebElement getCustdropdown() {
		return custdropdown;
	}

	public WebElement getCustOpt() {
		return CustOpt;
	}

	public WebElement getDesctbx() {
		return desctbx;
	}

	public WebElement getCreateproj() {
		return createproj;
	}

	

	
	
	
	

}
