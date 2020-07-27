package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class K_FrameHandle {
	
	public static void main(String[] args) {
		
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://classic.crmpro.com/");
	System.out.println(driver.getTitle());
	
	driver.findElement(By.name("username")).sendKeys("Apptrix");
    driver.findElement(By.name("password")).sendKeys("Test@123");
	
    WebElement login = driver.findElement(By.xpath("//*[@id='loginForm']/div/div/input"));
	JavascriptExecutor js = ( JavascriptExecutor)driver;
	js.executeScript("arguments [0].click();",login);
	
	WebElement frameMain = driver.findElement(By.xpath("//frame[@name='mainpanel']")); //xpath of <frame tag from HTML page
	
	driver.switchTo().frame(frameMain);
	
	String text = driver.findElement(By.xpath("/html/body/table[1]/tbody/tr[2]/td[1]/div/table/tbody/tr/td[1]")).getText();
	System.out.println(text);
	
	driver.switchTo().defaultContent(); // With this you can transfer control back to main page (if driver is lost use this)
	//if there is parent frame and under that child frame. So from child frame to come back to parent frame you can use bellow option
	//driver.switchTo().parentFrame(); 
	
	}
}
