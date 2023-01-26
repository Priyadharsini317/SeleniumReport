package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling2 {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String>windowHandles = driver.getWindowHandles();
		List<String>lstwin = new ArrayList<String>(windowHandles);
		driver.switchTo().window(lstwin.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(lstwin.get(0));
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		Set<String>windowHandles2 = driver.getWindowHandles();
		List<String>lstwin1 = new ArrayList<String>(windowHandles2);
		driver.switchTo().window(lstwin1.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(lstwin1.get(0));
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String>windowHandles3 = driver.getWindowHandles();
		List<String>lstwin2 = new ArrayList<String>(windowHandles3);
		driver.switchTo().window(lstwin2.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(lstwin2.get(0));
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		Set<String>windowHandles4 = driver.getWindowHandles();
		List<String>lstwin3 = new ArrayList<String>(windowHandles4);
		driver.switchTo().window(lstwin3.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(lstwin3.get(0));
		driver.close();
		
	}

}
