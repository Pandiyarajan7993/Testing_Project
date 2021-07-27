package seniumWebdriver;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class CheckBox {
	static WebDriver driver;
	@Test
	public void checkBoxModule() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\sample\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		
		//Click Check Box Module
		driver.findElement(By.linkText("Checkbox")).click();
		
		//Select By Index
		driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
		
		//Conform if Check Box Checked or Not
		WebElement conformChek = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[6]"));
		boolean selected = conformChek.isSelected();
		System.out.println("Conform if Check Box Checked or Not:");
		System.out.println(selected);
		
		//Deselect particular select check box
		WebElement deselect = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[8]"));
		deselect.click();
		
		//Select All Option
		driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[9]")).click();
		driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[10]")).click();
		driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[11]")).click();
		driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[12]")).click();
		driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[13]")).click();
		driver.close();
		
	}

}
