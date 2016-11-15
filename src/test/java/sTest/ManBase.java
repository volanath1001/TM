package sTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ManBase {
WebDriver driver = null;
	
	@Test
	public void t() throws InterruptedException{
		driver = new FirefoxDriver();
		
		
		driver.get("http://www.nbc.com");
		Thread.sleep(5000);
		driver.quit();
	}

}
