package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fill_InsuranceDetails {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		d.findElement(By.id("policynumber")).sendKeys("6106");
		d.findElement(By.id("dob")).click();
		WebElement mon=d.findElement(By.className("ui-datepicker-month"));
		Select m=new Select(mon);
		m.selectByIndex(0);
		WebElement year=d.findElement(By.className("ui-datepicker-year"));
		Select y=new Select(year);
		y.selectByVisibleText("2002");
		d.findElement(By.xpath("//a[@data-date='12']")).click();
		d.findElement(By.id("alternative_number")).sendKeys("1234567890");
		d.findElement(By.id("renew_policy_submit")).click();
//		String str=d.findElement(By.id("policynumberError")).getText();
//		System.out.println(str.equals("Please enter valid Policy No."));
		boolean str=d.findElement(By.id("policynumberError")).isDisplayed();
		if(str) {
			System.out.println("The element is displayed");
		}else {
			System.out.println("The element is not displayed");
		}
		d.quit();
	}

}
