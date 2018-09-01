package task.quandoo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Collections;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class TablesPage extends BasePage {
    public TablesPage(WebDriver driver) {super(driver);}

    /* LOCATORS */

    //Example 2 table columns data
    private static By example2TableLastNames = By.cssSelector("#table2 td.last-name");
    private static By example2TableFirstNames = By.cssSelector("#table2 td.first-name");
    private static By example2TableEmails = By.cssSelector("#table2 td.email");
    private static By example2TableDues = By.cssSelector("#table2 td.dues");
    //Example 2 table headers
    private static By lastNameHeader = By.cssSelector("span.last-name");
    private static By firstNameHeader = By.cssSelector("span.first-name");
    private static By emailHeader = By.cssSelector("span.email");
    private static By dueHeader = By.cssSelector("span.dues");

    /* END OF LOCATORS SECTION*/

    /* we need to initialize this list here because we will use it in different methods */
    private static List<String> initialColumnEntriesOrder;

    public static void getInitialColumnEntriesOrderByHeaderName(String headerName){
        switch (headerName){
            case "Last Name":
                initialColumnEntriesOrder = $$(example2TableLastNames).texts();
                break;
            case "First Name":
                initialColumnEntriesOrder = $$(example2TableFirstNames).texts();
                break;
            case "Email":
                initialColumnEntriesOrder = $$(example2TableEmails).texts();
                break;
            case "Due":
                initialColumnEntriesOrder = $$(example2TableDues).texts();
                break;
        }
    }

    public static void clickTableHeaderByName(String headerName) throws InterruptedException {
        switch(headerName){
            case "Last Name":
                $(lastNameHeader).click();
                break;
            case "First Name":
                $(firstNameHeader).click();
                break;
            case "Email":
                $(emailHeader).click();
                break;
            case "Due":
                $(dueHeader).click();
                break;
        }
    }

    public static void validateOrderIsCorrect(String orderType){
        List<String> currentOrder;
        switch (orderType){
            case "ascending":
                Collections.sort(initialColumnEntriesOrder);
                currentOrder = $$(example2TableLastNames).texts();
                assert(initialColumnEntriesOrder.equals(currentOrder));
                break;
            case "descending":
                Collections.reverse(initialColumnEntriesOrder);
                currentOrder = $$(example2TableLastNames).texts();
                assert(initialColumnEntriesOrder.equals(currentOrder));
                break;
        }
    }
}
