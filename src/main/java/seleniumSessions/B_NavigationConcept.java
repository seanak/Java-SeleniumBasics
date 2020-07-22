package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_NavigationConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/chromeDriver/chromedriver_win32/chromedriver.exe");
		
		//1.open a browser
		WebDriver driver = new ChromeDriver();
		
		//2.enter url using get
		driver.get("https://google.com"); //waiting to react until page is fully loaded 
		
		//3.enter url using navigation concept
		driver.navigate().to("https://amazon.de"); // without waiting to full page load given actions are performed
		
		//go back to google
		driver.navigate().back();
		String title = driver.getTitle(); 
		System.out.println("page title is - " +title);
		
		// validation of google title 
				if(title.equals("Google")){   // verification of title 
					System.out.println("correct title");
				}else {
						System.out.println("in-correct title");
		}
		
		//go forward to amazon 
		driver.navigate().forward();
		String title1 = driver.getTitle(); 
		System.out.println("page title is - " +title1);
		
		// validation of Amazon title 
				if(title1.equals("Amazon.de: Günstige Preise für Elektronik & Foto, Filme, Musik, Bücher, Games, Spielzeug & mehr")){   // verification of title 
				System.out.println("correct title");
				}else {
					System.out.println("in-correct title");
				}		
		
		//go back to google
		driver.navigate().back();
		String title2 = driver.getTitle(); 
		System.out.println("page title is - " +title2);
		
		// validation of google title 
		if(title2.equals("Google")){   // verification of title 
			System.out.println("correct title");
		}else {
				System.out.println("in-correct title");
}
		
		//close the browser
		driver.quit();
		
		
	}

}
