package seniumWebdriver;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OrderList {
	static WebDriver driver;
	@BeforeMethod
	public void setBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\sample\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		
	}
	@Test()
	public void orderList() throws IOException  {

		driver.get("http://demo.automationtesting.in/Selectable.html");
		//driver.manage().window().maximize();
		WebElement selected = driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]"));
		selected.click();
		
		List<WebElement> orderList = driver.findElements(By.xpath("//ul[@class='SerializeFunc']/li"));
	
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL)
		.click(orderList.get(0))
		.click(orderList.get(1))
		.click(orderList.get(2))
		.click(orderList.get(3))
		.click(orderList.get(4))
		.click(orderList.get(5)).build().perform();
			
			TakesScreenshot s1 = (TakesScreenshot) driver;
	        File sou = s1.getScreenshotAs(OutputType.FILE);
	        File destination = new File("C:\\Users\\Admin\\Desktop\\pandiya\\rajan.jpg");
	        FileHandler.copy(sou, destination);
	        
			
		driver.close();
		}
	
	@Test()
	public void unOrderList() throws InterruptedException, Throwable  {

		driver.get("http://demo.automationtesting.in/AutoComplete.html");
		driver.manage().window().maximize();
		WebElement autoSelect = driver.findElement(By.xpath("//input[@id='searchbox']"));
		autoSelect.sendKeys("A");
		Thread.sleep(5000);
		List<WebElement> Auto_Compleded = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		int size = driver.findElements(By.xpath("//li[@class='ui-menu-item']")).size();
		System.out.println(size);
		
		for (WebElement webElement : Auto_Compleded) {
			String text = webElement.getText();
			if (text.equals("Afghanistan")) {
				
				webElement.click();
			}
		}
			
		      
        Robot rob = new Robot();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rect = new Rectangle(dim);
        BufferedImage buffer = rob.createScreenCapture(rect);
        File destination = new File("C:\\Users\\Admin\\Desktop\\pandiya\\rajan1.jpg");
        ImageIO.write(buffer, "jpg", destination);
		driver.close();
		}

	}
