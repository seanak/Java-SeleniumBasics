package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_WebDriverBasics {
	/*
	 * @author seanak
	 * In comments you can see Manual testing Points but after authentication manual testing convert in to Automation Testing 
	 * Goal of Automation tester is to provide validation points to normal manual testing and catch errors 
	 */

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/chromeDriver/chromedriver_win32/chromedriver.exe");
		
		//1. open browser
		WebDriver driver = new ChromeDriver(); 
		
		//2.enter url
		driver.get("https://www.google.com"); 
		
		// get the page title 
		String title = driver.getTitle(); 
		System.out.println("page title is - " +title);
		
		// validation of title 
		if(title.equals("Google")){   // verification of title 
			System.out.println("correct title");
		}else {
			System.out.println("in-correct title");
		}
		
		//get current url
		String currentUrl = driver.getCurrentUrl(); 
		
		System.out.println("current url = "+ currentUrl);
		
		//verify current url
		if (currentUrl.equals("https://www.google.com/")){
			System.out.println("current url is correct");
		}else {
			System.out.println("current url is in-correct");
		}
		
		//close the browser 
		driver.quit(); //session id is null
		//driver.close(); // session id is there but invalid 
		
	}

}
