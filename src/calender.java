import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion");
		driver.manage().window().maximize();
		//Mar23
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(9000));
		//wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//input[@name='form_fields[travel_comp_date]']"))));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='form_fields[travel_comp_date]']")));
		//Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
		Thread.sleep(2000);
		String month=driver.findElement(By.xpath("//div[@class='flatpickr-current-month']")).getText();
		while(!month.contains("April"))
		{
			driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();
		}
		List<WebElement> dates = driver.findElements(By.xpath("//span[@class='flatpickr-day ']"));
		for(int i=0;i<dates.size();i++)
		{
			String datename=driver.findElements(By.xpath("//span[@class='flatpickr-day ']")).get(i).getText();
			
			if(datename.equalsIgnoreCase("23"))
			{
				driver.findElements(By.xpath("//span[@class='flatpickr-day ']")).get(i).click();
				break;
			}
			
		}
		}

}
