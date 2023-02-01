import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class locatorspractice2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		String name= "Rahul";
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);//ID
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");//Name
		driver.findElement(By.className("signInBtn")).click();//Classname
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		//System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
		//System.out.println("Hello "+name+",");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")),"Hello Rahul");
	}

}
