import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='form-group'] //input[@minlength='2']")).sendKeys("Nisha");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("xyz@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("xyz");
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement option=driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown=new Select(option);
		dropdown.selectByIndex(1);
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("12081988");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		
		
		
		//driver.findElement(By.className("form-control ng-pristine ng-invalid ng-touched")).sendKeys("xx");
		//driver.findElement(By.cssSelector(".form-control.ng-pristine.ng-invalid.ng-touched")).sendKeys("Nisha");
		
	}

}
