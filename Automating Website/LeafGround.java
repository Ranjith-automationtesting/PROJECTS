package webdrive;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LeafGround {
		@Test
		public static void main (String[] args)throws Exception{
		System.setProperty("webdriver.chrome.driver","D:\\STC\\AUTOMATIONTESTING\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//1.open website
		driver.get("http://www.leafground.com/home.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//2.click a link Image
		driver.findElement(By.cssSelector("#post-153 > div.wp-landing-categories > div > ul > li:nth-child(1) > a")).click();
		Thread.sleep(3000);
		
		//3.Enter values in Email and text box
		driver.findElement(By.id("email")).sendKeys("hello@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input")).clear();
		Thread.sleep(3000);
		
		//4.Go to previous page
		driver.navigate().back();
		
		//5.open Hyperlinks
		driver.findElement(By.cssSelector("#post-153 > div.wp-landing-categories > div > ul > li:nth-child(3) > a")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#contentblock > section > div:nth-child(4) > div > div > a")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		//6.DropDown
		driver.findElement(By.cssSelector("#post-153 > div.wp-landing-categories > div > ul > li:nth-child(5) > a")).click();
		Select sl = new Select(driver.findElement(By.id("dropdown1")));
		
		//by Index
		sl.selectByIndex(2);
		Thread.sleep(2000);
		//by visible text
		Select s2 = new Select(driver.findElement(By.id("dropdown3")));
		s2.selectByVisibleText("Loadrunner");
		Thread.sleep(2000);
		//by value
		Select s3 = new Select(driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/select")));
		s3.selectByValue("2");
		driver.navigate().back();
		
		//7.Radio Buttons
		driver.findElement(By.cssSelector("#post-153 > div.wp-landing-categories > div > ul > li:nth-child(6) > a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("no")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		//8.Check Box
		driver.findElement(By.cssSelector("#post-153 > div.wp-landing-categories > div > ul > li:nth-child(7) > a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[5]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[3]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[4]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[5]")).click();
		Thread.sleep(2000);
		//deselect check box
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[2]")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		//9.Alert Box
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[9]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		//conformation Box
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		//Promt Box
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("RANJITH");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.navigate().back();
		
		//10.Calender
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[12]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("ui-state-default")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		//11.Quit Browser
		Thread.sleep(4000);
		driver.quit();
		
	}

}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
