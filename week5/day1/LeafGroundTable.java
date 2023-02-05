package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundTable {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/table.xhtml");
		List<WebElement> row = driver.findElements(By.xpath("(//table[@role='grid'])[2]//tr"));
		for (int i = 0; i < row.size(); i++) {
			String text = driver.findElement(By.xpath("(//table[@role='grid'])[2]//tr["+i+"]//td[1]")).getText();
			System.out.println(text);
		}
	}

}
