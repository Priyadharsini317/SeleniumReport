package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://html.com/tags/table/");
		List<WebElement> library = driver.findElements(By.xpath("//div[@class='render']//tr//td[1]"));
		for (int i = 0; i < library.size(); i++) {
			String name = library.get(i).getText();
			System.out.println(name);
		}
		List<WebElement> marketplace = driver.findElements(By.xpath("//div[@class='render']//tr[1]//td"));
		for (int i = 0; i < marketplace.size(); i++) {
			String market = marketplace.get(i).getText();
			System.out.println(market);
		}
		
		List<WebElement> absoluteusage = driver.findElements(By.xpath("//div[@class='render']//tr[2]//td"));
		for (int i = 0; i < absoluteusage.size(); i++) {
			String absolute = absoluteusage.get(i).getText();
			System.out.println(absolute);
		}
		
	}

}
