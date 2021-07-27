package junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestJunit extends BaseClass {
public static void main(String[] args) throws InterruptedException, Throwable {
	
setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\example.org\\Driver\\chromedriver.exe");
	driver.get("https://en-gb.facebook.com/login/");
	Thread.sleep(5000);
	getScreenshot("launch",2);
	WebElement user = driver.findElement(By.id("email"));
	sendInput(user, dataDriven(user, 1, 0));
	getScreenshot("userInput",2);
	dataWrite(1, 0, getValue(user));
	Thread.sleep(5000);
	WebElement pass = driver.findElement(By.id("pass"));
	sendInput(pass, dataDriven(pass, 2, 0));
	getScreenshot("password",2);
	dataWrite(2, 0, getValue(user));
 	


}

}