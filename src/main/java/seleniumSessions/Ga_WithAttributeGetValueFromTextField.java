package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ga_WithAttributeGetValueFromTextField {
	//<input type= "text" this tag is obligatory to get value from text field

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://register.rediff.com/register/register.php");
		
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("text123@rediffmail.com");
	
		String value = driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).getAttribute("value");
		
		System.out.println(value);
		
		driver.quit();
	}

}
