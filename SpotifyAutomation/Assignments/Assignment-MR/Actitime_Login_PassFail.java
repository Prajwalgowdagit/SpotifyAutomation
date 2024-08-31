package assignments;

import java.io.FileInputStream; 
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_Login_PassFail {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		d.get(wb.getSheet("login").getRow(0).getCell(0).getStringCellValue());
		int count=wb.getSheet("login").getLastRowNum();
		for(int i=2;i<=count;i++) {
		String un=wb.getSheet("login").getRow(i).getCell(0).getStringCellValue();
		String pwd=wb.getSheet("login").getRow(i).getCell(1).getStringCellValue();
		d.findElement(By.id("username")).sendKeys(un);
		d.findElement(By.name("pwd")).sendKeys(pwd+Keys.ENTER);Thread.sleep(5000);
		WebElement err=d.findElement(By.tagName("span"));
//		try {
//			d.findElement(By.xpath("//a[@id='logoutLink']/../../../td[2]/div/a")).click();
//			wb.getSheet("login").getRow(i).getCell(2).setCellValue("Pass");
//		}catch(NoSuchElementException exc){
//			wb.getSheet("login").getRow(i).getCell(2).setCellValue("Fail");
//		}Thread.sleep(5000);
		if(!err.isDisplayed()) {
			d.findElement(By.xpath("//a[@id='logoutLink']/../../../td[2]/div/a")).click();
			wb.getSheet("login").getRow(i).getCell(2).setCellValue("Pass");
		}else {
			wb.getSheet("login").getRow(i).getCell(2).setCellValue("Fail");
		}
		}
		FileOutputStream fso=new FileOutputStream("./data/testscript.xlsx");
		wb.write(fso);
	}
}
