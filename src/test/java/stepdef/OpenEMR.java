package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.OpenEMRBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.OpenEMRHome;

public class OpenEMR extends OpenEMRBase{
	
	OpenEMRHome oe1;

	@Given("I am on OpenEMR log in page")
	public void i_am_on_open_emr_log_in_page() {
		launchBrowser();
	}

	@When("I enter {string} {string}")
	public void i_enter(String username, String password) {
		
		 oe1 = new OpenEMRHome(driver);
		 oe1.enterUname(username);
		 oe1.enterPass(password);
    }

	@When("I click Log in button")
	public void i_click_log_in_button() {
		
		oe1.clickLogin();
    }

	@Then("I land on the OpenEMR Home page")
	public void i_land_on_the_open_emr_home_page() {
		
		String title;
		title = driver.getTitle();
		System.out.println("======================================");
		System.out.println(title);
		System.out.println("======================================");
		
		//driver.close();
	  
	}
	
	
	
	
	
}
