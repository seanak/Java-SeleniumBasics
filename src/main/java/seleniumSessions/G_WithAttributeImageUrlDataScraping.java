package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class G_WithAttributeImageUrlDataScraping {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("http://amazon.de");
	
		List<WebElement> img = driver.findElements(By.tagName("img"));
	
		int totalimgs = img.size();
		
		System.out.println("total images on the page "+ totalimgs);
	
		for(int i=0; i<totalimgs; i++){
			String imageUrl = img.get(i).getAttribute("src");
			System.out.println(imageUrl);
		}
		
		driver.quit();
		

	}

}
	
