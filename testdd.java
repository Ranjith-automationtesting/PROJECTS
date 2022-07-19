package webdrive;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testdd {
		@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win10\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		Select sl = new Select (driver.findElement(By.id("dropdown1")));
		sl.selectByIndex(1);
		Select s2 = new Select (driver.findElement(By.name("dropdown2")));
		s2.selectByVisibleText("Loadrunner");
		Select s3 = new Select (driver.findElement(By.name("dropdown3")));
		s3.selectByValue("3");
		Select s4 = new Select (driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/select/option[3]")));
		s4.selectByVisibleText("Loadrunner");
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
