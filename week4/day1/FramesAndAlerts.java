package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAndAlerts {

		public static void main(String[] args) {
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt1");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			//To handle Cookies window
			String cookies = driver.getWindowHandle();
			System.out.println(cookies);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
		    driver.findElement(By.xpath("//div[contains(text(),'Accept all & visit the site')]")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.switchTo().frame("iframeResult");
			driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
			Alert alert = driver.switchTo().alert();
			alert.sendKeys("Thums up");
			alert.accept();
			WebElement findElement2 = driver.findElement(By.xpath("//p[@id=\"demo\"]"));
			String text1 = findElement2.getText();
			System.out.println("Text    : " + text1);
		}
		
}
