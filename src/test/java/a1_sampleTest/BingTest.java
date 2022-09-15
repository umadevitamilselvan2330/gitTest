package a1_sampleTest;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BingTest {
	
	@Test
	public void validateBing() throws IOException{
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.bing.com/");
		wd.findElement(By.name("q")).sendKeys("chennai");
		File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("D:/workspace/J1_GitTest/screenshot"));
		
	}
  // one suite matum na that partuicullar file la right click panni TestNg and convert TestNg kuduthutu panalam
 // but all suite pananum na antha code a google la search (multiole suite using TestNg) search panni antha code a copy pannitu 
//then theriumbavum oru file right click pannitu convert TestNg pannitu but suite file la 2 suite irukum antha 2nd suite kum name vachu run panni pakanum
}
