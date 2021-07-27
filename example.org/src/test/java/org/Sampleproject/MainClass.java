package org.Sampleproject;

import org.Sampleproject.POM.LoginPojo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MainClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\example.org\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/search?q=google&oq=google&aqs=chrome..69i57j69i60l2j69i65l2.3875j0j7&sourceid=chrome&ie=UTF-8");
		driver.manage().window().maximize();
		LoginPojo l=new LoginPojo();
		
		
	}

}
