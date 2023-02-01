import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assigment7mytry {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qaclickacademy.com/");
		Thread.sleep(9000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9000));
		driver.findElement(By.xpath("//button[text()='NO THANKS']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.rahulshettyacademy.com/AutomationPractice']")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");
		List<WebElement> Courses=driver.findElements(By.xpath("//table[@name='courses']/tbody/tr"));
		System.out.println("Total no rows" + Courses.size());
		List<WebElement> column =driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/th"));
		System.out.println("Total no column" + column.size());
		Courses.get(2).findElement(By.tagName("td"))
		System.out.println(driver.findElement(By.xpath("//table[@id='product']/tbody/tr[3]")).getText());
	}

}
