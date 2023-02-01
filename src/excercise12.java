import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class excercise12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(null))
		String[] userveg= { "Cucumber","Carrot","Brocolli"};
		int j=0;
		operation(driver,userveg,j);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		
	
	
	}
 public static void operation(WebDriver driver, String[] userveg,int j)
 {
	 	List<WebElement> totalProducts=driver.findElements(By.xpath("//h4[@class='product-name']"));
		for(int i=0;i<totalProducts.size();i++)
		{
			String nameofveggie=totalProducts.get(i).getText();
			String[] splittednameofveggie=nameofveggie.split("-");
			String updatedVeggie=splittednameofveggie[0].trim();
			
			List itemsNeeded = Arrays.asList(userveg);
			if(itemsNeeded.contains(updatedVeggie))
			{
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				j++;
				
				if(j==itemsNeeded.size())
				{
					break;
				}
			}
			}
		

 }
 
 
 }
	


