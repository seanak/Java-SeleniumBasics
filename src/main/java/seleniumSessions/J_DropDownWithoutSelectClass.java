package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class J_DropDownWithoutSelectClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		
		System.out.println(driver.getTitle());
		String daySelXpath = "//select[@id='day']";
		String monthSelXpath = "//select[@id='month']";
		String yearSelXpath = "//select[@id='year']";
		
		String option = "/option";
		
		slectDropDownValueWithoutSelect(driver, "3", daySelXpath,option);
		slectDropDownValueWithoutSelect(driver, "Sep",monthSelXpath,option);
		slectDropDownValueWithoutSelect(driver, "1992", yearSelXpath,option);
		
		getOptionsWithoutSelect(daySelXpath, driver);
		getOptionsWithoutSelect(monthSelXpath,driver);
		getOptionsWithoutSelect(yearSelXpath,driver);
		
		
		driver.quit();
		 
	}
	
	/**
	 * This method is Selecting drop down value on web page  without Select class
	 * @param driver
	 * @param value
	 * @param xpath
	 * @param option
	 */
	
	public static void slectDropDownValueWithoutSelect(WebDriver driver, String value,String xpath,String option){
		List<WebElement> dropList = driver.findElements(By.xpath(xpath+option));
		int listSize = dropList.size();
		System.out.println("total option size is "+listSize);
		
		for(int i=0;i<listSize;i++){
			String text = dropList.get(i).getText();
			//System.out.println(text);
				if(text.equals(value)){
					dropList.get(i).click();
						break;
						
			}
				System.out.println(text);
	
		}
		System.out.println("============");
	}
	
	
	/**
	 * This method is use for getting all value from drop down option without select class
	 * @param listWE
	 */
	
	public static void getOptionsWithoutSelect(String xpath, WebDriver driver){
		List<WebElement> listOptions = driver.findElements(By.xpath(xpath));
		int listSize = listOptions.size();
		
		for(int i=0;i<listSize;i++){
			String text = listOptions.get(i).getText();
			
			System.out.println(text);
			System.out.println("======================");
		}
		
	}
	
}


