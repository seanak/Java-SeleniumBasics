package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lb_RightClickConceptActionsClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		System.out.println(driver.getTitle());
		
		Actions action = new  Actions(driver);
		WebElement  rightClickElement = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		WebElement  copyElement = driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']/span"));
		
		action.contextClick(rightClickElement).build().perform();
		
		copyElement.click();
		driver.switchTo().alert().accept();
		
		driver.quit();
		
		
		
		
		

	}

}
