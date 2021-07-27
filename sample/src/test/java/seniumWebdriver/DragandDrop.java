package seniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragandDrop {
	static WebDriver driver;
	@BeforeMethod
	public void setBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\sample\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		
	}
	@Test()
	public void dragandDrop() throws InterruptedException  {

		driver.get("http://leafground.com/pages/drag.html");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		WebElement drag = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		Thread.sleep(5000);
		action.dragAndDropBy(drag, 125, 30).build().perform();
	}
	
	@Test()
	public void Drop() throws InterruptedException  {

		driver.get("http://leafground.com/pages/drop.html");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		WebElement so = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		WebElement des = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		action.dragAndDrop(so, des).build().perform();
		
	
	}

}
