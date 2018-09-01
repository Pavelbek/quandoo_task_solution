package task.quandoo.steps;

import cucumber.api.java8.En;
import task.quandoo.pages.TablesPage;
import task.quandoo.utils.WebDriverManager;

import static task.quandoo.pages.TablesPage.*;

public class TablesStepsDef implements En {
    private static TablesPage tablesPage;

    static {tablesPage = new TablesPage(WebDriverManager.getDriver());}

    public TablesStepsDef(){
        When("I check initial (.+) column order", (String headerName) -> {
            getInitialColumnEntriesOrderByHeaderName(headerName);
        });

        When("I click (.+) header", (String headerName) -> {
            clickTableHeaderByName(headerName);
        });

        Then("Table is sorted in (.+) order", (String orderType) -> {
            validateOrderIsCorrect(orderType);
        });
    }
}
