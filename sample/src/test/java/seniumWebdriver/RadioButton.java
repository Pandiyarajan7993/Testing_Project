package seniumWebdriver;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButton {
	static WebDriver driver;
	@Test
	public void radioButton() throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\sample\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		//Radio Button Module
		driver.findElement(By.linkText("Radio Button")).click();
		//Find default selected radio button
		List<WebElement> checkselect = driver.findElements(By.name("news"));
		System.out.println("Find default selected radio button:");
		for (WebElement verifyselect : checkselect) {
			
			
			if (verifyselect.isSelected()) {
				String text = verifyselect.getAttribute("value");			
						System.out.println(text);
			 	
			}
		}
		
	
	
	}

}
