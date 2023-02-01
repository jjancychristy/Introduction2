import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignmentactions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver)", "C:\\chromedriver.exe");
      WebDriver driver =new ChromeDriver();
      driver.get("https://the-internet.herokuapp.com/");
      Thread.sleep(2000);
      WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/windows']")));
      driver.findElement(By.xpath("//a[@href='/windows']")).click();
      driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
      Set<String> window = driver.getWindowHandles();
     Iterator<String> it =window.iterator();
     String parentID=it.next();
     String childID=it.next();
     driver.switchTo().window(childID);
     System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
     driver.switchTo().window(parentID);
     System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());      
	}

}
