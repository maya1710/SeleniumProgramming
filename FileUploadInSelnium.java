package calenderControls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadInSelnium {

	public static void main(String[] args) {
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("http://the-internet.herokuapp.com/upload");
		 
		 driver.findElement(By.id("file-upload")).sendKeys("/Users/ÄGARE/Desktop/Seleniummavenproject");

	}

}
