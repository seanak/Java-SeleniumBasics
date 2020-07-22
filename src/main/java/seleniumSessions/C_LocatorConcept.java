package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_LocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/chromeDriver/chromedriver_win32/chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		
		
		//1.ID	
		WebElement usernameId = driver.findElement(By.id("username"));
		usernameId.sendKeys("Test@gmail.com");
		System.out.println("sucess in By.id");
	
		
		//2.Name
		driver.navigate().to("https://classic.crmpro.com/");
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Test@gmail.com");
		System.out.println("sucess in By.name");
		
		
		//3.XPath
		driver.navigate().to("https://app.hubspot.com/login");
		Thread.sleep(5000);
		WebElement xpathUsername = driver.findElement(By.xpath("//*[@id='username']"));
		xpathUsername.sendKeys("Test@gmail.com");
		System.out.println("sucess in By.xpath");
		
		
		//4.CSS Selector
		WebElement selectorpwd = driver.findElement(By.cssSelector("#password"));
		selectorpwd.sendKeys("test123");
		System.out.println("sucess in By.cssSelector");
		
		
		//5.Class Name
		driver.navigate().to("https://app.hubspot.com/login");
		Thread.sleep(5000);
		//									1	|	   2			 |		3		|  4
		//for username class name = form-control private-form__control login-email
		//for password class name = form-control private-form__control login-password m-bottom-3
		//in above class name three classes are there and first two are same so we are gonna consider last one
		WebElement classUsername = driver.findElement(By.className("login-email"));
		classUsername.sendKeys("test123@gmail.com");
		WebElement classpwd = driver.findElement(By.className("login-password"));
		classpwd.sendKeys("test123");
		System.out.println("sucess in By.className");
		
		//6.Link Text
		WebElement linkText = driver.findElement(By.linkText("Sign up"));
		linkText.click();
		System.out.println("sucess in By.linkText");
		
		//7.Partial LinkText
		driver.navigate().to("https://classic.crmpro.com/");
		WebElement partiallinkText = driver.findElement(By.partialLinkText("Selenium"));
		partiallinkText.click();
		System.out.println("sucess in By.partialLinkText");
		
		//8.Tag Name
		
		System.out.println("By.tagName will come in next class.java ");
		
		driver.quit();
	}

}
