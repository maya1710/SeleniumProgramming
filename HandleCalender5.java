package calenderControls;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleCalender5 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		//if you find unable to locate use the below line
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		driver.findElement(By.id("datepicker")).sendKeys("01/04/2023");
		 
		driver.findElement(By.id("")).click();
		
		Select sel=new Select(driver.findElement(By.xpath("")));
		
		sel.selectByIndex(0);
		
		//create instance of javascript executor
		JavascriptExecutor je=(JavascriptExecutor) driver;
		
		//Indentify the WebElement which will appear after scrolling down
		
		WebElement element= driver.findElement(By.xpath(""));
		
		//now execute query which actually will scroll until that element is not appeared on page
		
		je.executeScript("arguments[0].scrollIntoView(true);", element);
		
		
		

	}

}
