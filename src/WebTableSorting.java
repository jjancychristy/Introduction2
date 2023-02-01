import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//click the column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		//capture in a list
		List<WebElement> vegNames=driver.findElements(By.xpath("//tr/td[1]"));
		//capture the text of the list
		List<String>originalList=vegNames.stream().map(s->s.getText()).collect(Collectors.toList());
		//sort the original list
		List<String>sortedList=originalList.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(originalList.equals(sortedList));
		
		
		//scan the vegcolumn get the text
		//List<String>selectedVeg=vegNames.stream().filter(s ->s.getText().contains("Beans")).map(s->getVeggPrice(s)).collect(Collectors.toList());
		//List<String>selectedVeg=vegNames.stream().filter(s->s.getText().contains("Beans")).map(s->getVeggPrice(s)).collect(Collectors.toList());
		List<Object> price;
		do {
			List<WebElement> rows=driver.findElements(By.xpath("//tr/td[1]"));
			//List<WebElement> vegNames=driver.findElements(By.xpath("//tr/td[1]"));
			
		price=rows.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPriceVeggie(s)).collect(Collectors.toList());
		//vegNames.stream().filter(s -> s.getText().contains("Beans")).map(s -> getPriceVeggie(s)).collect(Collectors.toList());
		//if we enter rice it is not visible
		//List<Object> price= vegNames.stream().filter(s -> s.getText().contains("Beans")).map(s -> getPriceVeggie(s)).collect(Collectors.toList());
		
		price.forEach(a->System.out.println(a));
		
		if(price.size()<1) 
		{
			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		}
		
		}while(price.size()<1);
	}

	private static Object getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		String finalPrice=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return finalPrice;
	}


}
