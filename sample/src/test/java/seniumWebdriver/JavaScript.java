package seniumWebdriver;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScript {

	static WebDriver driver;
	@BeforeMethod
	public void setBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\sample\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	@Test(enabled=false)
	public void javaScriptScroll()   {

		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,700)");



	}
	@Test()
	public void javaScript() throws InterruptedException   {

		driver.get("https://www.google.com/search?q=amason&oq=amason&aqs=chrome..69i57.3142j0j4&sourceid=chrome&ie=UTF-8");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement clickme = driver.findElement(By.xpath("(//span[@class=\"SJajHc\"])[1]"));
		js.executeScript("arguments[0].scrollIntoView(true);", clickme);
		Thread.sleep(5000);

	}


}
