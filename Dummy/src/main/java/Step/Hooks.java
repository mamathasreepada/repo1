package Step;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
		public static WebDriver driver;
		@Before
		public void BrowserStart() 
		{	
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\pavan\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("https://demoqa.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		@After
		public void BrowserClose()
		{
		 driver.quit();	
		}
	}


