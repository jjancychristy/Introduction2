import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment6sec11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.id("checkBoxOption1")).click();
		String userSelection = driver.findElement(By.xpath("//label[@for='bmw']")).getText();
		System.out.println(userSelection);
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select s=new Select(dropdown);
		s.selectByVisibleText(userSelection);
		driver.findElement(By.id("name")).sendKeys(userSelection);
		driver.findElement(By.id("alertbtn")).click();
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
		if(text.contains(userSelection))
		{
			System.out.println("option1 is found");
	
		}
		else
		{
			System.out.println("userselection is not found in message");
		}
}}
