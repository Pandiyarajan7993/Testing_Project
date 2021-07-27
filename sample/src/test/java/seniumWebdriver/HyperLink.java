package seniumWebdriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HyperLink {
	static WebDriver driver;
	@Test
	public void hyperLink() throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\sample\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		
		//Click to HyperLink Module
		driver.findElement(By.linkText("HyperLink")).click();
		
		// Click The Link
		driver.findElement(By.linkText("Go to Home Page")).click();
		
		//Click to HyperLink Module
		driver.findElement(By.linkText("HyperLink")).click();
		
		//Find where am supposed to go without clicking me?
		WebElement findLocation = driver.findElement(By.linkText("Find where am supposed to go without clicking me?"));
		String linklocation = findLocation.getAttribute("href");
		System.out.println("Find where am supposed to go without clicking me?:  "+linklocation);
		
		
		// Verify Broken Links
		int count=0;
		List<WebElement> verifyLink = driver.findElements(By.tagName("a"));
		for (WebElement webElement : verifyLink) {
			String brokenLink = webElement.getAttribute("href");
		
		
		URL url=new URL(brokenLink);
		URLConnection openConnection = url.openConnection();
		HttpURLConnection connection=(HttpURLConnection)openConnection;
		int responseCode = connection.getResponseCode();
		if (responseCode==404) {
			System.out.println(responseCode);
			count ++;
			}
		}
		System.out.println("Broken Link Count"+count);
		
		//Go To Home Page
		driver.findElement(By.linkText("Go to Home Page")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("HyperLink")).click();
		
		
		// Link Count
		int lincount=0;
		List<WebElement> linkCount = driver.findElements(By.tagName("a"));
		for (WebElement webElement : linkCount) {
			lincount++;
			System.out.println("Links "+linkCount);
			
			
		}
		System.out.println("Total Link"+lincount);
		
driver.close();
		
	}

	

	}
	
