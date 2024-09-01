package com.spotify.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtility extends BaseClass {
	public void rightClick(WebElement ele) {
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
	}

	public void scrollToTheElement(WebElement ele) {
		Actions a = new Actions(driver);
		a.scrollToElement(ele).perform();
	}
}
