package assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_DropDown_Sort {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		d.get("file:///D:/Doc/SDET/JAVA/Hotels.html");
		WebElement food=d.findElement(By.id("mtr"));
		Select s=new Select(food);
		List<WebElement> allopt=s.getOptions();
		
		List<String> optionsText = new ArrayList<>();
        for (WebElement nele : allopt) {
            optionsText.add(nele.getText());
        }
        Collections.sort(optionsText);
        for (String option : optionsText) {
            System.out.println(option);
        }
        d.quit();
    }
}