package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.When;
import utils.Driver;

public class DashboardPage {

	public DashboardPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy (xpath="//h6[.='Dashboard']")
	public WebElement dashboardPageTitle;
	
	
	
}
