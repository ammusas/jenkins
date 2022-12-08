package TEST_Cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Royal_Enfield_Test {
		
		@Test
		public void re(){
			
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.royalenfield.com/");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.close();
			
		}

}
	



