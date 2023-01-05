import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.OpenEMRHome;


public class Advance{

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.openemr.io/openemr/interface/login/login.php?site=default");
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
		
		Select sel = new Select (dropdown);
		sel.selectByVisibleText("Default - English (Standard)");
		
		
		
		
		
		

	}

}
