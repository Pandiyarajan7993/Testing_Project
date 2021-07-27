package seniumWebdriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindows {
	
	static WebDriver driver;
	@BeforeMethod
	public void beforemethods() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\sample\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();

	}


	@Test(enabled=false)
	public void windows() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://leafground.com/pages/Window.html");
		
		WebElement home = driver.findElement(By.xpath(" //button[@onclick='openWin();']"));
		home.click();
		String parentHandle = driver.getWindowHandle();
		Set<String> Allwindow = driver.getWindowHandles();
		
		for (String childWinows : Allwindow) {
			if (!Allwindow.equals(parentHandle)) {
				driver.switchTo().window(childWinows);
				driver.manage().window().maximize();
			}
			
		}
		driver.close();

	}

	@Test(enabled=false)
	public void windowsCount() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://leafground.com/pages/Window.html");
		
		WebElement home = driver.findElement(By.xpath("//button[@onclick='openWindows()']"));
		home.click();
		String parentHandle = driver.getWindowHandle();
		Set<String> Allwindow = driver.getWindowHandles();
		int count=0;
		for (String childWinows : Allwindow) {
			if (!Allwindow.equals(parentHandle)) {
				driver.switchTo().window(childWinows);
				count++;
				driver.manage().window().maximize();
			}
			
		}
		System.out.println("Windows Count: "+count);
		driver.close();

	}

	@Test(enabled=false)
	public void Close_all_except_this_window() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://leafground.com/pages/Window.html");
		
		WebElement home = driver.findElement(By.xpath(" //button[@onclick='openWindows();']"));
		home.click();
		String parentHandle = driver.getWindowHandle();
		Set<String> Allwindow = driver.getWindowHandles();
		for (String childwindow : Allwindow) {
			if (!parentHandle.equals(childwindow)) {
				driver.switchTo().window(childwindow).close();
				
			}
			
		}
		
		
	}

	@Test
	public void wait_for_2_new_Windows_to_open()
 {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		driver.navigate().to("http://leafground.com/pages/Window.html");
		WebElement home = driver.findElement(By.xpath("//button[@onclick='openWindowsWithWait();']"));
		home.click();
		String parentwindow = driver.getWindowHandle();		
		Set<String> childWindow = driver.getWindowHandles();
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		
		
		
		
	}

}
