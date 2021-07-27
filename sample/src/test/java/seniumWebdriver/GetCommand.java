package seniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetCommand {
	@Test
	public void getCommand() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\sample\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		//Get Text
		WebElement text = driver.findElement(By.xpath("//div[@class='main-header']"));
		String text2 = text.getText();
		System.out.println(text2);
		//Get Attribute
		WebElement att = driver.findElement(By.xpath("//div[@class='main-header']"));
		String attribute = att.getAttribute("value");
		System.out.println(attribute);
		//Get CurrentUrL
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		//Get Title
		String title = driver.getTitle();
		System.out.println(title);
		//Get PageSourse
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
	}

}
