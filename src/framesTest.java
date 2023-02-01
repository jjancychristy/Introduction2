import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class framesTest {
	public static void main(String[] args) {
		
	System.setProperty("webDriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	//System.out.println(driver.findElement(By.tagName("iframe")).getSize());
	WebElement w=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	//find by index not encouaged
	driver.switchTo().frame(0);
	//find my element
	//driver.switchTo().frame(w);
	driver.findElement(By.xpath("//div[@id='draggable']")).click();
	Actions a=new Actions(driver);
	WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
	a.dragAndDrop(source, target).build().perform();
	//to comeout off the frame
	driver.switchTo().defaultContent();
	}
}
