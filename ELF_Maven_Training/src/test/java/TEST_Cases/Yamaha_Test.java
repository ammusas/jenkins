package TEST_Cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Yamaha_Test {	
		@Test
		public void yamaha() {
			
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.yamaha-motor-india.com/");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.close();
			
		}

	}





