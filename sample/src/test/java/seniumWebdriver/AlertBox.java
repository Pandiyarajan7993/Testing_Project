package seniumWebdriver;

import java.awt.AWTException;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AlertBox { 	
	@Test()
	public void alertModule() throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\sample\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		// This step will result in an alert on screen
		WebElement element = driver.findElement(By.id("promtButton"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
		Alert promptAlert  = driver.switchTo().alert();
		String alertText = promptAlert.getText();
		System.out.println("Alert text is " + alertText);
		//Send some text to the alert
		Thread.sleep(5000);
		promptAlert.sendKeys("pandiyaraj");
		promptAlert.accept();
		Thread.sleep(5000);
		String text = driver.findElement(By.xpath("//span[@id='promptResult']")).getText();
		System.out.println(text);



	}
	@Test(enabled=false)
	public void simpleAlert() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\sample\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		WebElement simpleAlert = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		simpleAlert.click();
		driver.switchTo().alert().accept();


	}
	@Test(enabled=false)
	public void conformAlert() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\sample\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		WebElement simpleAlert = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		simpleAlert.click();
		driver.switchTo().alert().dismiss();


	}
	@Test(enabled=false)
	public void lineBreakAlert() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\sample\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		WebElement simpleAlert = driver.findElement(By.xpath("//button[@onclick='lineBreaks()']"));
		String text = simpleAlert.getText();
		System.out.println(text);
		simpleAlert.click();
		driver.switchTo().alert().dismiss();


	}
	@Test(enabled=false)
	public void Sweet_Alert() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\sample\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		driver.manage().window().maximize();

		WebElement simpleAlert = driver.findElement(By.xpath("//button[@id='btn']"));
		String text = simpleAlert.getText();
		System.out.println(text);
		simpleAlert.click();
		Point location = driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println("Alert Location"+"("+x+","+y+")");
		driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();
	}
}
