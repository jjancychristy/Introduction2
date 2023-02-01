import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class asgnlogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
//		driver.manage().window().maximize();
	String[] userPhoneName= {"iphone","Samsung","Nokia","Blackberry"};
		System.out.println(userPhoneName[0]);
//		int j=0;
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(7));
//        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rahulshettyacademy");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("learning");
//		driver.findElement(By.xpath("//input[@value='user']")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='okayBtn']")));
//		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='form-control']")));
//		WebElement dropdown=driver.findElement(By.xpath("//select[@class='form-control']"));
//		Select s=new Select(dropdown); 
//		s.selectByIndex(2);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='form-control']")));
//		driver.findElement(By.xpath("//span[@class='text-white termsText']")).click();
//		driver.findElement(By.xpath("//input[@name='signin']")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[@class='card-title']")));
//		List<WebElement> phoneTypes=driver.findElements(By.xpath("//h4[@class='card-title']"));
//		
//		List al = Arrays.asList(userPhoneName);
//		for(int i=0;i<phoneTypes.size();i++)
//		{
//			String selectedPhone=phoneTypes.get(i).getText();
//			String[] splittedName=selectedPhone.split(" ");
//			String phoneToSelect=splittedName[0];
//			 if(al.contains(phoneToSelect))
//			 {
//				 driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();
//				 
//				 j++;
//				 
//				 if(j==al.size())
//				 {
//					 break;
//				 }
//				 }
//			 }
//		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
//			
		}
		}
		
	
