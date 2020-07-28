package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class La_DragAndDropConceptActionsClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.getTitle());
		WebElement demoFrame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(demoFrame);
		
		Actions action = new Actions (driver);
		
		WebElement sourceElement = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement targetElement = driver.findElement(By.xpath("//*[@id='droppable']"));
		
		//action.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
		
		action.dragAndDrop(sourceElement, targetElement).build().perform();
		
		driver.quit();

	}

}
