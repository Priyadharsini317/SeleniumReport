package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//code for drag and drop		
		driver.get("https://www.leafground.com/drag.xhtml");
		WebElement source = driver.findElement(By.xpath("//div[@id='form:drop']"));
		WebElement target = driver.findElement(By.xpath("//p[text()='Drag to target']"));
		Actions builder=new Actions(driver);
		builder.dragAndDrop(target, source).perform();
		
		/*code for draggable
		driver.get("https://www.leafground.com/drag.xhtml");
		WebElement drag = driver.findElement(By.xpath("//span[text()='Drag and Drop']"));
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(drag, 400, 0).perform();*/
		
		/*code for sortable
		driver.get("https://www.leafground.com/drag.xhtml");
		WebElement source = driver.findElement(By.xpath("(//table[@role='grid'])[1]//th[1]"));
		WebElement target = driver.findElement(By.xpath("(//table[@role='grid'])[1]//th[3]"));
		Actions builder=new Actions(driver);
		builder.dragAndDrop(source, target).perform();*/
		
		/*code for slider
		driver.get("https://www.leafground.com/drag.xhtml");
		WebElement slider = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(slider, 100, 0).perform();*/
		
		/*code for scroll down
		driver.get("https://www.amazon.com/");
		WebElement scroll = driver.findElement(By.xpath("//a[text()='Your Ads Privacy Choices'"));
		Actions builder=new Actions(driver);
		builder.scrollToElement(scroll).perform();*/
		
	}

}
