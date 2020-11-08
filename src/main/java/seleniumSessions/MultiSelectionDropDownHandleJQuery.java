package seleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectionDropDownHandleJQuery {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.findElement(By.id("justAnInputBox")).click();
		
		SelectMultiChoiceValue(driver, "choice 2" ,"choice 2 2" ,"choice 6 2 3");
	
		driver.quit();
	}
	
	
	public static void SelectMultiChoiceValue(WebDriver driver, String... value ){
		List<WebElement> multiList = driver.findElements(
				By.xpath("//div[@class='comboTreeDropDownContainer']//ul//li/span[@class='comboTreeItemTitle']"));
		
		for(int i=0;i<multiList.size();i++){
			String multiText = multiList.get(i).getText();
			System.out.println(multiText);
			for(int k=0;k<value.length;k++){
				if(multiText.equals(value[k])){
				multiList.get(i).click();
				break;
				}
			}
			
		}
	}
	
	

	
}