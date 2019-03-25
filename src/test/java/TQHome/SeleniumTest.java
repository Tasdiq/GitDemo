package TQHome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
	
	@Test
	public void BrowserAutomation() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TQ\\Documents\\Workspace\\Drivers\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
	}
	
	@Test
	public void elementsUI() {
		System.out.println("ui elements");
	}
	
	
}
