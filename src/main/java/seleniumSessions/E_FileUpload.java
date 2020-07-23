 package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E_FileUpload {
	// To upload file <input type = "File"  this tag is obligatory.
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		driver.findElement(By.name("upfile")).sendKeys("C:/Users/hp-pc/Downloads/uploadSP.jpg");
		
		//driver.findElement(By.xpath("//input[@type='submit']"));
		
		driver.quit();
		

	}

}
