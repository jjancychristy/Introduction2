import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class windowshandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		Thread.sleep(5000);
		Set<String> window=driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parentID = it.next();
		String childID=it.next();
		driver.switchTo().window(childID);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String mailID=driver.findElement(By.cssSelector(".im-para.red")).getText().split("@")[1].split(" ")[0];
		System.out.println(mailID);
		driver.switchTo().window(parentID);
		driver.findElement(By.cssSelector("#username")).sendKeys(mailID);
		
	//	String[] text1=text.split("@");
		//System.out.println(text1[1]);
		//String[] text2=text1[1].split(" ");
		//System.out.println(text2[0]);
		
		
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(null));
	}

}
