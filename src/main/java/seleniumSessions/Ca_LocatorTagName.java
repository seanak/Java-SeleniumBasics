package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ca_LocatorTagName {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.get("http://amazon.de");
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		int totalLinks = linkList.size();
		System.out.println("total links on the page "+ totalLinks);
	
		for(int i=0; i<totalLinks; i++){
			String linkText = linkList.get(i).getText();
			
			if(! linkText.isEmpty()){//to ignore blank text 
				System.out.print(i+"--->"+linkText + " --->");
				System.out.println(linkList.get(i).getAttribute("href"));//attribute to get href links
				}
			}
		
		//List<WebElement> linkList = driver.findElements(By.tagName("a"));
		driver.quit();
	
		}
}
