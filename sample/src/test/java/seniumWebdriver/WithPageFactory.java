package seniumWebdriver;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

public class WithPageFactory {
	@Test()
	public void alertModule() throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\sample\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		PageFactory.initElements(driver, POModel.class);
		POModel.emailId.sendKeys("pandiya");
		POModel.keyboard_tab.clear();
		POModel.keyboard_tab.sendKeys("Pandiya");
		POModel.default_text.clear();
		POModel.default_text.sendKeys("rajan");
		Thread.sleep(5000);
		driver.close();
		
	
	}

}
