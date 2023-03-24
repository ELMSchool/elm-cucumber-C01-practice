package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DashboardPage;
import pages.LoginPage;
import pages.MyInfoPage;
import utils.ConfigReader;
import utils.Driver;

import java.util.concurrent.TimeUnit;

public class LoginStepDefs {
    @Given ("User navigates to login page")
    public void user_navigates_to_login_page() {
        Driver.getDriver().get(ConfigReader.getPropertyValue("url"));
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Then ("User should see the dashboard page")
    public void user_should_see_the_dashboard_page() {
        Assert.assertTrue(new DashboardPage().dashboardPageTitle.isDisplayed());
    }

    @Then("User closes the browser")
    public void user_closes_the_browser() {
        Driver.closeDriver();
    }

    @Then("User should see the error message")
    public void userShouldSeeTheErrorMessage() {
        String actualErrorMessage = new LoginPage().loginErrorMessage.getText();
        String expectedErrorMessage = "Invalid credentials";

        Assert.assertEquals("FAILED!!!", expectedErrorMessage, actualErrorMessage);
    }

    @When("User enters {string} and {string} as credentials")
    public void userEntersAndAsCredentials(String username, String password) {
        new LoginPage().usernameInputBox.sendKeys(username);
        new LoginPage().passwordInputBox.sendKeys(password);
    }


    @And("User clicks on {string}")
    public void userClicksOn(String name) {

        switch (name){
            case "login":
                new LoginPage().loginButton.click();
                break;
            case  "My Info":
                new MyInfoPage().clickMenuOption(name);
                break;
            case "Contact Details":
                new MyInfoPage().clickOnMyInfoOption(name);
        }
    }
}
