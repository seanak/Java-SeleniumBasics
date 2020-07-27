package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class I_DropDownHandleWithSelectClassNGetOptionsWithArrzyList {
	
	/**
	 * @author seanaK
	 * This Select class option available if drop down HTML has <select tag 
	 * If you don't want to use select class then create Xpath of select class 
	 * 
	 */

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		
		System.out.println(driver.getTitle());
		
		
		
		WebElement month =driver.findElement(By.xpath("//select[@id='month']"));
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		WebElement year =driver.findElement(By.xpath("//select[@id='year']"));
		
		selectValueFromDropDown(month,"Sep");
		selectValueFromDropDown(day,"6");
		selectValueFromDropDown(year,"1998");
		
		getDropDownValue(month);
		getDropDownValue(day);
		getDropDownValue(year);
		
		
		System.out.println("array list as follows");
		ArrayList<String> dayList = getDropDownValueWithArrayList(day);
		System.out.println(dayList);
		ArrayList<String> monthList = getDropDownValueWithArrayList(month);
		System.out.println(monthList);
		ArrayList<String> yearList = getDropDownValueWithArrayList(year);
		System.out.println(yearList);
		driver.quit();
	}
	
	/**
	 * This method is used to select value from DropDown on the basis of giving text
	 * @param element
	 * @param value
	 */
	public static void selectValueFromDropDown(WebElement element,String value){
		Select select = new Select(element);
		select.selectByVisibleText(value);
		
	}
	
	/**
	 * This method is used to get all the values from drop down.
	 * @param element
	 */
	public static void getDropDownValue(WebElement element){
		System.out.println("========================================");
		
		Select select = new Select(element);
		List<WebElement> dropList = select.getOptions();
		int listSize = dropList.size();
		System.out.println("Total size is :- " +listSize);
		
		for (int i=0; i<listSize;i++){
			String text = dropList.get(i).getText();
			System.out.println(text);
		}
		
	}
		
		/**
		 * This method is returning Array list of String for listOptions.
		 * @param element
		 * @return 
		 */
		
		public static ArrayList<String> getDropDownValueWithArrayList(WebElement element){
			System.out.println("========================================");
			
			Select select = new Select(element);
			List<WebElement> dropList = select.getOptions();
			int listSize = dropList.size();
			System.out.println("Total size is :- " +listSize);
			ArrayList<String> ar = new ArrayList<String>();
			
			for (int i=0; i<listSize;i++){
				String text = dropList.get(i).getText();
				//System.out.println(text);
				ar.add(text);
				
			}
			return ar;
			
	}
	
	

}
