package week5.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Myntra {
	
	public static void main(String[] args) throws IOException {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--diable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.myntra.com/");
		WebElement men = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(men).perform();
		
		driver.findElement(By.xpath("(//a[text()='Jackets'])[1]")).click();
		
		String items = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
		System.out.println("Total count: "+items);
		String text = driver.findElement(By.xpath("(//span[@class='categories-num'])[1]")).getText();
		String text1 = driver.findElement(By.xpath("(//span[@class='categories-num'])[2]")).getText();
		
		if((text+text1)==items) {
			System.out.println("counts matched");
		}
		else {
			System.out.println("counts mismatched");
		}
		driver.findElement(By.xpath("//div[@class='brand-more']")).click();
		
		driver.findElement(By.className("FilterDirectory-searchInput")).sendKeys("Duke");
		driver.findElement(By.xpath("//label[@class='common-customCheckbox']")).click();
		driver.findElement(By.xpath("(//span[contains(@class,'myntraweb-sprite'])[6]")).click();
		List<String>lst=new ArrayList<String>();
		List<WebElement> brand = driver.findElements(By.xpath("//h3[text()='Duke']"));
		for (int i = 0; i < brand.size(); i++) {
			String text3 = brand.get(i).getText();
			lst.add(text3);
			
		}
		if(lst.contains("Duke")) {
			System.out.println("All the Coats are of brand Duke");
		}
		String firstprice = driver.findElement(By.xpath("(//span[@class='product-discountedPrice'])[1]")).getText();
		System.out.println("Price :"+firstprice);
		driver.findElement(By.xpath("(//img[@draggable='false'])[4]")).click();
		
		Set<String> windowhandle = driver.getWindowHandles();
		List<String> lst1 = new ArrayList<String>(windowhandle);
		driver.switchTo().window(lst1.get(1));
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snap/myntra.png");
		FileUtils.copyFile(source, dest);
		
		driver.findElement(By.xpath("//span[text()='WISHLIST']")).click();
		driver.quit();

	}

}
