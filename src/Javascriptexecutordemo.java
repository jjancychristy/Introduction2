import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutordemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		List<WebElement> values = driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
		int sum=0;
		for(int i=0;i<values.size();i++)
			{
			
		 String textvalue = values.get(i).getText();
		 int eachamount =Integer.parseInt(textvalue);
		 sum=sum+eachamount;
			}
		 System.out.println(sum);
		String displayText = driver.findElement(By.xpath("//div[@class='totalAmount']")).getText();
		String[] splittedText=displayText.split(":");
		String neededNum=splittedText[1].trim();
		int numNum=Integer.parseInt(neededNum);
		if(numNum==sum)
		{
			System.out.println("total is correct");
	}
	}
}