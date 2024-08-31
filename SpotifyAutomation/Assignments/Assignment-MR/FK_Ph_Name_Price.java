package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FK_Ph_Name_Price {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com");
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 14 pro max"+Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> name=d.findElements(By.xpath("//div[contains(text(),'Apple iPhone 14 Pro Max')]"));
		List<WebElement> price=d.findElements(By.xpath("//div[contains(text(),'Apple iPhone 14 Pro Max')]/../div/../../div[2]/div[1]/div[1]/div[1]"));
		int c1=name.size();
		int c2=price.size();
		System.out.println("count of phone:"+c1+" count of price:"+c2);
		for(int i=0;i<c1;i++)
		{
			for(int j=i;j<=i;j++)
			{
				WebElement n=name.get(i);
				String t1=n.getText();
				WebElement p=price.get(j);
				String t2=p.getText();
				System.out.println(t1+" "+t2);
			}
		}
		d.quit();
	}
}
