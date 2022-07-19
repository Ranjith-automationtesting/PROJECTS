package webdrive;

import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class dropdown {
	@Test
	public void login1 () throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win10\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.mycontactform.com/samples.php");
		Select login = new Select(drive.findElement(By.name("q3")));
		login.selectByValue("First option");
//		login.selectByIndex(2);
//		login.selectByVisibleText("Fourth Option");
		File SrcFile=((TakesScreenshot)drive).getScreenshotAs(OutputType.FILE);
		Files.copy(SrcFile,new File("C:\\Users\\win10\\Desktop\\goat.png"));
		
	}
}
