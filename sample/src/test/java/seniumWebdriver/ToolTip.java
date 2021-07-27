package seniumWebdriver;
import java.io.FileInputStream;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ToolTip {
	static WebDriver driver;
	@Test(enabled=false)
	public void tollTips() throws Throwable {

		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\sample\\Driver\\chromedriver.exe");		
		Properties prop=new Properties();
		prop.load(file);
		String Browser_name = prop.getProperty("Browser");
		String browser_Path = prop.getProperty("Path");
		if (Browser_name.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", browser_Path);
			driver=new ChromeDriver();

		}
		driver.get("http://leafground.com/pages/tooltip.html");
		WebElement toolTip = driver.findElement(By.xpath("//input[@id='age']"));
		String attribute = toolTip.getAttribute("title");
		System.out.println(attribute);

	}
	@Test(enabled=false)
	public void tollTip() throws Throwable {

		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\org.Test\\Files\\config.properties");		
		Properties prop=new Properties();
		prop.load(file);
		String Browser_name = prop.getProperty("Browser");
		String browser_Path = prop.getProperty("Path");
		if (Browser_name.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", browser_Path);
			driver=new ChromeDriver();

		}
		String baseUrl = "http://leafground.com/pages/tooltip.html"; 

		driver.get(baseUrl); 
		String expectedTooltip = " Enter your Name"; 
		
		// Find the age field 
		WebElement ele = driver.findElement(By.xpath("//input[@id='age']")); 

		//get the value of the "title" attribute 
		String actualTooltip = ele.getAttribute("title"); 

		//Comparing tooltip’s value with expected value 
		System.out.println("Actual Title of Tool Tip"+actualTooltip); 
		if(actualTooltip.equals(expectedTooltip)) { 
			System.out.println("Test Case Passed"); 
		} 
		driver.close();
	}
	
	@Test
	public void ActiontollTip() throws Throwable {

		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\org.Test\\Files\\config.properties");		
		Properties prop=new Properties();
		prop.load(file);
		String Browser_name = prop.getProperty("Browser");
		String browser_Path = prop.getProperty("Path");
		if (Browser_name.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", browser_Path);
			driver=new ChromeDriver();

		}
		String baseUrl = "http://leafground.com/pages/tooltip.html"; 
		driver.get(baseUrl); 

		Actions actions = new Actions(driver);

		 
		

		WebElement ele = driver.findElement(By.xpath("//input[@id='age']")); 

		//get the value of the "title" attribute 
		String actualTooltip = ele.getAttribute("title"); 
		// Using the action class to mimic mouse hover
				actions.moveToElement(ele).perform();
				
		System.out.println("toolTipText-->"+actualTooltip);

		//Verification if tooltip text is matching expected value
		if(actualTooltip.equalsIgnoreCase("Enter your Name")){
		System.out.println("Pass");
		}else{
		System.out.println("Fail");
		}
		// Close the main window
		driver.close();
		}
}
