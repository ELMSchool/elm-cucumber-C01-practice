package step_definitions.my_info_step_defs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import pages.MyInfoPage;

import java.util.List;
import java.util.Map;

public class MyInfoStepDefs {

    @And("User enters Contact Detail values to corresponding fields")
    public void userEntersContactDetailValuesToCorrespondingFields(DataTable dataTable) {

        List<Map<String, String>> data = dataTable.asMaps();
        System.out.println(data);

        new MyInfoPage().sendKeysToContactDetailInputBoxes("Street 1", data.get(0).get("Street 1"));
        new MyInfoPage().sendKeysToContactDetailInputBoxes("Street 2", data.get(0).get("Street 2"));
        new MyInfoPage().sendKeysToContactDetailInputBoxes("City", data.get(0).get("City"));
        new MyInfoPage().sendKeysToContactDetailInputBoxes("State/Province", data.get(0).get("State/Province"));
        new MyInfoPage().sendKeysToContactDetailInputBoxes("Zip/Postal Code", data.get(0).get("Zip/Postal Code"));
        //new MyInfoPage().sendKeysToContactDetailInputBoxes("Country", data.get(0).get("Country"));
        new MyInfoPage().sendKeysToContactDetailInputBoxes("Home", data.get(0).get("Home"));
        new MyInfoPage().sendKeysToContactDetailInputBoxes("Mobile", data.get(0).get("Mobile"));
        new MyInfoPage().sendKeysToContactDetailInputBoxes("Work", data.get(0).get("Work"));
        new MyInfoPage().sendKeysToContactDetailInputBoxes("Work Email", data.get(0).get("Work Email"));
        new MyInfoPage().sendKeysToContactDetailInputBoxes("Other Email", data.get(0).get("Other Email"));
        

    }
}
