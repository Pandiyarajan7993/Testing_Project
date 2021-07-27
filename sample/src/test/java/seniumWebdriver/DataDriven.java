package seniumWebdriver;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;




public class DataDriven extends BaseClass {
	@Test()
	public void dataDriven() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\sample\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(dataRead("Sheet1", 0, 0)); 
		WebElement append = driver.findElement(By.xpath("//input[@value='Append ']"));
		append.clear();
		
		append.sendKeys(dataRead("Sheet1", 1, 0));
		WebElement testLeaf = driver.findElement(By.xpath("//input[@value='TestLeaf']"));
		testLeaf.clear();
		testLeaf.sendKeys(dataRead("Sheet1", 2, 0));
		WebElement clearMe = driver.findElement(By.xpath("//input[@value='Clear me!!']"));
		clearMe.clear();
		clearMe.sendKeys(dataRead("Sheet1", 3, 0));
	
	}
	@Test(enabled=false)
	public void pomdataDriven() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\sample\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		PomDataDriven.emailId.sendKeys(dataRead("Sheet1", 0, 0));
	}

}
