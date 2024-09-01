package com.spotify.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.spotify.pom.HomePage;
import com.spotify.pom.LoginPage;

public class BaseClass {
public static WebDriver driver;
public FileLib f=new FileLib();
public HomePage h;
@BeforeTest
public void openBrowser() throws IOException {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	String url = f.readDataFromProperty("url");
	driver.get(url);
}
@BeforeMethod
public void login() throws IOException {
	LoginPage l=new LoginPage(driver);
	String un = f.readDataFromProperty("un");
	String pwd = f.readDataFromProperty("pwd");
	l.login(un, pwd);
}
@AfterMethod
 public void logout() {
	h.getUserLogoBtn().click();
	h.getLogoutBtn().click();
}
@AfterTest
public void closeBrowser() {
	driver.manage().window().minimize();
//	driver.quit();
}
}
