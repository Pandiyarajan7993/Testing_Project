package org.datadriven;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitTest extends DataDriven {
	static WebDriver driver;
 
	public static void main(String[] args) throws Throwable {
		
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\example.org\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/login/");	

	WebElement user = driver.findElement(By.id("email"));
	sendInput(user, dataDriven(user, 1, 0));
	getScreenshot("userInput",4);
	Thread.sleep(5000);
	
	 dataWrite(1, 0, getValue(user));
	Thread.sleep(5000);
	WebElement pass = driver.findElement(By.id("pass"));
	sendInput(pass, dataDriven(pass, 2, 0));
	Thread.sleep(5000);
	getScreenshot("password",4);
	dataWrite(2, 0, getValue(user));
 	

}
}



