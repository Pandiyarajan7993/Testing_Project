package seniumWebdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {
	static WebDriver driver;
	@Test
	public void droupDown() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\sample\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Drop down")).click();
		
		//select by index
		WebElement selectByIntex = driver.findElement(By.id("dropdown1"));
		Select select=new Select(selectByIntex);
		select.selectByIndex(2);
		//Select By Text
		WebElement selectBytext = driver.findElement(By.name("dropdown2"));
		Select selectText=new Select(selectBytext);
		selectText.selectByVisibleText("Loadrunner");
		
		//Select By Value
		WebElement selectByvalue = driver.findElement(By.id("dropdown3"));
		Select selectvalue=new Select(selectByvalue);
		selectvalue.selectByValue("3");
		
		//Get All Selected Option
		WebElement getAllSelected = driver.findElement(By.className("dropdown"));
		Select getAll=new Select(getAllSelected);
		List<WebElement> allSelectedOptions = getAll.getOptions();
		for (WebElement allElement : allSelectedOptions) {
			String text = allElement.getText();
			System.out.println(text);
			}
		
		//Select By using SendKeys
		WebElement sendText = driver.findElement(By.xpath("(//option[@value=\"1\"]//parent::select)[5]"));	
			sendText.sendKeys("Appium");
		
			//selectALL
			WebElement selectAllCheckbox = driver.findElement(By.xpath("(//option[@value=\"1\"]//parent::select)[6]"));
			Select selectAll=new Select(selectAllCheckbox);
			List<WebElement> options = selectAll.getOptions();
			for (WebElement allSelect : options) {
				String text = allSelect.getText();
				
				if (text.equals("Selenium")||text.equals("Appium")) {
					selectAll.selectByVisibleText(text);	
					System.out.println(text);
				
				}
				
			}
			
				
			boolean multiple = selectAll.isMultiple();
			System.out.println(multiple);
	}
		
		
		
		
		
		
}


