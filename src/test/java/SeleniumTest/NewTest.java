package SeleniumTest;

import org.openqa.selenium.*;		
import org.openqa.selenium.chrome.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NewTest 
{
	private WebDriver driver;
	
	@Before
	public void beforeTest() 
	{
		//System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "/Users/emanuelordonez/Downloads/chromedriver");
		driver = new ChromeDriver();
	}
	
	@Test
	public void test() throws InterruptedException
	{
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		String title = driver.getTitle();				 
		//Assert.assertTrue(title.contains("Google"));
		Assert.assertTrue(title.contains("GG"));
	}
	
	@After
	public void afterTest() 
	{
		driver.quit();
	}

}
