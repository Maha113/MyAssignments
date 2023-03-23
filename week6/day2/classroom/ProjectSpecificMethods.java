package week6.day2.classroom;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethods {
	public RemoteWebDriver driver;
	public String excelfilename;
	
	@Parameters({"url", "browser"})
	
	@BeforeMethod
	public void openBrowser(String url,String browser) {
		switch(browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
			default:
				break;
		}
		//WebDriverManager.chromedriver().setup();
		//System.out.println("@Before Method");
		//driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
     @AfterMethod
  	 public void closeBrowser()
  	 {
    	 System.out.println("@After Method");
    	 driver.close();
	 }
     
     @DataProvider
     public String[][] sendData() throws IOException{
    	 String[][] data = ReadDataFromExcel.getData(excelfilename);
    	 return data;
     }
}
