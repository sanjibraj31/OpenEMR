package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenEMRHome {
	
	WebDriver driver;
	
	public OpenEMRHome(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="authUser")
	WebElement uName;
	
	public void enterUname(String username) {
		uName.sendKeys(username);
	}
	
	@FindBy(id="clearPass")
	WebElement pWord;
	
	public void enterPass(String password) {
		pWord.sendKeys(password);
	}
	
	@FindBy(id="login-button")
	WebElement cLogin;
	
	public void clickLogin() {
		cLogin.click();
	}

	
	
	

}
