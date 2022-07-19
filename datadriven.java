import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.*;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datadriven {

	public static void main (String[] args)throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win10\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		FileInputStream f= new FileInputStream("D:\\STC\\AUTOMATIONTESTING\\data.xls");
		HSSFWorkbook wb = new HSSFWorkbook(f);
		HSSFSheet s1=wb.getSheetAt(0);
		int totalrows=s1.getLastRowNum();
		System.out.println(totalrows);
		for(int i=1; i<totalrows+1;i++)
		{
			String Username=s1.getRow(i).getCell(0).getStringCellValue();
			//String a1=Username.getStringCellValue();
			System.out.println("Username is " + Username);
			driver.get("https://www.facebook.com/login/");
			WebElement user = driver.findElement(By.id("email"));
			user.sendKeys(Username);
			
			String Password=s1.getRow(i).getCell(1).getStringCellValue();
			//String p1=Password.getStringCellValue();
			System.out.println("Password is " + Password);
			WebElement pass = driver.findElement(By.id("pass"));
			pass.sendKeys(Password);
			
			WebElement login=driver.findElement(By.id("loginbutton"));
			login.click();
			Thread.sleep(5000);
		}
				
	}

}