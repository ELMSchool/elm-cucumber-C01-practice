package step_definitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;
import pages.LoginPage;
import utils.ConfigReader;
import utils.Driver;

public class LoginStepDefs {
	
	@Given ("User navigates to the login page")
	public void user_navigates_to_the_login_page() {
		
		Driver.getDriver().get(ConfigReader.getPropertyValue("url"));
		Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@When("User enters valid credentials and cliks on login button")
	public void user_enters_valid_credentials_and_cliks_on_login_button() {
	   
		new LoginPage().loginToOrangHRM(ConfigReader.getPropertyValue("username"), 
			                            ConfigReader.getPropertyValue("password")  	);
	}

	@Then("User should land on dashboard page")
	public void user_should_land_on_dashboard_page() {
	   
		String actualTitle = new DashboardPage().dashboardPageTitle.getText();
		Assert.assertEquals("Dashboard", actualTitle);
	}
	

}
