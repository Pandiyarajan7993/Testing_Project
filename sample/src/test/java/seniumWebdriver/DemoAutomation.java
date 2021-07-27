package seniumWebdriver;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoAutomation {
	@Test
	public void demoModule() throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\sample\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		// This step will result in an alert on screen
		WebElement element = driver.findElement(By.xpath("(//a[@data-toggle=\"dropdown\"])[1]"));
		WebElement alertBox = driver.findElement(By.xpath("(//a[@data-toggle=\"tab\"])[3]"));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", alertBox);
		driver.findElement(By.xpath("//button[@onclick=\"promptbox()\"]")).click();
		Thread.sleep(5000);
		Alert promptAlert  = driver.switchTo().alert();
		promptAlert.sendKeys("pandiyaraj");
		String alertText = promptAlert.getText();
		System.out.println(alertText);
		promptAlert.accept();
		Thread.sleep(5000);
		

	}

}
