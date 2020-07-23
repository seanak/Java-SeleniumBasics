package seleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class F_WindowPopUpHandles {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #1")).click();
		
		Set<String> Handles =driver.getWindowHandles(); 
		//set is not order based not store value on indexing so you have to iterator and guide it to whatever order you want.
		
		Iterator<String> it = Handles.iterator();
		
		String parentWindID = it.next();
		
		System.out.println("parent window id is "+ parentWindID);
		
		String childwindId = it.next();
		
		System.out.println("child window id is:  "+childwindId);
		
		driver.switchTo().window(childwindId);
		
		String cw1Title = driver.getTitle();
		
		System.out.println("child window title is : "+cw1Title);
		
		driver.close();
		
		driver.switchTo().window(parentWindID);
		
		String pwTitle = driver.getTitle();
		
		System.out.println("parent window title is : "+pwTitle);
		
		driver.quit();

	}

}
