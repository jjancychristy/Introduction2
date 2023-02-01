import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Brokenlinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links = driver.findElements(By.xpath("//li[@class='gf-li']/a"));
		SoftAssert a=new SoftAssert();
		
		for(WebElement link:links)
		{
			String url=link.getAttribute("href");
		//String url=driver.findElement(By.xpath("//*[contains(@href,'soapui')]")).getAttribute("href");
		//String url=driver.findElement(By.xpath("//*[contains(@href,'brokenlink')]")).getAttribute("href");
		
		//System.out.println(url);
		HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int code=conn.getResponseCode();
		System.out.println(code);
		a.assertTrue(code<400, "link is broken" +link.getTagName()+"is broken ith code"+code);
		
		}
		a.assertAll();
		}}