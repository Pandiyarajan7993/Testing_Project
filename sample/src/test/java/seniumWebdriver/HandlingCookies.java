package seniumWebdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandlingCookies {
	static WebDriver driver;
	@BeforeMethod
	public void config() throws Throwable {
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\sample\\Driver\\chromedriver.exe");		
		Properties prop=new Properties();
		prop.load(file);
		String Browser_name = prop.getProperty("Browser");
		String browser_Path = prop.getProperty("Path");
		if (Browser_name.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", browser_Path);
			driver=new ChromeDriver();

		}

	}
	@Test
	public void addCookies() throws Throwable {

		try {
			driver.get("http://leafground.com/pages/tooltip.html");

			// Adds the cookie into current browser context
			driver.manage().addCookie(new Cookie("01", "pandiya"));
			driver.manage().addCookie(new Cookie("02", "rajan"));
			driver.manage().addCookie(new Cookie("03", "palani"));
			driver.manage().addCookie(new Cookie("04", "samy"));
		} 
		finally {
			for (Cookie ck : driver.manage().getCookies()) {
				String name = ck.getName();
				String value = ck.getValue();
				System.out.println("Name: "+name+" Value: "+value);


			}

			driver.quit();
		}
	}
	@Test
	public void getNamedCookies() throws Throwable {
		try {
			driver.get("http://leafground.com/pages/tooltip.html");
			driver.manage().addCookie(new Cookie("pandiya", "rajan"));

			// Get cookie details with named cookie 'pandiya'
			Cookie cookie1 = driver.manage().getCookieNamed("pandiya");
			System.out.println(cookie1);
		} finally {
			driver.quit();
		}

	}
	@Test
	public void getAllCookies() throws Throwable {
		try {
			driver.get("http://leafground.com/pages/tooltip.html");
			// Add few cookies
			driver.manage().addCookie(new Cookie("test1", "cookie1"));
			driver.manage().addCookie(new Cookie("test2", "cookie2"));

			// Get All available cookies
			Set<Cookie> cookies = driver.manage().getCookies();
			System.out.println(cookies);
		} finally {
			driver.quit();
		}

	}
	@Test
	public void deleteCookies() throws Throwable {
		try {
			driver.get("http://www.example.com");
			driver.manage().addCookie(new Cookie("test1", "cookie1"));
			Cookie cookie1 = new Cookie("test2", "cookie2");
			driver.manage().addCookie(cookie1);
			Set<Cookie> cookies = driver.manage().getCookies();
			System.out.println(cookies);

			// delete a cookie with name 'test1'
			driver.manage().deleteCookieNamed("test1");
			System.out.println("Delete Named Cookies");

			/*
         Selenium Java bindings also provides a way to delete
         cookie by passing cookie object of current browsing context
			 */
			driver.manage().deleteCookie(cookie1);
			System.out.println("Delete Cookies");
		} finally {
			driver.quit();
		}
	}
	@Test
	public void deleteAllCookies() throws Throwable {

		try {
			driver.get("http://www.example.com");
			driver.manage().addCookie(new Cookie("test1", "cookie1"));
			driver.manage().addCookie(new Cookie("test2", "cookie2"));

			// deletes all cookies
			driver.manage().deleteAllCookies();
		} finally {
			driver.quit();
		}
		}
}