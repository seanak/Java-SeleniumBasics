package seleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D_AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id("login1")).sendKeys("test123");
		Thread.sleep(5000);
		driver.findElement(By.className("signinbtn")).click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		
		String alertext = alert.getText();
		
		System.out.println(alertext);
		
		if (alertext.equals("Please enter your password")){
			System.out.println("correct error message");
			
		}else{
			System.out.println("in-correct error massage"); 
			
		}
		
		
		alert.accept();
		//alert.dismiss();
		
		driver.quit();

	}

}
