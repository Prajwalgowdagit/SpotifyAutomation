package assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Display_AsscendingOpt_DropDown {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		d.get("file:///D:/Doc/SDET/JAVA/Hotels.html");
		WebElement food=d.findElement(By.id("mtr"));
		Select s=new Select(food);
		List<WebElement> allopt=s.getOptions();
		
		Set<String> optionsText = new HashSet<>();
        for (WebElement nele : allopt) {
            optionsText.add(nele.getText());
        }
        
		List<String> options = new ArrayList<>(optionsText);
        Collections.sort(options);
        
        for (String option : options) {
            System.out.println(option);
        }
        d.quit();

	}

}
