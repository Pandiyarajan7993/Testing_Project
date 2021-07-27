package seniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectModel {

	public static WebElement emailId(WebDriver driver)
	{
		return driver.findElement(By.xpath("//input[@id=\"email\"]"));
		
	}

	public static WebElement keyboard_tab(WebDriver driver)
	{
		return driver.findElement(By.xpath("//input[@value=\"Append \"]"));
		
	}

	public static WebElement default_text(WebDriver driver)
	{
		return driver.findElement(By.xpath("//input[@value=\"TestLeaf\"]"));
		
	}

}
