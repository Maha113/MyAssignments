package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//i[contains(@class,'pi pi-globe layout-menuitem-icon')]")).click();
		driver.findElement(By.xpath("//span[text()='Window']")).click();
        String  first = driver.getWindowHandle();
        System.out.println(first);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> windowHandleSet = driver.getWindowHandles();
		System.out.println(windowHandleSet);
		List<String> windowlist = new ArrayList<String>();
		windowlist.addAll(windowHandleSet);
		System.out.println(windowHandleSet);
		String second =  windowlist.get(1);
	    driver.switchTo().window(second);
	    System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(first);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	}

}
