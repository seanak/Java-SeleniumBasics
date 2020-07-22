package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/chromeDriver/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //1. open browser
		
		driver.get("https://www.google.com"); //2.enter url
		
		String title = driver.getTitle(); // get the page title 
		System.out.println("page title is - " +title);
		
		// validation point
		
		if(title.equals("Google")){   // verification of title 
			System.out.println("correct title");
		}else {
			System.out.println("in-correct title");
		}
		
		System.out.println("current url = "+driver.getCurrentUrl());
		
		//close the browser 
		
		driver.quit(); //session id is null
		//driver.close(); // session id is there but invalid 
		
	}

}
