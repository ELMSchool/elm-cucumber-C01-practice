package step_definitions.navigation_step_defs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.DashboardPage;
import pages.Navigation;

import java.util.ArrayList;
import java.util.List;

public class NavigationStepDefs {

    @Then("Menu options should be displayed")
    public void menuOptionsShouldBeDisplayed(DataTable dataTable) {
        //extracting list out of Datatable object
        List<String> expectedMenuOptionTexts = dataTable.asList();
        List<String> actualMenuOptionTexts = new ArrayList<>();

        for (WebElement menuOptionElement : new DashboardPage().menuOptionElementsList){
            actualMenuOptionTexts.add(menuOptionElement.getText());
        }

        System.out.println("Actual => "+actualMenuOptionTexts);
        System.out.println("Expected => "+expectedMenuOptionTexts);
        Assert.assertEquals(expectedMenuOptionTexts, actualMenuOptionTexts);
    }

}
