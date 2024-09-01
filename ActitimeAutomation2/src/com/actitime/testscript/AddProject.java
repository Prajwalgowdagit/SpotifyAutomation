package com.actitime.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;

@Listeners(com.actitime.generic.ListnerImplementation.class)
public class AddProject extends BaseClass {
	@Test
	public void createProject() throws InterruptedException {
		HomePage h = new HomePage(driver);
		h.getTaskOpt().click();Thread.sleep(2000);
		h.getAddNewbtn().click();Thread.sleep(2000);
		h.getNewProjOpt().click();Thread.sleep(2000);
		h.getProjnameTbx().sendKeys("Amazon");Thread.sleep(2000);
		h.getCustdropdown().click();Thread.sleep(2000);
		h.getCustOpt().click();Thread.sleep(2000);
		h.getDesctbx().sendKeys("This is a new project");Thread.sleep(2000);
		h.getCreateproj().click();Thread.sleep(2000);

	}

}
