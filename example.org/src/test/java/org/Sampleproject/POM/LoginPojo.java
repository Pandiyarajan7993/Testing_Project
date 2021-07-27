package org.Sampleproject.POM;

import org.Sampleproject.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	WebDriver driver;
	public LoginPojo() {
		PageFactory.initElements(driver,this);
	}
@FindBy(className="gb_D")
private WebElement allApp;
public WebDriver getDriver() {
	return driver;
}
public WebElement getAllApp() {
	return allApp;
}
}
