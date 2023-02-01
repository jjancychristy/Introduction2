import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class sslcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   ChromeOptions options=new ChromeOptions();
		   options.setAcceptInsecureCerts(true);
		   options.setCapability("proxy", value);
		   Proxy proxy = new Proxy();

		   proxy.setHttpProxy("ipaddress:4444");

		   options.setCapability("proxy", proxy);

		   Map<String, Object> prefs = new HashMap<String, Object>();
           prefs.put("download.default_directory", "/directory/path");



		   options.setExperimentalOption("prefs", prefs);
           System.setProperty("webdriver.chrone.drier", "C:\\chromedriver.exe");
           WebDriver driver=new ChromeDriver(options);
           driver.get("htpps://expired.badssl.com/");
         //  driver.get("https://expired.badssl.com/");
           System.out.println(driver.getTitle());
           
           
           
	}

}
