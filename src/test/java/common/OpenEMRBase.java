package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenEMRBase {
	
	public WebDriver driver;
	
	public void launchBrowser(){
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.openemr.io/openemr/interface/login/login.php?site=default");
		driver.manage().window().maximize();
		
		
		
	}
	
	

}
