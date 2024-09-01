package com.spotify.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(xpath = "//button[@data-testid='user-widget-link']")
private WebElement userLogoBtn;
@FindBy(xpath = "//span[text()='Log out']")
private WebElement logoutBtn;
@FindBy(linkText = "Popular artists")
private WebElement popularArtistsLink;
@FindBy(xpath = "(//section[@aria-label='Popular albums']/div[2]//span[text()])[1]")
private WebElement firstAlbum;
@FindBy(xpath = "//span[text()='Add to playlist']")
private WebElement addToPlaylistBtn;
@FindBy(xpath = "//span[text()='New playlist']")
private WebElement newPlaylistBtn;
@FindBy(xpath = "(//li[@role='listitem'])[4]")
private WebElement addedAblum;
@FindBy(xpath = "//span[text()='Edit details']")
private WebElement editDetailsOpt;
@FindBy(xpath = "//input[@placeholder='Add a name']")
private WebElement addNameTbx;
@FindBy(xpath = "//span[text()='Save']")
private WebElement saveBtn;
@FindBy(xpath = "//span[text()='Delete']")
private WebElement deleteBtn;

public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getUserLogoBtn() {
	return userLogoBtn;
}

public WebElement getLogoutBtn() {
	return logoutBtn;
}

public WebElement getPopularArtistsLink() {
	return popularArtistsLink;
}

public WebElement getFirstAlbum() {
	return firstAlbum;
}

public WebElement getAddToPlaylistBtn() {
	return addToPlaylistBtn;
}

public WebElement getNewPlaylistBtn() {
	return newPlaylistBtn;
}

public WebElement getAddedAblum() {
	return addedAblum;
}

public WebElement getEditDetailsOpt() {
	return editDetailsOpt;
}

public WebElement getAddNameTbx() {
	return addNameTbx;
}

public WebElement getSaveBtn() {
	return saveBtn;
}

public WebElement getDeleteBtn() {
	return deleteBtn;
}


}
