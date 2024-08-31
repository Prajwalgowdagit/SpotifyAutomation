package com.spotify.testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.spotify.generic.BaseClass;
import com.spotify.generic.WebDriverUtility;
import com.spotify.pom.HomePage;
@Listeners(com.spotify.generic.ListenerImplementation.class)
public class AlbumModule extends BaseClass{
	@Test
	public void createEditDeleteAlbum() throws InterruptedException, IOException {
		Thread.sleep(5000);	WebDriverUtility w=new WebDriverUtility();
		h=new HomePage(driver);
		WebElement popularAlbums = h.getPopularArtistsLink();
		w.scrollToTheElement(popularAlbums);
		WebElement album =h.getFirstAlbum();
		w.rightClick(album); 
		h.getAddToPlaylistBtn().click(); 
		h.getNewPlaylistBtn().click(); Thread.sleep(2000);
		WebElement addedAlbum = h.getAddedAblum();
		w.rightClick(addedAlbum); 	Thread.sleep(2000);
		h.getEditDetailsOpt().click(); 
		WebElement addNameTbx = h.getAddNameTbx();
		addNameTbx.clear();	Thread.sleep(2000);
		String expectedName = f.readDataFromProperty("rename");
		addNameTbx.sendKeys(expectedName); 
		h.getSaveBtn().click(); 
		Thread.sleep(2000);
		String actualText = addedAlbum.getText();
		boolean res = actualText.contains(expectedName);
		Thread.sleep(2000);
		Assert.assertTrue(res,"Both album name and expected value are same");
		w.rightClick(addNameTbx); 
		h.getDeleteBtn().click(); 
		h.getDeleteBtn().click();
	}
}