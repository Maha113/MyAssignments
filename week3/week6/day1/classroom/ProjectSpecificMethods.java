package week6.day1.classroom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethods {
	public ChromeDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		//WebDriverManager.chromedriver().setup();
		System.out.println("@Before Method");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
     @AfterMethod
  	 public void closeBrowser()
  	 {
    	 System.out.println("@After Method");
    	 driver.close();
	 }
}
