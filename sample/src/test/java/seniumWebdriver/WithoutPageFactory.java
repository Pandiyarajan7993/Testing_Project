package seniumWebdriver;

import java.awt.AWTException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class WithoutPageFactory {
	
	@Test()
	public void alertModule() throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\sample\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		PageObjectModel.emailId(driver).sendKeys("pandiya");
		PageObjectModel.keyboard_tab(driver).clear();
		PageObjectModel.keyboard_tab(driver).sendKeys("rajan");
		PageObjectModel.default_text(driver).clear();
		PageObjectModel.default_text(driver).sendKeys("pandiyarajan");
		driver.close();
		
	
	}
}
