import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links = driver.findElements(By.tagName("a"));//1.find all the links
		System.out.println(links.size());
		//List<WebElement> links2 = driver.findElements(By.cssSelector("div[id='gf-BIG'] a"));
		//System.out.println(links2.size());
		//List<WebElement> links3=driver.findElements(By.xpath("//div/table/tbody/tr/td[1]/ul/li"));
		//System.out.println(links3.size());
        WebElement footerdriver=driver.findElement(By.id("gf-BIG"));//2. Limiting webdriver scope to the last 
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//3-finding the column links
		WebElement coloumndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());
		//4.clicking n each link to see if its opening
		for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
		{

			String clickonLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonLinkTab);
			Thread.sleep(5000L);
		}
		//5.iterating the tabs and getting the title names
	        Set<String> windows = driver.getWindowHandles();
			Iterator<String> it = windows.iterator();
			
			while(it.hasNext())
			{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		
		}
	}}


