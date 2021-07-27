package seniumWebdriver;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Frames {
	static WebDriver driver;
	@BeforeMethod
	public void setBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\sample\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		
	}
	
		@Test()
		public void framesAutomation()  {

			driver.get("http://leafground.com/pages/frame.html");
			driver.manage().window().maximize();
			WebElement frameSwitching = driver.findElement(By.xpath("//iframe[@src='default.html']"));
			WebDriver frame = driver.switchTo().frame(frameSwitching);
			WebElement clickme = driver.findElement(By.xpath("//button[@id='Click']"));
			clickme.click();
			driver.close();
			
}
		@Test()
		public void nestedframesAutomation()  {

			driver.get("http://leafground.com/pages/frame.html");
			driver.manage().window().maximize();
			WebElement frameSwitching = driver.findElement(By.xpath("//iframe[@src='page.html']"));
			WebDriver frame = driver.switchTo().frame(frameSwitching);
			WebElement nestedFrame = driver.findElement(By.xpath("//iframe[@src=\"nested.html\"]"));
			WebDriver frames = driver.switchTo().frame(nestedFrame);
			driver.findElement(By.xpath("//button[@id='Click1']")).click();
			driver.switchTo().parentFrame();
			driver.switchTo().defaultContent();
			
			driver.close();
			
			
}
		@Test
		public void findTotalframes()  {
			int count=0;
			driver.get("http://leafground.com/pages/frame.html");
			driver.manage().window().maximize();
			WebElement findElement = driver.findElement(By.xpath("(//div[@id='wrapframe'])[3]"));
			List<WebElement> list = driver.findElements(By.tagName("iframe"));
			for (WebElement webElement : list) {
				String text = webElement.getText();
				System.out.println(text);
				count++;
				
				
			}
			System.out.println(count);
		}


}