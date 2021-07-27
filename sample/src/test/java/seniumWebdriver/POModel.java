package seniumWebdriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POModel {
	@FindBy(xpath="//input[@id='email']")
	public static WebElement emailId;
	@FindBy(xpath="//input[@value='Append ']")
	public static WebElement keyboard_tab;
	@FindBy(xpath="//input[@value='TestLeaf']")
	public static WebElement default_text;




}
