package assignments;

import org.openqa.selenium.By; 
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled_Displayed_Sendkeys_CSS {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com");Thread.sleep(3000);
		d.findElement(By.id("email")).sendKeys("MR@gmail.com");
		d.findElement(By.id("email")).sendKeys(Keys.CONTROL+"AC");Thread.sleep(2000);
		d.findElement(By.id("pass")).sendKeys(Keys.CONTROL+"V");Thread.sleep(2000);
		d.findElement(By.id("email")).clear();Thread.sleep(2000);
		d.findElement(By.id("pass")).clear();Thread.sleep(2000);
		int s1=d.findElement(By.id("email")).getRect().getWidth();
		int s2=d.findElement(By.id("pass")).getRect().getWidth();
		System.out.println(s1+" "+s2);
		if(s1==s2)
		{
			System.out.println("Email text and pwd box are same size");
		}
		else
		{
			System.out.println("Email text and pwd box are not in same size");
		}
		WebElement ele=d.findElement(By.name("login"));
		System.out.println(ele.getTagName());
		System.out.println(ele.getText());
		System.out.println(ele.getAttribute("type"));
		System.out.println(ele.getCssValue("color"));
		boolean res=ele.isEnabled();
		if(res==true)
		{
			System.out.println("The login button is enabled");
		}
		else
		{
			System.out.println("The login button is disabled");
		}
		d.findElement(By.linkText("Create new account")).click();Thread.sleep(2000);
		boolean sighin=d.findElement(By.name("websubmit")).isDisplayed();
		if(sighin)
		{
			System.out.println("The element sighin btn is displayed");
		}
		else
		{
			System.out.println("The element is signin btn not displayed");
		}
		d.findElement(By.xpath("//label[text()='Male']")).click();Thread.sleep(2000);
		boolean m=d.findElement(By.cssSelector("input[value='2']")).isSelected();
		if(m)
		{
			System.out.println("The m radio btn is selected");
		}
		else
		{
			System.out.println("The m radio btn is not selected");
		}
		d.quit();

	}

}
