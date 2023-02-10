package calenderControls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriver driver=new ChromeDriver();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Maya");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Maya@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Maya4569");
		driver.findElement(By.xpath("//label[text()='Selenium -2']")).click();
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		Select sel=new Select(driver.findElement(By.xpath("//select[@name='state']")));
		sel.selectByValue("odisha");
		
	}

}
