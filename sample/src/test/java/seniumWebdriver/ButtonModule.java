package seniumWebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ButtonModule {
	  	@Test
	public void buttonModule() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\sample\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		
		//Click Button Module
		driver.findElement(By.linkText("Button")).click();
		
		// Click to home Button
		driver.findElement(By.xpath("//button[@id=\"home\"]")).click();
		
		//Again Clic Button Module
		driver.findElement(By.linkText("Button")).click();
		
		// Get The Button Position
		WebElement position = driver.findElement(By.xpath("//button[@id=\"position\"]"));
		Point point = position.getLocation();
		int x = point.getX();
		int y = point.getY();
		System.out.println("Button Position Is: XValue: "+x+", YValue: "+y);
		// Get Button Colour
		WebElement buttonColor = driver.findElement(By.xpath("//button[@id=\"color\"]"));
		String colorValue = buttonColor.getCssValue("color");
		System.out.println("Button Color Is: "+colorValue);
		
		//Get Button Size
		WebElement buttonSize = driver.findElement(By.xpath("//button[@id=\"size\"]"));
		Dimension size = buttonSize.getSize();
		System.out.println("Button Size: "+size);
		//close Page
		driver.close();
		
		
	
	
	
	}

}
