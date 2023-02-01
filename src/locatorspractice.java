import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorspractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");//ID
		driver.findElement(By.name("inputPassword")).sendKeys("xxx");//Name
		driver.findElement(By.className("signInBtn")).click();//Classname
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());//CSS
		driver.findElement(By.linkText("Forgot your password?")).click();//Link Text
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("jancy");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("jj@gmail.com");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).clear();
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("jj@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("000005545");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());

		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("label[for='chkboxOne']")).click();
		driver.findElement(By.cssSelector("label[for='chkboxTwo']")).click();
		driver.findElement(By.cssSelector("button[class='submit signInBtn']")).click();
		
		
	}

}
//program having ID,Name,Classname,CSS