package com.spotify.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(id="login-username")
private WebElement unTbx;
@FindBy(id="login-password")
private WebElement pwdTbx;
@FindBy(xpath = "//span[text()='Log In']")
private WebElement loginBtn;
@FindBy(xpath = "//span[text()='Log in']")
private WebElement loginLink;
public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void login(String un,String pwd) {
	loginLink.click();
	unTbx.sendKeys(un);
	pwdTbx.sendKeys(pwd);
	loginBtn.click();
}
}
