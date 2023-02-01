import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qaclickacademy.com/");
		Thread.sleep(9000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9000));
		driver.findElement(By.xpath("//button[text()='NO THANKS']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.rahulshettyacademy.com/AutomationPractice']")).click();
		driver.findElement(By.cssSelector("#autocomplete")).sendKeys("Ind");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.cssSelector("#autocomplete")).sendKeys(Keys.DOWN);
		//driver.findElement(By.cssSelector("#autocomplete")).sendKeys(Keys.DOWN);
		
		System.out.println(driver.findElement(By.cssSelector("#autocomplete")).getAttribute("value"));
		//System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
	}

}
