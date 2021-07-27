package seniumWebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditModule {
	static WebDriver driver;
	@Test
	public void editModule() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\sample\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@class=\"wp-categories-link maxheight\"])[1]")).click();
		driver.findElement(By.id("email")).sendKeys("pandiyarajbscct@gmail.com");
		driver.findElement(By.cssSelector("input[value='Append ']")).clear();
		driver.findElement(By.cssSelector("input[value='Append ']")).sendKeys("Pandiyaraj");
		driver.findElement(By.xpath("(//input[@name=\"username\"])[1]")).clear();
		driver.findElement(By.xpath("(//input[@name=\"username\"])[1]")).sendKeys("palanisamy");
		driver.findElement(By.xpath("(//input[@name=\"username\"])[2]")).clear();
		driver.findElement(By.xpath("(//input[@name=\"username\"])[2]")).sendKeys("New Text");
		boolean Enabled = driver.findElement(By.xpath("//input[@disabled=\"true\"]")).isEnabled();
		System.out.println("EDIT MODULE AUTOMATED DONE");
		System.out.println("MY FAINAL TEXT BOX WILL DISABLED:"+Enabled);
		driver.close();
			}

}
