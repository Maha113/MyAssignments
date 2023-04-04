package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import utils.ReadExcel;



public class ProjectSpecificMethods {
	
	public  ChromeDriver driver;
	public static Properties prop;
	public String excelfilename;
	
	public static ExtentReports extent;
	public static ExtentTest test;
	public String testName, testDescription, testCategory, testAuthor;
	
	@BeforeSuite
	public void startReport()
	{
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
		reporter.setAppendExisting(true);
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}
	
	@BeforeClass	
	public void testdetails() {
		// TODO Auto-generated method stub
		test = extent.createTest(testName,testDescription);
		test.assignCategory(testCategory);
		test.assignAuthor(testAuthor);		
		

	}
	
	public int takeSnap() throws IOException {
		int ranNum = (int) (Math.random()*9999999+1000000);
		File source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./snaps/img"+ranNum+".png");
		FileUtils.copyFile(source,target);
		return ranNum;
				
	}
	
	public void reportStep(String msg, String status) throws IOException {
		
		int ranNum = takeSnap();
		
		if(status.equalsIgnoreCase("pass")) {
			test.pass(msg,MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+ranNum+".png").build());
		}else if(status.equalsIgnoreCase("fail")) {
			test.fail(msg,MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+ranNum+".png").build());
			throw new RuntimeException("Refer ExtentReport for more details");
		}

	}
	
	@AfterSuite
	public void stopReport() {
		extent.flush();
	}
	

	
	
	 @DataProvider(indices = {0,1})   //run for first set of data
	 public String[][] sendData() throws IOException{
	 String[][] data = ReadExcel.getData(excelfilename);
	 return data;
	 }
	
	@BeforeMethod
	public void preCondition() throws IOException {
		
		//code to load the properties
		FileInputStream fis = new FileInputStream("./src/main/resources/configuration_english.properties");
				
		//Create object for properties class
		prop = new Properties();
				
		//load the properties file using prop object
		prop.load(fis);
					
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        System.out.println(driver);
        driver.get("http://leaftaps.com/opentaps/control/login");
        driver.manage().window().maximize();	
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	

}
