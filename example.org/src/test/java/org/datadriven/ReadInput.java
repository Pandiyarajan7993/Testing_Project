package org.datadriven;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadInput extends DataDriven {
	public static void main(String[] args) throws Throwable {
		setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\example.org\\Driver\\chromedriver.exe");
		chromeDriver();
		launchBrowser("https://en-gb.facebook.com/login/");
		getScreenshot("launch",2);
		WebElement user = driver.findElement(By.id("email"));
		sendInput(user, dataDriven(user, 1, 0));
		getScreenshot("user",2);
		String attribute = user.getAttribute("value");
		dataWrite(1, 0, attribute);
		Thread.sleep(5000);
		WebElement pass = driver.findElement(By.id("pass"));
		sendInput(pass, dataDriven(pass, 2, 0));
		getScreenshot("password",2);
		//dataWrite(2, 0, getValue(pass));
	 	}

}
