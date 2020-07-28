package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L_MoveToElementAndActionsSendKeysConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/");
		System.out.println("Title of the login page is:- " +driver.getTitle());
		
		WebElement id = driver.findElement(By.name("username"));
		//id.sendKeys("Apptrix");
		WebElement pwd = driver.findElement(By.name("password"));
		//pwd.sendKeys("Test@123");
		 WebElement login = driver.findElement(By.xpath("//*[@id='loginForm']/div/div/input"));
		   /*	JavascriptExecutor js = ( JavascriptExecutor)driver;
		   	js.executeScript("arguments [0].click();",login);*/
		 
		Actions action = new Actions(driver);
		action.sendKeys(id, "Apptrix").build().perform();
		action.sendKeys(pwd,"Test@123").build().perform();
	   	action.click(login).build().perform();
	 
	   	WebElement frameMain = driver.findElement(By.xpath("//frame[@name='mainpanel']"));
		driver.switchTo().frame(frameMain);
		
		
		WebElement parentCon = driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[4]/a"));
		action.moveToElement(parentCon).build().perform();
		driver.findElement(By.xpath("//li/a[@title='New Contact']")).click();
		
		driver.quit();
		

	}

}
