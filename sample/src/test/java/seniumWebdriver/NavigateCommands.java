package seniumWebdriver;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigateCommands {
	@Test
	public void getCommand() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\sample\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://leafground.com/");
		WebElement home = driver.findElement(By.linkText("Edit"));
		home.click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Dimension dim=new Dimension(250,300);
		driver.manage().window().setSize(dim);
		
	
	
	}

}
